package com.array.test

import com.array.MinimizeMaxDiffBtwnHeigts.minimizeMaxDiff
object MinimizeMaxDiffBtwnHeigtsTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  minimizeMaxDiff(Array(1, 15, 10), 6)            //> List(7, 4, 9)
                                                  //| res0: Int = 5
  minimizeMaxDiff(Array(1, 5, 15, 10), 3)         //> List(4, 8, 7, 12)
                                                  //| res1: Int = 8
  minimizeMaxDiff(Array(4, 6), 10)                //>  k >= maxe-mineres2: Int = 2
  minimizeMaxDiff(Array(6, 10), 3)                //> List(9, 7)
                                                  //| res3: Int = 2
  minimizeMaxDiff(Array(1, 10, 14, 14, 14, 15), 6)//> List(7, 4, 8, 8, 8, 9)
                                                  //| res4: Int = 5
  minimizeMaxDiff(Array(1, 2, 3), 2)              //>  k >= maxe-mineres5: Int = 2
}