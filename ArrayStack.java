package com.mycompany.stackexample;

// Stack Implementation Using Array
public class ArrayStack<E> implements Stack<E> {
    
    private static final int CAPACITY = 1000;
    private int t = -1;
    private E[] data;
    
    public ArrayStack() {
        this(CAPACITY);
    }
    
    public ArrayStack(int capacity) {
        data = (E[]) new Object[capacity];
    }
    
    @Override
    public int size() {
        return (t + 1);
    }
    
    @Override
    public boolean isEmpty() {
        return (t == -1);
    }
    
    @Override
    public void push(E e) throws IllegalStateException {
        if(size() == data.length) {
            throw new IllegalStateException("Stack is full.");
        }
        data[++t] = e;
    }
    
    @Override
    public E top() {
        if(size() == 0) {
            return null;
        }
        return data[t];
    }
    
    @Override
    public E pop() {
        if(size() == 0) {
            return null;
        }
        E answer = data[t];
        data[t] = null;
        t--;
        return answer;
    }
    
    
}
