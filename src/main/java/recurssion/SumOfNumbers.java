package recurssion;

/**
 * Calculate sum of numbers using recursion and iteration
 */
public class SumOfNumbers {
    /**
     * Driver to run the program
     *
     * @param args to be passed
     */
    public static void main(String[] args) {
        System.out.println("Sum of number using Recursion is " + sumOfNumbers(4));
        System.out.println("Sum of number using Iteration is " + sumOfNumbersIteration(4));
    }

    /**
     * Using recursion to add n numbers.
     * Here we need to specify base condition to avoid infinite loop.
     * WORKFLOW--> It will be added to top of stack
     * 4+sumOfNumbers(3)    |   1
     * 3+sumOfNumbers(2)    |   2+sumOfNumbers(1)
     * 2+sumOfNumbers(1)    |   3+sumOfNumbers(2)
     * 1                    |   4+sumOfNumbers(3)
     * RESULT
     * 4+3+2+1=10
     *
     * @param number to be summed
     * @return sum
     */
    private static Integer sumOfNumbers(final int number) {
        if (number == 1) return 1;//Base condition
        return number + sumOfNumbers(number - 1);
    }

    /**
     * Sum of numbers using Iteration
     * Iterate through number till 1. Keep adding the number
     *
     * @param number to be summed
     * @return sum of numbers
     */
    private static Integer sumOfNumbersIteration(final int number) {
        int sum = 0;
        for (int i = number; i > 0; i--) {
            sum = sum + i;
        }
        return sum;
    }
}
