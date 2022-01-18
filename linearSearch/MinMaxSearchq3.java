package com.linearSearch;

public class MinMaxSearchq3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 56, 5};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }

    static int min(int[] arr) {
        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < min)
//                min = arr[i];
//        }
        for (int i : arr)
            if (i < min)
                min = i;
        return min;
    }

    static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
//        for (int i = 0; i <arr.length ; i++) {
//            if(arr[i]>max)
//                max=arr[i];
//        }
        for (int i : arr)
            if (i > max)
                max = i;
        return max;
    }
}
