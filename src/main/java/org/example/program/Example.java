package org.example.program;

public class Example {
    public static void main(String[] args) throws Exception {
        try {
            assert args.length > 0;
        }
        catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }

}
