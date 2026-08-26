package Conditionalstatments;

public class NestedIf {

    public static void main(String[] args){

        int marks = 100;
        boolean feepaid = true;

        if(marks>35){
            if(feepaid){
                System.out.println("Student pass and release result");
            }else{
                System.out.println("Student pass and Fee not paid ");
            }
        }else{
            System.out.println("Student not passed");
        }
    }
}
