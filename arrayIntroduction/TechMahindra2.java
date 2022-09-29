package com.arrayIntroduction;

/**
 * * x="sneha mathadawar"
 * y="sneha"*
 * *
 */
public class TechMahindra2 {
    static String contains(String x,String y){
        String temp=x;
        temp=temp.replace(y,"");
        if(x.length()-y.length()==temp.length()-y.length())
            return "No";
        else
            return "Yes";
    }
    public static void main(String[] args){
        System.out.println(contains("sneha mathadawar"," dawara"));

    }
}
