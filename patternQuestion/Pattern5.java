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
        format5(5);
    }
    static void format5(int n){
        for(int row=0;row<2*n;row++){
            int colInRow=row>n ? 2*n-row : row;
            for(int col=0;col<colInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        }
    }

