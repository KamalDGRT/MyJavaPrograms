/*
Write a program where interface can be used to support multiple inheritances. Develop a
standalone Java program for this.
*/

interface Sing {
    default void singRock() {
        System.out.println("I am singing rock.");
    }
}

interface Dance {
    default void danceSlow(){
        System.out.println("I am dancing slow!");
    }
}

class Human implements Sing, Dance {

}

class Question20 {
    public static void main(String[] args) {
        Human h = new Human();
        h.singRock();
        h.danceSlow();
    }
}

/* Output after execution :

I am singing rock.
I am dancing slow!

*/
