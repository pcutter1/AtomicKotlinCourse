package numberTypesExercise4

fun convertToMilliseconds(hours: Int, minutes: Int, seconds: Int): Long =
  seconds * 1000 + minutes * 60000 + hours * 3600000L

fun main() {
  println(convertToMilliseconds(1, 30, 0))
}