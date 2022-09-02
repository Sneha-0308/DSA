package com.TCS;

import java.util.Arrays;

public class SubSetOfArray {
    static int search(int a[],int target){
        int start=0;
        int end=a.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target>a[mid])
                start=mid+1;
            else if(target<a[mid])
                end=mid-1;
            else
                return mid;
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        System.out.println(search(a,1));
    }
}
