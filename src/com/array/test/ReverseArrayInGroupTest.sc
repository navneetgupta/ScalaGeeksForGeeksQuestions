package com.array.test

import com.array.ReverseArrayInGroup.reverseInGroup

object ReverseArrayInGroupTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  reverseInGroup(Array(1, 2, 3, 4, 5, 6, 7, 8), 1)//> res0: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8)
  reverseInGroup(Array(1, 2, 3, 4, 5, 6, 7, 8), 2)//> res1: Array[Int] = Array(2, 1, 4, 3, 6, 5, 8, 7)
  reverseInGroup(Array(1, 2, 3, 4, 5, 6, 7, 8), 3)//> res2: Array[Int] = Array(3, 2, 1, 6, 5, 4, 8, 7)
  reverseInGroup(Array(1, 2, 3, 4, 5, 6, 7, 8), 4)//> res3: Array[Int] = Array(4, 3, 2, 1, 8, 7, 6, 5)
  reverseInGroup(Array(1, 2, 3, 4, 5, 6, 7, 8), 5)//> res4: Array[Int] = Array(5, 4, 3, 2, 1, 8, 7, 6)
  reverseInGroup(Array(1, 2, 3, 4, 5, 6, 7, 8), 6)//> res5: Array[Int] = Array(6, 5, 4, 3, 2, 1, 8, 7)
  reverseInGroup(Array(1, 2, 3, 4, 5, 6, 7, 8), 7)//> res6: Array[Int] = Array(7, 6, 5, 4, 3, 2, 1, 8)
  reverseInGroup(Array(1, 2, 3, 4, 5, 6, 7, 8), 8)//> res7: Array[Int] = Array(8, 7, 6, 5, 4, 3, 2, 1)
  
}