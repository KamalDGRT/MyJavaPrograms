/* Write a Java Program which prompts the user to enter 4 numbers. The program will then
computes and display their sum and their product.
*/

import java.util.Scanner;

class Question11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 1, m, sum = 0, product = 1;
        while(n <= 4){
            System.out.print("Enter number " + n + " : ");
            m = scanner.nextInt();
            sum += m;
            product *= m;
            n += 1;
        }
        System.out.println("Sum = " + sum + " , Product = " + product);
    }
}

/* Output after execution :

Enter number 1 : 1
Enter number 2 : 2
Enter number 3 : 4
Enter number 4 : 5
Sum = 12 , Product = 40

*/
