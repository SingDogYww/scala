package com.cxyxh.scala.chapter_005

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

  }

}
