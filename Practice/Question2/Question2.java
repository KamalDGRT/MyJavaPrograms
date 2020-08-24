/*
Write a program that displays a random coordinate in a rectangle. The rectangle is
centred at (0, 0) with width 50 and height 150.
*/

import java.util.Random;

class Question2 {
    public static void main(String[] args) {

        Random randx = new Random();
        Random randy = new Random();

        int x = randx.nextInt(50) + 1;
        int y = randy.nextInt(150) + 1;
        System.out.println("Random Co-ordinate : (" + x + ", " + y + ")");
    }
}
