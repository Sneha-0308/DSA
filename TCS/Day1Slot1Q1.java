package com.TCS;

import java.util.Scanner;

public class Day1Slot1Q1 {
    static String doset(String str) {
        char[] arr = str.toCharArray();
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (arr[i] != '\0') {
                res += arr[i];
                for (int j = i + 1; j < str.length(); j++) {
                    if (arr[i] == arr[j])
                        arr[j] = '\0';
                }
            }
        }
        return res;
    }
        static char[] bubble(String str){
            boolean swapped;
            char[] arr=str.toCharArray();
            for(int i=0;i<arr.length;i++){
                swapped=false;

                for(int j=1;j< arr.length-i;j++){
                    if(arr[j]<arr[j-1]){
                        char temp=arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=temp;
                        swapped=true;
                    }
                }
                if(swapped==false)
                    break;
            }
//            System.out.println(arr);
            return arr;
        }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String a=s.next();
        String b=s.next();
        if(a==b) //is both String are same
            System.out.println(1);
        String res="";
        String res2="";
        for(int i=0;i<n;i++){
            if(a.charAt(i)!=b.charAt(i)){
                res+=a.charAt(i);
                res2+=b.charAt(i);
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(ans!=0)
                break;
            if(b.indexOf(a.charAt(i))==-1){
                System.out.println("-1");
                break;
            }
            else {
                char[] set=bubble(doset(res2));
                for(int j=0;j<set.length;j++){
                    if (a.indexOf(set[j])==-1){
                        System.out.println("-1");
                        ans+=1;
                        break;
                    }
                    else {
                        System.out.println(set.length);
                        ans+=1;
                        break;
                    }
                }
            }
            if(ans==1)
                break;
        }
    }
}