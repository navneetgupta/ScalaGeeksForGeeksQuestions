package com.array.test

import com.array.MaxProductSubArraySet2.maxProductSubArray

object MaxProductSubArraySet2Test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  maxProductSubArray(Array(-1, -2, -3, 4))        //> res0: Int = 24
  maxProductSubArray(Array(6, -3, -10, 0, 2))     //> res1: Int = 180
  maxProductSubArray(Array(-1, -3, -10, 0, 60))   //> res2: Int = 60
  maxProductSubArray(Array(-10))                  //> res3: Int = 0
}