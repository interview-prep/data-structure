package com.sandeep.interview.collections.stacks;

import com.sandeep.interview.collections.oops.StaticOverload;

/**
 * Created by Sandeep on 2/13/2017.
 */
public class Stack {
    int maxsize;
    int arr[];
    int top = -1;

    public Stack(int maxsize) {
        this.maxsize = maxsize;
        this.arr = new int[maxsize];
    }

    public void insert(int x) {
        this.arr[++top] = x;
    }

    public void delete() {
        if(top!=-1){
            int i = this.arr[top--];
        }

    }

    public boolean isFull() {
        return top == maxsize-1;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public int top(){
        int i = 0;
        if(top !=-1){
            i = this.arr[top];
        }
        return i;
    }

    public static void main(String[] args) {
        Stack stack =  new Stack(5);
        stack.insert(1);
        stack.insert(2);
        stack.insert(3);
        stack.insert(4);
        stack.insert(5);
        System.out.println(stack.top());
        stack.delete();
        stack.delete();
        System.out.println(stack.top());

    }
}
