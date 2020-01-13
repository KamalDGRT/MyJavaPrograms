// A simple java program to pass arguments to a function and display the same
// using a single class

import java.io.*;

public class Question2
{
  public static void main(String[] args)
  {
      Average A1 = new Average();

      A1.read(2,2,4);
      A1.calculate();
      A1.display();
  }
}
