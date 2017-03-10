package com.array.test

import com.array.ConvertToZigZagArray.zigZag
object ConvertToZigZagArrayTEst {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  zigZag(Array(4, 3, 7, 8, 6, 2, 1))              //> res0: Array[Int] = Array(3, 7, 4, 8, 2, 6, 1)
  zigZag(Array(1, 4, 3, 2))                       //> res1: Array[Int] = Array(1, 4, 2, 3)
  
  
}