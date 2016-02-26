/**
 * @see <a href="https://projecteuler.net/problem=1">Problem#1:Multiples of 3 and 5</a>
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

(0 until 1000).filter(num => (num % 3 == 0 || num % 5 == 0)).reduceLeft(_ + _)