package exercises

import org.scalacheck.Gen.choose
import org.scalacheck.Prop.forAll
import org.scalacheck.Properties

object ExponentCheck extends Properties("ExponentCheck") {
  val smallNN = for  {
    n ← choose(0, 5)
  } yield n
  
  property("expt") = forAll(smallNN, smallNN) { (n: Int, e:Int) ⇒
    Exponent.expt(n, e) == scala.math.pow(n, e)    
  }
}
