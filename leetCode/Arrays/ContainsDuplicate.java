package com.leetCode.Arrays;

import java.util.Arrays;

public class ContainsDuplicate {
    static boolean isDuplicate(int[] nums){
        Arrays.sort(nums);
        for(int i=1;i<=nums.length-1;i++){
            if(nums[i-1]==nums[i])
                return true;
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums={1,1,1,3,3,4,3,2,4,2};
        System.out.println(isDuplicate(nums));

    }
}
