// OperatorOverloading/OpOverloadingSoln1.kt
package operatorOverloadingExercise1
import atomictest.*

class WrapRange(
  val range: IntRange,
  private var current: Int = range.start
) {
  init {
    // TODO
  }
  override fun toString() = "$current"
  operator fun inc(): WrapRange {
    TODO()
  }
  operator fun dec(): WrapRange {
    TODO()
  }
}

fun main() {
  val range = 0..5
  var wr = WrapRange(range)
  fun testUp() =
    println("${wr}, ${wr++}")
  fun testDown() =
    println("${wr}, ${wr--}")
  range.forEach { testUp() }
  println("-----------")
  range.forEach { testDown() }
  capture { WrapRange(range, 6) } eq
    "IllegalArgumentException: " +
    "'current' out of range: 6"
  capture { WrapRange(range, -1) } eq
    "IllegalArgumentException: " +
    "'current' out of range: -1"
}
/* Exercise Output:
0, 1
1, 2
2, 3
3, 4
4, 5
5, 0
-----------
0, 5
5, 4
4, 3
3, 2
2, 1
1, 0
IllegalArgumentException: 'current' out of range: 6
IllegalArgumentException: 'current' out of range: -1
*/