package com.leetCode.SSTRING;

public class ExcelSheet_column_title {
    static String convertToTitle(int columnnumber){
        StringBuilder sb=new StringBuilder();
        while (columnnumber>0){
            columnnumber--; //We are first decrementing the value of column  number by one because we are adding
            // A with every reminder we get so for that purpose we reduce the value by one if you are adding the
            // reminder with B then we have to first decrement the value by two
            int current=columnnumber%26; //get the reminder so that you can add that value with 'A'
            columnnumber/=26; //and reduce the column number
            sb.append((char) (current+'A'));  // first add the reminder and ascii value of A then convert that
            // ascii value to respective character
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args){
        int col=701;
        System.out.println(convertToTitle(col));
    }
}
