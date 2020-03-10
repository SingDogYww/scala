package com.cxyxh.scala.chapter_001

/**
  * 变量
  */
object Variable {
  def main(args: Array[String]): Unit = {
    //声明变量，但是必须赋初值
    var myVar1 : String  = "555"
    var myVar2 : String  = "777"
    println(myVar1)
    print(myVar2)
    myVar1 = "888"
    println(myVar1)

    var myVar3 = 48
    var myVar4 = "666"
    //myVar3 = "8989" 报错，因为虽然上面没有指定类型，
    //但是scala会自己根据后面赋初值的类型推断出类型
    //声明常量，声明了之后不可在变
    val myVal : String = "male"
    println(myVal)


    //多个变量声明
    var xmax, ymax = 400

  }



}
