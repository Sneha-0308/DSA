package com.Sorting;

import java.util.Arrays;

public class BubbleSort{
//    Time complexity=O(n^2)
    static int[] sort(int arr[]){
        for(int i=0;i<arr.length-1;i++) {//n-1 times
        // arr.length-1-i we are subtracting the i because for every ith loop from last
            // element will be sorted so no need to consider last element for every loop so every
            // time we reduce length by i
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
//                    swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
        return arr;
    }
    public static void main(String[] args){
        int arr[]={80,70,60,30,20};
        System.out.println(Arrays.toString(sort(arr)));
    }

}