fun main(args: Array<String>) {
  val result = janken(0, 0)
  val result2 = janken(1, 2)
    
  println(result)
  println(result2)
}

fun janken(a: Int, b: Int): String = when {
  a == 0 && b == 1 || a == 1 && b == 2 || a == 2 && b == 0 -> "Win!!"
  a == 1 && b == 0 || a == 2 && b == 1 || a == 0 && b == 2 -> "Lose..."
  a == 0 && b == 0 || a == 1 && b == 1 || a == 2 && b == 2 -> "Draw"
  else -> "じゃんけんしようぜ？"
}
