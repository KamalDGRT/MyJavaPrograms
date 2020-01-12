// A simple java program to pass arguments to a function and display the same
// using a single class

import java.io.*;

public class Question1
{
  public static void main(String[] args)
  {
      Student S1 = new Student();
      Student S2 = new Student();
      Student S3 = new Student();

      S1.read(1,"Sam","12345","Chennai");
      S2.read(2,"John","67890","Trichy");

      S1.display();
      S2.display();
  }
}
