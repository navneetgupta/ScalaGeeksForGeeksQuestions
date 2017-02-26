package com.array.test

import com.array.MajorityElement.printMajority
object MajorityElementTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val ar = Array(1,1,1,1,1,1,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,2,2,2,2,2,1,1,1,1,11,1)
                                                  //> ar  : Array[Int] = Array(1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 
                                                  //| 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 1, 1, 1, 1, 11, 1)
 printMajority(Array(1,1,1,1,1,1,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,2,2,2,2,2,1,1,1,1,11,1))
                                                  //> res0: Option[Int] = None
 printMajority(Array(1,1,1,1,1,1,2,2,2,2,2,2,2,3,3,3,3,3,3,3,1,1,1,1,1,1,1,1,1,1,1,1,1,1,3,3,2,2,2,2,2,1,1,1,1,11,1))
                                                  //> res1: Option[Int] = Some(1)
                                      
 printMajority(Array(1,1,1,2,2,2,2,2,2,2,2,2,2,2,1,1,1,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,2,2,2,2,2,1,1,1,1,11,1))
                                                  //> res2: Option[Int] = Some(2)
                                    
                                    
                                                  
                                                  
}