package com.array.test

import com.array.SmallestSubArrayWithSumMultipleOfArraySize.subArraySumWithMultipleOfN

object SmallestSubArrayWithSumMultipleOfArraySizeTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val as = List(1,2,3)                            //> as  : List[Int] = List(1, 2, 3)
  as.length                                       //> res0: Int = 3
  as.size                                         //> res1: Int = 3
  
  subArraySumWithMultipleOfN(Array(1, 1, 2, 2, 4, 2))
                                                  //> 2 , 4 , 
 print("")
}