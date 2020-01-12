import java.io.*;

public class Student
{
  int rno;
  String name;

  void read(int R, String N)
  {
    rno = R;
    name = N;
  }

  void display()
  {
    System.out.println("Student Details :");
    System.out.println("Roll     : " + rno);
    System.out.println("Name     : " + name);
  }
}
