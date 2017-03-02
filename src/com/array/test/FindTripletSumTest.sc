package com.array.test

import com.array.FindTripletSum.{findTripletSum,findTripletSum2}
object FindTripletSumTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  findTripletSum(Array(1, 4, 45, 6, 10, 8), 22)   //> res0: (List[Int], Boolean) = (List(4, 10, 8),true)
  findTripletSum2(Array(1, 4, 45, 6, 10, 8), 22)  //> res1: List[Int] = List(4, 8, 10)
  
}