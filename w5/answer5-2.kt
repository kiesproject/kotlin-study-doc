fun main(args: Array<String>) {
  val testList1: List<Int> = listOf(1, 2, 3)
  val testList2: List<Int> = listOf(3, 6, 8)
  val testList3: List<Int> = listOf(123, 653, 900)
  
  println(double(testList1))
  println(double(testList2))
  println(double(testList3))
}

fun double(list: List<Int>): List<Int> {
  return list.map { it * 2 }
}
