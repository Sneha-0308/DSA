package com.linearSearch;

public class MaxMIn2Dq4 {
    public static void main(String[] args) {
        int[][] arr = {{100, 2, 3}, {4, 5, 6}, {7, 800, 9}};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }

    static int min(int[][] arr) {
        int min = Integer.MAX_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] < min)
                    min = arr[row][col];
            }
        }
        return min;
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max)
                    max = arr[row][col];
            }
        }
        return max;
    }
}
