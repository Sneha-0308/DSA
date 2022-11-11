package com.DataStructure;

public class LL {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addList(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head; //to not to loss the head because of that we use currNode so remember neverever update the head value;
        while (currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;

    }

    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode=head; //to not to loss the head because of that we use currNode so remember neverever update the head value;
        while (currNode!=null){ //if we use currNode.next!=null then it will not print last list element
            System.out.print(currNode.data+ "->");
            currNode=currNode.next;
        }
        System.out.println("NULL");

    }
    public static void main(String[] args){
        LL list=new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addList("list");
        list.printList();
        list.addFirst("this");
        list.printList();
    }
}
