package com.leetCode.SSTRING;

public class LongestCommonPrefix {
    static String longestCommonPrefix(String[] strs) {
       // if the array does not contain any String the return empty String
        if(strs.length==0)
            return "";
//        consider first word in string as prefix
        String prefix=strs[0];
//        loop till the array length
        for(int i=0;i<strs.length;i++){
//            every time consider the each word and check whether that prefix is present in that word
//            if the answer is 0 then it is present else reduce the prefix by one letter and also check
            while(strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
//                once you get the prefix check whether value is empty if it is empty that means
//                we dont have any prefix;
                if(prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }
    public static void main(String[] args){
        String[] strs={"aaa","aa","aaa"};
        System.out.println(longestCommonPrefix(strs));
    }
}
