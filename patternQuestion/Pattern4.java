package com.patternQuestion;

public class Pattern4 {
//    1
//    12
//    123
//    1234
//    12345
    public static void main(String[] args){
        format4(5);
    }
    static void format4(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++)
                System.out.print(col+" ");
            System.out.println();
        }
    }
}
