import java.io.*;
import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
      Vehicle Cycle = new Vehicle();
      Vehicle Car = new Vehicle();
      Vehicle Auto = new Vehicle();

      Cycle.read();
      Car.read();
      Auto.read();

      System.out.println("\n\n Displaying the vehicle details : \n\n");

      Cycle.display();
      Car.display();
  }
}

class Vehicle
{
  String modelName, regNo, noOfWheels;

  void read()
  {
    Scanner S = new Scanner(System.in);
    System.out.println("Enter Model Name : ");
    modelName = S.newString();
    System.out.println("Enter Register Number : ");
    regNo = S.newString();
    System.out.println("Enter Number of Wheels : ");
    noOfWheels = S.newInt();
  }

  void display()
  {
    System.out.println(" Model Name      : " + modelName);
    System.out.println("Register Number  : " + regNo);
    System.out.println("Number of Wheels : " + noOfWheels);
  }
}
