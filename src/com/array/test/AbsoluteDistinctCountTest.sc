package com.array.test

import com.array.AbsoluteDistinctCount.{absoluteDistinctElts,absoluteDistinctElts2}

object AbsoluteDistinctCountTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  absoluteDistinctElts(Array(-2, -1, 0, 1, 1))    //> res0: Set[Int] = Set(2, 1, 0)
  absoluteDistinctElts2(Array(-2, -1, 0, 1, 1))   //> res1: Int = 3
}