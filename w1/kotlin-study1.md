## 今回やること
- kotlinを動かせるようになる環境をつくる
- 軽くkotlinについて触れる

## 確認すること
- powershellがデフォルトのコンソールになっている人はコマンドプロンプトに変更してもらう(macの人は必要なし)
- IntelliJ Idea (Ultimate)がインストールされていない人はしてもらう

## 事前準備
- chocolateyのインストール
- chocolateyを使用してjdk8のインストール
- macの人はbrew caskを使用して入れる(java8)

```
> choco install jdk8
```

- 環境変数JAVA_HOMEのセット～確認まで
- macの人はexportを.bashrc以下に入れてください
```
> set JAVA_HOME=jdk8のインストールパス
```

- 確認ついでにIntelliJではじめてのプロジェクト作成(コンピュータ内にインストールされたjavaを設定)実際にkotlinをかいてみるまでやる

<div style="page-break-before:always"></div>

## kotlinの基本的な機能
### 標準出力
```kotlin
println("ここに文字がはいる")
println("繋げて" + "書くことも" + "できる")
println("文字列リテラル、文字列補完もできます${1 + 2}")
```

### 変数とは
文字列や計算結果などを入れる(代入)ことができる、プログラムにおける箱のようなもの  
箱の中身を参照したり、入れ替えたり(再代入)できる普通の箱の扱いをするものが`var`、参照はできるけど入れ替えができないものを`val`といいます

## もんだい
四則演算（+ - * /）の結果を変数に代入してそれぞれ出力してみてください

## 次回
- プリミティブ型
- if for while
