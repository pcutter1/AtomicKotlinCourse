package ifExpressionsExercise3

fun findMax(first: Int, second: Int): Int =
  if (first < second) second else first

fun main() {
  println(findMax(-1, 4))  // 4
}