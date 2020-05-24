/*  Write a java program 'MyNumber.java" that performs following operations on a variable
'num' of type double: 
a) Finds the round value of 'num' and stores the result in a variable numRound of type double. 
b) Finds the ceil value of 'num' and stores the result in a variable numCeil of type double. 
c) Finds the floor value of 'num' and stores the result in a variable numFloor of type double 
d) Cast 'num' to type int and stores the result in a variable numInteger of type int. 
Display output of numRound, numCeil, numFloor and numInteger on screen.

Note: Test your program with following value of num num=56.764 num=36.432 Use
Math.round, Math.ceil, Math.floor methods of class Math for 1,2 and 3.

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

Output 1 :

Enter a number : 56.764
numRound = 57.0
numCeil = 57.0
numFloor = 56.0
numInteger = 56

Output 2 :

Enter a number : 36.432
numRound = 36.0
numCeil = 37.0
numFloor = 36.0
numInteger = 36


*/
