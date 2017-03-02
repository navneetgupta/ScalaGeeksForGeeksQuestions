package com.array.test

import com.array.MaxLengthBitonicSubArray.maxLengthBitonicSubArray

object MaxLengthBitonicSubArrayTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  maxLengthBitonicSubArray(Array(12, 4, 78, 90, 45, 23), 6)
                                                  //> res0: Int = 5
   Array(1, 1, 2, 3, 1, 1).zip(Array(2, 1, 1, 3, 2, 1))
                                                  //> res1: Array[(Int, Int)] = Array((1,2), (1,1), (2,1), (3,3), (1,2), (1,1))
   
   
  maxLengthBitonicSubArray(Array(20, 4, 1, 2, 3, 4, 2, 10), 8)
                                                  //> res2: Int = 5
  maxLengthBitonicSubArray(Array(10), 1)          //> res3: Int = 1
  maxLengthBitonicSubArray(Array(10, 20, 30, 40), 4)
                                                  //> res4: Int = 4
  maxLengthBitonicSubArray(Array(40, 30, 20, 10), 4)
                                                  //> res5: Int = 4
                                                  
  maxLengthBitonicSubArray(Array(12, 4, 78, 90, 45, 23), 6)
                                                  //> res6: Int = 5
}