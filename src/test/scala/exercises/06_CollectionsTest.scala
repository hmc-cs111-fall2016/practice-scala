package exercises

import org.scalatest.FlatSpec

import Collections._

/**
 * These tests are taken from ScalaLabs:
 *    https://github.com/scala-labs/scala-labs/blob/master/labs/src/test/scala/org/scalalabs/basic/lab02/
 */

class CollectionsTest extends FlatSpec {

  val listOfStrings: List[String] = List("One", "Two", "Three")

  "Collections" should "get first Element in list" in {
    val result: String = firstElementInList(listOfStrings)
    assert("One" == result)
  }


  it should "calculate sum of list" in {
    assert(15 == sumOfList(List(1, 2, 3, 4, 5)))
  }

  it should "get last element in list" in {
    assert("Three" == lastElementInList(listOfStrings))
    assert(9 == lastElementInList(List(1, 6, 10, 33, 54, 9)))
  }

  it should "get nth element in list" in {
    assert("One" == nthElementInList(0, listOfStrings))
    assert("Two" == nthElementInList(1, listOfStrings))
    assert("Three" == nthElementInList(2, listOfStrings))
  }

  it should "concat two lists" in {
    assert(List("One", "Two", "Three", "Four", "Five") == concatLists(listOfStrings, List("Four", "Five")))
  }

  it should "sort list of strings" in {
    val l = List("Sjors", "Arjan", "Age", "Lieke", "J-Fall", "ScalaLabs")
    assert(List("Age", "Arjan", "J-Fall", "Lieke", "ScalaLabs", "Sjors") == sortList(l))
  }

  it should "contains One Two And Three" in {
    elementExists(listOfStrings, "One")
    elementExists(listOfStrings, "Two")
    elementExists(listOfStrings, "Three")
  }

  it should "get list contains two odd elements" in {
    assert(List(1, 3, 5) == oddElements(List(1, 2, 3, 4, 5)))
  }

  it should "get tails of list" in {
    assert(List(List(1, 2, 3, 4, 5), List(2, 3, 4, 5), List(3, 4, 5), List(4, 5), List(5), List()) == tails(List(1, 2, 3, 4, 5)))
  }
  
  "A Scala List" should  "find max int in list" in {
    assert(9 == maxElementInList(List(1, 9, 4, 9, 8)))
    assert(25 == maxElementInList(List(1, 7, 5, 17, 25, 24, 22, 19)))
  }

  it should "calc sum of same positioned elements in two lists" in {
    assert(List(2, 8, 14) == sumOfTwo(List(1, 5, 9), List(1, 3, 5)))
    //if one of the lists is empty return the ones with values
    assert(List(1, 2, 3) == sumOfTwo(List(1, 2, 3), List()))
    assert(List(1, 2, 3) == sumOfTwo(List(), List(1, 2, 3)))
  }

  it should "calc sum of same positioned elements in many lists" in {
    assert(List(12, 15, 18) == sumOfMany(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9)))
  }
  
   it should "rewrite imperative to functional" in {
    val avery1 = Collections.Person(15, "Avery1", "Jansen")
    val avery2 = Collections.Person(17, "Avery2", "Janssen")
    val avery3 = Collections.Person(18, "Avery3", "Jansssen")
    val jordan1 = Collections.Person(17, "Jordan1", "Peterson")
    val jordan2 = Collections.Person(19, "Jordan2", "Petersson")
    val nehal = Collections.Person(21, "Nehal", "Tambe")
    
    val result = separateTheYoungFromTheOld(List(nehal, avery1, avery2, avery3, jordan1, jordan2))
    
    assert(List(List("Avery1", "Avery2", "Jordan1"), List("Avery3", "Jordan2", "Nehal")) == result)
  }
}