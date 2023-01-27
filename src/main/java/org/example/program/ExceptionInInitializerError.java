package org.example.program;

public class ExceptionInInitializerError {
    private static  int x=20/0;

    public static void main(String[] args) {
        System.out.println(x);
    }
}
