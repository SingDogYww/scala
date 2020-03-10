package com.cxyxh.scala.chapter_003

object Operator {
  def main(args: Array[String]): Unit = {
    //算术运算符+，-，*，/，%
    var a = 79
    var b = 56
    var c = 45.2
    var d = 2
    println("a + b = " + (a + b))
    println("a - b = " + (a - b))
    println("a * b = " + (a * b))
    println("a / b = " + (a / b))
    println("a % b = " + (a % b))
    println("b / a = " + (b / a))

    println("c / d = " + (c / d))

    //关系运算符==  != < > <= >=
    val w: Int = 10
    val e: Int = 20
    println("a == b = " + (w == e))
    println("a != b = " + (w != e))
    println("a > b = " + (w > e))
    println("a < b = " + (w < e))
    println("b >= a = " + (w >= e))
    println("b <= a = " + (w <= e))

    //逻辑运算符 && || !
    var rng = true;
    var edg = false;

    println("a && b = " + (rng && edg) );

    println("a || b = " + (rng || edg) );

    println("!(a && b) = " + !(rng && edg) );

    //位运算 ~ & | ^
  }
}
