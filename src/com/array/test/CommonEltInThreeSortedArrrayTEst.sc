package com.array.test

import com.array.CommonEltInThreeSortedArrray.findCommon

object CommonEltInThreeSortedArrrayTEst {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  findCommon(Array(1, 5, 10, 20, 40, 80), Array(6, 7, 20, 80, 100), Array(3, 4, 15, 20, 30, 70, 80, 120))
                                                  //> 20  80  
                                          
  var arr = Array(1,2,3,4,5)                      //> arr  : Array[Int] = Array(1, 2, 3, 4, 5)
}