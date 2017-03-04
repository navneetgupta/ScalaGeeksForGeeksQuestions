package com.array.test

import com.array.MaxCircularSubArraySum.maxCircularSum

object MaxCircularSubArraySumTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  maxCircularSum(Array(11, 10, -20, 5, -3, -5, 8, -13, 10))
                                                  //> res0: Int = 31
  maxCircularSum(Array(8, -8, 9, -9, 10, -11, 12))//> res1: Int = 22
  maxCircularSum(Array(10, -3, -4, 7, 6, 5, -4, -1))
                                                  //> res2: Int = 23
  maxCircularSum(Array(-1, 40, -14, 7, 6, 5, -4, -1))
                                                  //> res3: Int = 52
}