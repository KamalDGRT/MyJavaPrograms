/*
Implement the classes for the shapes using an interface for the common methods, rather
than inheritance from the superclass, while still Shape as a base class.
*/

interface Shape { 
    void input();
    void area();
}

class Circle implements Shape {
    int r = 0;
    double pi = 3.14, ar = 0;
    public void input() {
        r = 5;
    }
    public void area() {
        ar = pi * r * r;
        System.out.println("Area of circle : " + ar); 
    }
}

class Rectangle extends Circle {
    int l = 0, b = 0;
    double ar;
    public void input() {
        super.input();  
        l = 6;
        b = 4;
    }
    public void area() {
        super.area();
        ar = l * b;
        System.out.println("Area of rectangle : " + ar);
    }
}

class Question21 {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.input();
        obj.area();
    }
}

/* Output after execution

Area of circle : 78.5
Area of rectangle : 24.0

*/
