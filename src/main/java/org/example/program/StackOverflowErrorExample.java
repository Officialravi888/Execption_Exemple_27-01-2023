package org.example.program;

public class StackOverflowErrorExample {
    public void print(int myInt) {
        System.out.println(myInt);
        print(myInt);
    }

    public static void main(String[] args) {
        StackOverflowErrorExample soe = new StackOverflowErrorExample();
        soe.print(0);
    }
}

