package com.leetCode.Arrays;

import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
    static List<List<Integer>> sum(int[] nums){
        List<List<Integer>> list=new LinkedList<>();
        for(int i=0;i<=nums.length-3;i++){
            for(int j=i+1;j<=nums.length-2;j++){
                List<Integer> temp=new LinkedList<>();
                if(nums[i]+nums[j]+nums[j+1]==0){
                temp.add(0,nums[i]);
                temp.add(1,nums[j]);
                temp.add(2,nums[j+1]);
                            list.add(temp);
                    }
            }
        }
        return list;
    }
    public static void main(String[] args){
        int arr[]={0,0,0};
        System.out.println(sum(arr).toString());

    }
}
