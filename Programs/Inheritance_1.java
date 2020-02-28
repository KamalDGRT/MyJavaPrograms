class A
{
    int x,y;
    
    void display()
    {
        System.out.println("x = " + x + ", y = " + y);
    }
}

class B extends A
{
    int z;
    
    void display()
    {
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
    }
}

class Inheritance_1
{
    public static void main(String args[])
    {
        A O1 = new A();
        B O2 = new B();

        O1.x = 10;
        O1.y = 20;
        O1.display();

        O2.x = 30;
        O2.y = 40;
        O2.z = 50;
        O2.display();

    }
}