package com.array.test

import com.array.PossibleGroupOf2Or3WithSumAs3Mult.possibleGroups
object PossibleGroupOf2Or3WithSumAs3MultTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  possibleGroups(Array(3, 6, 7, 2, 9))            //> res0: Int = 8
  possibleGroups(Array(2, 1, 3, 4))               //> res1: Int = 4
  
}