fun main(args: Array<String>) {
  // 九九の表をlistをつかって解く
  val list: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)  // 別解 val list: List<Int> = (1..9).toList()
  for (i in list) {
    for (j in list) {
      print(String.format("%3d", i * j)) 
    }
    println()
  }

  println()

  // 九九の表をforEachを使って解く
  list.forEach { i ->
    list.forEach { j ->
      print(String.format("%3d", i * j))
    }
    println()
  }
}
