// Java program for finding the sum, difference, product, quotient, 
// minimum and maximum of any two integers

import java.util.Scanner;

class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number 1 : ");
        int a = scanner.nextInt();

        System.out.print("Enter a number 2 : ");
        int b  = scanner.nextInt();

        System.out.println("Sum of two integers: " + ( a + b )); 
        System.out.println("Difference of two integers: " + ( a - b ));
        System.out.println("Product of two integers: " + ( a * b ));
        System.out.println("Quotient of two integers: " + ( a / b ));
        System.out.println("Max integer: " + ( Math.max(a, b )));
        System.out.println("Min integer: " + ( Math.min(a, b )));
    }
}


/* Output after execution:
Enter a number 1 : 10
Enter a number 2 : 5
Sum of two integers: 15
Difference of two integers: 5
Product of two integers: 50
Quotient of two integers: 2
Max integer: 10
Min integer: 5
*/
