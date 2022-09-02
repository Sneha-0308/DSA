package com.leetCode.SSTRING;

public class LongestCommonPrefix {
    static String longestCommonPrefix(String[] strs) {
        String res="";
        char temp;
        int flag=0;
        if(strs.length==1){
            return strs[0];
        }
        for(int i=0;i<strs[0].length();i++){
            temp=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i<strs[j].length()){
                    if(strs[j].charAt(i)==temp)
                        flag=1;
                    else
                        flag=0;
                }
                else
                    break;
            }
            if(flag==1) {
                res += temp;
                flag=0;
            }
            else
                break;
        }
        return res;
    }
    public static void main(String[] args){
        String[] strs={"aaa","aa","aaa"};
        System.out.println(longestCommonPrefix(strs));
    }
}
