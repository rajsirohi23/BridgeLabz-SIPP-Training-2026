abstract class Shape {
    abstract double area();
    abstract double perimeter();
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }

    double perimeter() {
        return 2 * (length + width);
    }
}

class Triangle extends Shape {
    double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    double perimeter() {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Triangle(3, 4, 5);

        System.out.println("Shape\t\tArea\t\tPerimeter");

        for (Shape s : shapes) {
            System.out.printf("%s\t\t%.2f\t\t%.2f%n",
                    s.getClass().getSimpleName(),
                    s.area(),
                    s.perimeter());
        }
    }
}
