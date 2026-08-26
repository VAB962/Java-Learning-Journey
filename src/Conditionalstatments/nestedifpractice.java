package Conditionalstatments;

public class nestedifpractice {

    public static void main(String[] args){                 //trek program

        boolean a = false;
        boolean b = true;
        boolean goingtotrip = true;

        if(goingtotrip){
            System.out.println(" Going for Trek");
                System.out.println(" A will Take a bike");

            if (a) {
                System.out.println(" Drived by A");
                if(a){
                    System.out.println(" B will give full petrol money");
                }
            }else{
                System.out.println(" Drived by b");
                if(b){
                    System.out.println(" petrol money will give 50-50");
                }
            }

        }else{
            System.out.println("Trip get cancel due to some reason");
        }

    }
}

