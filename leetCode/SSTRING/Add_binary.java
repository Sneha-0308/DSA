package com.leetCode.SSTRING;

public class Add_binary {
    static String addBinary(String a,String b){
//        create the String builder to revers and append the String
        StringBuilder sb=new StringBuilder();
//        take the last index of both Strings
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        while (i>=0||j>=0){
//            everytime whenever you get the carry add to sum at the end of each addition of digit
            int sum=carry;
//            here we add sum+every digit of i and j.after adding all 3 number check whether the sum is greater than 1
            if(i>=0)
                sum+=a.charAt(i--)-'0';
            if(j>=0)
                sum+=b.charAt(j--)-'0';
//            if sum is greater than 1 then we have to take the carry as one and append the resultant digit sum%2 to the String
            carry=sum>1?1:0;
            sb.append(sum%2);
        }
//        at the end after adding all binary digit if the carry is other than 0 then append that digit at the end of String
        if(carry!=0)
            sb.append(carry);
//        then revers the String
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("10","1"));
    }
}
