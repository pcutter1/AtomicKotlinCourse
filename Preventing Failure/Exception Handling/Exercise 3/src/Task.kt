// ExceptionHandling/ExceptHandlingSoln3.kt
package exceptionHandlingExercise3
import exceptionHandlingExercise3.Status.*

open class Except : Exception() {
  override fun toString() =
    "${this::class.simpleName}"
}

open class DBFail : Except()
class DBOpenFail : DBFail()
class DBWriteFail : DBFail()
class DBCloseFail : DBFail()

class DataBase {
  fun open(id: Int, level: Int) {
    if (id == level) throw DBOpenFail()
  }
  fun write(s: String, id: Int, level: Int) {
    if (id == level) throw DBWriteFail()
  }
  fun close(id: Int, level: Int) {
    if (id == level) throw DBCloseFail()
  }
}

open class NetworkFail : Except()
class NetworkOpenFail : NetworkFail()
class NetworkCloseFail : NetworkFail()

class NetConnection(val url: String) {
  fun open(id: Int, level: Int) {
    if (id == level) throw NetworkOpenFail()
  }
  fun read() = "Dummy Data"
  fun close(id: Int, level: Int) {
    if (id == level) throw NetworkCloseFail()
  }
}

enum class Status { Success, Failed }

fun transact(level: Int): Status {
  val db = DataBase()
  val nets = listOf(
    NetConnection("AtomicKotlin.com"),
    NetConnection("RickAndMorty.com")
  )
  try {
    db.open(1, level)
  } catch (e: DBOpenFail) {
    println("Database Problem $e")
    return Failed
  }
  fun transfer(net: NetConnection): Status {
    TODO()
  }
  TODO()
}

fun main() {
  for (level in 0..5)
    try {
      println(transact(level))
    } catch (e: DBCloseFail) {
      println("main() Problem $e")
    } catch (e: NetworkCloseFail) {
      println("main() Problem $e")
    }
}
/* Output:
Success
Database Problem DBOpenFail
Failed
Network Problem NetworkOpenFail
Failed
Database Write Failed DBWriteFail
Failed
Network Close Failed NetworkCloseFail
Failed
Database Problem DBCloseFail
main() Problem DBCloseFail
*/