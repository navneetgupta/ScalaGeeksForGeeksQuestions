package com.array.test

import com.array.LargestProductOfSubArrayOfSizeK.findMaxProduct
object LargestProductOfSubArrayOfSizeKTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  findMaxProduct(Array(1, 5, 9, 8, 2, 4, 1, 8, 1, 2), 6)
                                                  //> res0: Int = 4608
  findMaxProduct(Array(1, 5, 9, 8, 2, 4, 1, 8, 1, 2), 4)
                                                  //> res1: Int = 720
  findMaxProduct(Array(2, 5, 8, 1, 1, 3), 3)      //> res2: Int = 80
}