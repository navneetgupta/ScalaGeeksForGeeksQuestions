package com.array.test

import com.array.SubArrayWithGivenSum.{subArraySum,subArraySum2}

object SubArrayWithGivenSumTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  subArraySum(Array(15, 2, 4, 8, 9, 5, 10, 23), 23)
                                                  //> Founded sub Array between 1 and 4
  subArraySum(Array(1, 4, 20, 3, 10, 5), 33)      //> Founded sub Array between 2 and 4
  subArraySum(Array(1, 4, 0, 0, 3, 10, 5), 7)     //> Founded sub Array between 1 and 4
  subArraySum(Array(1, 4), 0)                     //> No Sub Array Exists
  
  subArraySum2(Array(15, 2, 4, 8, 9, 5, 10, 23), 23)
                                                  //> Founded sub Array between 0 and 4
  subArraySum2(Array(1, 4, 20, 3, 10, 5), 33)     //> Founded sub Array between 2 and 4
  subArraySum2(Array(1, 4, 0, 0, 3, 10, 5), 7)    //> Founded sub Array between 1 and 4
  subArraySum2(Array(1, 4), 0)                    //> No Sub Array Exists
  
  
  val arr = Array(12,2,3,4,5,6,7,8,9)             //> arr  : Array[Int] = Array(12, 2, 3, 4, 5, 6, 7, 8, 9)
  arr.drop(2)                                     //> res0: Array[Int] = Array(3, 4, 5, 6, 7, 8, 9)
  arr                                             //> res1: Array[Int] = Array(12, 2, 3, 4, 5, 6, 7, 8, 9)
}