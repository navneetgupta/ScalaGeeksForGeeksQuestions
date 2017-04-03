package com.array.test

import com.array.MiddleOrEqualPointInSortedArrWithDuplicates.findEqulaPoint

object MiddleOrEqualPointInSortedArrWithDuplicatesTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val idx = findEqulaPoint(Array(1, 2, 3, 4, 4, 5, 6, 6, 6, 7))
                                                  //> idx  : Int = 3
                                                  
  Array(1, 2, 3, 4, 4, 5, 6, 6, 6, 7)(idx)        //> res0: Int = 4
}