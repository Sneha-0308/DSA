package com.Interview;

class Shape{
    String color;
}

class Triangle extends Shape{

}
public class Inheritance {
    public static void main(String[] args){
        Triangle t1=new Triangle();
        t1.color="pink";
        System.out.println(t1.color);
    }
}
