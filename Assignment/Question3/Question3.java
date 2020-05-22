// Java program to convert the given temperature in Fahrenheit to Celsius
// using the following conversion formula C = F-32 / 1.8 
// and display the value in a tabular form.
import java.util.Scanner;

class Question3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter Temparature in Fahrenheit (f) : "); 
    double fahrenheit = scanner.nextDouble();

    double celsius =  (fahrenheit - 32) / 1.8; 
    System.out.println("Tempurature in Celsius = " + celsius);
    
    }
}

/* Output after execution:
Enter Temparature in Fahrenheit (f) : 23
Tempurature in Celsius = -5.0
*/
