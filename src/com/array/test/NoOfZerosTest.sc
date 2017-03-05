package com.array.test

import com.array.NoOfZeros.findNoOfZeros

object NoOfZerosTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  findNoOfZeros(Array(1, 1, 1, 0, 0, 0, 0, 0))    //> res0: Int = 5
  findNoOfZeros(Array(1, 1, 1,1,1,1,0,0,0, 0, 0, 0, 0, 0))
                                                  //> res1: Int = 8
  findNoOfZeros(Array(1, 1, 1,1,1,0,0,0,0,0,0, 0, 0, 0, 0, 0))
                                                  //> res2: Int = 11
  findNoOfZeros(Array(1, 1, 1,1,1,1,1,1,1,1,1,0, 0, 0, 0, 0, 0))
                                                  //> res3: Int = 6
}