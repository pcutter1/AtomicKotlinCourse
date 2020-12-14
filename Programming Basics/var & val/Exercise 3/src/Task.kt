package varAndValExercise3

fun main() {
  var x = 1
  var y = 2
  val temp = x
  x = y
  y = temp
  println(x)
  println(y)
}