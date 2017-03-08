package com.array.test

import com.array.RearrangePositiveNegativeEltsSet1.rearrange
object RearrangePositiveNegativeEltsSet1Test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  rearrange(Array(-5, -2, 5, 2, 4, 7, 1, 8, 0, -8))
                                                  //> res0: Array[Int] = Array(-5, 5, -2, 2, -8, 4, 7, 1, 8, 0)
  rearrange(Array(-5, 3, 4, 5, -6, -2, 8, 9, -1, -4))
                                                  //> res1: Array[Int] = Array(-5, 3, -6, 4, -2, 5, -1, 8, -4, 9)
  rearrange(Array(-5, -3, -4, -5, -6, 2 , 8, 9, 1 , 4))
                                                  //> res2: Array[Int] = Array(-5, 2, -3, 8, -4, 9, -5, 1, -6, 4)
  rearrange(Array(-5, 3, -4, -7, -1, -2 , -8, -9, 1 , -4))
                                                  //> res3: Array[Int] = Array(-5, 3, -4, 1, -7, -1, -2, -8, -9, -4)
                                                  
  rearrange(Array(5, 3, 4, 2, 1, -2 , -8, -9, -1 , -4))
                                                  //> res4: Array[Int] = Array(-2, 5, -8, 3, -9, 4, -1, 2, -4, 1)
  
}