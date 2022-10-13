package com.leetCode.SSTRING;

public class IsSubsequence {
    static boolean fun(String s,String t){
        int j=0,i=0;
        while (i<t.length()&&j<s.length()){
            if(t.charAt(i)==s.charAt(j)){
                i++;
                j++;
            }
            else
                i++;
        }
        return j  == s.length();
    }

    public static void main(String[] args) {
        System.out.println(fun("abd","ahbgdc"));
    }
}
