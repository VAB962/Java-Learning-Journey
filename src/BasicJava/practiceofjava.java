package BasicJava;

public class practiceofjava {





    byte k = 82;
    short l = 827;
    int a = 20 ;
    float f = 1938.0f;
    double b = 288374 ;                    // datatypes
    long p = 882764;
    char c = 'c';
    String s = "i have to banana";
    boolean g = true ;




    class rohit{
                                            // class created
    }





    int q = 20 ;                            // q is an int variable initialized with the value 20






    void method1(){                                                                  //No parameter
        System.out.println("this is first method ");
    }

    void method2(int a, int b)                                                       //Parameter
    {
        int c= a*b;
        System.out.println("This is second method "+ c);
    }

    int method3(){                                                                   // No parameter
        System.out.println("this is third method");
        return 100;
    }

    int method4(int a, int b){                                                      // Parameter
        int c = a+b;
        System.out.println("this is the fouth method"+ c);
        return 0;
    }





    public static void main (String[] args) {

        practiceofjava obj1 = new practiceofjava();
                                                                            // object is created in static void main
        practiceofjava obj2 = new practiceofjava();




        obj1.method1();                                        // call method
        obj2.method2(100 , 500);                         // call method
        obj2.method4(900,300);



        System.out.println(obj1.a);
        System.out.println(obj2.s);

    }

}
