package com.leetCode.SSTRING;

import java.util.Arrays;

public class MinimumNumberOfOperationsToMoveAllBallstoEachBox {
    static int[] func(String boxes){
        int count;
        int n=boxes.length();
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            count=0;
            for(int j=0;j<n;j++){
                if(boxes.charAt(j)=='1')
                    count+=Math.abs(j-i);
            }
            result[i]=count;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(func("001011")));
    }
}
