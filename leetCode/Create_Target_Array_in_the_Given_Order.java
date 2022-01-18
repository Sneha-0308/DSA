package com.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Create_Target_Array_in_the_Given_Order {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            arr.add(index[i], nums[i]);
        }
        int[] target = new int[arr.size()];
        for (int i = 0; i < nums.length; i++) {
            target[i] = arr.get(i);
        }
        return target;
    }

    public static void main(String[] args) {
        Create_Target_Array_in_the_Given_Order s = new Create_Target_Array_in_the_Given_Order();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        int[] index = new int[n];
        if (nums.length != index.length)
            System.exit(0);
        if (nums.length < 1 || index.length > 100)
            System.exit(0);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
            if (nums[i] < 0 || nums[i] > 100)
                System.exit(0);
        }
        for (int i = 0; i < index.length; i++) {
            index[i] = in.nextInt();
            if (index[i] < 0 || index[i] > i)
                System.exit(0);
        }
        int[] res = s.createTargetArray(nums, index);
        System.out.println(Arrays.toString(res));
    }
}
