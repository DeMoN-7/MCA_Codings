import java.util.Scanner;

// Interface for Shape with area method
interface Shape {
    double area();
}

// Circle class implementing Shape interface
class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 3.14159 * radius * radius;
    }
}

// Rectangle class implementing Shape interface
class Rectangle implements Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }
}

// Triangle class implementing Shape interface
class Triangle implements Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double area() {
        return 0.5 * base * height;
    }
}

// Main class with simplified structure
public class shapeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose a shape (1: Circle, 2: Rectangle, 3: Triangle, 4: Exit):");
            int choice = sc.nextInt();

            if (choice == 4) {
                System.out.println("Exiting...");
                break;
            }

            Shape shape = null;

            switch (choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    double radius = sc.nextDouble();
                    shape = new Circle(radius);
                    break;

                case 2:
                    System.out.print("Enter length: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter width: ");
                    double width = sc.nextDouble();
                    shape = new Rectangle(length, width);
                    break;

                case 3:
                    System.out.print("Enter base: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter height: ");
                    double height = sc.nextDouble();
                    shape = new Triangle(base, height);
                    break;

                default:
                    System.out.println("Invalid choice.");
                    continue;
            }

            System.out.println("The area is: " + shape.area());
        }

        sc.close();
    }
}
