- Shape:
    An enum Color with values RED, GREEN, and BLUE.
    A protected Color instance variable.
    A protected constructor that initializes the color.
- A method public double calculateArea() that returns 0.0.

- Rectangle:
    private instance variables width and height.
    A constructor that takes Color, width, and height as arguments.
- Override calculateArea() to return the area of the rectangle.

- Circle:
    A private instance variable radius.
    A constructor that takes Color and radius as arguments.
- Override calculateArea() to return the area of the circle.

- Create a ShapeTester class with a main method that creates instances of Rectangle and Circle, and demonstrates polymorphism by calling calculateArea() on both.

// ShapeTester.java
public class ShapeTester {
public static void main(String[] args) { 
Shape rectangle = new Rectangle(Shape.Color.RED, 5, 10); 
Shape circle = new Circle(Shape.Color.BLUE, 7); 
System.out.println("Rectangle area: " + rectangle.calculateArea() + " color: " + rectangle.getColor()); 
System.out.println("Circle area: " + circle.calculateArea() + " color: " + circle.getColor()); 
  } 
}

Example Output:
Rectangle area: 50.0 color: RED
Circle area: 153.93804002589985 color: BLUE
