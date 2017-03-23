package com.array.test

import com.array.IsSingleFlipMakeAllBitSame.{canMakeSame,canMakeSame2}
object IsSingleFlipMakeAllBitSameTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val as = "10111110001"                          //> as  : String = 10111110001
  as.toArray                                      //> res0: Array[Char] = Array(1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1)
  
  canMakeSame("101111111111")                     //> res1: Boolean = true
  canMakeSame2("101111111111")                    //> res2: Boolean = true
}