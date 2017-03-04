package com.array.test

import com.array.RearrangePositiveNegativeNos.rearragnge
object RearrangePositiveNegativeNosTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  rearragnge(Array(-1, 2, -3, 4, 5, 6, -7, 8, 9)) //> res0: Array[Int] = Array(4, -3, 5, -1, 6, -7, 2, 8, 9)
  rearragnge(Array(-1, -2, 3, -4, -5, 6, 7, -8, -9))
                                                  //> res1: Array[Int] = Array(7, -2, 3, -5, 6, -9, -1, -4, -8)
}