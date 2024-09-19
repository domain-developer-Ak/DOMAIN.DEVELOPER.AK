/*
 METHOD OVERLOADING:
 ------------------

            If a class has multiple methods having same name but 
            different in parameters, it is known as Method Overloading.


DIFFERENT WAYS TO OVERLOAD THE METHOD:-
-------------------------------------
=>There are two ways to overload the method in java

            1)By changing number of arguments
            2)By changing the data type



 */



public class method_overloading {

    static int adder(int a, int b){
        return a+b;
    }

    static int adder(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args){
        System.out.println(adder(10, 20));
        System.out.println(adder(10,11,12));
    }
}
