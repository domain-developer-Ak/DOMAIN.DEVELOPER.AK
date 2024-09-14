/*
 METHOD OVERRIDING:
 ------------------

            If a class has multiple methods having same name 
            It is known as Method Overriding.

            It overrides the previous method data.

 */

class Bike{
    static int adder(int a, int b){
        return a+b;
    }
}


class Bike2{
    static int adder(int a, int b){
        return a-b;
    }
}


public class method_overriding {
    public static void main(String[] args) {
        Bike2 b = new Bike2();
        b.adder(10, 20);
    }
}
