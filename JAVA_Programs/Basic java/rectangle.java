import java.util.Scanner;

class Rect {

    double length, width;
    String colour;
    Scanner sc = new Scanner(System.in);

    void getLength() {
        System.out.print("Enter the length of Rectangle: ");
        length = sc.nextDouble();
    }

    void getWidth() {
        System.out.print("Enter the width of Rectangle: ");
        width = sc.nextDouble();
    }

    void getColour() {
        System.out.print("Enter the colour of Rectangle: ");
        colour = sc.next();
    }

    double findArea() {
        return length * width;
    }

    String showColour() {
        return colour;
    }
}

public class rectangle {

    public static void main(String[] args) {
        Rect r1 = new Rect();
        Rect r2 = new Rect();

        System.out.println("First Rectangle");
        r1.getLength();
        r1.getWidth();
        r1.getColour();

        System.out.println("Area of Rectangle 1: " + r1.findArea());

        System.out.println("\nSecond Rectangle");
        r2.getLength();
        r2.getWidth();
        r2.getColour();

        System.out.println("Area of Rectangle 2: " + r2.findArea());

        // Compare areas and colours
        double area1 = r1.findArea();
        double area2 = r2.findArea();
        String colour1 = r1.showColour();
        String colour2 = r2.showColour();

        if (area1 == area2 && colour1.equals(colour2)) {
            System.out.println("Matching Rectangles");
        } else {
            System.out.println("Non-Matching Rectangles");
        }
    }
}
