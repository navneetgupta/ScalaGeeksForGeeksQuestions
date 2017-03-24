package com.array.test

import com.array.MaxPairSumWithSpecificDiffrence.{maxPairSum,maxPairSum2}

object MaxPairSumWithSpecificDiffrenceTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  maxPairSum(Array(3, 5, 10, 15, 17, 12, 9), 4)   //> res0: Int = 62
  maxPairSum2(Array(3, 5, 10, 15, 17, 12, 9), 4)  //> res1: Int = 62
  maxPairSum2(Array(5, 15, 10, 300), 12)          //> res2: Int = 25
  maxPairSum(Array(5, 15, 10, 300), 12)           //> res3: Int = 25
}