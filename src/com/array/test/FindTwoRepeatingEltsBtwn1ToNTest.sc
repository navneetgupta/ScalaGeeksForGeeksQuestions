package com.array.test

import com.array.FindTwoRepeatingEltsBtwn1ToN.{printRepeating,printRepeating2,factorial,printRepeating3,printRepeat4}
object FindTwoRepeatingEltsBtwn1ToNTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  printRepeating(Array(1,2,3,4,4,5,6,7,8,8,9), 9) //> 4
                                                  //| 8
  
  printRepeating(Array(4,2,3,4,1,5,8,7,9,8,6), 9) //> 4
                                                  //| 8
  printRepeating2(Array(1,2,3,4,4,5,6,7,8,8,9), 9)//> 4
                                                  //| 8
 
 
                                    
  
  printRepeating2(Array(4,2,3,4,1,5,8,7,9,8,6), 9)//> 4
                                                  //| 8
                                                  
  printRepeating3(Array(1,2,3,4,4,5,6,7,8,8,9), 9)//> 8
                                                  //| 4
  
  printRepeating3(Array(4,2,3,4,1,5,8,7,9,8,6), 9)//> 8
                                                  //| 4
                                                  
  printRepeat4(Array(1,2,3,4,4,5,6,7,8,8,9), 9)   //> 4
                                                  //| 8
  
  printRepeat4(Array(4,2,3,4,1,5,8,7,9,8,6), 9)   //> 4
                                                  //| 8
  
  printRepeating3(Array(1,2,3,4,4,5,6,7,8,8,9), 9)//> 8
                                                  //| 4
  
  printRepeating3(Array(4,2,3,4,1,5,8,7,9,8,6), 9)//> 8
                                                  //| 4
  
  factorial(3)                                    //> res0: Int = 6
  factorial(4)                                    //> res1: Int = 24
  factorial(5)                                    //> res2: Int = 120
  factorial(6)                                    //> res3: Int = 720
                       
                                                  
}