package com.leetCode.Arrays;

import java.util.Arrays;
import java.util.List;

public class MissingNumber {
    static int fun(int[] nums){
        int n=nums.length;
        int i=0;
        Arrays.sort(nums);
        while(i<=n){
            if(Arrays.binarySearch(nums,i)<0)
                break;
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums={0,1,3};
        System.out.println(fun(nums));
    }
}
