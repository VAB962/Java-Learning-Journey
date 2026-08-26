package BasicJava;

public class CallingMethodAndVariable {

    int add = 20 ;              // add = variable
    float sub = 13000.00f;      // sub = variable

    void method1(){               //method1 = methodName
        System.out.println("Test Method 1");
    }

    void method2(int a , int b){   //method2 = methodName with parameter
        System.out.println("Test method 2");
    }

    public static void main (String[] args)
    {
        System.out.println("This is the starting point of the program");

        CallingMethodAndVariable obj = new CallingMethodAndVariable();

        //syntax for calling an variable
        // objectRefrenceName.Variable name

        System.out.println(obj.add);    //calling variable
        System.out.println(obj.sub);    //calling variable


        //syntax for calling method

        obj.method1();
        obj.method2(100,200);
        obj.method3(100);




    }
    void method3(int a){
        System.out.println("test this method 3");

    }

    }


