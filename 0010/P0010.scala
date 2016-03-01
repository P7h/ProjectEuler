/**
 * @see <a href="https://projecteuler.net/problem=10">Summation of primes</a>
 * 
 * [Problem 10]: The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * 
 * Find the sum of all the primes below two million.
 */

def isPrime(n : Long) = {
    val sqrtOfNumber = math.sqrt(n).toInt
    val hasFactors = (2 to sqrtOfNumber).exists { i => n % i == 0 }
    n > 1 && !hasFactors
}

lazy val range = 2L to 2000000L

val p0010 = range.filter(i => isPrime(i)).reduceLeft(_ + _)
