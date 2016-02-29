/**
 * @see <a href="https://projecteuler.net/problem=4">Largest palindrome product</a>
 * 
 * [Problem 4]: A palindromic number reads the same both ways. The largest palindrome made from the
 * product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

import scala.annotation.tailrec

@tailrec def reverse(n: Int, accumulo : Int = 0): Int = n match {
  case 0 => accumulo
  case _ => reverse(n / 10, accumulo * 10 + n % 10)
}

val p004 = (100 to 999).view
  .flatMap(i => (i to 999).map(i * _))
  .filter(n => n == reverse(n))
  .max