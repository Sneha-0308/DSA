package com.Sorting;

import java.util.Arrays;

public class SelectionSort {
//    time complexity O(n^2)
    static int[] sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[smallest]){
                    smallest=j;
                }
            }
                int temp = arr[smallest]; //arr[index] has the smallest element
                arr[smallest] = arr[i];
                arr[i] = temp;
        }
        return arr;
    }
    public static void main(String[] args){
        int arr[]={7,8,3,1,2};
        System.out.println(Arrays.toString(sort(arr)));

    }
}
