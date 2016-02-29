/**
 * @see <a href="https://projecteuler.net/problem=1">Problem#1:Multiples of 3 and 5</a>
 * 
 * [Problem 1]: If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

val p0001 = (1 until 1000).par.filter(num => (num % 3 == 0 || num % 5 == 0)).reduceLeft(_ + _)

val p0001Refined = (1 until 1000).view.par.filter(num => (num % 3 == 0 || num % 5 == 0)).sum