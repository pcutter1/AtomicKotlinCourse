package compositionExercise3
import atomictest.*

class Stack<E> {
  // private val list

  fun push(e: E) {
    TODO()
  }

  fun pop(): E = TODO()
}

@OptIn(ExperimentalStdlibApi::class)
class Queue<E> {
  // private val arrayDeque

  fun add(e: E) {
    TODO()
  }

  fun poll(): E = TODO()
}

fun main() {
  val stack = Stack<Int>()
  stack.push(1)
  stack.push(2)
  stack.push(3)
  stack.push(4)
  stack.pop() eq 4
  stack.pop() eq 3

  val queue = Queue<String>()
  queue.add("a")
  queue.add("b")
  queue.add("c")
  queue.add("d")
  queue.poll() eq "a"
  queue.poll() eq "b"
}