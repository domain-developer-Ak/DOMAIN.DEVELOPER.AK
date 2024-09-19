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

class Cat extends Lion {
    void cat() {
        System.out.println("Cat Class");
    }
}
public class _2multilevel_inheritance {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.animal();
        cat.lion();
        cat.cat();
    }
}
