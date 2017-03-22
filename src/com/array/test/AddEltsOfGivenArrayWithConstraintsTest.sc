package com.array.test

import com.array.AddEltsOfGivenArrayWithConstraints.addArrays

object AddEltsOfGivenArrayWithConstraintsTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val as = "1234"                                 //> as  : String = 1234
  //as.flatMap(x => x.toLower)
  as.toList                                       //> res0: List[Char] = List(1, 2, 3, 4)
  
  val a =1                                        //> a  : Int = 1
  val b=2                                         //> b  : Int = 2
  a+b                                             //> res1: Int = 3
  (a+b).toString().toList                         //> res2: List[Char] = List(3)
  
  addArrays(Array(9343, 2, 3, 7, 9, 6), Array(34, 11, 4, 7, 8, 7, 6, 99))
                                                  //> res3: List[Char] = List(9, 3, 7, 7, 1, 3, 7, 1, 4, 1, 7, 1, 3, 6, 9, 9)
  
  
}