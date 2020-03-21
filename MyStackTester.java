package com.sjsu;

public class MyStackTester {
    public static void main(String[] args) {
        MyStack list = new MyStack();

        //add to the list
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);

        //check if the list is empty
        System.out.println("Is the list empty?:" + list.isEmpty());

        //check the size
        System.out.println("The size of list:" + list.getSize());

        //display the list
        System.out.println(list.toString());

        //peek the top the list
        System.out.println("The last element in:" + list.peek());

        //pop the last element
        list.pop();
        System.out.print("The list after popping" + list.toString());

    }
}
