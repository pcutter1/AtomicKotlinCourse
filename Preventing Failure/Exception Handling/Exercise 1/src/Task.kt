// ExceptionHandling/ExceptHandlingSoln1.kt
package exceptionHandlingExercise1
import kotlin.random.Random

data class Hamster(val name: String)

// TODO exception classes

class HamsterCage(val capacity: Int) {
  private val seed = Random(47)
  private val cage = HashSet<Hamster>()
  // TODO
}

val hamsters = listOf(
  Hamster("Sally"), Hamster("Ralph"),
  Hamster("Bob"), Hamster("Sergio"),
  Hamster("Allison"), Hamster("Jane"))

fun test(hc: HamsterCage) {
  // TODO
}

fun main() {
  test(HamsterCage(3))
}
/* Output:
Hamster(name=Sally)
Hamster(name=Ralph)
Hamster(name=Bob)
Hamster(name=Sergio)
HamsterCageException: Cage full > 3
Hamster(name=Sally)
HamsterCageException: No Hamster Morty
Feeding complete
HamsterCageException: Cage out of water
*/