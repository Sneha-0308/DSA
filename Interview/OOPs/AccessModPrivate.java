package com.Interview.OOPs;

class Modifier{
    private String password;

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password=password;
    }
}
public class AccessModPrivate {
    public static void main(String[] args){
        Modifier m=new Modifier();
//        m.password="sneha&&&";  //this gives error because we can not access private member of class we should first creat getters and setter for private member
        m.setPassword("abcd");
        System.out.println(m.getPassword());
    }
}
