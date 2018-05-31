fun main(args: Array<String>) {
  val list = listOf(1, 2, 3, 4, 5)
  val sum = sum(list)
  println(sum)
}

fun sum(list: List<Int>): Int {
  var sum = 0
  list.forEach {
    sum += it
  }
  return sum
}
