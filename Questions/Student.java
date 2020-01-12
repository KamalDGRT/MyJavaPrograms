import java.io.*;

public class Student
{
  int rno;
  String name;
  String phno;
  String address;

  void read(int R, String N, String P, String A)
  {
    rno = R;
    name = N;
    phno = P;
    address = A;
  }
  void display()
  {
    System.out.println("Student Details :");
    System.out.println("Roll     : " + rno);
    System.out.println("Name     : " + name);
    System.out.println("Address  : " + address);
    System.out.println("Ph. No.  : " + phno+ "\n");

  }
}
