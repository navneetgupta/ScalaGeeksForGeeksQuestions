package com.array.test

import com.array.MoveAllZeroToEnd.{mozeZeroToEnd}
object MoveAllZeroToEndTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  mozeZeroToEnd(Array(1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0))
                                                  //> res0: Array[Int] = Array(1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0)
  
  mozeZeroToEnd(Array(1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9))
                                                  //> res1: Array[Int] = Array(1, 9, 8, 4, 2, 7, 6, 9, 0, 0, 0, 0)
}