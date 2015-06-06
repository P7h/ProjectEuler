/**
 * @see <a href="https://projecteuler.net/problem=3">Largest prime factor</a>
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143?
 */

public final class P0003 {

    public static void main(final String[] args) {
        long number = 600851475143L;
        long primeFactor = 1L;
        for (long i = 3L; i < number; i += 2) {
            if (number % i == 0) {
                primeFactor = i;
                number /= i;
            }
        }
        if(number > primeFactor) { 
            primeFactor = number;
        }
        System.out.println(primeFactor);
    }
}