package Autonomo4;

public class Rectangle extends Shape {

    private float width;
    private float length;

    public Rectangle(float width, float length){
        this.width = width;
        this.length = length;
    }

    @Override
    public float calculateArea() {
        return width * length;
    }

    @Override
    public float calculatePerimeter() {
        return 2 * width + 2 * length;
    }

    @Override
    public String toString() {
        return "This shape is a rectangle with a width of " + width + " and a length of " + length;
    }
}
