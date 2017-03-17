package com.array.test

import com.array.PairsWithGivenSum.{findPairs,findPairs2}
object PairsWithGivenSumTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  findPairs(Array(1, 5, 7, -1, 5), 6)             //> res0: Int = 3
  findPairs2(Array(1, 5, 7, -1, 5), 6)            //> res1: Int = 3
  
  findPairs(Array(1, 5, 7, -1, 5,4,4), 8)         //> res2: Int = 2
  findPairs2(Array(1, 5, 7, -1, 5,4,4), 8)        //> res3: Int = 2
  
  findPairs(Array(1, 5, 7, -1, 5,3,-3,2,-2), 0)   //> res4: Int = 3
  findPairs2(Array(1, 5, 7, -1, 5,3,-3,2,-2), 0)  //> res5: Int = 3
  
}