package upcastingExercise2

import atomictest.trace

interface Apple {
  fun consume(): String
}

class GrannySmith

class Gala

class Fuji

class Braeburn

fun main() {
  val apples = listOf(
    GrannySmith(),
    Gala(),
    Fuji(),
    Braeburn()
  )
  apples.forEach {
//    trace(it.consume())
  }
  trace eq """
    chomp GrannySmith
    bite Gala
    press Fuji
    peel Braeburn
    """
}