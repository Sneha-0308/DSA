package com.leetCode.SSTRING;

public class FindTheDifference {
//    static char fun(String s,String t){
//        for(int i=0;i<s.length();i++){
//            t=t.replaceFirst(s.charAt(i)+"","");
//
//        }
//        return t.charAt(0);
//    }
    static char fun(String s,String t){
        char addChar = 0;

        int i=0;
        while(i<s.length()){
            addChar ^= s.charAt(i);
            i++;
        }

        int j=0;
        while(j<t.length()){
            addChar ^= t.charAt(j);
            j++;
        }

        return addChar;

    }

    public static void main(String[] args) {
        System.out.println(fun("a","aa"));
    }
}
