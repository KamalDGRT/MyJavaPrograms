class A1
{
    int x,y;
    
    void display()
    {
        System.out.println("x = " + x + ", y = " + y);
    }
}

class B1 extends A1
{
    int z;
    
    void display()
    {
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
    }
}

public class Inheritance_1
{
    public static void main(String args[])
    {
        A1 O1 = new A1();
        B1 O2 = new B1();

        O1.x = 10;
        O1.y = 20;
        O1.display();

        O2.x = 30;
        O2.y = 40;
        O2.z = 50;
        O2.display();

    }
}