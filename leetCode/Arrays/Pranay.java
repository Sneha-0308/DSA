package com.leetCode.Arrays;

public class Pranay {
    static int peak(int[] arr,int n){
        int start=0;
        int end=n-1;
        while (start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
                start=mid+1;
            else
                end=mid;
        }
        return start;
    }
    static boolean numSequence(int[] arr,int n){
        int peak=peak(arr,n);
        for(int i=1;i<=peak;i++)
            if(arr[i-1]<= arr[i])
                return false;
        for(int i=peak;i<n-1;i++)
            if(arr[i] >=arr[i+1])
                return false;
        return true;
    }

    public static void main(String[] args) {
        int[] arr={9,8,4,5,6};
        int n=5;
        System.out.println(numSequence(arr,n));
        int num=47;
//        int a=Arrays.;
    }
}
