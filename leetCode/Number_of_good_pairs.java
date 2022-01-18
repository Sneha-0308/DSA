package com.leetCode;

import java.util.Scanner;

public class Number_of_good_pairs {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j)
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Number_of_good_pairs s = new Number_of_good_pairs();
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] nums = new int[size];
        if (nums.length < 1 || nums.length > 100)
            System.exit(0);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
            if (nums[i] < 1 || nums[i] > 100)
                System.exit(0);
        }
        int ans = s.numIdenticalPairs(nums);
        System.out.println(ans);
    }
}
