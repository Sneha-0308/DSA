package com.leetCode.Arrays;

public class ContainsDuplicate2 {
    static boolean contains(int[] arr,int k){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<=i+k;j++){
                if((arr[j]==arr[j+1]) && (Math.abs(i-j)<=k))
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr={99,99};
        int k=2;
        System.out.println(contains(arr,k));

    }
}
