class Animal{
    void animal(){
       System.out.println("Animal Class");
    }
}

class Lion extends Animal{
    void lion(){
        System.out.println("Lion Class");
    }
}

public class single_inheritance {
    public static void main(String[] args) {
        Lion l = new Lion();
        l.animal();
        l.lion();
    }
}
