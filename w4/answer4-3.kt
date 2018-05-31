fun main(args: Array<String>) {
  // map関数を使用して各要素を２倍する
  val list = listOf(1, 2, 3, 4, 5)
  val mappedList = list.map { it * 2 }
  
  println(mappedList)
}
