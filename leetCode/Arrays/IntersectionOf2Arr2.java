package com.leetCode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOf2Arr2 {
    static int[] func(int[] nums1,int[] nums2){
        ArrayList<Integer> list=new ArrayList<>();
        /**METHOD 1**/
//        for(int i=0;i<nums1.length;i++){
//            for(int j=0;j<nums2.length;j++){
//                if(nums1[i]==nums2[j]){
//                    list.add(nums1[i]);
//                    nums2[j]=-1;
//                    break;
//                }
//            }
//        }

        /**METHOD 2**/
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        while (i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j])
                i++;
            else if(nums1[i]>nums2[j])
                j++;
            else {
                list.add(nums1[i]);
                i++;j++;
            }
        }

        int[] result=new int[list.size()];
        for(int k=0;k<result.length;k++){
            result[k]=list.get(k);
        }
        return result;
    }
    public static void main(String[] args){
        int[] nums1={4,9,5};
        int[] nums2={9,4,9,8,4};
        System.out.println(Arrays.toString(func(nums1,nums2)));
    }
}
