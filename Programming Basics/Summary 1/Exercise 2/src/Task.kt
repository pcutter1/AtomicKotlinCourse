package summaryIExercise2

fun other(s: String): String {
  var a = ""
  for (i in 0..(s.length - 1) step 2) {
    a += s[i]
  }
  return a
}

fun main() {
  println(other("cement"))
}
/* Output:
cmn
*/