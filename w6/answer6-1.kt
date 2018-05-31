fun main(args: Array<String>) {
  val result = getBirthday(1996)
  println("${result}才です")
}

fun getBirthday(n: Int): Int {
  return 2018 - n
}
