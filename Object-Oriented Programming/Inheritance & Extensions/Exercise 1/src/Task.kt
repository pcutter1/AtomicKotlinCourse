package inheritanceAndExtensionsExercise1

import atomictest.trace

// Duck Library
interface Duck {
  fun quack()
  fun swim()
}

class RealDuck : Duck {
  override fun quack() = trace("quack")
  override fun swim() = trace("swim")
}

fun interactWithDuck(duck: Duck) {
  duck.quack()
  duck.swim()
}

// Our codebase
interface Crocodile {
  fun bite()
}

class RealCrocodile : Crocodile {
  override fun bite() = trace("Mnom-mnom")
}

fun interactWithCrocodile(crocodile: Crocodile) {
  trace("Panic!!!")
  crocodile.bite()
}

class IAmHonestlyDuck(
  val crocodile: Crocodile
)

fun mimicDuck(crocodile: Crocodile): IAmHonestlyDuck =
  TODO()

fun main() {
  val honestlyDuck = mimicDuck(RealCrocodile())
//  interactWithDuck(honestlyDuck)
//  interactWithCrocodile(honestlyDuck.crocodile)
  trace eq """
    Mnom-mnom
    Mnom-mnom
    Panic!!!
    Mnom-mnom
  """
}