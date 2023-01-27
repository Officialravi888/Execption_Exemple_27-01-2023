package org.example.program;

//public class ClassCastExceptionExample {
//    public static void main(String[] args) {
//        Object obj = new String("Hello");
//        System.out.println((Integer) obj);
//    }
//}

// Fix error------------------------------------------------------------------------

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Object obj = new String("Hello");

        if (obj instanceof Integer) {
            System.out.println((Integer) obj);
        } else {
            System.out.println(obj);
        }
    }
}


