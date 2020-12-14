package repetitionWithWhileExercise1

fun displayContent(s: String) {
    var count = 0
    while (count < s.length) {
        println("$s"[count])
        count++
    }
}

fun main() {
//  displayContent("abc")
}
/* Expected output:
a
b
c
*/