package com.BubbleSelectionInsertion;

import java.util.Arrays;

public class BubbleSort011 {
    public static void main(String[] args) {
        int[] arr={1,2,3,6,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapped;
//        run the steps for n-1 times
        for(int i=0;i<arr.length;i++){//this loop is to used for reduce the iteration of j loop
           swapped=false;
//            for each step, max item will come at the last respective index and TODO j index starts from 1
            for(int j=1;j< arr.length-i;j++){
//                swapping of two numbers
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
//           TODO condition is outside j loop
            if(swapped==false)
                break;
        }
    }
}
