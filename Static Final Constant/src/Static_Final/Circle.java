package Static_Final;

class Circle {
    static final double PI = 3.14159;  // constant value

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return PI * radius * radius;
    }
}

