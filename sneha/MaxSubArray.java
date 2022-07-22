package com.sneha;

public class MaxSubArray {
    static void function(int[] arr){
        int result=arr[0];
        for (int i = 0; i < arr.length; i++) {
            int mul=arr[i];
            for (int j = i+1; j <arr.length; j++) {
                result=Math.max(result,mul);
                mul*=arr[j];
            }
            result=Math.max(result,mul);
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        int[] arr={10, -20, -30, 0, 70, -80, -20};
        function(arr);
    }
}
