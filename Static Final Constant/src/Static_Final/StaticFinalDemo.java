package Static_Final;

public class StaticFinalDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        System.out.println("Area of Circle: " + c1.calculateArea());

        Circle c2 = new Circle(10);
        System.out.println("Area of Circle: " + c2.calculateArea());

        // accessing static final directly via class
        System.out.println("Value of PI: " + Circle.PI);
    }
}