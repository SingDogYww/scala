package com.cxyxh.scala.chapter_005

import java.util.Date

/**
  * 方法和函数，在scala中是分开的
  */
object MethodAndFunction {

  def m(x : Int) = x + 3

  val f = (x : Int) => x + 3

  def method1(x : String, str : String): String ={
    return x + str
  }

  /**
    * java 中的main方法
    * public static void main(String[] args){}
    * scala的main方法中，args: Array[String]是参数列表，对应String[] args
    * Unit对应void，也就是没有返回值
    * @param args
    */
  def main(args: Array[String]): Unit = {
    var result1 = m(5)
    println(result1)
    var result2 = f(6)
    println(result2)

    println(f.getClass)
    //    println(m.getClass)


    var x = method1("55", "66")
    println(x)

    //调用另一个类的方法

    var obj = new TestMethod


    var result3 = obj.testAdd(5, 6)
    println(result3)
    var result4 = obj.testAdd("566", "哈哈")
    println(result4)


    //指定参数名
    var result5 = obj.testAdd(str2 = "556", str1 = "哈哈")
    println(result5)


    var result6 = obj.testAdd("556", "哈哈", "855")
    println(result6)

    var result7 = obj.testMoren()
    println(result7)
    var result8 = obj.testMoren(55, 33)
    println(result8)
    var result9 = obj.testMoren(55, 33.0)
    println(result9)


    var result10 = obj.aplly(obj.testAdd, "嘎嘎", "嘎嘎")
    println(result10)


    println(obj.factorial(0))
    println(obj.factorial(1))
    println(obj.factorial(2))
    println(obj.factorial(3))
    println(obj.factorial(4))

    println(obj.feiBo(1))
    println(obj.feiBo(2))
    println(obj.feiBo(3))
    println(obj.feiBo(4))
    println(obj.feiBo(5))
    println(obj.feiBo(6))
    println(obj.feiBo(7))
    println(obj.feiBo(8))
    println(obj.feiBo(9))
    println(obj.feiBo(10))
    println(obj.feiBo(11))
    println(obj.feiBo(12))
    println(obj.feiBo(13))
    println(obj.feiBo(14))
    println(obj.feiBo(15))
    println(obj.feiBo(16))
    println(obj.feiBo(17))
    //到达100就会计算很久了
//    println(obj.feiBo(100))

    val date = new Date
    //可以进行参数绑定，然后设置类似于占位符的_,之后调用就只需要传入占位符的内容了
    val logWithDateBound = obj.log(date, _:String)

    logWithDateBound("message1")
    logWithDateBound("message2")
    logWithDateBound("message3")

    println(obj.testAdd2("mesage")("mesage2"))


  }
}