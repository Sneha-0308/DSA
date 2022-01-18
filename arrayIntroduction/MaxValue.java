package com.arrayIntroduction;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {12, 55, 47, 1, 6};
        System.out.println(max(arr));
        System.out.println(max_in_range(arr, 2, 4));
    }

    //Add edge cases
    static int max(int[] arr) {
        if (arr == null)
            return -1;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    static int max_in_range(int[] arr, int start, int end) {
        if (end < start)
            return -1;
        if (arr == null)
            return -1;
        int max_inrange = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > max_inrange)
                max_inrange = arr[i];
        }
        return max_inrange;
    }
}
