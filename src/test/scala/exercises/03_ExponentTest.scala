package exercises

import org.scalacheck.Properties
import org.scalacheck.Prop.forAll

object ExponentCheck extends Properties("ExponentCheck") {
  property("expt") = forAll{ (n: Int, e: Int) ⇒
    Exponent.expt(n, e) == scala.math.pow(n, e)    
  }
}
