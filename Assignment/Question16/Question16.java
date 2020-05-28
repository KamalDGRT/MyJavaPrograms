/*
Write a program to make use of a parameterized method inside a class. Take the following
case: Create a class Box and define a method in this class which will return the volume of the
box. Initialize two objects for your class and print out the volumes respectively.
*/

import java.util.Scanner;

class Question16 {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box();

        b1.getDetails();
        b1.showDetails();
        System.out.println("Volume : " + b1.getVolume());

        b2.getDetails();
        b2.showDetails();
        System.out.println("Volume : " + b2.getVolume());
    }
}

class Box {
    private double length, breadth, height, volume;
    Box() {
        length = 0; breadth = 0; height = 0; volume = 0;
    }
    public void getDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length   : ");        
        length = scanner.nextFloat();
        System.out.print("Enter breadth  : ");        
        breadth = scanner.nextFloat();
        System.out.print("Enter height   : ");        
        height = scanner.nextFloat();
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

Enter length   : 10
Enter breadth  : 10
Enter height   : 19

Length : 10.0 , Breadth : 10.0 , Height : 19.0 , Volume : 1900.0
Enter length   : 34
Enter breadth  : 10
Enter height   : 5

Length : 34.0 , Breadth : 10.0 , Height : 5.0 , Volume : 1700.0

*/
