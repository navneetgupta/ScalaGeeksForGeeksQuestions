package com.array.test

import com.array.SmallestPsitiveIntWithNoSubsetSum.findSmallest

object SmallestPsitiveIntWithNoSubsetSumTEst {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  findSmallest(Array(1, 3, 4, 5))                 //> res0: Int = 2
   findSmallest(Array(1, 2, 6, 10, 11, 15))       //> res1: Int = 4
   findSmallest(Array(1, 1, 1, 1))                //> res2: Int = 5
   findSmallest(Array(1, 1, 3, 4))                //> res3: Int = 10
}