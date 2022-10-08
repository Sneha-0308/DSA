package com.leetCode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class SummaryRange {
    static List<String> summaryRange(int[] nums){
        List<String> list=new ArrayList<>();
        int ind=0;
        while (ind<nums.length){
            int start,end;
            start=nums[ind];
            while (ind+1<nums.length && nums[ind+1]==nums[ind]+1)
                ind++;
            end=nums[ind];
            if(start==end)
                list.add(start+"");
            else
                list.add(start+"->"+end);
            ind++;
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums={0,2,3,4,6,8,9};
        System.out.println(summaryRange(nums));
    }
}
