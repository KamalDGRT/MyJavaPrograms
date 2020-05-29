/*
Write a program to make use of a parameterized method inside a class. Take the following
case: Create a class Box and define a method in this class which will return the volume of the
box. Initialize two objects for your class and print out the volumes respectively.
*/

import java.util.Scanner;

class Question16 {
    public static void main(String[] args) {
        double length, breadth, height, volume;
        Box b1 = new Box();
        Box b2 = new Box();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Box 1 Details : ");
        System.out.print("Enter length   : ");        
        length = scanner.nextFloat();
        System.out.print("Enter breadth  : ");        
        breadth = scanner.nextFloat();
        System.out.print("Enter height   : ");        
        height = scanner.nextFloat();
        b1.assignDetails(length, breadth, height);
        b1.showDetails();
        System.out.println("Box 1 Volume : " + b1.getVolume());

        System.out.println("\nEnter Box 2 Details : ");
        System.out.print("Enter length   : ");        
        length = scanner.nextFloat();
        System.out.print("Enter breadth  : ");        
        breadth = scanner.nextFloat();
        System.out.print("Enter height   : ");        
        height = scanner.nextFloat();
        b2.assignDetails(length, breadth, height);
        b2.showDetails();
        System.out.println("Box 1 Volume : " + b2.getVolume());
    }
}

class Box {
    private double length, breadth, height, volume;
    Box() {
        length = 0; breadth = 0; height = 0; volume = 0;
    }
    public void assignDetails(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height  = height;
    }

    public double getVolume() {
        volume = length * breadth * height;
        return Math.round(volume);
    }

    public void showDetails() {
        System.out.print("\nLength : " + length + " , ");
        System.out.print("Breadth : " + breadth + " , ");
        System.out.print("Height : " + height + " , ");
    }
}

/* Output after execution

Enter Box 1 Details : 
Enter length   : 10
Enter breadth  : 10
Enter height   : 10

Length : 10.0 , Breadth : 10.0 , Height : 10.0 , Box 1 Volume : 1000.0

Enter Box 2 Details :
Enter length   : 20
Enter breadth  : 20
Enter height   : 20

Length : 20.0 , Breadth : 20.0 , Height : 20.0 , Box 1 Volume : 8000.0

*/
