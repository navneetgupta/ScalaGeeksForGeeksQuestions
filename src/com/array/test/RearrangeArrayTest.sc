package com.array

import com.array.RearrangeArray.{rearrange2,rearrange}

object RearrangeArrayTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  rearrange(Array(2, 0, 1, 4, 5, 3))              //> res0: Array[Int] = Array(1, 2, 0, 5, 3, 4)
  rearrange2(Array(2, 0, 1, 4, 5, 3))             //> res1: Array[Int] = Array(1, 2, 0, 5, 3, 4)
}