package Autonomo4;

public class Circle  extends Shape {

    private float radius;

    public Circle(float radius){
        this.radius = radius;
    }

    @Override
    public float calculateArea() {
        return (float) (Math.PI * Math.pow(radius,  2));
    }

    @Override
    public float calculatePerimeter() {
        return (float) (2 * Math.PI * radius);
    }

    @Override
    public String toString() {
        return "This shape is a circle with a radius of " + radius;
    }
}
