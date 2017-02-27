package com.array.test

import com.array.Segregate0sand1s.segregate0sand1s
object Segregate0sand1sTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  segregate0sand1s(Array(0, 1, 0, 1, 1, 1))       //> res0: Array[Int] = Array(0, 0, 1, 1, 1, 1)
	segregate0sand1s(Array(0,1,1,1,1,0,0,1,1,0,1,0,1,1,0,0,1,0))
                                                  //> res1: Array[Int] = Array(0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
                                                  //| 1)


 
}