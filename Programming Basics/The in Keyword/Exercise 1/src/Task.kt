package theInKeywordExercise1

fun getAlphabet(): String {
  var s = ""
  for (i in 'a'..'z') {
    s+=i
}
  return s
}

fun main() {
  println(getAlphabet())  // abcdefghijklmnopqrstuvwxyz
}