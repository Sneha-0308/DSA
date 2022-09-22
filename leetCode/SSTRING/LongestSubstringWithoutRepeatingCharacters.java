package com.leetCode.SSTRING;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    /***  own algorithm
    static int find(String s){
        int result=0,temp=0;
        for(int i=s.length();i>=0;i--){
            for(int j=0;j<i;j++){
                temp=countLarger(s.substring(j,i),result);
                if(temp>result)
                    result=temp;
                if(temp==s.length())
                    return s.length();
            }
            }
        return result;
    }
    static int countLarger(String sub,int count){
        if(count<sub.length()){
            StringBuilder sb=new StringBuilder(sub);
            for(int i=0;i<sb.length();i++){
                String ch=sb.charAt(i)+"";
                sb.setCharAt(i,'\0');
                if(sb.indexOf(ch)!=-1){
                    return 0;
                }
            }
                count=sub.length();
        }
        return count;
    }
     */

    //leetcode solution
    static int find(String s){
        HashMap<Character,Integer> map=new HashMap<>();
//        i points to the Starting index of non repeating subString
//        j points to the end index of non repeating subString
//        n length of non repeating substring
        int i=0,j=0,ans=0,n=s.length();
        while (j<n){
//            if character is not present then add to the hash table
            if(!map.containsKey(s.charAt(j))){
                map.put(s.charAt(j),j);
                j++;
            }
            //if already present that means we got repeating character so start deleting character from hash map until that repeating element should not be present in map
            else {
                map.remove(s.charAt(i));
                i++;
            }
//            everytime take maximum length
            ans=Math.max(ans,j-i);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(find("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }
}
