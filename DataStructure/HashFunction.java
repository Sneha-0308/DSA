package com.DataStructure;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashFunction {
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder();
        HashMap<Character, Character> map=new HashMap<>(); //declaring hashMap
        String str1="foo";
        String str2="bar";
        for(int i=0;i<str1.length();i++){
//            map.containsKey(str1.charAt(i)) -- this check whether key present in table or not
            if(!map.containsKey(str1.charAt(i)))
//                put function is to add key,value pairs
                map.put(str1.charAt(i),str2.charAt(i));
        }
//        map.get(key);--you will get the value of passed key
        for(int i=0;i<str2.length();i++) {
//            we dont have inbuilt method to get the key by passing the value so we use Entry or in exam we use Map.Entry method and entrySet to getKey and getValue method
            for (Entry<Character, Character> entry : map.entrySet()) {
                if(entry.getValue()==str2.charAt(i)){
                    char ch=entry.getKey();
                    sb.append(ch);
                }
            }
        }
        if(sb.toString().equals(str1))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
