/*  Write a program in the sequence 1 1 2 3 5 8 13 21 ……………… is called Fibonacci numbers.
Write a program using a do…while loop to calculate and print the first m Fabonacci numbers.
*/

import java.util.Scanner;

class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of m : ");        
        int m = scanner.nextInt();

        System.out.print("Fibonacci Series : ");

        int i = 0, a = -1, b = 1, c;
        do {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            i++;
        } while (i < m);
    }
}

/* Output after Execution

Enter the value of m : 10
Fibonacci Series : 0 1 1 2 3 5 8 13 21 34

*/
