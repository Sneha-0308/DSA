package com.leetCode;

public class Pangram {
    public boolean checkIfPangram(String sentence) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        if (sentence.length() < 26)
            return false;
        for (int i = 0; i < alpha.length(); i++) {
//            char c=alpha.charAt(i);
//            int index=sentence.indexOf('c');
//            if(index==-1)
//                return false;
            if (sentence.indexOf(alpha.charAt(i)) == -1)
                return false;
        }
        return true;
    }
}
