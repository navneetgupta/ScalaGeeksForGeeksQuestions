package com.array.test

import com.array.NoOfSubArrayWithEvenSum.{findNoOfSubArray,countEvenSum}
object NoOfSubArrayWithEvenSumTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  findNoOfSubArray(Array(1, 2, 2, 3, 4, 1))       //> 2
                                                  //| 5
                                                  //| 7
                                                  //| 8
                                                  //| 9
                                                  //| 9
                                                  //| res0: Int = 9
  countEvenSum(Array(1, 2, 2, 3, 4, 1))           //> nSum ==1
                                                  //| nSum ==1
                                                  //| nSum ==1
                                                  //| nSum ==0
                                                  //| nSum ==0
                                                  //| nSum ==1
                                                  //| res1: Int = 9
                                                 
  
 
}