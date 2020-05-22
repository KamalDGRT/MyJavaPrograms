import java.util.Scanner;

class Question1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number 1 : ");
    int a = scanner.nextInt();

    System.out.print("Enter a number 2 : ");
    int b = scanner.nextInt();

    int c = a + b;

    System.out.println("Sum of " + a + " and " + b + " is " + c + ".");

    }
}

/* Output after execution:

Enter a number 1 : 13
Enter a number 2 : 12
Sum of 13 and 12 is 25.

*/
