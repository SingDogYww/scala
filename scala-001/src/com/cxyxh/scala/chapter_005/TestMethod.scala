package com.cxyxh.scala.chapter_005

class TestMethod {
  def testAdd(num1 : Int, num2 : Int): Int = {
    return num1 + num2
  }


  /**
    * 下面这俩没重复，但是在传入参数有两个时，会掉用第一个
    */

  def testAdd(str1 : String, str2 : String): String = {
    return str1 + str2
  }

  def testAdd(args : String*): String ={
    var strs = ""
    for (str <- args){
      strs += str
    }
    strs
  }

  def testMoren(a:Int = 5, b : Double = 6.2): Double ={
    b / a
  }

}
