package com.array.test

import com.array.MaxProductSubArray.maxProduct

object MaxProductSubArrayTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  maxProduct(Array(1, -2, -3, 0, 7, -8, -2))      //> res0: Int = 112
   maxProduct(Array(6, -3, -10, 0, 2))            //> res1: Int = 180
    maxProduct(Array(-1, -3, -10, 0, 60))         //> res2: Int = 60
     maxProduct(Array(-2, -3, 0, -2, -40))        //> res3: Int = 80
}