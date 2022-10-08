package com.leetCode.SSTRING;

import java.util.Arrays;

public class RansomNote {
    static boolean fun(String ransomNote, String magazine){
        int flag=0;
        char[] mag= magazine.toCharArray();
        for(int i=0;i<ransomNote.length();i++){
            for(int j=0;j<mag.length;j++){
                if(ransomNote.charAt(i)==mag[j]){
                    mag[j]='\0';
                    flag=1;
                    break;
                }
                else
                    flag=-1;
            }
            if(flag==-1)return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(fun("bb","aab"));
    }
}
