package com.leetCode.SSTRING;

public class LongestPalindromeOWN {
    static boolean isPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while (i<j){
            if(str.charAt(i)!=str.charAt(j))
                return false;
            i++;j--;
        }
        return true;
    }

    static int longestPalindrome(String s){
        int result=0;
        String sub="";
        for(int i=0;i<s.length();i++){
            for(int j=s.length()-1;j>=0;j--){
                sub=s.substring(i,j+1);
                if(result>sub.length())
                    break;
                else{
                    if(isPalindrome(sub)){
                        result=sub.length();
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(longestPalindrome("abadd"));
    }
}
