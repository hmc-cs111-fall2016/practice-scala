package exercises

import org.scalatest.FlatSpec

/**
 * Tests taken from ScalaLabs:
 * 		https://github.com/scala-labs/scala-labs/blob/master/labs/src/test/scala/org/scalalabs/basic/lab03/OptionExerciseTest.scala
 */

class OptionsTest extends FlatSpec {
  "Options1" should "correctly show the state of filled room (e.g. Some(12))" in {
    Options.roomState(Options.rooms, 1) === "12"
  }

  it should "correctly show the state of an empty room (None)" in {
    Options.roomState(Options.rooms, 2) === "empty"
  }

  it should "correctly show the state of a room that is not available (Some(locked))" in {
    Options.roomState(Options.rooms, 3) === "not available"
  }

  it should "correctly show the state of a room that does not exist (no entry in Map)" in {
    Options.roomState(Options.rooms, 100) === "not existing"
  }

  "Options2" should "calculate total amount of people in rooms" in {
    Options.totalPeopleInRooms(Options.rooms) === 34
  }
}