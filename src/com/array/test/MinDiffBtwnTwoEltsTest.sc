package com.array.test

import com.array.MinDiffBtwnTwoElts.{minDiffPair,minDiffPair2}
object MinDiffBtwnTwoEltsTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  minDiffPair(Array(1, 5, 3, 19, 18, 25))         //> res0: Int = 1
  
  minDiffPair(Array(1,4,7,11,17,23))              //> res1: Int = 3
  minDiffPair2(Array(1, 5, 3, 19, 18, 25))        //> res2: Int = 1
  
  minDiffPair2(Array(1,4,7,11,17,23))             //> res3: Int = 3
}