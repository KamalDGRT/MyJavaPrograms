/*
Write a Java program to create a super class Vehicle having members Company and price.
Derive 2 different classes LightMotorVehicle (members – mileage) and HeavyMotorVehicle
(members – capacity-in-tons). Accept the information for n vehicles and display the
information in appropriate form. While taking data, ask the user about the type of vehicle
first.
*/

import java.io.*;

class Vehicle {
    String company;
    double price;

    public void accept() throws IOException {
        System.out.print("\nEnter the Company of the Vehicle: "); 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        company = br.readLine(); 
        System.out.print("Enter Price of the Vehicle: "); 
        price = Double.parseDouble(br.readLine());
    }
    public void display() {
        System.out.print("Company : " + company + " , Price: " + price);
    }
}

class LightMotorVehicle extends Vehicle {
    double mileage;

    public void accept() throws IOException {
        super.accept();
        System.out.print("Enter the mileage of the vehicle: "); 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        mileage = Double.parseDouble(br.readLine());
    }

    public void display() {
        super.display();
        System.out.println(" , Mileage: " + mileage);
    }
}

class HeavyMotorVehicle extends Vehicle {
    double captons;
    public void accept() throws IOException { 
        super.accept();
        System.out.println("Enter the capacity of vehicle (in tons) : "); 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        captons = Double.parseDouble(br.readLine());
    }
    public void display() {
        super.display();
        System.out.println(" , Capacity in tons: " + captons);
    }
}

class Question31 {
    public static void main(String [] args) throws IOException {
        int i;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

        System.out.println("Vehicle types : ");        
        System.out.println("1. Light Vehicle");
        System.out.println("2. Heavy Vehicle");
        System.out.print("Enter your choice : ");
        int ch = Integer.parseInt(br.readLine());

        switch(ch) {
            case 1 :    System.out.print("Enter the number of Light vehicles : "); 
                        int n = Integer.parseInt(br.readLine()); 
                        LightMotorVehicle [] l = new LightMotorVehicle[n]; 
                        for(i = 0; i < n; i++) {
                            l[i] = new LightMotorVehicle();
                            l[i].accept();
                        }
                        for(i = 0; i < n; i++) {
                            l[i].display();
                        }
                        break;

            case 2 :    System.out.print("Enter the number of Heavy vehicles : "); 
                        int m = Integer.parseInt(br.readLine()); 
                        HeavyMotorVehicle [] h = new HeavyMotorVehicle[m]; 
                        for(i = 0; i < m; i++) {
                            h[i] = new HeavyMotorVehicle();
                            h[i].accept();
                        }
                        for(i = 0; i < m; i++) {
                            h[i].display();
                        }
                        break;
        }
    }
}

/* Output after execution 

Vehicle types : 
1. Light Vehicle
2. Heavy Vehicle
Enter your choice : 1
Enter the number of Light vehicles : 2

Enter the Company of the Vehicle: Ashok Leyland
Enter Price of the Vehicle: 20450
Enter the mileage of the vehicle: 40

Enter the Company of the Vehicle: Tata
Enter Price of the Vehicle: 45450
Enter the mileage of the vehicle: 45

Company : Ashok Leyland , Price: 20450.0 , Mileage: 40.0
Company : Tata , Price: 45450.0 , Mileage: 45.0

*/
