## 今回やること

- 関数の練習問題

## ゴール

- 関数の仕組みについて慣れること

- 型と仲良しになること

## 問題

#### (1) 誕生日を知る

生年`N`を引数として与えて、2018年1月1日の時点での年齢を出力する関数`getBirthday()`を作成してみよう。ただし、誕生月日は1月1日とします。

##### 例

```kotlin
val result = getBirthday(1996)

println("${result}才です")  // 22才です
```

---

#### (2) 階乗を求める

整数の値`N`を引数に与えて、`N`の階乗の結果を返す関数`factorial()`を作成してみよう

##### 例

```kotlin
val result = factorial(5)

println(result)  // 120
```

---

#### (3) 四則演算を１つの関数にまとめる

`+` 、`-`、`*`、`/`いずれかの文字と2つの数字`a`と`b`を引数に与えて、文字に対応した計算結果を返す関数`calculate()`を作成してみよう

##### 例

```kotlin
val result = calculate("+", 3, 4)

println(result)  // 7
```

---

#### (4) 平均を知る

`List<Int>`型のデータを引数に与えて、平均値を`Double`型で返す関数`average()`を作成してみよう

##### 例

```kotlin
val collection: List<Int> = listOf(1, 2, 3, 4, 5)
val result = average(collection)

println(result)  // 3.0
```

---

#### (5) じゃんけんのようなもの

お互いの手を示す数字(0はグー、1はチョキ、2はパー)を2つ引数に与え、１つ目に与えた人のじゃんけんの結果を返す関数`janken()`を作成してみよう。なお出力する文字列は、以下のようになるようにしよう

- 勝ち :arrow_right: `Win!!`

- 負け :arrow_right: `Lose...`

- 引き分け :arrow_right: `Draw`

##### 例

```kotlin
val result = janken(0, 0)
val result2 = janken(1, 2)

println(result)  // Draw
println(result2) // Win!!
```

## 次回

- クラスとオブジェクト

  - おそらく最後の講義になるかと思います
