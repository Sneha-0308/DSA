package com.leetCode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * * int[] arr1={1,2,2,3,4,4,6,5};
 * * int[] arr2={4,5,6,6,7,8,8};
 * intersection of two array means the common array element*
 */
public class IntersectionOf2Arr {
    static int[] fun(int[] nums1, int[] nums2){
        ArrayList<Integer> list=new ArrayList<>();  //Because we don't know how many element are common we use arraylist then after that we assign those value to array so that we can write array
        HashMap<Integer,Integer> map1=new HashMap<>();  //this two hashmap stores the unique value that is no duplicate element array allowed after that you chaeck with keySet() method to see the keys
        HashMap<Integer,Integer> map2=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map1.put(nums1[i],i);
        }
        for(int i=0;i<nums2.length;i++){
            map2.put(nums2[i],i);
        }
        Object[] arr=map2.keySet().toArray();  //We have to add the keySet value of map2 to array so that we can take each element check whether element is present in map1 if it is present the store that value to array of size Array list
        for(int i=0;i<arr.length;i++){
            if(map1.containsKey(arr[i]))
                list.add((Integer) arr[i]);
        }
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++)
            res[i]=list.get(i);
        return res;
    }
    public static void main(String[] args){
        int[] arr1={1,2,2,3,4,4,6,5};
        int[] arr2={4,5,6,6,7,8,8};
        System.out.println(Arrays.toString(fun(arr1,arr2)));
    }
}
