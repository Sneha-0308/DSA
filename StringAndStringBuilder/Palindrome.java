package com.StringAndStringBuilder;

public class Palindrome {
    public static void main(String[] args) {
        String str="abcdba";
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String str){
//        this condition is depend on if it is mentioned null or zero length as false so consider as false or else consider as true
//        TODO first null condition then length==0
        if(str==null || str.length()==0)
            return true;
        str=str.toLowerCase();
        for(int i=0;i<str.length()/2;i++){
            char start = str.charAt(i);
            char end=str.charAt(str.length()-1-i);
            if(start!=end)
                return false;
        }
        return true;
    }
}
