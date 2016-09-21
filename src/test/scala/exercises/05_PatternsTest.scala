package exercises

import org.scalatest.FlatSpec

import PatternMatching._

/** 
 *  Tests take from ScalaLabs:
 *  	https://github.com/scala-labs/scala-labs/blob/master/labs/src/test/scala/org/scalalabs/basic/lab03/PatternMatchingExerciseTest.scala
 */

class PatternMatchingExerciseTest extends FlatSpec {

  "PatternMatching" should  "match language on strings" in {
    "OOP" === describeLanguage("Java")
    "OOP" === describeLanguage("Smalltalk")
    "Functional" === describeLanguage("Clojure")
    "Functional" === describeLanguage("Haskell")
    "Hybrid" === describeLanguage("Scala")
    "Procedural" === describeLanguage("C")
    "Unknown" === describeLanguage("Oz")
  }
  
  it should "match on input type" in {
    "A string with length 8" === matchOnInputType("A String")
    "A positive integer" === matchOnInputType(10)
    "A person with name: Jack" === matchOnInputType(Person("Jack", 39))
    "Seq with more than 10 elements" === matchOnInputType((1 to 11).toSeq)
    "first: first, second: second, rest: List(third, fourth)" === matchOnInputType(Seq("first", "second", "third", "fourth"))
    "Some Scala class" === matchOnInputType(10l)
    "A null value" === matchOnInputType(null)
  }
  it should "check age" in {
    Some("Jack") === older(new Person("Jack", 31))
    None === older(new Person("Jack", 30))
  }
}