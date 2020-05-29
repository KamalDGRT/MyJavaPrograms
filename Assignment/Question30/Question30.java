/*
Define a class Employee having private members – id,  name,  department,  salary. Define
default and parameterized constructors. Create a subclass called "Manager" with private
member bonus. Define methods accept and display in both the classes. Create n objects of
the Manager class and display the details of the manager having the maximum total salary
(salary+bonus)
*/

import java.io.*;

class Employee {
    private int id;
    private double salary; 
    private String name, dept;
    double total;
    double  sal = salary;

    public Employee() {
        id =0;
        salary = 0.0;
        name = "";
        dept = "";
    }

    public Employee(int id, double salary,  String name,  String dept) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.dept = dept;
    }

    public void accept() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nEnter id of Employee   : ");
        id = Integer.parseInt(br.readLine());
        System.out.print("Enter name of Employee : "); 
        name = br.readLine();
        System.out.print("Enter salary of Employee : ");
        salary = Double.parseDouble(br.readLine());
        System.out.print("Enter department of Employee : ");
        dept = br.readLine();
    }

    public double total() {
        total = total + salary; 
        return total;
    }

    public void display() {
        System.out.println("\nEmployee Id  : " + id);
        System.out.println("Name         : " + name);
        System.out.println("Salary       : " + salary);
        System.out.println("Department   : " + dept);
    }
}

class Manager extends Employee {
    private double bonus; 

    public void accept() throws IOException {
        super.accept();
        System.out.print("Enter Bonus of Employee : "); 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bonus = Double.parseDouble(br.readLine());
        super.total = bonus;
    }

    public void display() {
        super.display();
        System.out.println("Bonus        : " + bonus);
        System.out.println("Total Salary : " + total);
    }
}

class Question30{
    public static void main(String[] args) throws IOException {
        Manager[] m = new Manager[10]; 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of Employees : "); 
        int n = Integer.parseInt(br.readLine()); 
        for(int i = 0; i < n; i++) {
            m[i] = new Manager();
            m[i].accept();
            m[i].total();
        }
        for(int i = 0; i < n; i++) {
            m[i].display();
            System.out.println("--");
        }
        double src = m[0].total;
        int tEmployee = 0;
        for(int i = 1; i < n; i++) {
            if(src < m[i].total) {
                src = m[i].total;
                tEmployee = i;
            }
        }
        System.out.println("\nThe Employee having the maximum Total salary is :");
        m[tEmployee].display();
    }
}

/* Output after execution

Enter the number of Employees : 2

Enter id of Employee   : 1
Enter name of Employee : Kamal
Enter salary of Employee : 1000
Enter department of Employee :  IT
Enter Bonus of Employee : 2000

Enter id of Employee   : 2 
Enter name of Employee : Sharma
Enter salary of Employee : 2000
Enter department of Employee :  IT
Enter Bonus of Employee : 400

Employee Id  : 1
Name         : Kamal
Salary       : 1000.0
Department   : IT
Bonus        : 2000.0
Total Salary : 3000.0
--

Employee Id  : 2
Name         : Sharma
Salary       : 2000.0
Department   : IT
Bonus        : 400.0
Total Salary : 2400.0
--

The Employee having the maximum Total salary is :
Employee Id  : 1
Name         : Kamal
Salary       : 1000.0
Department   : IT
Bonus        : 2000.0
Total Salary : 3000.0

*/
