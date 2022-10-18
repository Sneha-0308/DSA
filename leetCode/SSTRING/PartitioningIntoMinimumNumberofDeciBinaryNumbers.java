package com.leetCode.SSTRING;

public class PartitioningIntoMinimumNumberofDeciBinaryNumbers {
    static int func(String n){
        int result=0;
        /**
         for(int i=0;i<s.length();i++){
            if(s.charAt(i)-'0'>result)
                result=s.charAt(i)-'0';
        }
        return result;**/
        for(int digit: n.toCharArray()){
            if(digit-'0'==9){
                result=9;
                break;
            }
            if(digit-'0'>result)
                result=digit-'0';
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(func("27346209830709182346"));
    }
}
