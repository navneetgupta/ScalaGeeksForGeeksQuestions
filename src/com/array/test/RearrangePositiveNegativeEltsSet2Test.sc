package com.array.test

import com.array.RearrangePositiveNegativeEltsSet2.rearrange

object RearrangePositiveNegativeEltsSet2Test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  rearrange(Array(2, 3, -4, -1, 6, -9))           //> res0: Array[Int] = Array(-1, 3, -4, 2, -9, 6)
  rearrange(Array(-2, 3, 4, -1))                  //> res1: Array[Int] = Array(-2, 3, -1, 4)
  rearrange(Array(-2, 3, 1))                      //> res2: Array[Int] = Array(-2, 3, 1)
  rearrange(Array(-5, 3, 4, 5, -6, -2, 8, 9, -1, -4))
                                                  //> res3: Array[Int] = Array(-2, 3, -6, 5, -5, 9, -1, 8, -4, 4)
  rearrange(Array(2, 3, -4, -1, 6, -9))           //> res4: Array[Int] = Array(-1, 3, -4, 2, -9, 6)
  
  
}