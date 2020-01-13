// A simple java program to pass arguments to a function and display the same
// using a single class

import java.io.*;

public class Question3
{
  public static void main(String[] args)
  {
      Average A1 = new Average();

      A1.read(2,2,4);
      A1.calculate();
      A1.display();
  }
}

class Average
{
  int n1, n2, n3;
  float avg;

  void read(int a, int b, int c)
  {
     n1 = a;
     n2 = b;
     n3 = c;
  }

  void calculate()
  {
    avg = n1 + n2 + n3;
    avg = avg / 3;
  }
  void display()
  {
    System.out.println("Details :");
    System.out.println("Number 1     : " + n1);
    System.out.println("Number 2     : " + n2);
    System.out.println("Number 3     : " + n3);
    System.out.println("Average      : " + avg);
  }
}
