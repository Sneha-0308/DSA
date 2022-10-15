package com.Interview.OOPs;
class Shape3{
    public void area(){
        System.out.println("Displays area");
    }
}

class Triangle3 extends Shape3{
    public void area(int l,int h){
        System.out.println(l*h/2);
    }
}

class Circle extends Shape3{
    public void area(int r){
        System.out.println(Math.PI*r*r);
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args){
        Circle c=new Circle();
        c.area(2);
        c.area();

        Triangle3 t=new Triangle3();
        t.area(2,3);
        t.area();

    }
}
