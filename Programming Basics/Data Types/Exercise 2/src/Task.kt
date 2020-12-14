package dataTypesExercise2

fun main() {
  val int: Int = 10
  val double: Double = 1.1
  val boolean: Boolean = false
  val string: String = "abc"
  val character: Char = 'a'
  // Can be combined:
  // String can be combined with every other type:
  val si = string + int
  val sd = string + double
  val sb = string + boolean
  val sc = string + character
  val d1 = int + double
  val d2 = double + int
  val s1 = character + string
  val c1 = character + int
  println("The type that can be combined " +
    "with every other type using '+':")
  println("String")
  // Can't be combined:

  println("The type that can't be combined " +
    "with itself using '+':")
  println("Boolean")
}