// A simple java program to pass arguments to a function and display the same
// using two classes


import java.io.*;

public class StudentClass2
{

    public static void main(String[] args)
  {
      Student2 S1 = new Student2();

      S1.read(1,"Kamal");

      S1.display();
  }

}


public class Student2
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
}
