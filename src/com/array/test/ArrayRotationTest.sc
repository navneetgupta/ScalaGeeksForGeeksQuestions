package com.array.test

import com.array.ArrayRotation.{leftRotate,leftRotateByOne,leftRotate2,leftRotate4}

object ArrayRotationTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  leftRotateByOne(Array(1,2,3,4,5,6))             //> res0: Array[Int] = Array(2, 3, 4, 5, 6, 1)
  
  leftRotate(Array(1,2,3,4,5,6), 4)               //> res1: Array[Int] = Array(5, 6, 1, 2, 3, 4)
  
  leftRotate4(Array(1,2,3,4,5,6), 4)              //> res2: Array[Int] = Array(5, 6, 1, 2, 3, 4)
  leftRotate(Array(1,2,3,4,5,6), 1)               //> res3: Array[Int] = Array(2, 3, 4, 5, 6, 1)
  
  leftRotate4(Array(1,2,3,4,5,6), 1)              //> res4: Array[Int] = Array(2, 3, 4, 5, 6, 1)
  leftRotate(Array(1,2,3,4,5,6), 2)               //> res5: Array[Int] = Array(3, 4, 5, 6, 1, 2)
  
  leftRotate4(Array(1,2,3,4,5,6), 2)              //> res6: Array[Int] = Array(3, 4, 5, 6, 1, 2)
  leftRotate(Array(1,2,3,4,5,6), 3)               //> res7: Array[Int] = Array(4, 5, 6, 1, 2, 3)
  
  leftRotate4(Array(1,2,3,4,5,6), 3)              //> res8: Array[Int] = Array(4, 5, 6, 1, 2, 3)
  leftRotate(Array(1,2,3,4,5,6), 5)               //> res9: Array[Int] = Array(6, 1, 2, 3, 4, 5)
  
  leftRotate4(Array(1,2,3,4,5,6), 5)              //> res10: Array[Int] = Array(6, 1, 2, 3, 4, 5)
  leftRotate(Array(1,2,3,4,5,6), 6)               //> res11: Array[Int] = Array(1, 2, 3, 4, 5, 6)
  
  leftRotate4(Array(1,2,3,4,5,6), 6)              //> res12: Array[Int] = Array(1, 2, 3, 4, 5, 6)
  //leftRotate2(Array(1,2,3,4,5,6), 4)
                         
                                     
}