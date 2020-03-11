package com.cxyxh.scala.chapter_005

import java.util.Date

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


  //将函数作为参数
  def aplly(f: (String, String) => String, str1 : String, str2 : String) = f(str1, str2)


  //计算阶乘
  def factorial(i : Int) : Int = {
    //在方法内部定义方法，局部函数
    def fact(i : Int, accumulator : Int) : Int = {
      if (i <= 1){
        accumulator
      }else{
        fact(i - 1, i * accumulator)
      }
    }

    fact(i, 1)
  }

  //斐波那契数列，递归
  def feiBo(i : Int) : Int = {
    if (i == 1)
      1
    else if (i == 2)
      1
    //一般不会分成两个，这样的内存占据是成线性增长的
    else
      feiBo(i - 1) + feiBo(i - 2)
  }


  def log(date : Date, message : String): Unit ={
    println(date, message)
  }

  def testAdd2(str1:String)(str2:String): String ={
    str1 + str2
  }


  var factor = 5
  val mutiply = (i:Int) => i * factor
  def mutiply2(i:Int) : Int = {
    i * factor
  }

}
