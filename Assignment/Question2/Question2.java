// Java program to print the count of odd and even no’s entered.

import java.util.Scanner;

class Question2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    
    System.out.print("Enter number of elements : ");
    int n = scanner.nextInt();

    int[] a = new int[n];
    int eventCount = 0, oddCount = 0;

    for (int i = 0; i < n ; i++){
        System.out.print("Enter number " + (i + 1) + " : ");
        a[i] = scanner.nextInt();
    }

    for (int i = 0; i < n ; i++){
        if(a[i] %2 == 0)
            eventCount += 1;
        else
            oddCount += 1;
    }

    System.out.println("Odd Count : " + oddCount + " , Even Count : " + eventCount);
    }
}

/* Output after execution:
Enter number of elements : 10
Enter number 1 : 1
Enter number 2 : 2
Enter number 3 : 3
Enter number 4 : 1
Enter number 5 : 4
Enter number 6 : 5
Enter number 7 : 34
Enter number 8 : 24
Enter number 9 : 2
Enter number 10 : 45
Odd Count : 5 , Even Count : 5
*/
