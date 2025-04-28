package polymorphism;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class MethodOverloadingDemo {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Sum: " + c.add(5, 10));
        System.out.println("Sum: " + c.add(5.5, 10.5));
    }
}
