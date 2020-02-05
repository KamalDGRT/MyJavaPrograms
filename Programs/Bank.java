abstract class Bank
{
    double rateOfInterest()
    {
        return 0.5;
    }

    void display()
      {
         System.out.println("inside");
      }
}

class Indian extends Bank
{
    double rateOfInterest()
    {
        return 0.75;
    }
}

class HDFC extends Bank
{
    double rateOfInterest()
    {
        return 0.9;
    }
}

class ICICI extends Bank
{
    float rateOfInterest()
    {
        System.out.println(0.75);
    }
}
