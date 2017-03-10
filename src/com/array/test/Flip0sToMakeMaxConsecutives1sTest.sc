package com.array.test

import com.array.Flip0sToMakeMaxConsecutives1s.findZeros
object Flip0sToMakeMaxConsecutives1sTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  findZeros(Array(1, 0, 0, 1, 1, 0, 1, 0, 1, 1), 2)
                                                  //> 5 , 
                                                  //| 7 , 
  findZeros(Array(1,1,1, 0, 0, 1, 1,1,1,1, 0, 1, 0, 1, 1), 2)
                                                  //> 3 , 
                                                  //| 4 , 
}