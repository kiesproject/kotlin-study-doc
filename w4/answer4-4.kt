fun main(args: Array<String>) {
  // filter関数を使用して各要素を4の倍数のみにする
  val list = (0..32).toList()
  val filteredList = list.filter { it % 4 == 0 }
  
  println(filteredList)
}
