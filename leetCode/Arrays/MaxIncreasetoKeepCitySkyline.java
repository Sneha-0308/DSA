package com.leetCode.Arrays;

public class MaxIncreasetoKeepCitySkyline {
    static int func(int[][] grid) {
        int after=0,before=0;
        for (int i = 0; i < grid.length; i++) {
            int target = grid[i][0];
            for (int j = 0; j < grid[i].length; j++) {
                before+=grid[i][j];
                if (target < grid[i][j])
                    target = grid[i][j];
            }
            for (int k = 0; k < grid[i].length; k++) {
                int maxc=grid[i][k];
                for (int j = 0; j < grid.length; j++) {
                    if (target < grid[j][k]) {
                        maxc = target;
                        break;
                    }
                    if (maxc < grid[j][k] && grid[j][k] <= target)
                        maxc = grid[j][k];
                }
                after+=maxc;
            }
        }
        return after-before;
    }
    public static void main(String[] args){
        int[][] grid= {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
        System.out.println(func(grid));
    }
}
