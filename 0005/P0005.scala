/**
 * @see <a href="https://projecteuler.net/problem=5">Smallest multiple</a>
 * 
 * [Problem 5]: 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

val p0005Sample = Range(10, Int.MaxValue).find(n => Range(2, 11).forall(n % _ == 0)).get

val p0005 = Range(20, Int.MaxValue).find(n => Range(2, 21).forall(n % _ == 0)).get