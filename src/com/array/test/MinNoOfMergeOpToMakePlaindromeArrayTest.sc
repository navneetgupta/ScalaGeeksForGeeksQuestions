package com.array.test

import com.array.MinNoOfMergeOpToMakePlaindromeArray.findMinOps
object MinNoOfMergeOpToMakePlaindromeArrayTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  findMinOps(Array(1, 4, 5, 9, 1))                //> res0: Int = 1
  findMinOps(Array(1, 4, 1))                      //> res1: Int = 0
  findMinOps(Array(11, 14, 15, 99))               //> res2: Int = 3
  findMinOps(Array(1, 4, 1))                      //> res3: Int = 0
}