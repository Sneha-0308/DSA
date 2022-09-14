package com.leetCode.SSTRING;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    static boolean patternstr(String pattern,String s) {
        Map map = new HashMap();
        s=s.trim();
        String[] tokens = s.split(" ");
        if(tokens.length !=pattern.length()) return false;
        for(Integer i=0;i<tokens.length;i++){
            if(map.put(tokens[i],i) != map.put(pattern.charAt(i),i)) return false;
        }
//        System.out.println(map);
        return true;
    }

    public static void main(String[] args) {
        System.out.println(patternstr("jquery","jquery"));
    }
}

