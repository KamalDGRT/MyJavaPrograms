/*
14. Design a class Circle and implement the following methods:
    -  Define a circle method to compute its area
    -  Define a circle method to compute its perimeter
    -  Define a method that takes a given point represented by a pair of numbers and 
        checks whether or not the point is inside the circle.

The circle class needs to have instance variables to store the radius of the circle, and
the x and y coordinates of the center. Add main program to test the class Circle repeatedly,
until user enters negative value for the radius of the circle.

*/

import java.util.Scanner;

class Circle {
    double x, y, radius;

    public void readData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        radius = scanner.nextDouble();
        if (radius < 0) {
            System.exit(0);
        }
        System.out.print("Enter x-coordinate of the centre : ");
        x = scanner.nextDouble();
        System.out.print("Enter y-coordinate of the centre : ");
        y = scanner.nextDouble();
    }

    public void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of circle = " + area);
    }

    public void calculatePerimeter() {
        double area = 2 *  3.14 * radius;
        System.out.println("Perimeter of circle = " + area);
    }

    public void checkIfInsise(double a, double b) {
        double d=Math.sqrt((x-a)*(x-a) + (y-b)*(y-b)); 
        if(radius < d) 
            System.out.println("The given point is outside the circle."); 
        else 
            System.out.println("The given point is inside the circle.");
    }
}

class Question14 {
    public static void main(String[] args) {
        Circle C = new Circle();
        Scanner scanner = new Scanner(System.in);
        double x1, y1;
        do {
            C.readData();
            C.calculateArea();
            C.calculatePerimeter();
            System.out.print("Enter x-coordinate of a point : ");
            x1 = scanner.nextDouble();
            System.out.print("Enter y-coordinate of a point : ");
            y1 = scanner.nextDouble();
            C.checkIfInsise(x1,y1);
        } while (true);
    }
}

/* Output after execution:

Enter the radius of the circle : 10
Enter x-coordinate of the centre : 0
Enter y-coordinate of the centre : 0
Area of circle = 314.0
Perimeter of circle = 62.800000000000004
Enter x-coordinate of a point : 5
Enter y-coordinate of a point : 5
The given point is inside the circle.
Enter the radius of the circle : -2

*/
