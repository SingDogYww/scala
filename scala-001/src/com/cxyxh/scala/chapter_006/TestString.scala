package com.cxyxh.scala.chapter_006

object TestString {

  def main(args: Array[String]): Unit = {

    var str = "离离原上草"
    var buf = new StringBuilder
    buf += 'a'


    val str2 = "离离原上草"
    //str2 += "一岁一枯荣" 报错
    val str3 = new StringBuilder("离离原上草")
    str3 += '一'

    println(str.length())




  }


}
