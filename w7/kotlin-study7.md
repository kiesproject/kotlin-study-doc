## 今回やること

- classとobject

### オブジェクト指向プログラミングについて

#### オブジェクトとは？

プログラムに存在する全てのモノ

- 変数

- 関数

- クラス(オブジェクト)

#### クラスとは？

- 共通の性質をもつオブジェクトたちをまとめる(抽出)して分類したものをクラスという。

  #### 例

  - 車のクラス

    - 車の名称

    - 車検年

    - エンジン

    - バッテリー

    - エンジンオイル

    - タイヤ

    - ワイパー

    - エンジンをかける

    - 前進する

    - ハンドルをきる

    - etc...

このようなオブジェクトが分類されたクラス群を使い分けてプログラミングする手法を**オブジェクト指向プログラミング**という。kotlinはこのプログラミング手法に分類される。

上記の例をkotlinに置き換えるとするならば、以下のようになるだろう。(あくまで例なのでこのまま書き写しても意味がない)

```kotlin
class Car {
  val name: String = "プリウス"  // 名称
  val inspectionYear: Int = 2020 // 車検年
  val engine: Engine = Engine()    // Engineクラス
  val battery: Battery = Battery()  // Batteryクラス
  val oil: Oil = Oil()  // Oilクラス
  val wheel: Wheel = Wheel()  // Wheelクラス
  val wiper: Wiper = Wiper()  // Wiperクラス

  fun applyEngine() {
    // エンジンをかける
    println("エンジンをかけました")
  }

  fun goForward() {
    // 前進
    println("前へ進むよ")
  }

  fun handleRight() {
    // ハンドルを右にきる
    println("インド人を右に")
  }

  // ...more
}
```

また、自作した上記のようなCarクラスを実際のプログラムに落とし込むと以下のようになるだろう。

```kotlin
fun main(args: Array<String>) {
  val car: Car = Car()

  println(car.name)  // クラス内の変数を参照する
  car.goFarward()    // クラス内の関数を呼び出す
}
```

このように、クラス内で定義されているオブジェクトは`.`に続いて書くことで参照することができる。

#### インスタンス

上記の例では、変数`car`に対して、`Car()`を指定することでCarクラス内のオブジェクトを使用することができていた。このようにクラスのオブジェクトを使用するために変数にクラスを宣言することを**インスタンス化**といい、インスタンス化された変数を**インスタンス変数**という。

#### コンストラクタ

クラスに対して初期値を渡すことをコンストラクタに渡すという。インスタンス化するにおいて、内部のオブジェクトが外部から初期値をもらうときなどに使用する。Carクラスを拡張してコンストラクタを挿入する。

```kotlin
class Car(val name: String, val inspectionYear: Int) {  // クラス名の横に初期値の変数を与える
  val engine: Engine = Engine()    // Engineクラス
  val battery: Battery = Battery()  // Batteryクラス
  val oil: Oil = Oil()  // Oilクラス
  val wheel: Wheel = Wheel()  // Wheelクラス
  val wiper: Wiper = Wiper()  // Wiperクラス

  fun applyEngine() {
    // エンジンをかける
    println("エンジンをかけました")
  }

  fun goForward() {
    // 前進
    println("前へ進むよ")
  }

  fun handleRight() {
    // ハンドルを右にきる
    println("インド人を右に")
  }

  // ...more
}
```

```kotlin
fun main(args: Array<String>) {
  val car = Car("プリウス", 2020)

  println(car.name)  // プリウス
}
```

#### 継承(インヘリタンス)

クラスはこれまでのCarクラスのように、そのまま使用するという形よりクラスを何層かに**継承**して使用することがしばしばある。継承を行うことであいまいな機能のみ持っているクラスをさらに拡張して使うことができる。あいまいなクラスを作って置くことでそのクラスから様々なクラスを生み出すことができる。

Carクラスを例にあげる。今回はCarクラスを継承して新たにハイブリッド車のクラスを作成したい。このような場合のプログラムを以下に示す。

```kotlin
open class Car(val name: String, val inspectionYear: Int) {  // 先頭に`open`をつけないと継承させることができない！！！
  val engine: Engine = Engine()    // Engineクラス
  val battery: Battery = Battery()  // Batteryクラス
  val oil: Oil = Oil()  // Oilクラス
  val wheel: Wheel = Wheel()  // Wheelクラス
  val wiper: Wiper = Wiper()  // Wiperクラス

  open fun applyEngine() {
    // エンジンをかける
    println("エンジンをかけました")
  }

  open fun goForward() {
    // 前進
    println("前へ進むよ")
  }

  open fun handleRight() {
    // ハンドルを右にきる
    println("インド人を右に")
  }

  // ...more
}
```

```kotlin
class HybridCar(name: String, inspectionYear: Int): Car(name, inspectionYear) {
  override fun applyEngine() {
    super.applyEngine()
    println("バッテリーで動いています")
  }

  override fun goForward() {
    println("静かに前に進むよ")
  }

  override fun handleRight() {
    println("ハンドルを右に")
  }
}
```

```kotlin
fun main(args: Array<String>) {
  val car = HybridCar("プリウス", 2020)

  println("車の名前: ${car.name}, 車の車検満期年: ${car.inspectionYear}")
  car.applyEngine()
}
```

継承はコンストラクタの横から`:`に続いて継承元のクラス(**親クラス、スーパークラス**)を指定することで行うことができる。親クラスの関数を呼び出すことを**オーバーライド**といい、`override`を関数の先頭に修飾する必要がある。この中で親クラスの関数を拡張することができる。また、親クラスのオブジェクトを使用したい場合は`super`を使用する。

### シングルトンオブジェクトとは？

クラスは通常、インスタンス化しないと使用することができない。つまりそのクラスを使用したい時に逐次インスタンス化して使用するというやり方がクラスの基本的な使い方でもある。

これの例外として、**シングルトンオブジェクト**というものがある。シングルトンオブジェクトは、プログラム内にインスタンスがすでに１つのみ生成されているオブジェクトのことをいう。つまりクラスとは異なりインスタンス化が不要なオブジェクトでもある。

kotlinでシングルトンオブジェクトを生成する方法は以下のように行う。

```kotlin
object SingletonObject {
  fun utilFunction() {
    // ....
      println("この関数はシングルトンオブジェクトで呼び出しています。")  
  }
}
```

呼び出しは以下のように行う。

```kotlin
fun main(args: Array<String>) {
  SingletonObject.utilFunction()
}
```

説明すると長くなるので、説明はしませんが基本的に**シングルトンオブジェクトは使用せずにクラスで適宜インスタンス化する方法を選んでください。**

## 次回について

##### これで全てのkotlinはもちろん、プログラミングの**基本的な**ことを全てマスターしたと思います！！

次回からはペアプログラミングという学習方法で皆さんは学習してもらうことになると思います。詳しいことは別途連絡されると思いますが、やることはプログラミングであり今までとほぼ変わらないので気軽に頑張ってください。
