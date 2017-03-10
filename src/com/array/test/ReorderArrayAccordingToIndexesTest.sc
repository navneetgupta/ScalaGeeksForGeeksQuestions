package com.array.test

import com.array.ReorderArrayAccordingToIndexes.{reorder,reorder2}
object ReorderArrayAccordingToIndexesTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  reorder(Array(50, 40, 70, 60, 90), Array(3,  0,  4,  1,  2))
                                                  //> res0: Array[Int] = Array(40, 60, 90, 50, 70)
  reorder2(Array(50, 40, 70, 60, 90), Array(3,  0,  4,  1,  2))
                                                  //> res1: Array[Int] = Array(40, 60, 90, 50, 70)
                                          
                                            
}