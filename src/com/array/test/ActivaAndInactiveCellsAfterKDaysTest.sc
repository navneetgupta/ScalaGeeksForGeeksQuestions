package com.array.test

import com.array.ActivaAndInactiveCellsAfterKDays.activaInactiveCells
object ActivaAndInactiveCellsAfterKDaysTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  activaInactiveCells(Array(0, 1, 0, 1, 0, 1, 0, 1), 3)
                                                  //> List(0, 1, 0, 1, 0, 1, 0, 1)
                                                  //| List(0, 1, 0, 1, 0, 1, 0, 1)
                                                  //| List(1, 1, 0, 0, 1, 1, 1, 0)
                                                  //| List(1, 1, 0, 0, 1, 1, 1, 0)
                                                  //| List(1, 1, 1, 0, 1, 0, 1, 1)
                                                  //| List(1, 1, 1, 0, 1, 0, 1, 1)
                                                  //| List(1, 0, 0, 1, 1, 0, 1, 1)
                                                  //| List(1, 0, 0, 1, 1, 0, 1, 1)
                                                  //| res0: (Int, Int) = (5,3)
}