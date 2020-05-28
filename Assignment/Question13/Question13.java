/*

In a small firm employee numbers are given in serial numerical order, that is 1, 2, 3 etc. write
a menu driven program to perform following operations: 
a) Create a file of employee data with following information: Employee No, Name, Sex, Gross Salary. 
b) Append the data of a new employee joining the firm.
c) If a given employee leaves, delete his record. 
d) If gross salary of a given employee increases, update the gross salary. 
e) Display the record of (i) a given employee or (ii) all employees.

*/

import java.util.Scanner;

class Question13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuChoice, userChoice;
        System.out.print("Enter total number of Employees : ");
        int n = scanner.nextInt();
        TestEmployee Test = new TestEmployee(n);

        do {
            System.out.println("\n1. Add");
            System.out.println("2. Remove");
            System.out.println("3. Display all records");
            System.out.println("4. Display a particular record");
            System.out.print("Enter your choice : ");
            menuChoice = scanner.nextInt();
            switch(menuChoice) {
                case 1 : Test.Insert();  break;
                case 2 : Test.Delete();  break;
                case 3 : Test.displayAllRecords(); break;
                case 4 : Test.displayParticularRecord(); break;
                default : System.out.println("Invalid Choice.");
            }
            System.out.print("To continue with the same, press 1. ");
            userChoice = scanner.nextInt();
        }   while(userChoice == 1);
    }
}

class Employee {
    //Employee No, Name, Sex, Gross Salary. 
	private int eno;
    private String name;
	private String gender;
    private int salary;

    public void getDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Employee Name : ");        
        name = scanner.nextLine();
        System.out.print("Enter Employee Gender : ");        
        gender = scanner.nextLine();
        System.out.print("Enter Employee Number : ");        
        eno = scanner.nextInt();
        System.out.print("Enter Employee Salary : ");        
        salary = scanner.nextInt();
    }

    public void showDetails() {
        System.out.println(eno + " , " + name + " , " + gender +  " , " + salary);
    }

    public int getEno() {
        return this.eno;
    }
}

class TestEmployee {
    private int maxSize;
    private Employee empArray[];
    private int last;

    public TestEmployee(int s) {
        maxSize = s;
        empArray = new Employee[maxSize];
        last = -1;
    }

    public void Insert() {
        if (last == (maxSize - 1)) 
            System.out.println("Cannot enter employee records.");
        else {
            Employee a = new Employee();
            last += 1;
            a.getDetails();
            empArray[last] = a;
        }
    }

    public int getSize() {
        return this.maxSize;
    }

    public void Delete() {
        if (last == -1) 
            System.out.println("\n There are no employee records.");
        else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the employee number : ");
            int emno =  scanner.nextInt();
            int flag = 0, empno;
            int size = this.last + 1;

            for (int i = 0; i < size; i++){
                empno = empArray[i].getEno();
                if(emno == empno) {
                    flag = 1;
                    for (int j = i; j < (size - 1); j++)
                        empArray[j] = empArray[j + 1];
                    size -= 1;
                    if((i - 1)>=0)   //for continuous elements.
                        i -= 1;
                }
            }
            this.last = size - 1;
        }
    }

    public void displayAllRecords() {
        if (last == -1)
            System.out.println("\n There are no employee records.");
        else {
            System.out.println("\nEmployee records : ");
            for (int i = 0; i <= last; i++)
                empArray[i].showDetails();
        }
    }

    public void displayParticularRecord() {
        if (last == -1)
            System.out.println("\n There are no employee records.");
        else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the employee number : ");
            int emno =  scanner.nextInt();
            int flag = 0, empno;
            int size = this.last + 1;
            Employee E = new Employee();

            for (int i = 0; i < size; i++){
                empno = empArray[i].getEno();
                if(emno == empno) {
                    flag = 1;
                    E = empArray[i];
                    break;
                }
            }
            if(flag > 0) {
                System.out.println("\nRecord found.");
                E.showDetails();
            } else {
                System.out.println("\nEmployee with that number doen't exist.");
            }
        }
    }
}

/*

Enter total number of Employees : 3

1. Add
2. Remove
3. Display all records
4. Display a particular record
Enter your choice : 1

Enter Employee Name : Kamal Sharma
Enter Employee Gender : Male
Enter Employee Number : 1
Enter Employee Salary : 1000
To continue with the same, press 1. 1

1. Add
2. Remove
3. Display all records
4. Display a particular record
Enter your choice : 1

Enter Employee Name : Bharath Raam
Enter Employee Gender : Male
Enter Employee Number : 2
Enter Employee Salary : 2000
To continue with the same, press 1. 1

1. Add
2. Remove
3. Display all records
4. Display a particular record
Enter your choice : 1

Enter Employee Name : Sarveshanand
Enter Employee Gender : Male
Enter Employee Number : 3
Enter Employee Salary : 3000
To continue with the same, press 1. 1

1. Add
2. Remove
3. Display all records
4. Display a particular record
Enter your choice : 3

Employee records :
1 , Kamal Sharma , Male , 1000
2 , Bharath Raam , Male , 2000
3 , Sarveshanand , Male , 3000
To continue with the same, press 1. 1

1. Add
2. Remove
3. Display all records
4. Display a particular record
Enter your choice : 4
Enter the employee number : 3

Record found.
3 , Sarveshanand , Male , 3000
To continue with the same, press 1. 1

1. Add
2. Remove
3. Display all records
4. Display a particular record
Enter your choice : 1
Cannot enter employee records.
To continue with the same, press 1. 1

1. Add
2. Remove
3. Display all records
4. Display a particular record
Enter your choice : 4
Enter the employee number : 4

Employee with that number doen't exist.
To continue with the same, press 1. 1

1. Add
2. Remove
3. Display all records
4. Display a particular record
Enter your choice : 2
Enter the employee number : 1
To continue with the same, press 1. 1

1. Add
2. Remove
3. Display all records
4. Display a particular record
Enter your choice : 3

Employee records :
2 , Bharath Raam , Male , 2000
3 , Sarveshanand , Male , 3000
To continue with the same, press 1. 1

1. Add
2. Remove
3. Display all records
4. Display a particular record
Enter your choice : 1

Enter Employee Name : Bharani Raaj
Enter Employee Gender : Male
Enter Employee Number : 4
Enter Employee Salary : 4000
To continue with the same, press 1. 1

1. Add
2. Remove
3. Display all records
4. Display a particular record
Enter your choice : 3

Employee records :
2 , Bharath Raam , Male , 2000
3 , Sarveshanand , Male , 3000
4 , Bharani Raaj , Male , 4000
To continue with the same, press 1. 5

*/
