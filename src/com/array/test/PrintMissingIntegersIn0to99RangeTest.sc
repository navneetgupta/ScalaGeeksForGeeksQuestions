package com.array.test

import com.array.PrintMissingIntegersIn0to99Range.findMissingElts
object PrintMissingIntegersIn0to99RangeTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  findMissingElts(Array(88, 105, 3, 2, 200, 0, 10))
                                                  //> 1
                                                  //| 4-9
                                                  //| 11-87
                                                  //| 89-99
                                                  
  val arr = Array.fill(5){false}                  //> arr  : Array[Boolean] = Array(false, false, false, false, false)
}