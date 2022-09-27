package com.leetCode.SSTRING;

public class LongestPanidromeSubString {
    static boolean isPalindrome(String sub){
        int i=0,j=sub.length()-1;
        while (i<=j){
            if(sub.charAt(i)!=sub.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    static String longest(String s){
        String result="",temp="";
        for (int i=0;i<s.length();i++){
            for(int j=s.length();j>=i;j--){
                temp=s.substring(i,j);
                if(temp.length()>result.length() && isPalindrome(temp))
                    result=temp;
            }
        }
        return result;
    }
    public static void main(String[] args){
        String str="aacabdkacaa";
        System.out.println(longest(str));

    }
}
