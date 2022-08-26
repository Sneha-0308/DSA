package com.TCS;
//TODO
import java.util.Scanner;

public class Day5Slot2Q2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int count=0;
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                arr[i][j]=s.nextInt();
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                if(arr[i-1][j-1]==1 && arr[i-1][j]==1){
                    count+=2;
                    arr[i-1][j-1]=0;
                    arr[i-1][j]=0;
                }
            }
        }
    }
}
