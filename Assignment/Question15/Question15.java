/*  The certain instructor assigns letter grade for his course based on the following table:
Score   Grade
>= 90   A+
>= 85   A
>= 80   B+
>= 75   B
>= 70   C+
>= 65   C
>= 60   D+
>= 55   D
<50     F

Write a class, Grader, which has an instance variable, score, an appropriate constructor and
appropriate methods
- a method, letterGrade() that returns the letter grade as a String.

Now write a demo class to test the Grader class by reading a score from the user,
using it to create a Grader object after validating that the value is not negative and is not
greater then 100. Finally, call the letterGrade() method to get and print the grade. See figure
(b) for sample run.

*/

import java.util.Scanner;
class Question15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;
        System.out.print("Enter the Score : ");
        int n = scanner.nextInt();
        if (n >= 0 && n <= 100) {
            Grader Test = new Grader(n);
            System.out.println("Grade = " + Test.letterGrade());
        } else {
            System.out.println("Enter a valid score.");
        }
    }
}

class Grader {
    private int score; 
    String Grade;
    public Grader() {
        score = 0;
        Grade = "";
    }

    public Grader(int s) {
        score = s;
    }

    public String letterGrade() {
        String  grade;
        if(score >= 90)   
            grade = "A+";
        else if(score >= 85)
            grade = "A";
        else if(score >= 80)
            grade = "B+";
        else if(score >= 75)
            grade = "B"; 
        else if(score >= 65)
            grade = "C+";
        else if(score >= 60)
            grade = "C";
        else if(score >= 55)
            grade = "D+";
        else if(score >= 50)
            grade = "D";
        else  
            grade = "F";
        return grade;
    }
}

/* Output after execution : 

Enter the Score : 98
Grade = A+

*/
