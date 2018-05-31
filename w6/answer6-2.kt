fun main(args: Array<String>) {
  val result = factorial(5)
  println(result)
}
fun factorial(n: Int): Int {
  var count = 1
  for (i in 1..n) {
    count *= i
  }
  return count
}

// 別解(再起呼び出しを使用した方法)
fun factorialEx(n: Int): Int {
  return when (n) {
    0 -> 1
    else -> n * factorial(n - 1)
  }
}
