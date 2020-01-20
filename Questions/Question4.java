import java.io.*;
import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {

  }
}

class Vehicle
{
  String modelName, regNo;

  void read()
  {
    Scanner S = new Scanner(System.in);
    System.out.println("Enter Model Name : ");
    modelName = S.newString();
    System.out.println("Enter Register Number : ");
    regNo = S.newString();
    
  }
}
