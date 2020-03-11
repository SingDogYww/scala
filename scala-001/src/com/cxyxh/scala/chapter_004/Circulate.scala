package com.cxyxh.scala.chapter_004

/**
  * 循环 while 和 do-while和Java一致
  */
object Circulate {
  def main(args: Array[String]): Unit = {
    var num = 1
    while(num < 20){
      println("我又跑了一圈，这是第" + num + "圈")
      num += 1
    }

    var num1 = 1
    do {
      println("我又跑了一圈，这是第" + num1 + "圈")
      num1 += 1
    }while(num1 < 20)


  }
}
