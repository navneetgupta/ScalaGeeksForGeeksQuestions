package com.array.test

import com.array.MergeNSizeArrayIntoMNSizeArray.{pushToEnd,pushToEnd2,mergeNSizeIntoMNSize}
object MergeNSizeArrayIntoMNSizeArrayTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  pushToEnd(Array("2","NA","7","NA","NA","10","NA"))
                                                  //> res0: Array[String] = Array(2, NA, 7, NA, 2, 7, 10)
             
  pushToEnd2(Array("2","NA","7","NA","NA","10","NA"))
                                                  //> res1: Array[String] = Array(2, NA, 7, NA, 2, 7, 10)
                                                  
  mergeNSizeIntoMNSize(Array("3","6","9","12"), Array("2","NA","7","NA","NA","10","NA"))
                                                  //> res2: Array[String] = Array(2, 3, 6, 7, 9, 10, 12)
 
}