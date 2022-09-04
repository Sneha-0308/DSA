package com.leetCode.SSTRING;

import java.util.Stack;

public class Valid_parenthesis {
    static boolean isValid(String str){
//        create a stack of character array
        Stack<Character> stack=new Stack<Character>();
//        iterate the String
        for(int i=0;i<str.length();i++){
            char ele=str.charAt(i);
//            push the element into stack if it is opening parenthesis
            if(ele=='('||ele=='{'||ele=='[')
                stack.push(ele);
            else {
//                when you wont get any opening parenthesis at the first element
                if(stack.isEmpty())
                    return false;
                else if(ele==')' && stack.peek()=='(')
                    stack.pop();
                else if(ele==']' && stack.peek()=='[')
                    stack.pop();
                else if(ele=='}' && stack.peek()=='{')
                    stack.pop();
//                other than (){}[] this character the break the loop
                else
                    break;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args){
        String str="(()";
        System.out.println(isValid(str));
    }
}
