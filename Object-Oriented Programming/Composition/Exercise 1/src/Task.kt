package compositionExercise1
import atomictest.*

class Shape(
  val name: String,
  val color: String
) {
  fun draw() = "drawing $color $name"
}

class Circle(
  val radius: Int, 
  val color: String
) {
  val shape = Shape("circle of radius $radius", color)
}

class Rectangle(
  val height: Int,
  val width: Int,
  val color: String
) {
  val shape = Shape("rectangle of size ${height}x$width", color)
}

fun main() {
  val circle = Circle(10, "red")
  val rectangle = Rectangle(3, 4, "blue")
  trace(circle.shape.draw())
  trace(rectangle.shape.draw())
  trace eq """
    drawing red circle of radius 10
    drawing blue rectangle of size 3x4
  """
}