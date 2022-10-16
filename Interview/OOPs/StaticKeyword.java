package com.Interview.OOPs;

//variable or method declare with static keyword can be accessed by ony member
//static is one which is common to all member for example school name for every student in that class will have same school name then we use static String school
class Student1{
    String name;
    static String school;
}
public class StaticKeyword {
    public static void main(String[] args) {
        Student1.school="JVM";  //we don't require object to access static member because these are common to all, so we use class name to access static member
//        if you change the value of school then that will reflect on all student that's why it is called static
//        you should create object to access non static member
        Student1 s=new Student1();
        s.name="Sneha";
        System.out.println(Student1.school+" "+s.name);
    }
}
