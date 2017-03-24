package com.array.test

import com.array.IsLeftOrRigthPositionedArray.leftRight

object IsLeftOrRigthPositionedArrayTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  leftRight(Array(2, 1, 5, 2, 1, 5))              //> List(true, true, true, true, true, true)
                                                  //| 
                                                  //| res0: Boolean = true
   leftRight(Array(1, 6, 5, 4, 3, 2, 1))          //> List(false, true, true, true, true, true, true)
                                                  //| 
                                                  //| res1: Boolean = false
   leftRight(Array(2, 0, 1, 3))                   //> List(true, true, true, true)
                                                  //| 
                                                  //| res2: Boolean = true
   leftRight(Array(2, 1, 5, 2, 1, 5))             //> List(true, true, true, true, true, true)
                                                  //| 
                                                  //| res3: Boolean = true
   leftRight(Array(1, 3, 3, 2))                   //> List(true, true, true, true)
                                                  //| 
                                                  //| res4: Boolean = true
  
  println((List(true, true, true, true, true, true).takeWhile { x => x }).length)
                                                  //> 6
  
}