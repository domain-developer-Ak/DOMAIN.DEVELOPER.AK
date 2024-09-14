class Animal {
    void animal() {
        System.out.println("Animal Class");
    }
}

class Lion extends Animal {
    void lion() {
        System.out.println("Lion Class");
    }

}

public class _1single_inheritance{
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.animal();
        lion.lion();
    }
}
