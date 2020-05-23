// Java program to print the squares and cubes for the numbers 1 to 5.

class Question4 {
    public static void main(String[] args) {

        for (int i = 1; i <=5  ; i++){
            System.out.print("Number : " + i + " , ");
            System.out.print( i + " squared  = " + (i * i) + " , ");
            System.out.println( i + " cubed  = " + (i * i * i));
        }
    }
}

/* Output after execution:

Number : 1 , 1 squared  = 1 , 1 cubed  = 1
Number : 2 , 2 squared  = 4 , 2 cubed  = 8
Number : 3 , 3 squared  = 9 , 3 cubed  = 27
Number : 4 , 4 squared  = 16 , 4 cubed  = 64
Number : 5 , 5 squared  = 25 , 5 cubed  = 125

*/
