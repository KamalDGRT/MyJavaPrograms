/*
Implement a Student class with the following fields, constructors and methods : 

Fields:
    name;
    totalScore;
    numberOfQuizzes;
Constructors:
    public Student(String name, double score)
    public Student(double score, String name)
    public Student(String name)
Methods:
    public String getName()
    public double getAverage() //this should return zero if no quiz has been taken.
    public double getTotalScore()
    public void addQuiz(double score)
    public void printStudent() //this should print the student’s name and average score
    public String toString()

Write an application TestStudent that reads a student name and use the Student
class to create a Student object. Then read the scores of the student in three quizzes
and add each to the totalScore of the student using addQuiz() method and print the
student object.
*/

class Student{
    private String  name;
    private int numberOfQuizzes;
    private int totalScore;
    private double myAverage;

    public Student(String name, int score) {
        this.name = name;
        totalScore += score;
    }

    public Student(int score, String name) {
        this.name = name;
        totalScore += score;
    }

    public Student(String name) {
        this.name = name;
        numberOfQuizzes = 0;
        totalScore = 0;
        myAverage = 0;
    } 

    public Student() {
        this("");
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        return myAverage;
    }

    public double getTotalScore() {
        return totalScore;
    }

    public void addQuiz(int score)  {
        totalScore = totalScore + score; 
        numberOfQuizzes++;
    }

    public void printStudent() {
        System.out.println("Name: " + name );
        System.out.println("Average Score: " + myAverage);
    }

    public String toString() {
        return "Name: " + name + "\n#Quizzes: " + numberOfQuizzes + 
                "\nTotal Quiz Score: " + totalScore + 
                "\nAverage Score: " + myAverage;
    }

    public void calculateAverageScore() {
        if (numberOfQuizzes == 0) 
            myAverage = 0.0;
        else
            myAverage = Math.round((double)totalScore/ (double)numberOfQuizzes);
    }
}

class Question17 {
    public static void main(String[] args) {        
        Student Test = new Student("Percy Jackson");
        Test.addQuiz(120);
        Test.addQuiz(160);
        Test.addQuiz(220);
        Test.calculateAverageScore();
        Test.printStudent();
    }
}

/* Output after execution :

Name: Percy Jackson
Average Score: 167.0

*/
