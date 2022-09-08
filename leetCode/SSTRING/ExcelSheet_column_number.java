package com.leetCode.SSTRING;
public class ExcelSheet_column_number {
    static int convertToNumber(String title){
        int sum=0;
//        consider each character from string
        for(int i=0;i<title.length();i++){
            sum*=26; //every time multiply the A-1,B-2......z-26 with some 1,2,3,4... this all are reminder
            int mod=title.charAt(i)-'A'+1; //get the reminder as A-1,B-2......z-26
            sum+=mod;//then add with sum
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(convertToNumber("ZY"));

    }
}

