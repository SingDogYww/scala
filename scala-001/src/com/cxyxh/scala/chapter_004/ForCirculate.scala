package com.cxyxh.scala.chapter_004

/**
  * for 循环比较特别
  */
object ForCirculate {
  def main(args: Array[String]): Unit = {
    //for中 声明一个变量i，指定一个范围11到30，包含30
    for (i <- 11 to 30){
      println(i*11)
    }

    //也是声明一个变量i，指定一个范围1到10，不包含10
    for(i <- 1 until 10 ){
      println(i)
    }

    //也是声明一个变量i，指定一个范围1到19，不包含19，但是多了个步长3，隔3取1
    for (j <- 1 until(19, 3)){
      println(j)
    }

    //类似于双重循环，当i取11时，j会取遍1-19,3的值
    for (i <- 11 to 30;j <- 1 until(19, 3)){
      println(i + "*" + j + " = " + (i * j))
    }

    //指定一个list集合，然后这个会遍历整个集合
    var list = List(1, 5, 85, 79, 55)
    for (x <- list){
      println(x)
    }

    //在for中遍历时，进行if判断符合条件的通过
    for (x <- 1 to 10 if x % 3 == 0){
      println(x)
    }

    //后面添加;可无限扩展条件
    for (x <- 1 to 100 if x % 3 == 0;if x % 5 == 0){
      println(x)
    }

    //yield，会将循环中遍历的数据保存下来存到集合中，注意for后面是中括号{}
    var result = for {x <- 1 to 100 if x % 2 == 0; if x % 3 == 0}yield x
    println(result)



  }
}
