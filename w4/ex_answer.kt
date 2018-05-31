fun main(args: Array<String>) {
  // Listを包容したListをflatmapによってつぶしてさらに各要素を2の倍数のみにする
  val listInList: List<List<Int>> = listOf(listOf(1, 2, 3), listOf(4, 5, 6), listOf(7, 8, 9, 10))
  val flattenList: List<Int> = listInList.flatMap { it.filter { it % 2 == 0 } }
  
  println(flattenList)
    
  // listInListに対して各List内の要素を3倍し、さらに2の倍数のみにする
  val filteredList = listInList.flatMap { it.map { it * 3 }.filter { it % 2 == 0 } }
  println(filteredList)
}
