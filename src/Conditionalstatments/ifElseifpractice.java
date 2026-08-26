package Conditionalstatments;

public class ifElseifpractice {
    //Marks system
    public static void main(String[] args){

        int marks = 8888;

        if(marks < 35){
            System.out.println("You are Fail");
        }else if(marks >= 35 && marks < 60){
            System.out.println("You are Passed class second");
        }else if(marks >= 60 && marks < 75){
            System.out.println("You are Passed class First");
        }else if(marks >= 75 && marks < 90){
            System.out.println("You are Passed first class with Distinction");
        }else if(marks >=90 && marks <= 100){
            System.out.println("You are in Merit");
        }else {
            System.out.println("Enter the correct marks between 0 to 100");
        }
    }

}
