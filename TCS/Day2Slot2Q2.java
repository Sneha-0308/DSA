package com.TCS;

import java.util.Arrays;
import java.util.Scanner;

public class Day2Slot2Q2 {
    static void bubble(int[] v,int[] p){
        boolean swapped;
        for(int i=0;i<v.length;i++){
            swapped=false;
            for(int j=1;j< v.length-i;j++){
                if(v[j-1]<v[j]){
                    int temp1=v[j];
                    v[j]=v[j-1];
                    v[j-1]=temp1;
                    int temp2=p[j];
                    p[j]=p[j-1];
                    p[j-1]=temp2;
                    swapped=true;
                }
            }
            if(swapped==false)
                break;
        }
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int sum=0,res=0,price=0,temp=0;
        int[] p=new int[n];
        int[] v=new int[n];
        for(int i=0;i<n;i++) {
            p[i] = s.nextInt();
            v[i] = s.nextInt();
        }
        bubble(v,p);
//        System.out.println(Arrays.toString(p));
//        System.out.println(Arrays.toString(v));
        for(int i=0;i<n;i++){
            sum+=v[i];
            temp+=p[i];
            if(sum>res && temp<=k){
                res=sum;
                price=temp;
            }
            else {
                sum-=v[i];
                temp-=p[i];
            }
        }
        System.out.println(res);
    }
}
