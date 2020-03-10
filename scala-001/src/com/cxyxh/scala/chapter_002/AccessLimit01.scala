package com.cxyxh.scala.chapter_002

/**
  * 访问修饰
  */
class AccessLimit01 {
  //private关键字修饰，带有此标记的成员，
  //仅在包含了成员定义的类或者对象内部可见
  class Inner1{
    private def f(){println("Inner.f()")}
    class InnerMost{
      f()
    }
  }
//  (new Inner1).f(); 报错

  //默认，是最大的权限，这样的成员在哪儿都可以访问
  class Inner2{
    def f(){println("Inner.f()")}
    class InnerMost{
      f()
    }
  }
  (new Inner2).f();

  //protected, 他只允许保护成员在定义了该成员的类的子类中被访问
  //和java不一样的是，java中的protected还允许在同一个类中的其他类访问
  class Inner3{
    protected def f(){println("Inner.f()")}
    class InnerMost{
      f()
    }
  }
//  (new Inner3).f(); 报错


  //作用域保护private[x] 或 protected[x]
  //表示在这个x表示的类或者包中可见，但是之外的都是自己原有的访问限制




}
