package com.array.test

import com.array.SmallestMissingNumber.smallestMissingNumber
object SmallestMissingNumberTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  smallestMissingNumber(Array(0, 1, 2, 3, 4, 5, 6, 7, 10), 0, 8)
                                                  //> res0: Int = 8
  smallestMissingNumber(Array(0, 1, 2, 6, 9), 0, 4)
                                                  //> res1: Int = 3
  smallestMissingNumber(Array(4, 5, 10, 11), 0, 3)//> res2: Int = 0
  smallestMissingNumber(Array(0, 1, 2, 3), 0, 3)  //> res3: Int = 4
}