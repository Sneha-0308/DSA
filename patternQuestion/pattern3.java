package com.patternQuestion;

public class pattern3 {
//    ****
//    ***
//    **
//    *
    public static void main(String[] args){
        format3(4);
    }
    static void format3(int n){
        for(int row=1;row<=n;row++){
            for(int col=n;col>=1;col--)
                System.out.print("* ");
            System.out.println();
        }
    }
}
