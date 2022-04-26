package com.patternQuestion;

public class Pattern7 {
    public static void main(String[] args){
        formate7(5);
        }
        static   void formate7(int n){
        for(int row=1;row<=n;row++){
            int space=n-row;
            for(int i=1;i<=space;i++)
                System.out.print(" ");
            for(int col=row;col>=1;col--)
                System.out.print(col);
            for(int col=2;col<=row;col++)
                System.out.print(col);
            System.out.println();
        }
    }
}
