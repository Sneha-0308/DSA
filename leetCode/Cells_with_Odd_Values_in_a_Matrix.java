package com.leetCode;

public class Cells_with_Odd_Values_in_a_Matrix {
    public int oddCells(int m, int n, int[][] indices) {
        int count = 0;
        int[][] zero = new int[m][n];
        for (int i = 0; i < zero.length; i++) {
            for (int j = 0; j < zero[i].length; j++) {
                zero[i][j] = 0;
            }
        }
        for (int row = 0; row < indices.length; row++) {
            int v1 = indices[row][0];
            for (int i = 0; i < n; i++) {
                zero[v1][i] += 1;
            }
        }
        for (int row = 0; row < indices.length; row++) {
            int v2 = indices[row][1];
            for (int i = 0; i < m; i++) {
                zero[i][v2] += 1;
            }
        }
        for (int i = 0; i < zero.length; i++) {
            for (int j = 0; j < zero[i].length; j++) {
                if (zero[i][j] % 2 != 0)
                    count++;
            }
        }
        return count;
    }
}
