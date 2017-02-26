package com.array.test

import com.array.NoOccuringOddNumberOfTimes.getOddOccurenceNumber
object NoOccuringOddNumberOfTimesTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  getOddOccurenceNumber(Array(1,1,1,1,1,1,1,1,2,2,2,2,2,2,3,3,3,3,3,3,2,3,2,3,2,3,4,5,6,4,5,6,2))
                                                  //> res0: Int = 3
  getOddOccurenceNumber(Array(1,1,1,1,1,1,1,1,2,2,2,2,2,2,3,3,3,3,3,3,2,3,2,3,2,3,4,5,6,4,5,6,2,3,6))
                                                  //> res1: Int = 6
  getOddOccurenceNumber(Array(1,1,1,1,1,1,1,1,2,2,2,2,2,2,3,3,3,3,3,3,2,3,2,3,2,3,4,5,6,4,5,6,2,3,2))
                                                  //> res2: Int = 2


val a = Array(1,2,3,4)                            //> a  : Array[Int] = Array(1, 2, 3, 4)
a.reverse                                         //> res3: Array[Int] = Array(4, 3, 2, 1)

val ar = Array("as","asd","sdsd")                 //> ar  : Array[String] = Array(as, asd, sdsd)
ar.reverse                                        //> res4: Array[String] = Array(sdsd, asd, as)

}