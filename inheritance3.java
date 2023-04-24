class Shape {
    double dim1, dim2;

    public Shape(double a, double b) {
        this.dim1 = a;
        this.dim2 = b;
    }

    public void printArea() {
        System.out.println("Area");
    }
}

class Rectangle extends Shape {
    public Rectangle(double a, double b) {
        super(a, b);
    }

    public void printArea() {
        double area = dim1 * dim2;
        System.out.println("Area of the rectangle: " + area);
    }
}

class Triangle extends Shape {
    public Triangle(double p, double q) {
        super(p, q);
    }

    public void printArea() {
        double area = 0.5 * dim1 * dim2;
        System.out.println("Area of the triangle: " + area);
    }
}

public class inheritance3 {
    public static void main(String[] args) {
        Shape s1 = new Shape(10, 20);
        s1.printArea();

        Rectangle r1 = new Rectangle(5, 8);
        r1.printArea();

        Triangle t1 = new Triangle(6, 12);
        t1.printArea();
    }
}