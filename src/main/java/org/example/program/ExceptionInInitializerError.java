package org.example.program;

//public class ExceptionInInitializerError {
//    private static  int x=20/0;
//
//    public static void main(String[] args) {
//        System.out.println(x);
//    }
//}


// Fix Exception----------------------------------------------------------
public class ExceptionInInitializerError{
    private static int x=30/10;

    public static void main(String[] args) {
        System.out.println(x);
    }
}
