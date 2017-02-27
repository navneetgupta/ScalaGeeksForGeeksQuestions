package com.array.test

import com.array.BlockSwapArrayRotation.{leftRotate2,leftRotate}
object BlockSwapArrayRotationTEst {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  leftRotate2(Array(1, 2, 3, 4, 5, 6, 7), 1, 7)   //> res0: Array[Int] = Array(2, 3, 4, 5, 6, 7, 1)
  leftRotate2(Array(1, 2, 3, 4, 5, 6, 7), 2, 7)   //> res1: Array[Int] = Array(3, 4, 5, 6, 7, 1, 2)
  leftRotate2(Array(1, 2, 3, 4, 5, 6, 7), 3, 7)   //> res2: Array[Int] = Array(4, 5, 6, 7, 1, 2, 3)
  leftRotate2(Array(1, 2, 3, 4, 5, 6, 7), 4, 7)   //> res3: Array[Int] = Array(5, 6, 7, 1, 2, 3, 4)
  leftRotate2(Array(1, 2, 3, 4, 5, 6, 7), 5, 7)   //> res4: Array[Int] = Array(6, 7, 1, 2, 3, 4, 5)
  leftRotate2(Array(1, 2, 3, 4, 5, 6, 7), 6, 7)   //> res5: Array[Int] = Array(7, 1, 2, 3, 4, 5, 6)
  leftRotate2(Array(1, 2, 3, 4, 5, 6, 7), 7, 7)   //> res6: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7)
  leftRotate(Array(1, 2, 3, 4, 5, 6, 7), 1, 7,0)  //> res7: Array[Int] = Array(2, 3, 4, 5, 6, 7, 1)
  //leftRotate(Array(1, 2, 3, 4, 5, 6, 7), 2, 7)
  
  
 
  //leftRotate(Array(1, 2, 3, 4, 5, 6, 7), 3, 7,0)
  //leftRotate(Array(1, 2, 3, 4, 5, 6, 7), 4, 7,0)
  //leftRotate(Array(1, 2, 3, 4, 5, 6, 7), 5, 7,0)
  //leftRotate(Array(1, 2, 3, 4, 5, 6, 7), 6, 7,0)
  //leftRotate(Array(1, 2, 3, 4, 5, 6, 7), 7, 7,0)
}