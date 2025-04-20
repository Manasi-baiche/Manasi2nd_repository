package inheritance;

class Animal {
    String name = "Animal";

    void display() {
        System.out.println("This is an Animal");
    }
}

class Dog extends Animal {
    String name = "Dog";

    void display() {
        super.display();
        System.out.println("This is a Dog");
    }
}

class SuperKeywordDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}
