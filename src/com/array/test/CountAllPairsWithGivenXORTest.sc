package com.array.test

import com.array.CountAllPairsWithGivenXOR.{xorPairCount2,xorPairCount}

object CountAllPairsWithGivenXORTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  xorPairCount(Array(2, 5, 2), 0)                 //> res0: Int = 1
  xorPairCount2(Array(2, 5, 2), 0)                //> res1: Int = 1
  xorPairCount(Array(5 , 4 ,10, 15, 7, 6), 5)     //> res2: Int = 1
  xorPairCount2(Array(5 , 4 ,10, 15, 7, 6),5)     //> res3: Int = 1
}