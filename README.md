# Practice Scala
###### _Submission deadline: Wednesday, September 28 at 11:59pm_
###### _Critique deadline: Friday, September 30 at 11:59pm_

The goal of this assignment is to help you become familiar with Scala and the 
development tools we'll be using this semester. When you're done, you should: 

  - feel you've had good practice with the basics of Scala: variables, data
  structures, functions, tests
  - have lots of questions about why Scala was designed the way it was

_Credits:_ Much of this assignment is based on the 
[Scala Labs](http://scala-labs.github.io/) project. Normally, it would be good 
practice to fork the
[Scala Labs repository](https://github.com/scala-labs/scala-labs/), then modify
the fork. But I didn't want our pull requests to accidentally go to Scala Labs,
so I cloned the lab instead. We'll do only a small part of the lab, so I removed
the other parts.

## Instructions
**Read the WHOLE document (and the linked pages) very carefully, before you
start coding.**

Here's what to do:

- Get things set up
  - [ ] Review the [Assignment workflow](https://github.com/hmc-cs111-fall2016/hmc-cs111-fall2016.github.io/wiki/Assignment-HOWTO), and follow it to get the materials for this lab.
  - [ ] Read [Installing Scala](https://github.com/hmc-cs111-fall2016/hmc-cs111-fall2016.github.io/wiki/Installing-Scala), if you want to install Scala on your own machine.

- Work on the assignment
  - [ ] Read the lab instructions, hints, and tips, below.
  - [ ] Complete the exercises in the following files (found in the 
  `src/main/scala` directory):
     - `00_HelloWorld.scala`
     - `01_Echo.scala`
     - `02_Fibonacci.scala`
     - `03_Exponent.scala`
     - `04_Options.scala`
     - `05_Patterns.scala`
     - `06_Collections.scala`
     - `07_Palindrome.scala`
  - [ ] Possibly complete the optional exercises in the following files:
     - `Rainfall.scala`
     - `WebScraper.scala`
  - [ ] Review Ben's solutions (in a pull request)
  - [ ] Possibly review the [solutions from ScalaLabs](https://github.com/scala-labs/scala-labs/tree/master/solutions/src/main/scala/org/scalalabs/basic).
  - [ ] Write about Scala in `scala-thoughts.md`

- Submit the assignment 
  - [ ] Submit your work (by issuing a pull request).
  - [ ] Review and comment on other people's code. 

## Resources

You'll need to learn a fair bit of Scala on your own, to do the exercises. In
fact, that's the whole point of this assignment :). Many of the exercises contain
links to helpful documentation / information. Here are some additional, general 
resources on learning Scala that might help:
   - _Scala for the Impatient_ (one of the recommended books for the course)
   - [Scala tutorials](http://scalatutorials.com/) A series of entry-level
   tutorials. (Note that their ability to run Scala code in the browser is
   currently unavailable.)   
   - [Scala language documentation](http://www.scala-lang.org/documentation/)
   - [Scala style guide](http://docs.scala-lang.org/style/)
   - [Scala cheatsheet](http://docs.scala-lang.org/cheatsheets/)
   - [Scala school](https://twitter.github.io/scala_school/)
   - [The Neophyte's Guide to Scala](http://danielwestheide.com/scala/neophytes.html)
   - [Effective Scala](https://twitter.github.io/effectivescala/) Contains 
   information about some more advanced functionality.

Please also ask questions in class, on Piazza, and in office hours!

## Working on the exercises
In general, for each exercise, do the following:
   1. Open the appropriate code file.
   1. Browse through the file to see what's required. 
   1. Look at and run the corresponding tests.
   1. Work on the exercise, reading documentation, and running and augmenting 
   the tests as needed.
   1. Compare your work to solutions.

### Loading a project into ScalaIDE
If you want use ScalaIDE to work on your project, **run `sbt eclipse` in the 
top directory** (the one with `build.sbt` in it), then import the project.

#### Running code and tests with ScalaIDE
None of the exercises are meant to be run as programs. Instead, you can run
the tests for each exercise. To run *all* the tests, right-click on the
`src/test/scala/exercises` package (in the "Package Explorer, on the left side
of the screen) and select `Run as ▸ ScalaTest - Package`.

To run a single test, open the test file and right click in the Editor (or you
can just right click on the test file's name in the Package Explorer) and select
either:
  - `Run as ▸ ScalaTest - File` (if the file contains ScalaTest tests). The
  test results will show up in the ScalaTest window, usually found along the 
  left side of the screen.
  - `Run as ▸ Scala - Application` (if the file contains ScalaCheck tests). The
  test results will show up in the Console window, usually found along the
  bottom of the screen.



### Running code and tests with `sbt`
None of the exercises are meant to be run as programs. Instead, you can run
the tests for each exercise. To run all tests in sbt, you can type the following
command in the terminal:
  `sbt test`

If you'd like to run a specific test, type something like the following command:
  `sbt test-only exercises.HelloWorldTest`
This example runs the tests for the `HelloWorld` exercise. If you want to run
tests for other exercises, use the appropriate class name instead of 
`HelloWorld`.

As always, you can run the tests continually, by starting sbt and using the
tilde (` ~`) symbol before the sbt command. Here's an example of continually 
running the `HelloWorld` test:
```
$ sbt
[info] Loading global plugins from /Users/ben/.sbt/0.13/plugins
[info] Loading project definition from ...
[info] Set current project to Practice Scala (in build file: ...)
> ~test-only exercises.HelloWorldTest
[info] HelloWorldTest:
[info] - Hello world *** FAILED ***
[info]   "[Change me]" did not equal "[Hello world!]" (00_HelloWorldTest.scala:22)
[info] ScalaCheck
[info] Passed: Total 0, Failed 0, Errors 0, Passed 0
[info] ScalaTest
[info] Run completed in 240 milliseconds.
[info] Total number of tests run: 1
[info] Suites: completed 1, aborted 0
[info] Tests: succeeded 0, failed 1, canceled 0, ignored 0, pending 0
[info] *** 1 TEST FAILED ***
[error] Failed: Total 1, Failed 1, Errors 0, Passed 0
[error] Failed tests:
[error]   exercises.HelloWorldTest
[error] (test:testOnly) sbt.TestsFailedException: Tests unsuccessful
[error] Total time: 1 s, completed Sep 21, 2016 11:02:20 AM
1. Waiting for source changes... (press enter to interrupt)
```

## Write about Scala
After completing the exercises, take about 20 minutes to collect and write about
your initial impressions of Scala. Write about them in `scala-thoughts.md` Some
possible topics include:

  - What's easy to do in Scala? What's not?
  - What is/are your favorite language design choice(s) that the designers of Scala 
  made? Why?
  - What is/are your least favorite language design choice(s)? Why? And why do
  you think the designers made that / those choice(s)?
  - What Scala features would you like to learn more about?

## Peer-review other people's work
You'll comment on at least one other person's work. Look at the 
[peer review table](https://github.com/hmc-cs111-fall2016/practice-scala/wiki/Peer-review) 
to see whom you should review. You should look through their
solutions to each of the exercises, as well as their `scala-thoughts.md` file.
You don't need to comment on everything, but find some interesting parts of
their work to evaluate. Some questions you might consider / answer when 
providing feedback:

  - How does this team's solution compare to yours? To the provided solutions?
  To other people's solutions? Is there anything they did that you like better?
  Is there any way to improve their solution?
  - How readable is their code? How elegant is their solution? If you think it's
  inelegant, was that because the team was trying to show an alternative
  solution?
  - How Scala-y is the code? Most of us are just learning the language, and we
  can help each other spot cases when a functional approach would have worked in
  place of an imperative one, etc.
  - If a team has raised a question in the comments of their code, or in their
  writings about Scala, try to answer it!

## Bonus exercises
There are two bonus exercises: `Rainfall.scala` and `Webscraper.scala`. These
exercises are for your enjoyment, if you'd like to play with Scala a little bit 
more. There's no extra credit for them; they're just fun.

The `Rainfall.scala` exercise is mostly self-explanatory: it's similar in nature
to the `Palindrome.scala` exercise.

The `Webscraper.scala` exercise is a chance to play around with a(nother) Scala
library that implements an internal DSL, in this case for parsing web pages. To
get started, head over the the 
[home page for the library](https://github.com/ruippeixotog/scala-scraper).
Follow the instructions to add the library's dependency to sbt. (Note: if you're
using ScalaIDE, you'll need to re-run `sbt eclipse`. Then, you can refresh the 
project in ScalaIDE, to make sure the new library is included in your project.)
After you've added the web-scraping library, look at some examples and play 
around with writing a program that parses a webpage and produces interesting 
results.

