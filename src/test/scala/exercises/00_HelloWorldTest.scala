/*
 * Note that this test class lives in the `exercises` package, EVEN THOUGH
 * it's in a different directory from the code it's testing. That's a nice
 * feature of the Scala package system that lets us organize our files one
 * way and our code another. Because `HelloWorldTest` is in the `exercises`
 * package, we don't have to import the code we're testing.
 */
package exercises

/*
 * Here, we import the features of the testing library that we're going to use.
 * 
 * These features use the basic testing style that comes with ScalaTest, but
 * there are many, many more styles (some of which we'll use in other code). 
 * For more information about the ScalaTest library, see:
 * 		 http://www.scalatest.org/user_guide
 */
import org.scalatest.FunSuite

class HelloWorldTest extends FunSuite {
  test("Hello world") {
    assert(HelloWorld.message == "Hello world!")
  }
}
