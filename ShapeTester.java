class Shape {
    enum Color { RED, GREEN, BLUE }
    protected Color color;

    protected Shape(Color color) {
        this.color = color;
    }

    public double calculateArea() {
        return 0.0;
    }

    public Color getColor() {
        return color;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class ShapeTester {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(Shape.Color.RED, 5, 10);
        Shape circle = new Circle(Shape.Color.BLUE, 7);
        System.out.println("Rectangle area: " + rectangle.calculateArea() + " color: " + rectangle.getColor());
        System.out.println("Circle area: " + circle.calculateArea() + " color: " + circle.getColor());
    }
}