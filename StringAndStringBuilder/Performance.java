package com.StringAndStringBuilder;

public class Performance {
//    But the solution which we have coded is not correct one because for every loop it is going to create new object
//    till we get abcd.......z we will be created with  objects with increasing size that is a,ab,abc,abcd,abcde,,,,,,,,abcd......y this
//    all object will not be referencing to anything which we can say as garbage.
//    complexity will be O(n^2) because for every loop size is increasing by 1 i.e 1+2+3+4+.....+n=n(n+1)/2=O(n^2)
//    TODO because String is immutable it will create new object everytime
//    public static void main(String[] args) {
//        String series=" ";
//        for(int i=0;i<26;i++){
//            char ch=(char)('a'+i);
//            series+=ch;
//        }
//        System.out.println(series);
//    }
//    TODO StringBuilder are mutable
public static void main(String[] args) {
    StringBuilder builder=new StringBuilder();
    for(int i=0;i<26;i++){
        char ch= (char)('a'+i);
        builder.append(ch);
    }
    System.out.println(builder);
    builder.deleteCharAt(0);
    System.out.println(builder);
    builder.reverse();
    System.out.println(builder);
}
}
