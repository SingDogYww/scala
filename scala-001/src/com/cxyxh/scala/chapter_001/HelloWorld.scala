package com.cxyxh.scala.chapter_001

object HelloWorld {
  //使用class修饰的main的类里面的main方法不能直接执行，
  //但是使用object修饰的能直接执行
  def main(args: Array[String]): Unit = {
    print("Hello, World")
  }
}
