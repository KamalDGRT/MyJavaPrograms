/*
Implement a superclass Person. Make two classes, Student and Instructor, inherit from
Person. A person has a name and a year of birth. A student has a major, and an instructor
has a salary. Write the class definitions, the constructors, and the methods toString for all
classes. Supply a test program that tests these classes and methods.
*/

class Question19 {
    public static void main(String[] args) {
        Person a = new Person("Poseidon", 1992);
        Student b = new Student("Percy Jackson", 1919, "Aquatics");
        Instructor c = new Instructor("Chiron", 1998, 95000);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

class Person {
    private String name;
    private int birthYear;
    public Person(String n, int byear) {
        name = n;
        birthYear = byear;
    }
    public String toString() {
        return "Person [ name = " + name + " , birthYear = " + birthYear + "]";
    }   
}

class Student extends Person {
    private String major;
    public Student(String n, int byear, String m) {
        super(n, byear);
        major = m;
    }

    public String toString() {
        return "Student [ super = " + super.toString() + " , major = " + major + "]";
    }
}

class Instructor extends Person {
    private double salary;
    public Instructor(String n, int byear, double s) {
        super(n, byear);
        salary = s;
    }

    public String toString() {
        return "Employee [ super = " + super.toString() + " , salary = " + salary + "]";
    }
}

/* Output after execution

Person [ name = Poseidon , birthYear = 1992]
Student [ super = Person [ name = Percy Jackson , birthYear = 1919] , major = Aquatics]
Employee [ super = Person [ name = Chiron , birthYear = 1998] , salary = 95000.0]

*/
