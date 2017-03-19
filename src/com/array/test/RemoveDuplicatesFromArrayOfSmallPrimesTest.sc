package com.array.test

import com.array.RemoveDuplicatesFromArrayOfSmallPrimes.{removeDups,removeDups2}
object RemoveDuplicatesFromArrayOfSmallPrimesTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  removeDups(Array(1,1,5, 5, 7, 2, 2, 5, 7, 7,3)) //> res0: List[Int] = List(3, 2, 7, 5, 1)
  
  removeDups2(Array(3, 5, 7, 2, 2, 5, 7, 7))      //> res1: List[Int] = List(2, 7, 5, 3)
  
  removeDups(Array(3, 5, 7, 2, 2, 5, 7, 7))       //> res2: List[Int] = List(2, 7, 5, 3)
  
  removeDups2(Array(3, 5, 7, 2, 2, 5, 7, 7))      //> res3: List[Int] = List(2, 7, 5, 3)
  
}