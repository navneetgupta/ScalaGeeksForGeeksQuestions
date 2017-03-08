package com.array.test

import com.array.UnionIntersectionUnSortedArray.{printUnion,printIntersection}

object UnionIntersectionUnSortedArrayTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  printUnion(Array(7, 1, 5, 2, 3, 6), Array(3, 8, 6, 20, 7))
                                                  //> 3 , 6 , 7 , 8 , 20 , 1 , 5 , 2 , 
  printIntersection(Array(7, 1, 5, 2, 3, 6), Array(3, 8, 6, 20, 7))
                                                  //> 7 , 3 , 6 , 
                                                  
                                       
 val arr = Array(1,2,3,4)                         //> arr  : Array[Int] = Array(1, 2, 3, 4)
}