/*  
    Write Java program to compute the sum of the 2+4+6+ ---------+10.
*/ 

class Question8 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 10; i += 2) 
            sum += i;
        System.out.println("Sum = " + sum);
    }
}

/*Output after execution

Sum = 30

*/
