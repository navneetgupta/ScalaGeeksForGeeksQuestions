package com.array.test

import com.array.ReplaceEveryeltWithGreatestElmtOnRight.nextGreatest
object ReplaceEveryeltWithGreatestElmtOnRightTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  nextGreatest(Array(1,13,5,16,2,4,3,9,23,5,13,46,98,34))
                                                  //> res0: Array[Int] = Array(98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 34,
                                                  //|  -1)
  nextGreatest(Array(1,13,5,16,2,4,3,9,23,5,13,46,98,34).reverse)
                                                  //> res1: Array[Int] = Array(98, 46, 23, 23, 23, 16, 16, 16, 16, 16, 13, 13, 1, 
                                                  //| -1)
  nextGreatest(Array(16, 17, 4, 3, 5, 2))         //> res2: Array[Int] = Array(17, 5, 5, 5, 2, -1)
                                                  
 
                                  
}