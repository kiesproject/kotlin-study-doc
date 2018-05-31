fun main(args: Array<String>) {
  for (i in 1 until 10) {
    for (j in 1 until 10) {
      print(String.format("%3d", i * j))
    }
    println()
  }
}
