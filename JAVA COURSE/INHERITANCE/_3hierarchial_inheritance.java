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

class Tiger extends Animal{
    void tiger(){
        System.out.println("Tiger Class");
    }
}
public class _3hierarchial_inheritance {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        lion.lion();
        tiger.tiger();
    }
}
