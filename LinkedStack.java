
package com.mycompany.linkedstack;

public class LinkedStack<E> implements Stack<E> {
    
    SinglyLinkedList<E> list = new SinglyLinkedList<>();
    
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    @Override
    public E top() {
        return list.first();
    }

}
