fun main(args: Array<String>) {
  val result = calculate("+", 3, 4)
  println(result)
}

fun calculate(symbol: String, a: Int, b: Int): Int {
  return when (symbol) {
    "+" -> a + b
    "-" -> a - b
    "*" -> a * b
    "/" -> a / b
    else -> 0
  }
}
