package com.leetCode;

import java.util.Arrays;
import java.util.Scanner;

public class Shuffle_the_Array {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i * 2] = nums[i];
            ans[i * 2 + 1] = nums[n + i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Shuffle_the_Array s = new Shuffle_the_Array();
        int n = in.nextInt();
        int[] nums = new int[2 * n];
        if (n < 1 || n > 500)
            System.exit(0);
        if (nums.length != 2 * n)
            System.exit(0);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
            if (nums[i] < 1 || nums[i] > Math.pow(10, 3))
                System.exit(0);
        }
        int[] last = s.shuffle(nums, n);
        System.out.println(Arrays.toString(last));
    }
}
