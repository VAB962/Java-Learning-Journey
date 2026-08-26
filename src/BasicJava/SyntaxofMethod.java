package BasicJava;

public class SyntaxofMethod {

    //void : empty space or returns nothing

    //syntax 1
    //returntype methodname();
            // code is here

    //e.g
    void method1(){
        System.out.println("This is the simple method ");
    }



    //syntax 2
    //returntype methodname(datatype para1 , datatype para2);
                //code is here

    //e.g

    void method2(int a , int c){
        int result = a+c;
        System.out.println("additon of 2 no are "+ result);
    }

    //e.g 2

    void multiplication(long a, long b){
        long result = a * b;
        System.out.println("the multiplication of this two no are"+result);
    }



    //syntax 3
    //note :- whenever a method return anything other then void ,
    // writing   return   statement inside method is mandatory

    //returntype methodname();
    //  return returntype(value);

    //method return type and the value we are providing from the method must match

    //e.g 1

    int method3(){

        return 10;
    }

    //e.g 2

    float method13(){

        return 10.0f;
    }

    //e.g 3

    boolean didrainwillfall(){

        return true;
    }

    //e.g 4

    String getname(){
        String s ="vishal";

        return s;
    }



    //syntax 4
    //note :- whenever a method return anything other then void ,
    // writing   return   statement inside method is mandatory

    //returntype methodname(datatype para1 , datatype para2);
    //  return returntype(value);

    //e.g 1

    int add (int a, int b){
        int c = a+b;
        return c;
    }

    // e.g 2

    String iwanttoplay(int a, int b){
        int c = a + b ;
        return "iwanttoplay";
    }
}
