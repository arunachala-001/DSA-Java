package com.arun.dsa.stack;

public class ArrayStackImpl {
    int[] arr = new int[30];
    int top;

    public ArrayStackImpl() {
        top = -1;
    }

    public void push(int i) {
        if(top == arr.length-1) {
            throw new StackOverflowError("Stack is Full!");
        }
        arr[++top] = i;
    }

    public int pop() {
        if(top == -1) {
            throw new IndexOutOfBoundsException("Empty Stack!");
        }
        return arr[top--];
    }

    public int peek() {
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        int[] input = {10,30,20,50};
        ArrayStackImpl stack = new ArrayStackImpl();
        for(int i : input) {
            stack.push(i);
        }

        System.out.println("Popped top element "+stack.pop());
        System.out.println("Returned top element " +stack.peek());
        System.out.println(stack.isEmpty());

    }
}
