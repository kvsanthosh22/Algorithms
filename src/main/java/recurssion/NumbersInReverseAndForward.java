package recurssion;

/**
 * Understand Head and Tail recursion
 */
public class NumbersInReverseAndForward {
    /**
     * Driver to run the program
     *
     * @param args to be passed
     */
    public static void main(String[] args) {
        System.out.println("Head Recursion");
        headRecursion(5);
        System.out.println("\nTail Recursion ");
        tailRecursion(5);
    }

    /**
     * HEAD RECURSION
     * This uses Operating system STACK MEMORY to store the values
     * And print number once base condition is achieved
     *
     * @param number to be printed
     */
    private static void headRecursion(final int number) {
        if (number == 0) return;
        headRecursion(number - 1);
        System.out.printf(" " + number);
    }

    /**
     * TAIL RECURSION
     * This is similar to For loop
     *
     * @param number to be printed
     */
    private static void tailRecursion(final int number) {
        if (number == 0) return;
        System.out.printf(" " + number);
        tailRecursion(number - 1);
    }
}
