package com.TCS;

import java.util.Arrays;
import java.util.Scanner;

public class Day6Slot1Q2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int count=0;
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
//        int[] temp=new int[n];
        int[] prev=new int[n];
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
//                temp=arr;
                int[] temp=arr.clone();
                temp[i]=-1*temp[i];
                temp[j]=-1*temp[j];
                if(!(Arrays.equals(temp,prev))){
                    count++;
                    prev=temp;
                }
            }
        }
        System.out.println(count);
    }
}
