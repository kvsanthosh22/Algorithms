package recurssion;

/**
 * Use recursion in two ways(One most efficient way) to find the Factorial of a number
 */
public class Factorial {
    /**
     * Driver to run the program
     *
     * @param args to be passed
     */
    public static void main(String[] args) {
        System.out.println("Factorial is " + factorialOfNumber(5));
        System.out.println("Factorial using accumulator is " + factorialUsingAccumulator(1, 5));
    }

    /**
     * FACTORIAL OF NUMBER
     * Use recursion to find factorial of number
     * <p>
     * 1
     * 2*factorialOfNumber(1)
     * 3*factorialOfNumber(2)
     * 4*factorialOfNumber(3)
     * Once base condition achieved: It will execute for 4 more steps to replace value
     * 4*3*2*1=24
     * So total steps to execute this algorithm is 4+4=8
     *
     * @param number to find factorial
     * @return factorial
     */
    private static Integer factorialOfNumber(final int number) {
        if (number == 1) return 1;
        return number * factorialOfNumber(number - 1);
    }

    /**
     * Faster way to execute factorial than previous way
     * factorialUsingAccumulator(1*4,3)
     * factorialUsingAccumulator(4*3,2)
     * factorialUsingAccumulator(12*2,1)
     * 24 is returned since base condition to achieved
     * Total steps to execute this algorithm is 4
     *
     * @param accumulator to store the intermediate value
     * @param number      to find factorial
     * @return factorial of number
     */
    private static Integer factorialUsingAccumulator(final int accumulator, final int number) {
        if (number == 1) return accumulator;
        return factorialUsingAccumulator(accumulator * number, number - 1);
    }
}
