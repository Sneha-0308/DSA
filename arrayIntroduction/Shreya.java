package com.arrayIntroduction;

public class Shreya {
    static int func(String s){
        int count=0;
        s=s.replaceAll("[\\s]","");
        System.out.println(s);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!((ch<=90 &&ch>=65)||(ch>=97 && ch<=122)||(ch>=48&&ch<=57)))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(func(















                "aa a234bc@ sad$ hsagd^"));
    }
}

//public class Shreya {
////    static int func(int num){
////        int[] arr= num
////
////    }
//public static void main(String[] args) {
//    int[] arr=123;
//}
//}