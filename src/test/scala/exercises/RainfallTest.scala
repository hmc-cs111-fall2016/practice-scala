package exercises

import org.scalatest._
import Rainfall.rainfall

class RainfallTest extends FunSuite with Matchers {
  test("An empty list should return NaN") {
      rainfall(List.empty).isNaN() should be (true)
  }
  
  test("A list that has only -999 should return NaN") {
      rainfall(List(-999)).isNaN() should be (true)
  }
  
  test("A list with one element (and -999) should be that element") {
      rainfall(List(1)) should be (1.0)
  }
  
  test("A list with multiple -999s should stop at the first one should be that element") {
      rainfall(List(1, -999, 1000, -999)) should be (1.0)
  }
  
  test("Negative rainfalls should not be counted") {
      rainfall(List(1, -10000, -10000, -999)) should be (1.0)
  }
  
  test("Multiple positive rainfalls should be counted") {
      rainfall(List(1, 2, 3, -10000, -10000, -999)) should be (2.0)
  }
    
  test("Postive rainfalls can be intermixed with negative numbers and still be counted") {
      rainfall(List(1, -10000, 2, -10000, 3, -999)) should be (2.0)
  }
  
  test("Another example") {
    rainfall(List(1, -2, 5, -999, 8)) should be (3.0)
  }
  
}