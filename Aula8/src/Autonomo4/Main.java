package Autonomo4;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2, 4);
        Rectangle rectangle2 = new Rectangle(6, 8);
        Circle  circle1 = new Circle(3);
        Circle circle2 = new Circle(6);
        Square square = new Square(2);

        Shape[] shapes = new Shape[5];

        shapes[0] = rectangle1;
        shapes[1] = rectangle2;
        shapes[2] = circle1;
        shapes[3] = circle2;
        shapes[4] = square;

        System.out.println("Shapes");
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < shapes.length; i++){
            System.out.println("Details of shape " + (i + 1) + ": ");
            System.out.println(shapes[i].toString() + " // " + "The perimeter is of " + shapes[i].calculatePerimeter() + " // The area is of " + shapes[i].calculateArea());
        }
    }
}
