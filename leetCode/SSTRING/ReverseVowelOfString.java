package com.leetCode.SSTRING;

import java.util.Arrays;

public class ReverseVowelOfString {
    static String reverse(String s){
        char[] arr=s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<j){
            if(arr[i]!='a'&& arr[i]!='e'&&arr[i]!='i'&&arr[i]!='o'&&arr[i]!='u'&& arr[i]!='A'&& arr[i]!='E'&&arr[i]!='I'&&arr[i]!='O'&&arr[i]!='U')
                i++;
            if(arr[j]!='a'&&arr[j]!='e'&&arr[j]!='i'&&arr[j]!='o'&&arr[j]!='u' && arr[j]!='A'&&arr[j]!='E'&&arr[j]!='I'&&arr[j]!='O'&&arr[j]!='U')
                j--;
            if((arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U') && (arr[j]=='a'||arr[j]=='e'||arr[j]=='i'||arr[j]=='o'||arr[j]=='u'||arr[j]=='A'||arr[j]=='E'||arr[j]=='I'||arr[j]=='O'||arr[j]=='U')){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;j--;
            }
        }
        //used to convert character array to String
        s=String.valueOf(arr);
        return s;
    }

    public static void main(String[] args) {
        String s="aA";
        System.out.println(reverse(s));
    }
}
