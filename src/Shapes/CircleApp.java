package Shapes;
import util.Input;

public class CircleApp extends Circle {

    public static void main(String[] args) {
        Input input = new Input();

        double userRadius = input.getDouble();

        Circle circle = new Circle(userRadius);

        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());
    }
}