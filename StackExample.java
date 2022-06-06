
package com.mycompany.stackexample;

// Stack Main class
public class StackExample {

    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();
        stack.push(5);
        stack.push(6);
        System.out.println(stack.size());
        System.out.println(stack.top());
        
        
    }
}
