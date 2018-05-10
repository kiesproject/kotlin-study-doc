## 今回やること

- kotlinコレクション続き

  - イミュータブルコレクションとミュータブルコレクションとは？

- ~~Nullとは？~~

- ~~Nullとうまく付き合うための対策方法~~

- 関数とは？

## ミュータブルとイミュータブルとは？

### イミュータブルコレクション(immutable)

不変なコレクション。不変なコレクションであるとはコレクション内部が持つデータやオブジェクトを追加したり削除したりなどして変更することができないこと。

kotlinの場合、`listOf`、`mapOf`、`setOf`で定義されたコレクションはイミュータブルである。

```kotlin
val list: List<Int> = listOf(1, 2, 3) 
val map: Map<String, Int> = mapOf("hoge" to 1, "fuga" to 2)
val set: Set<Int> = setOf(1, 2, 3)
// 上のように定義されたコレクションの変数たちは全てイミュータブルなコレクション
```

### ミュータブルコレクション(mutable)

可変なコレクション。イミュータブルコレクションとは異なり、コレクション内部に対して追加、削除などの変更を行うことができる。

kotlinの場合、`mutableListOf`kotlinの場合、これらのコレクションの型はそれぞれ`MutableList<T>`、`MutableMap<K, T>`、`MutableSet<T>`となり`mutableListOf`、`mutableMapOf`、`mutableSetOf`で定義されたコレクションはミュータブルになる。

```kotlin
val mutableList: MutableList<Int> = mutableListOf(1, 2, 3)
val mutableMap: MutableMap<String, Int> = mutableMapOf("hoge" -> 1, "fuga" -> 2)
val mutableSet: MutableSet<Int> = mutableSetOf(1, 2, 3)
// 上のように定義されたコレクションの変数たちは全てミュータブルなコレクション

mutableList.add(4)  // 末尾に新しく追加される
mutableList.remove(1)  // 要素を削除する
mutableList.removeAt(2)  // アドレスを指定して削除する。先頭アドレスは0(2と指定した場合、0,1,2と見るので3番目の数字が削除される)
```

## 関数

これまでは`fun main(args: Array<String>) {}`の中で計算、コレクションなどを使用して処理を行ってきた。しかし、Androidアプリのような大規模のプログラムを触るときにmainとなるソースコードにつらつらと処理を書くのは特定の処理を修正しようにも流れを追いにくく、とても読みにくい。関数はそのような問題を解消するために一連の処理のかたまりをまとめることでソースコードの読みやすさ(可読性)を上げるために使用される。

kotlinでは、関数の定義は`fun`で行う。実際に足し算を行うだけの関数`add()`を実装してみよう。

```kotlin
fun main(args: Array<String>) {
  val a = 1
  val b = 2

  val addData: Int = add(a, b)  // 関数add()を呼び出す
  val addData2: Int = add(3, 4)  // 値を直接渡してもいい
  val addData3: Int = add(add(2, 3), add(4, 5))  // 引数と返り値が同じであれば関数を引数として渡すこともできる

  println(addData)  // 3
  println(addData2) // 7
  println(addData3) // ???
}

// 関数add()の処理内容
fun add(a: Int, b: Int): Int {
  return a + b  // 単純に足すだけ
}
```

関数`add()`を例に関数について説明する。

`fun`の後に示された名前`add`は関数を呼び出すための識別子(関数名)となるので、なんでもOK。

`()`内に示されているものは引数といい、外部のデータを使用したい場合はここで事前に渡す必要がある。

上記のプログラムの場合、`add()`関数で必要としている引数は`Int`型の変数`a`と`b`である。そのため、`add()`関数を呼び出すためには、`Int`型の値2つを指定するひつようがある。

引数の必要性は変数のアクセス範囲にある。`main`関数内で使用している変数`a`と`b`は`main`関数内でしか使用することができないので、引数として渡してあげる必要がある。

`{}`で囲まれた関数内部にある`return`以下にある処理が関数の返り値といい、実際にその値がそのまま呼び出し元へ返る。`:`と`{`の間に示す型`Int`は関数の返り値の型を示し、返り値がこの型と一致しない場合、エラーになる。

変数`addData`に代入された`add()`関数のように`main`で定義した変数`a`、`b`を`add()`関数の引数として渡すことで各変数に代入された値を読み処理をすることができる。

`add()`関数は、返り値が`Int`であるため、変数`addData3`に代入された`add()`関数のように、返り値と同じ`Int`型を引数として必要としているので、直接引数に関数を渡すことができる。

### 問題

- `addData3`の結果を確かめてみよう

- `List<Int>`の全要素を足した値を返す関数`sum()`を作成してみよう。

  - 引数はもちろん`List<Int>`型

  - 返り値は合計値なので`Int`

  - 引数に対して返り値の型が異なることに注意

- `List<Int>`型のコレクションを引数として、各要素を2倍したコレクションを`List<Int>`型で返す関数`double`を作成して以下のテストケースを試してみよう

  - テストケース

    ```kotlin
    val testList1: List<Int> = listOf(1, 2, 3)
    val testList2: List<Int> = listOf(3, 6, 8)
    val testList3: List<Int> = listOf(123, 653, 900)
    ```

  - コード例

    ```kotlin
    val list: List<Int> = listOf(1, 2, 3)
    val doubleList: List<Int> = double(list)
    
    doubleList.forEach { i ->
        println(i)
    }
    // 2
    // 4
    // 6
    ```

  - 前回のコレクションの操作関数のページを参考にしてみよう

## 次回

- オブジェクトとクラス
