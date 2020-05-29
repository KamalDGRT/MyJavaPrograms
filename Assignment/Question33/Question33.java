/*
Define a class called fruit with the following attributes:
1. Name of the fruit.
2. Single fruit or bunch fruit.
3. Price.
Define a suitable constructor and displayFruit() method that displays values of all the
attributes. Write a program that creates 2 objects of fruit class and display their attributes.
*/

import java.util.Scanner;

class Fruit {
    String Name, Type;
    double Price;

    Fruit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Fruit Name  : ");
        Name = scanner.nextLine();
        System.out.print("Enter Fruit Type  : ");
        Type = scanner.nextLine();
        System.out.print("Enter Fruit Price : ");
        Price = scanner.nextDouble();
    }

    public void displayFruit() {
        System.out.println("\nFruit Details : ");
        System.out.println("Name  : " + Name);
        System.out.println("Type  : " + Type);
        System.out.println("Price : " + Price);
    }
}

class Question33 {
    public static void main(String[] args) {
        Fruit F1 = new Fruit();
        F1.displayFruit();
        Fruit F2 = new Fruit();
        F2.displayFruit();
    }
}

/* Output after execution :

Enter Fruit Name  : Apple
Enter Fruit Type  : Bunch
Enter Fruit Price : 200

Fruit Details :
Name  : Apple
Type  : Bunch
Price : 200.0

Enter Fruit Name  : Watermelon
Enter Fruit Type  : Single
Enter Fruit Price : 50

Fruit Details :
Name  : Watermelon
Type  : Single
Price : 50.0

*/
