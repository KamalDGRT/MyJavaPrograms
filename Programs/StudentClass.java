// A simple java program to pass arguments to a function and display the same
// using a single class

import java.io.*;

public class StudentClass
{

  int rno;
  String name;

  void read(int x, String S)
  {
    rno = x;
    name = S;
  }
  void display()
  {
    System.out.println("Student Roll Number : " + rno + "     Student Name : " + name);
  }

  public static void main(String[] args)
  {
      StudentClass S1 = new StudentClass();
      StudentClass S2 = new StudentClass();
      StudentClass S3 = new StudentClass();

      S1.read(1,"Kamal");
      S2.read(2,"Hamid");
      S3.read(3,"Kushal");

      S1.display();
      S2.display();
      S3.display();
  }
}
