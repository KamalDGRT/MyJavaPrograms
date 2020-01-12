// A simple java program to pass arguments to a function and display the same
// using two classes


import java.io.*;

public class StudentClass2
{
  public static void main(String[] args)
  {
      Student S1 = new Student();

      S1.read(1,"Elliot");

      S1.display();
  }

}
