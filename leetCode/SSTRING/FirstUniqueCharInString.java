package com.leetCode.SSTRING;

public class FirstUniqueCharInString {
    static int fun(String s){
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!='\0'){
                char ch=arr[i];
                arr[i]='\0';
                int cnt=1;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]==ch) {
                        arr[j] = '\0';
                        cnt++;
                    }
                }
                if(cnt==1){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(fun("leetcode"));
    }
}
