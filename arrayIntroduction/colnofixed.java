package com.arrayIntroduction;

import java.util.Arrays;

public class colnofixed {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
                {1, 2, 3},
                {1, 2}};
//        for (int row = 0; row <arr.length ; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }
//            for (int row = 0; row <arr.length ; row++) {
//                System.out.println(Arrays.toString(arr[row]));
//            }
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
