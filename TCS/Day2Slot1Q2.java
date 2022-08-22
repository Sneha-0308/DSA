package com.TCS;

import java.util.Scanner;

public class Day2Slot1Q2 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int sum,count,res=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        for(int i=0;i<n;i++){
            sum=0;
            count=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum<k){
                    count++;
                }
                else {
                    if(res<count){
                        res=count;
                        break;
                    }
                }
            }
        }
        System.out.println(res);
    }
}
