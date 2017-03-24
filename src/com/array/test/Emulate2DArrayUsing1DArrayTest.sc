package com.array.test

import com.array.Emulate2DArrayUsing1DArray.emulate

object Emulate2DArrayUsing1DArrayTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  emulate(Array(Array(1, 2, 3),Array(4, 5, 6),Array(7, 8, 9)), 3, 3)
                                                  //> 4  5  6  4  5  6  4  5  6  
  val as ="as"                                    //> as  : String = as
}