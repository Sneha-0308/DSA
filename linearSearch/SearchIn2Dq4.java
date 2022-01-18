package com.linearSearch;

import java.util.Arrays;

public class SearchIn2Dq4 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int target = 54;
        System.out.println(Arrays.toString(search(arr, target)));//Imp-->If the return type is array then you must
        // use Arrays.toString otherwise it will go error
//        System.out.println(search(arr,target));//if you write like this will get garbage value
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    int[] res = {row, col};
                    return res;
//                    return new int[]{row,col};
                }
            }
        }
        int[] res = {-1, -1};
        return res;
//        return new int[]{-1,-1};
    }
}
