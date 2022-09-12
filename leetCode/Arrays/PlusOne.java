package com.leetCode.Arrays;

import java.util.Arrays;

public class PlusOne {
static int[] plusone(int[] digits){
    int n=digits.length;
    for(int i=n-1;i>=0;i--){
        if(digits[i]<9){ //if last number is less than 9 then we add 1 to last array and direct return the array
            digits[i]++;
            return digits;
        }
        //if number is greater than 9 then change the value to 0
        digits[i]=0;
    }
    int[] arr=new int[n+1];
    arr[0]=1;
    return arr;

}
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusone(arr)));
    }
}
