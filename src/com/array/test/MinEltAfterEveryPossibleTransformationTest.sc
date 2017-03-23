package com.array.test

import com.array.MinEltAfterEveryPossibleTransformation.findMin

object MinEltAfterEveryPossibleTransformationTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val r= 2                                        //> r  : Int = 2
  val g=1                                         //> g  : Int = 1
  val as: Boolean = ((r & 1) == 0)                //> as  : Boolean = true
  
  findMin(Array('R', 'G', 'B', 'R'))              //> res0: Int = 1
}