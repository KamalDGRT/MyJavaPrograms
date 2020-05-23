// Java program to find the roots of a quadratic equation. Assign the values of a, b and
// c of the equations in the program itself.

class Question5 {
    public static void main(String[] args) {

        double a, b, c, x1, x2, discriminant, realPart, imaginaryPart;

        a = 1; b = -2; c = 1;

        if (a == 0) {
            System.out.println("Not a quadratic equation.");
        }
        else {
            discriminant = b*b - 4*a*c;
            if (discriminant > 0) {
                x1 = (-b + Math.sqrt(discriminant)) / (2*a);
                x2 = (-b - Math.sqrt(discriminant)) / (2*a);
                System.out.println("Roots are real and different.");
                System.out.println(" x1 = " + x1 );
                System.out.println(" x2 = " + x2 );
            }
            else if (discriminant == 0) {
                System.out.println("Roots are real and same.");
                x1 = (-b + Math.sqrt(discriminant)) / (2*a);
                System.out.println("x1 = x2 = " + x1);
            }
            else {
                realPart = -b/(2*a);
                imaginaryPart =Math.sqrt(-discriminant)/(2*a);
                System.out.println("Roots are complex and different.");
                System.out.println( "x1 = " + realPart + " + " + imaginaryPart + "i");
                System.out.println( "x2 = " + realPart + " - " + imaginaryPart + "i");
            }
        }
    }
}

/* Output after execution

Roots are real and same.
x1 = x2 = 1.0

*/
