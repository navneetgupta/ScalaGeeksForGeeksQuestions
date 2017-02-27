package com.array.test

import com.array.ReverseArray.reverseArray
object ReverseArrayTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  reverseArray(Array(1,2,3,4,5,67,7), 0, Array(1,2,3,4,5,67,7).length-1)
                                                  //> res0: Array[Int] = Array(7, 67, 5, 4, 3, 2, 1)
}