package com;/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
   static boolean check(int v){
        if(v%2==0)
            return true;
        else
            return false;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++){
            int count=0;
            int ans=-1;
            int n=s.nextInt();
            int[] a=new int[n];
            for(int j=0;j<n;j++){
                a[j]=s.nextInt();
                if(check(a[j])){
                 count++;
                ans=Math.max(count,ans);
                }
            else count=0;}
            System.out.println(ans);
        }
    }

}