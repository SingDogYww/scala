package com.cxyxh.scala.chapter_004

/**
  * if - else if - else语句和Java类似
  */
object IfElseIf {
  def main(args: Array[String]): Unit = {
    var num = 20
    if (num < 10){
      println("num < 10")
    }else if (num < 50){
      println("num在10到50之间")
    }else{
      println("num>50")
    }

  }
}
