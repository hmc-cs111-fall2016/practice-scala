package exercises

import org.scalacheck.Properties
import org.scalacheck.Prop.forAll
import org.scalacheck.Prop.BooleanOperators

object ExponentCheck extends Properties("ExponentCheck") {
  property("expt") = forAll{ (n: Int, e: Int) ⇒
    (n >= 0 && e >=0 && e < 1024) ==> (Exponent.expt(n, e) == scala.math.pow(n, e))    
  }
}
