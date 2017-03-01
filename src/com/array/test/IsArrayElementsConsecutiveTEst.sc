package com.array.test

import com.array.IsArrayElementsConsecutive.{areConsecutive}
object IsArrayElementsConsecutiveTEst {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  areConsecutive(Array(5, 4, 2, 3, 1, 6), 6)      //> res0: Boolean = true
  areConsecutive(Array(5, 4, 2, 3, 1, 6,3), 7)    //> res1: Boolean = false
  areConsecutive(Array(5, 2, 3, 1, 4), 5)         //> res2: Boolean = true
  areConsecutive(Array(83, 78, 80, 81, 79, 82), 6)//> res3: Boolean = true
  areConsecutive(Array(34, 23, 52, 12, 3), 5)     //> res4: Boolean = false
  areConsecutive(Array(7, 6, 5, 5, 3, 4), 6)      //> res5: Boolean = false
  
}