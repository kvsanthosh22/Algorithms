package recurssion;

/**
 * Euclid algorithm to find GCD of two number
 * Euclid algorithm says-->
 * GCD [42,12] == GCD[12,6] ==GCD [6,0] ==>GCD is 6
 * So basically we can use recursion principle to apply Euclid algorithm
 * <p>
 * recursive(number2, number1%number2)
 */
public class GCD {
    /**
     * Driver to run the program
     *
     * @param args to be passed
     */
    public static void main(String[] args) {
        System.out.println("GCD using Euclid recursion is " + findGCDOfTwoNumbers(42, 12));
        System.out.println("GCD using iteration is " + findGCDUsingIterative(42, 12));
    }

    /**
     * Recursive approach to implement Euclid algorithm
     *
     * @param number1 to be passed
     * @param number2 to be passed
     * @return GCD of two numbers
     */
    private static Integer findGCDOfTwoNumbers(final int number1, final int number2) {
        if (number2 == 0) return number1;
        return findGCDOfTwoNumbers(number2, number1 % number2);
    }

    /**
     * Iterative approach to find GCD of two numbers
     *
     * @param number1 to be passed
     * @param number2 to be passed
     * @return GCD of numbers
     */
    private static Integer findGCDUsingIterative(int number1, int number2) {
        while (number2 != 0) {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }
        return number1;
    }
}
