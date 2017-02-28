package com.array.test

import com.array.SegregateEvenOdd.segregateEvenAndOdds
object SegregateEvenOddTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  segregateEvenAndOdds(Array(12, 34, 45, 9, 8, 90, 3))
                                                  //> res0: Array[Int] = Array(12, 34, 90, 8, 9, 45, 3)
}