/**
 * @see <a href="https://projecteuler.net/problem=7">10001st prime</a>
 * 
 * [Problem 7]: By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * 
 * What is the 10 001st prime number?
 */
import Stream.cons

def isPrime(n : Int) = {
	val sqrtOfNumber = math.sqrt(n).toInt
	val hasFactors = (2 to sqrtOfNumber).exists { i => n % i == 0 }
	n > 1 && !hasFactors
}

lazy val stream = cons(0,cons(1,Stream.empty))

val p0007 = stream.view.filter(i => isPrime(i)).take(10001).last
//.takeWhile(_ <= 4000000)