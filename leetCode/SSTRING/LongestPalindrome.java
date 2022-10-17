package com.leetCode.SSTRING;

import java.util.HashSet;

public class LongestPalindrome {
    static int func(String s){
        HashSet<Character> set = new HashSet<>();
        int count=0;
        if(s.length()==0 || s==null)
            return 0;
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(i));
                count++;
            }
            else
                set.add(s.charAt(i));
        }
        if(!set.isEmpty())
            return count*2+1;
        else
            return count*2;
    }

    public static void main(String[] args) {
        System.out.println(func("abcccdd"));
    }
}
