/**
 * @see <a href="https://projecteuler.net/problem=1">Problem#1:Multiples of 3 and 5</a>
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

public final class P0001 {

    public static void main(final String[] args) {
        final long min = 0L;
        final long max = 1000L;
        final long answer = 0L;
        for (long i = min; i < max; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                answer += i;
        }
        System.out.println("Answer for P0001: " + answer);
    }
}