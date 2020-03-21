package com.sjsu;

import java.util.ArrayList;

/**
 * Simulate Stack data structure
 */
public class MyStack {
    private ArrayList<Integer> list;

    /**
     * Initialize empty Stack data structure
     */
    public MyStack() {

        this.list = new ArrayList<Integer>();
    }

    /**
     * Check if the stack is empty
     *
     * @return true if stack is empty
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * Number of elements in the stack
     *
     * @return the size of the stack
     */
    public int getSize() {
        return list.size();
    }

    /**
     * Returns the top (last added) element in the stack without removing it
     *
     * @return the top of the stack
     */
    public int peek() {
        //last in first out so the last element you peek at the last element in
        return list.get(getSize() - 1);
    }

    /**
     * Returns and removes the top (last added) element from the stack
     *
     * @return the top of the stack
     */
    public int pop() {
        list.remove(getSize() - 1);
        return list.get(getSize() - 1);
    }

    /**
     * Add a new element to the top (the end of the list) of the stack
     *
     * @param value element to be added
     */
    public void push(int value) {
        list.add(value);
    }

    @Override
    public String toString() {
        return "stack: " + this.list.toString();
    }
}
