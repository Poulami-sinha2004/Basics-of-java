package Practise_oops;

interface Shape {
    float getArea();
    float getPerimeter();
}

class Rectangle implements Shape {
    float length;
    float breadth;

    Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public float getArea() {
        return length * breadth;
    }
z
    @Override
    public float getPerimeter() {
        return 2 * (length + breadth);
    }

    @Override
    public String toString() {
        return "Rectangle: length=" + length + ", breadth=" + breadth +
               ", area=" + getArea() + ", perimeter=" + getPerimeter();
    }
}

class Square implements Shape {
    float side;

    Square() {
        this.side = 0;
    }

    Square(float side) {
        this.side = side;
    }

    @Override
    public float getArea() {
        return side * side;
    }

    @Override
    public float getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square: side=" + side +
               ", area=" + getArea() + ", perimeter=" + getPerimeter();
    }
}

class Circle implements Shape {
    float radius;

    Circle() {
        this.radius = 0;
    }

    Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return 3.14f * radius * radius;
    }

    @Override
    public float getPerimeter() {
        return 2 * 3.14f * radius;
    }

    @Override
    public String toString() {
        return "Circle: radius=" + radius +
               ", area=" + getArea() + ", perimeter=" + getPerimeter();
    }
}

public class Program1 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5.0f, 4.0f);
        Square r1 = new Square(4.0f);
        Circle c = new Circle(3.1f);

        System.out.println(r);
        System.out.println(r1);
        System.out.println(c);
    }
}