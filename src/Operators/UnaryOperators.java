package Operators;

public class UnaryOperators {

    public static void main(String[] args){

        // Integer declared
        int a=100;
        int b=200;

        //using unary operater

        System.out.println("post matrix increment"+ a++ );
        System.out.println("pre matrix increment "+ ++a);
        System.out.println(a);

        System.out.println("post matrix decrement "+ b--);
        System.out.println("pre matrix decrement"+ --b);
        System.out.println(b);

    }
}
