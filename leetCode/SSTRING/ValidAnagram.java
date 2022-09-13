package com.leetCode.SSTRING;

import java.util.Arrays;

public class ValidAnagram {

   /****************************BRUTE FORCE METHOD
   static boolean isAnagram(String s,String t){
        for(int i=0;i<s.length();i++){ //here take each character and check with the t String if you get
            // that character then remove from t string and break it. you have to check for only first
            // occurrence of character and once you get delete that and break the loop and find for
            // next character
            for(int j=0;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)) {
                    t = t.substring(0, j) + t.substring(j + 1);
                    break;
                }
            }
        }
//        if t string becomes empty that means we got all character from t which are present in s
        if(t.isEmpty())
            return true;
        else
            return false;
    }

    */
/***************OPTIMIZED CODE****************/
static boolean isAnagram(String s,String t){
//    convert to array
    char[] schar=s.toCharArray();
    char[] tchar=t.toCharArray();
//    sort
    Arrays.sort(schar);
    Arrays.sort(tchar);
    if(schar.length!=tchar.length)
        return false;
//    if character at same place are not equal the  false
    for(int i=0;i<schar.length;i++){
        if(schar[i]!=tchar[i])
            return false;
    }
    return true;
}
    public static void main(String[] args){
        String s="listen";
        String t="silent";
        System.out.println(isAnagram(s,t));
    }
}
