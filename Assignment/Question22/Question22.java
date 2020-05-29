/*
Write a program that calls a method that throws an exception of type ArithmeticExcepton at
a random iteration in a for loop. Catch the exception in the method and pass the iteration
count when the exception occurred to the calling method by using an object of an exception
class you define.
*/

class IteratedArithmeticException extends Throwable {
    private int iteration = -1;

    public IteratedArithmeticException() { }
    public IteratedArithmeticException(String s, Throwable cause) {
        super(s, cause);
    }
    public IteratedArithmeticException(int iteration, Throwable cause) {
        super(cause);
        this.iteration = iteration;
    }
    public int getIteration() { 
        return iteration;
    }
}

class Question22 {
    public static void main(String args[]) {
        try {
            loopy(); 
        } 
        catch(IteratedArithmeticException e) {
            System.out.println("Originating exception was : " + e.getCause());
            int iteration = e.getIteration();
            if(iteration < 0)
                System.out.println("Iteration count not recorded");
            else
                System.out.println("Iteration count when exception occurred: " + iteration);
        }
    }
    
    static void loopy() throws IteratedArithmeticException {
        int iteration =	0;
        int result = 0;
        int divisor = 0;
        for(iteration = 0 ; ; ++iteration) 
            try {
                divisor = (int)(100*Math.random());
                result = 1000/divisor;
            }
            catch(ArithmeticException e) {
                throw new IteratedArithmeticException(iteration, e);
            }
    }
}

/* Output after execution :

Originating exception was : java.lang.ArithmeticException: / by zero
Iteration count when exception occurred: 200

*/
