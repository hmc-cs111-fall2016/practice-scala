package exercises

/*
 * For these tests, we'll use a different library than for HelloWorld. 
 * The ScalaCheck library *generates* test cases for us! We (the tester) 
 * specify the behavior that our code should exhibit, and the testing library
 * generates inputs to test that behavior.
 * 
 * For more information on ScalaCheck, see:
 * 		https://github.com/rickynils/scalacheck/blob/master/doc/UserGuide.md
 */
import org.scalacheck.Properties
import org.scalacheck.Prop.forAll

object EchoCheck extends Properties("EchoCheck") {
  property("echo") = forAll{ (message: String) ⇒
    Echo.echo(message) == message
  }
}
