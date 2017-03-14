package com.array.test

import com.array.CountInversions.{countInversions,countInversions2}
object CountInversionsTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  countInversions(Array(8, 4, 2, 1))              //> res0: Int = 4
  countInversions(Array(9, 6, 4, 5, 8))           //> res1: Int = 2
	countInversions2(Array(8, 4, 2, 1))       //> res2: Int = 4
  countInversions2(Array(9, 6, 4, 5, 8))          //> res3: Int = 2
  
  
}