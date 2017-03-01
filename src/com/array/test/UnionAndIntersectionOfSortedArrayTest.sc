package com.array.test

import com.array.UnionAndIntersectionOfSortedArray.{union,intersection}

object UnionAndIntersectionOfSortedArrayTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val a1= Array(1,2,3,4,5,6,7,9,12,13,14,15,16,19)//> a1  : Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 9, 12, 13, 14, 15, 16, 19)
  val a2 = Array(2,3,4,6,7,8,10,11,13,14,15,16,17,18)
                                                  //> a2  : Array[Int] = Array(2, 3, 4, 6, 7, 8, 10, 11, 13, 14, 15, 16, 17, 18)
  a1.zip(a2)                                      //> res0: Array[(Int, Int)] = Array((1,2), (2,3), (3,4), (4,6), (5,7), (6,8), (7
                                                  //| ,10), (9,11), (12,13), (13,14), (14,15), (15,16), (16,17), (19,18))
  union(a1,a2)                                    //> res1: List[Int] = List(19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5
                                                  //| , 4, 3, 2, 1)
  intersection(a1, a2)                            //> res2: List[Int] = List(16, 15, 14, 13, 7, 6, 4, 3, 2)
 
}