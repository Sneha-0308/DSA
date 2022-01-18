package com.leetCode;

import java.util.Arrays;
import java.util.Scanner;

public class Running_Sum_of_1d_Array {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= i; j++) {
                runningSum[i] = runningSum[i] + nums[j];
            }
        }
        return runningSum;
    }

    public static void main(String[] args) {
        Running_Sum_of_1d_Array s = new Running_Sum_of_1d_Array();
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] nums = new int[size];
        if (nums.length < 1 || nums.length > 1000)
            System.exit(0);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
            if (nums[i] < -Math.pow(10, 6) || nums[i] > Math.pow(10, 6))
                System.exit(0);
        }
        int[] last = s.runningSum(nums);
        System.out.println(Arrays.toString(last));
    }
}
