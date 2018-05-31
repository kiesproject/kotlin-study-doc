fun main(args: Array<String>) {
  // 三角形をlistをつかって解く
  val iList: List<Int> = (1..10).toList()
  for (i in iList) {
    val jList = (1..i).toList()
    for (j in jList) {
      print("*") 
    }
    println()
  }
  
  println()
  
  // 三角形をforEachを使って解く
  iList.forEach { i ->
    val jList = (1..i).toList()
    jList.forEach {
      print("*")
    }
    println()
  }
}
