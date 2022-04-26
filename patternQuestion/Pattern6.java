package com.patternQuestion;

public class Pattern6 {
    static void format6(int n){
        for(int row=0;row<2*n;row++){
            int colInRow=row>n ? 2*n-row : row;
            int space=n-colInRow;
            for(int s=0;s<space;s++)
                System.out.print(" ");
            for(int col=0;col<colInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        format6(5);
    }
}
