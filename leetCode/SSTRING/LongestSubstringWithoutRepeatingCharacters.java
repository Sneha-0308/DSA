package com.leetCode.SSTRING;

public class LongestSubstringWithoutRepeatingCharacters {
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

    public static void main(String[] args) {
        System.out.println(find("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }
}
