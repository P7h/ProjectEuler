/**
 * @see <a href="https://projecteuler.net/problem=1">Problem#1:Multiples of 3 and 5</a>
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

public final class P0001_02 {

    public static void main(final String[] args) {
        final long max = 999l;
        final long sumOfThrees = 3 * sumOfNNaturalNumbers(max/3);
        final long sumOfFives = 5 * sumOfNNaturalNumbers(max/5);
        final long sumOfFifteens = 15 * sumOfNNaturalNumbers(max/15);

        final long sumOfMultiplesOf3Or5 = sumOfThrees + sumOfFives - sumOfFifteens;

        System.out.println("Answer for P0001: " + sumOfMultiplesOf3Or5);
    }

    private static final long sumOfNNaturalNumbers(final long n) {
        final long sum = n * (n+1) / 2;
        return sum;
    }
}