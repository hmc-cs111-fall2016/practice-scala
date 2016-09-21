package exercises

import Fibonacci.fib
import org.scalatest.FunSuite
import org.scalatest.Matchers

class FibonacciTest extends FunSuite with Matchers {
  test("fib(1)") {
    fib(1) should be (1)
  }
  
  test("fib(2)") {
    fib(2) should be (1)
  }
  
  test("fib(5)") {
    fib(5) should be (5)
  } 
}
