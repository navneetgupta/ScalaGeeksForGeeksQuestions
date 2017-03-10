package com.array.test

import com.array.CountTripletsWithSumSmallerThanGivenValue.{findNoOfTriplet,findNoOfTriplet2}

object CountTripletsWithSumSmallerThanGivenValueTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  findNoOfTriplet(Array(5, 1, 3, 4, 7), 12)       //> res0: (IndexedSeq[List[Int]], Boolean, Int) = (Vector(List(5, 1, 3), List(5,
                                                  //|  1, 4), List(1, 3, 4), List(1, 3, 7)),true,4)
  findNoOfTriplet2(Array(5, 1, 3, 4, 7), 12)      //> res1: Int = 4
  
  findNoOfTriplet(Array(-2, 0, 1, 3), 2)          //> res2: (IndexedSeq[List[Int]], Boolean, Int) = (Vector(List(-2, 0, 1), List(-
                                                  //| 2, 0, 3)),true,2)
  findNoOfTriplet2(Array(-2, 0, 1, 3), 2)         //> res3: Int = 2
  
  findNoOfTriplet(Array(5, 1, 3, 4, 7), 10)       //> res4: (IndexedSeq[List[Int]], Boolean, Int) = (Vector(List(5, 1, 3), List(1,
                                                  //|  3, 4)),true,2)
  findNoOfTriplet2(Array(5, 1, 3, 4, 7), 10)      //> res5: Int = 2
  
}