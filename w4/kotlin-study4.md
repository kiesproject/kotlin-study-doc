## 今回やること

- 配列

- kotlinコレクション

## 配列とは

複数の要素を１つの変数に持つことができる。基本的に配列の中身を示したい時は`[]`をつかう

```kotlin
val array: Array<Int> = arrayOf(1, 2, 3)  // [1, 2, 3]
```

for式で要素を１つ１つ分解して使うこともできる

```kotlin
for (i in array) {
    println(i)  // 1, 2, 3が順番に参照される  
}
```

- 結果

```
1
2
3
```

`size`をつけると要素の個数を得ることができる

```kotlin
val array = arrayOf(1, 2, 3)
println(array.size)  // 3
```

## コレクションとは

IT辞典用語e-wordsより引用

> データや[オブジェクト](http://e-words.jp/w/%E3%82%AA%E3%83%96%E3%82%B8%E3%82%A7%E3%82%AF%E3%83%88.html)などをまとめて格納するための[データ構造](http://e-words.jp/w/%E3%83%87%E3%83%BC%E3%82%BF%E6%A7%8B%E9%80%A0.html)や[クラス](http://e-words.jp/w/%E3%82%AF%E3%83%A9%E3%82%B9.html)などの総称をコレクションということがある。

Arrayをもっといい感じにしてくれるものだと考えておけばOK

### コレクションの種類

基本的には以下の3つ

| List                         | Map                      | Set                |
|:---------------------------- |:------------------------ |:------------------ |
| 一番スタンダードなコレクション。値を複数持つことができる | 値をキー(String)と添えて持つことができる | 一意性をもった値のみ持つことができる |

```kotlin
val list: List<Int> = listOf(1, 2, 3)  
// [1, 2, 3]
```

```kotlin
val map: Map<String, Int> = mapOf("hoge" to 1, "fuga" to 2)  
// ["hoge" -> 1, "fuga" -> 2]
```

```kotlin
val set: Set<Int> = setOf(1, 2, 3, 3)  
// [1, 2, 3](最後の3は除外される)
```

まだほかにもある

- Sequence
- Iterator

toList関数を使用することでfor式で使用していた書き方をコレクションに変換することもできる

```kotlin
val list1 = (1 .. 3).toList()  // [1, 2, 3]
val list2 = (1 until 3).toList()  // 今まで使っていたものを使用することができる
val list3 = (0 .. 32 step 2).toList() // もちろんstepも
```

## コレクションの操作関数

コレクションとして作成した変数に対して以下を使用することで、コレクションをより詳細に操作することができる(関数)

コレクションの操作関数はたくさんある

- **forEach**
- **map**
- **flatMap**
- **filter**
- **fold**
- drop
- max
- min
- sum
- average
- as~ (~には各コレクション)

#### forEach

順番にコレクションの中身をみる

```kotlin
val list = listOf(1, 2, 3)
list.forEach { i ->
  println(i)
}
```

#### map

順番に中身を操作して加工する

```kotlin
val list = listOf(1, 2, 3)
list.map { i -> i * 2}  // [2, 4, 6]
```

#### flatMap

たくさんのコレクションを操作して平ら(フラット)にする

```kotlin
val listOfList: List<List<Int>> = listOf(listOf(1, 2, 3), listOf(4, 5, 6))
val flatList: List<Int> = listOfList.flatMap { it }  // 型が変化していることに注目
// [1, 2, 3, 4, 5, 6]
```

#### filter

要素にフィルターをかけて条件が正しいもののみの要素に加工する

```kotlin
val list = (0 .. 32).toList()
val filteredList = list.filter { i ->
    i % 2 == 0  // 2の倍数の要素だけ取り出す
}
// [0, 2, 4, 6, 8, 10 ....... 32]
```

#### fold

配列に初期値を与えることができる

```kotlin
val list: List<String> = listOf("a", "b", "c", "d")
list.fold("first: ") { s1, s2 -> s1 + s2 }
// "first: abcd"
```

### もんだい

- 前回の九九の表と三角形を表示するプログラムをListを使って以下の方法で実装してみよう

  - for式内にListを指定する方法

  - forEach関数を使う方法

- map関数を使用して1〜5の連番が格納されたListに対して3倍した結果を表示してみよう

- filter関数を使用して0〜32の連番が格納されたListに対して4の倍数だけ取り出された結果を表示してみよう

## 次回

- kotlinコレクション続き
  - ミュータブル、イミュータブル
- Nullとは？(できたら)
