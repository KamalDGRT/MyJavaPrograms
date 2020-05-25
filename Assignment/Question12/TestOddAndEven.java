/*
Write Java program involving two classes: OddAndEven and TestOddAndEven. 

OddAndEven has the following: 
    - Instance varaibales countOfOdd and countOfEven both of type int
    - A method addNumber that takes a number as parameter and increment countOfOdd, 
        if the number is odd, else increment countOfEven.
    - A method toString that returns a string in the form: 
        "Number of Odd: x, Number of Even : y", 
        where x and y are the values of the instance variables. 

The TestOddAndEven class first creates OddAndEven object, then in a loop, read a
number and use it to call the addNumber method until the user enters Q. 
Finally, it prints the count of odd and even numbers entered.
*/

import java.util.Scanner;

class OddAndEven {
    int countOfOdd, countOfEven;
    public void addNumber(int n) {
        if (n%2==1)
            countOfOdd += 1;
        else 
            countOfEven += 1;
    }

    public String toString() {
        return "Number of Odd: " + countOfOdd + ", Number of Even : " + countOfEven;
    }
}
class TestOddAndEven {
    public static void main(String[] args) {
        
        OddAndEven object = new OddAndEven();        
        Scanner scanner = new Scanner(System.in);
        int number;
        String choice;

        do {
            System.out.print("\nEnter a number : ");
            number = scanner.nextInt();
            object.addNumber(number);
            System.out.println("Press 'Y' to continue, 'Q' to quit.");
            System.out.print("Enter your choice : ");
            choice = scanner.next();
        } while (!(choice.equals("Q")));
        System.out.println("\n" + object.toString());
    }
}

/* Output after execution 

Enter a number : 1
Press 'Y' to continue, 'Q' to quit.
Enter your choice : Y

Enter a number : 2
Press 'Y' to continue, 'Q' to quit.
Enter your choice : Y

Enter a number : 3
Press 'Y' to continue, 'Q' to quit.
Enter your choice : Y

Enter a number : 4
Press 'Y' to continue, 'Q' to quit.
Enter your choice : Y

Enter a number : 5
Press 'Y' to continue, 'Q' to quit.
Enter your choice : Q

Number of Odd: 3, Number of Even : 2

*/
