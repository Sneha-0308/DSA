package com.leetCode.SSTRING;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
//    brute force method


//    static boolean isIsomorphic(String str1,String str2){
//        StringBuilder sb=new StringBuilder();
//        HashMap<Character, Character> map=new HashMap<>();
//        for(int i=0;i<str1.length();i++){
//            if(!map.containsKey(str1.charAt(i)))
//                map.put(str1.charAt(i),str2.charAt(i));
//        }
////        map.get(key);
//        for(int i=0;i<str2.length();i++) {
//            for (Map.Entry<Character, Character> entry : map.entrySet()) {
//                if(entry.getValue()==str2.charAt(i)){
//                    char ch=entry.getKey();
//                    sb.append(ch);
//                }
//            }
//        }
//        if(sb.toString().equals(str1))
//           return true;
//        else
//            return false;
//    }

//    optimized code
    static boolean isIsomorphic(String s,String t){
        HashMap<Character,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
//            if the key already present in hash table then check whether the value of that key is equal to the character at second String at the same position
            if(map.containsKey(s.charAt(i))){
                char ch=map.get(s.charAt(i));
                if(ch!=t.charAt(i))
                    return false;
            }
//            if key not present in table then first check whether that key is present as value in table for other key if so return false else add (key,value) pair to the table
            else {
                if(map.containsValue(t.charAt(i)))
                    return false;
                map.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1="paper";
        String str2="title";
        System.out.println(isIsomorphic(str1,str2));
    }
}
