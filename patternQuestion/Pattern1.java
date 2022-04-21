package com.patternQuestion;

public class Pattern1 {
// 1.   *
// 2.   * *
// 3.   * * *
// 4.   * * * *
    public static void main(String[] args){
        format1(4);
    }
    static void format1(int n){
        for(int row=1;row<=n;row++){  // run outer for loop for row or line number of times
            for(int col=1;col<=row;col++){  //this is running the loop row times
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
