package com.leetCode;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        if (nums.length <= 0 || nums.length > 1000)
            System.exit(0);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    System.exit(0);
            }
        }
        int[] last = s.buildArray(nums);
        System.out.println(Arrays.toString(last));
    }
}
