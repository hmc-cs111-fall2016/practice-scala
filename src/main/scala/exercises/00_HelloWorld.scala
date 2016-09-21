/* ---------------------------------
 * DETAILS ABOUT PACKAGE DECLARATIONS
 * ---------------------------------
 * 
 * Scala has a sophisticated package system, more complex than Java's. 
 * We won't take advantage of much of that sophistication. For now, it's 
 * helpful to know that the statement
 * 	package exercises
 * declares the code in this file to belong to the exercises package, which
 * helps make the code more modular. 
 * 
 * If you're interested in more information about packages, please see: 
 * 		
 * 		Scala for the Impatient 2/e, Chapter 7
 * 	AND / OR
 * 		https://en.wikibooks.org/wiki/Scala/Packages 
 */
package exercises

/* ---------------------------------
 * DETAILS ABOUT objectS
 * ---------------------------------
 * 
 * The `object` keyword in Scala begins the declaration of a standalone object:
 * something with its own fields and methods, which can be used without having
 * to call a constructor.
 * 
 * In a Scala program, all top-level declarations (e.g., of variables and 
 * functions), must appear in an object or class. If we just want to define a
 * function (as below), we put that declaration in an object (instead of a 
 * class). 
 */
object HelloWorld {
  
  /* ---------------------------------
   * DETAILS ABOUT FIELD DECLARATIONS
   * ---------------------------------
   * 
   * Using val to declare a value will create an immutable field. The value
   * of an immutable field cannot be changed; it can only be accessed.
   *
   * Field declarations in Scala are public by default. 
   * We don't need to create a getter to access this value. Instead we can write:
   * 		HelloWorld.message
	 *
   * We could also have written the declaration like so:
   * 		val message = "Change me"
   * which would omit the type declaration for message and allow the Scala
   * compiler to infer the type for us. In general, we should let Scala infer
   * types; HOWEVER, the Scala style guide recommends that we document the
   * types of any public members, by declaring that type. In this way, we 
   * provide precise descriptions of the interfaces of our classes, objects, 
   * etc. For more information on style guidelines for when to declare types,
   * see:
   * 		http://docs.scala-lang.org/style/types.html#inference 
   */
  
  /**
   * See @HelloWorldTest for information about the correct value for `message`.
   * 
   * The `HelloWorldTest` class is in the file
   * 	`src/test/scala/00_HelloWorldTest.scala`
   * 
   * This exercise is taken from ScalaLabs:
   * 		https://github.com/scala-labs/scala-labs/blob/master/labs/src/main/scala/org/scalalabs/basic/lab01/HelloWorldExercise.scala
   */
  val message: String = "Change me"
}