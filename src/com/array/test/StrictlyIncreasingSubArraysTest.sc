package com.array.test

import com.array.StrictlyIncreasingSubArrays.{countSISubArrays,countSISubArrays2}

object StrictlyIncreasingSubArraysTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  countSISubArrays(Array(1,2,2,4))                //> res0: Int = 2
  
  countSISubArrays(Array(1,2,3,4,5,5,5,6,7,8,9,10,11,12))
                                                  //> res1: Int = 38
  
  countSISubArrays2(Array(1,2,2,4))               //> res2: Int = 2
  
  countSISubArrays2(Array(1,2,3,4,5,5,5,6,7,8,9,10,11,12))
                                                  //> res3: Int = 38
}