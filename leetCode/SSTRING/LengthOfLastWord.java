package com.leetCode.SSTRING;

import java.util.Arrays;

public class LengthOfLastWord {
    public static void main(String[] args){
        String str="luffy is still joyboy";
        String[] arr=str.split("\\s");
        System.out.println(arr[arr.length-1].length());
    }
}
