package com.array.test

import com.array.IsTwoSubArrayWithEqualSum.divideArray

object IsTwoSubArrayWithEqualSumTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  divideArray(Array(6, 2, 3, 2, 1))               //> res0: List[Int] = List(1)
  divideArray(Array(6, 1, 3, 2, 5))               //> res1: List[Int] = List(2)
  divideArray(Array(6, -2, -3, 2, 3))             //> res2: List[Int] = List(0)
  divideArray(Array(6, -2, 3, 2, 3))              //> res3: List[Int] = List()
}