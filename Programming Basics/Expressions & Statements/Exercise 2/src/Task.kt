package expressionsAndStatementsExercise2

fun f(a : Int, b : Int) = a+b

fun g(c : String, d : String) = c + d

fun h() = println("h()")

fun main() {
  val f : Int = f(1, 3)
  val g : String = g("string", "thing")
  val h : Unit = h()
  println("Int")
  println("String")
  println("Unit")
}