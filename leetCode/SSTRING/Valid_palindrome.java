package com.leetCode.SSTRING;
//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all
// non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
// Given a string s, return true if it is a palindrome, or false otherwise.
public class Valid_palindrome {
    public static void main(String[] args){
        String sentence=" A man, a plan, a canal: Panama";
        sentence=sentence.toLowerCase();
        sentence=sentence.replaceAll("[^a-z 0-9]","");
        sentence=sentence.replaceAll("[\\s]","");
        StringBuilder sb=new StringBuilder(sentence);
        sb.reverse();
        if(sentence.equals(sb.toString()))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
