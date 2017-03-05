package com.array.test

import com.array.MaxSumPathInTwoArray.maxSumPath

object MaxSumPathInTwoArrayTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  maxSumPath(Array(2, 3, 7, 10, 12, 15, 30, 34), Array(1, 5, 7, 8, 10, 15, 16, 19))
                                                  //> res0: Int = 122
  maxSumPath(Array(2, 3, 7, 10, 12), Array(1, 5, 7, 8))
                                                  //> res1: Int = 35
  maxSumPath(Array(10, 12), Array(5, 7, 9))       //> res2: Int = 22
}