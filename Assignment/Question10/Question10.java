/* Write a program to calculate the area of triangle, square, circle, rectangle by using method
overloading.
*/


import java.util.Scanner;

class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        area(); // for Triangle

        System.out.println("\nSquare :-");  
        System.out.print("Enter the side  : ");        
        float side = scanner.nextFloat();
        float sqarea = area(side, side);
        System.out.println("Area of Square = " + sqarea + " sq. units");

        System.out.println("\nCircle :-");  
        System.out.print("Enter the radius : ");        
        float r = scanner.nextFloat();
        float cirarea = area(r);
        System.out.println("Area of Circle = " + cirarea + " sq. units");

        System.out.println("\nRectangle :-");  
        System.out.print("Enter the length  : ");        
        float length = scanner.nextFloat();
        System.out.print("Enter the breadth  : ");        
        float breadth = scanner.nextFloat();
        float recarea = area(length,breadth);
        System.out.println("Area of Rectangle = " + recarea + " sq. units");
    }

    public static void area() {                    // for Triangle
        Scanner scanner = new Scanner(System.in);

        System.out.println("Triangle :-");  
        System.out.print("Enter the base  : ");        
        float base = scanner.nextFloat();

        System.out.print("Enter the height  : ");        
        float height = scanner.nextFloat();
        float area = base * height / 2 ;

        System.out.println("Area of Triangle = " + area + " sq. units");
    }

    public static float area(float radius) {        // for Circle
        return (float)3.14 * radius * radius;
    }

    public static float area(float sideA, float sideB){  // for Square and Rectangle
        return sideA * sideB;
    }

}

/* Output after Execution

Triangle :-
Enter the base  : 10
Enter the height  : 5
Area of Triangle = 25.0 sq. units

Square :-
Enter the side  : 40
Area of Square = 1600.0 sq. units

Circle :-
Enter the radius : 100
Area of Circle = 31400.0 sq. units

Rectangle :-
Enter the length  : 10
Enter the breadth  : 50
Area of Rectangle = 500.0 sq. units

*/
