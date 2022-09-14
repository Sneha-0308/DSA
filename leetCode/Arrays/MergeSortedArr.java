package com.leetCode.Arrays;

import java.util.Arrays;

public class MergeSortedArr {
    static void merge(int[] nums1,int m,int[] nums2,int n){
        int j=0;
        for(int i=m;i<m+n;i++){
            nums1[i]=nums2[j++];
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        merge(nums1,3,nums2,3);
    }
}
