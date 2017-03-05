package com.array.test

import com.array.SmallestArrayWithSumGtGivenValue.{smallestArrayLength,smallestArrayLength2}

object SmallestArrayWithSumGtGivenValueTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  smallestArrayLength(Array(1, 4, 45, 6, 10, 19), 51)
                                                  //> res0: Int = 3
  smallestArrayLength(Array(1, 10, 5, 2, 7), 9)   //> res1: Int = 1
  smallestArrayLength(Array(1, 11, 100, 1, 0, 200, 3, 2, 1, 250), 280)
                                                  //> res2: Int = 4
  
  smallestArrayLength2(Array(1, 4, 45, 6, 10, 19), 51)
                                                  //> res3: Int = 3
  smallestArrayLength2(Array(1, 10, 5, 2, 7), 9)  //> res4: Int = 1
  smallestArrayLength2(Array(1, 11, 100, 1, 0, 200, 3, 2, 1, 250), 280)
                                                  //> res5: Int = 4
                                                  
}