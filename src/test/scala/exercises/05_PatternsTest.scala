package exercises

import org.scalatest.FlatSpec

import PatternMatching._

/** 
 *  Tests take from ScalaLabs:
 *    https://github.com/scala-labs/scala-labs/blob/master/labs/src/test/scala/org/scalalabs/basic/lab03/PatternMatchingExerciseTest.scala
 */

class PatternMatchingExerciseTest extends FlatSpec {

  "PatternMatching" should  "match language on strings" in {
    assert("OOP" == describeLanguage("Java"))
    assert("OOP" == describeLanguage("Smalltalk"))
    assert("Functional" == describeLanguage("Clojure"))
    assert("Functional" == describeLanguage("Haskell"))
    assert("Hybrid" == describeLanguage("Scala"))
    assert("Procedural" == describeLanguage("C"))
    assert("Unknown" == describeLanguage("Oz"))
  }
  
  it should "match on input type" in {
    assert("A string with length 8" == matchOnInputType("A String"))
    assert("A positive integer" == matchOnInputType(10))
    assert("A person with name: Jack" == matchOnInputType(Person("Jack", 39)))
    assert("Seq with more than 10 elements" == matchOnInputType((1 to 11).toSeq))
    assert("first: first, second: second, rest: List(third, fourth)" == matchOnInputType(Seq("first", "second", "third", "fourth")))
    assert("Some Scala class" == matchOnInputType(10l))
    assert("A null value" == matchOnInputType(null))
  }
  it should "check age" in {
    assert(Some("Jack") == older(new Person("Jack", 31)))
    assert(None == older(new Person("Jack", 30)))
  }
}