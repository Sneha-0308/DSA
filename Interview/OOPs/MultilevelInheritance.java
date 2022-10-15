package com.Interview.OOPs;

class Shape2{
    public void area(){
        System.out.println("Displays area");
    }
}

class Triangle2 extends Shape2{
    public void area(int l,int h){
        System.out.println(l*h/2);
    }
}

class EquilateralTriangle extends Triangle2{
    public void area(int l,int h){
        System.out.println(l*h/2);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args){
        EquilateralTriangle e=new EquilateralTriangle();
        e.area(2,3);  //EquilateralTriangle
        e.area(3,4); //Triangle
        e.area();  //Shape

    }
}
