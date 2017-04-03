package com.array.test

import com.array.MinSwapsForIdenticalArray.minSwapForIdenticalArray

object MinSwapsForIdenticalArrayTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  minSwapForIdenticalArray(Array(3, 6, 4, 8), Array(4, 6, 8, 3))
                                                  //> List((0,2), (1,1), (2,3), (3,0))
                                                  //| res0: Int = 2
}