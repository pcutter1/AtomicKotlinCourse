// OperatorOverloading/OpOverloadingSoln3.kt
package operatorOverloadingExercise3
import atomictest.*

class Repository

fun main() {
/*
  val r = Repository<Int>(5)
  (1..7).forEach {
    r += it * 10
    println(r)
  }
  println("r[4]: ${r[4]}")
  r[4] = 99
  println("r[4]: ${r[4]}")
  println(r)
  capture { r[7] } eq
    "IllegalArgumentException: get() " +
    "index 7 out of range"
  capture { r[7] = 100 } eq
    "IllegalArgumentException: set() " +
    "index 7 out of range"
  val r2 = Repository<Int>(5)
  capture { r2[3] } eq
    "IllegalArgumentException: get() " +
    "accessing null element"
  capture { r2[3] = 100 } eq
    "IllegalArgumentException: set() " +
    "accessing null element"

*/
}
/* Exercise Output:
10, null, null, null, null
10, 20, null, null, null
10, 20, 30, null, null
10, 20, 30, 40, null
10, 20, 30, 40, 50
10, 20, 30, 40, 50, 60
10, 20, 30, 40, 50, 60, 70
r[4]: 50
r[4]: 99
10, 20, 30, 40, 99, 60, 70
IllegalArgumentException: get() index 7 out of range
IllegalArgumentException: set() index 7 out of range
IllegalArgumentException: get() accessing null element
IllegalArgumentException: set() accessing null element
*/