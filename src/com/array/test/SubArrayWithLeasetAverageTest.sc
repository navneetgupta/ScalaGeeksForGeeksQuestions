package com.array.test

import com.array.SubArrayWithLeasetAverage.findMinAvgSubArray
object SubArrayWithLeasetAverageTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  findMinAvgSubArray(Array(3, 7, 90, 20, 10, 50, 40), 3)
                                                  //> res0: List[Int] = List(3, 5)
  findMinAvgSubArray(Array(3, 7, 5, 20, -10, 0, 12), 2)
                                                  //> res1: List[Int] = List(4, 5)
}