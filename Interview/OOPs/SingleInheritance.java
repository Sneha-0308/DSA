package com.Interview.OOPs;

class Shape1{
    public void area(){
        System.out.println("Displays area");
    }
}

class Triangle1 extends Shape1{
    public void area(int l,int h){
        System.out.println(l*h/2);
    }

}
public class SingleInheritance {
    public static void main(String[] args){
        Triangle1 t=new Triangle1();
        t.area(2,3);
        t.area();
    }
}
