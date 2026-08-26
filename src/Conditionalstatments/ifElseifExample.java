package Conditionalstatments;

public class ifElseifExample {

    // size 28 = Xs
    // size 30 = Small
    // size 32 = M
    // size 34 = l
    // size 36 = Xl
    // size 38 = Xxl

    public static void main(String[] args){

        int size=34;

        if(size==28){
            System.out.println("size is xs");
        }else if(size==30){
            System.out.println("size is small");
        }else if(size==32){
            System.out.println("size is M");
        }else if(size==34){
            System.out.println("size is L");
        }else if(size==36){
            System.out.println("size is xL");
        }else if(size==38){
            System.out.println("size is xxl");
        }else {
            System.out.println("Give the right size");
        }
    }
}
