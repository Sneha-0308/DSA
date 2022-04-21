package com.patternQuestion;

public class Pattern5 {
//    *
//    **
//    ***
//    ****
//    *****
//    ****
//    ***
//    **
//    *
    public static void main(String[] args){
        format5(9);
    }
    static void format5(int n){
        for(int row=1;row<=n;row++){
            if(row<=(n/2)+1){
                for(int col=1;col<=row;col++)
                    System.out.print("* ");
            }
            else {
                for(int col=n-1;col>=1;col++)
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
