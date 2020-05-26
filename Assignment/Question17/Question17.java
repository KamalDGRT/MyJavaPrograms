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
