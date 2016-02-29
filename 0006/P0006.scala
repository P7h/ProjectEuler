/**
 * @see <a href="https://projecteuler.net/problem=6">Smallest multiple</a>
 * 
 * [Problem 6]: 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

def square(n: Int) = n * n

val numbers = 1 to 100

val p0006 = square(numbers.par.sum) - numbers.par.map(square).sum