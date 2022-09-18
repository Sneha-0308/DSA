package com.leetCode.SSTRING;

import java.util.Arrays;

public class ReverseString {
    static void reverseArray(char[] arr){
        int mid=(arr.length-1)/2;
        for(int i=0;i<=mid;i++){
            char temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args){
        char[] arr={'s','n','e','h','a'};
        reverseArray(arr);
    }
}
