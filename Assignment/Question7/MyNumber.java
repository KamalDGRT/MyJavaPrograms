/*  Write a java program 'MyNumber.java" that performs following operations on a variable
'num' of type double: 
a) Finds the round value of 'num' and stores the result in a variable numRound of type double. 
b) Finds the ceil value of 'num' and stores the result in a variable numCeil of type double. 
c) Finds the floor value of 'num' and stores the result in a variable numFloor of type double 
d) Cast 'num' to type int and stores the result in a variable numInteger of type int. 
Display output of numRound, numCeil, numFloor and numInteger on screen.
*/

import java.util.Scanner;

class MyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        double num = scanner.nextDouble();

        double numRound  = Math.round(num); 
        double numCeil  = Math.ceil(num);
        double numFloor = Math.floor(num);
        int numInteger = (int)num;

        System.out.println("numRound = " + numRound);
        System.out.println("numCeil = " + numCeil);
        System.out.println("numFloor = " + numFloor);
        System.out.println("numInteger = " + numInteger);
    }
}

/* Output after execution

Enter a number : 12.8
numRound = 13.0
numCeil = 13.0
numFloor = 12.0
numInteger = 12

*/
