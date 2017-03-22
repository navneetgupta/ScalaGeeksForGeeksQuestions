package com.array.test

import com.array.TripletsInSortedArrayFormingGP.findGeometricTriplets

object TripletsInSortedArrayFormingGPTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  findGeometricTriplets(Array(1, 2, 6, 10, 18, 54))
                                                  //> res0: List[(Int, Int, Int)] = List((6,18,54), (2,6,18))
  findGeometricTriplets(Array(2, 8, 10, 15, 16, 30, 32, 64))
                                                  //> res1: List[(Int, Int, Int)] = List((16,32,64), (8,16,32), (2,8,32))
	findGeometricTriplets(Array(1, 2, 4, 16)) //> res2: List[(Int, Int, Int)] = List((1,4,16), (1,2,4))
	findGeometricTriplets(Array(1, 2, 3, 6, 18, 22))
                                                  //> res3: List[(Int, Int, Int)] = List((2,6,18))
	findGeometricTriplets(Array(1,3,6,9,12,15,18,21))
                                                  //> res4: List[(Int, Int, Int)] = List((3,6,12), (1,3,9))
	findGeometricTriplets(Array(1,2,4,8))     //> res5: List[(Int, Int, Int)] = List((2,4,8), (1,2,4))
	findGeometricTriplets(Array(1,3,9,27,81)) //> res6: List[(Int, Int, Int)] = List((9,27,81), (1,9,81), (3,9,27), (1,3,9))
}