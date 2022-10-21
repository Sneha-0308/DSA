package com.leetCode.SSTRING;

import java.util.Arrays;

public class MinimumNumberOfOperationsToMoveAllBallstoEachBox {
    static int[] func(String boxes){
        int count;
        int[] result=new int[boxes.length()];
        for(int i=0;i<boxes.length();i++){
//            char[] temp=new char[boxes.length()];
            char[] temp=boxes.toCharArray();
            count=0;
            for(int j=0;j<boxes.length();j++){
                if(i==j)
                    continue;
                else if (boxes.charAt(j)-'0'==0) {
                    count++;
                }
                else{
                    count++;
                    temp[j]=0;
                }
            }
            result[i]=count;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(func("110")));
    }
}
