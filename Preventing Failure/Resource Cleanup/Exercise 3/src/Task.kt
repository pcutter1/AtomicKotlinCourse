// ResourceCleanup/ResourceCleanupSoln3.kt
package resourceCleanupExercise3
import atomictest.*

class Cleanup : AutoCloseable {
  fun f() = println("f()")
  fun g() = println("g()")
  fun h() = println("h()")
  override fun close() = println("close()")
}

enum class Option { Normal, Return, Throw }

fun verifyClose(opt: Option) {
  TODO()
}

fun main() {
  verifyClose(Option.Normal)
  verifyClose(Option.Return)
  capture {
    verifyClose(Option.Throw)
  } eq "Exception"
}
/* Output:
f()
g()
h()
close()
f()
close()
f()
close()
Exception
 */