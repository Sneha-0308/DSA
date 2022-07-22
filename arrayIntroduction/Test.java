package com.arrayIntroduction;

//import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int a[]={18,7,4,3,2};
        System.out.println(search(a,18));
    }
    static int search(int a[],int target){
        int start=0;
        int end=a.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;//3
            if(target<a[mid])
                start=mid+1;
            else if (target>a[mid])
                end=mid-1;
            else
                return mid;
        }
        return -1;
    }
}
