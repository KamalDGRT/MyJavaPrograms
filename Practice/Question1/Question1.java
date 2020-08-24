/*
Write a program that randomly generates an integer between 1and 12 and displays the
English month names January, February , . . . , December for the numbers 1, 2, . . . ,
12, accordingly.
*/

import java.util.Random;

class Question1 {
    public static void main(String[] args) {

        String[] Months = {"January", "February", "March", "April", "May", "June", 
                            "July", "August", "September", "October", "November",
                            "December"
                        };

        Random rand = new Random();
        int month = rand.nextInt(12);

        System.out.println("Random Month : " + Months[month]);
    }
}

