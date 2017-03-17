package com.array.test


import com.array.MinNoFromGivenSequence.{printMinNumber,printLeast}

object MinNoFromGivenSequenceTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  printMinNumber("IDID".toCharArray())            //> 1 3 2 5 4 
  printMinNumber("I".toCharArray())               //> 1 2 
  printMinNumber("DD".toCharArray())              //> 3 2 1 
  printMinNumber("II".toCharArray())              //> 1 2 3 
  printMinNumber("DIDI".toCharArray())            //> 2 1 4 3 5 
  printMinNumber("IIDDD".toCharArray())           //> 1 2 6 5 4 3 
  printMinNumber("DDIDDIID".toCharArray())        //> 3 2 1 6 5 4 7 9 8 
  
  printLeast("IDID".toCharArray())                //> 1 3 2 5 4 
  printLeast("I".toCharArray())                   //> 1 2 
  printLeast("DD".toCharArray())                  //> 3 2 1 
  printLeast("II".toCharArray())                  //> 1 2 3 
  printLeast("DIDI".toCharArray())                //> 2 1 4 3 5 
  printLeast("IIDDD".toCharArray())               //> 1 2 6 5 4 3 
  printLeast("DDIDDIID".toCharArray())            //> 3 2 1 6 5 4 7 9 8 
                                       
  
  
  
  println("Super")                                //> Super
  
  val arr = Array(1)                              //> arr  : Array[Int] = Array(1)
  
  val v = Vector(1,2,3,4,5)                       //> v  : scala.collection.immutable.Vector[Int] = Vector(1, 2, 3, 4, 5)
  
  v.updated(1, 10)                                //> res0: scala.collection.immutable.Vector[Int] = Vector(1, 10, 3, 4, 5)
  
}