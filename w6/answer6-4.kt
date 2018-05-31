fun main(args: Array<String>) {
  val list = listOf(1, 2, 3, 4, 5)
  val result = average(list)
  println(result)
}

fun average(list: List<Int>): Double {
  var sum : Double = 0.0
  list.forEach {
    sum += it
  }
  return sum / list.size
}
