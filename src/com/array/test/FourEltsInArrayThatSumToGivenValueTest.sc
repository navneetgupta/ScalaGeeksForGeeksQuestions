package com.array.test

import com.array.FourEltsInArrayThatSumToGivenValue.{findFourElt,findFourElts2}
object FourEltsInArrayThatSumToGivenValueTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  findFourElts2(Array(10, 20, 30, 40, 1, 2), 91 ) //> List(30, 40, 1, 20)
  findFourElts2(Array(10, 20, 30, 40, 1, 2), 92 ) //> List(30, 40, 2, 20)
  findFourElts2(Array(10, 20, 30, 40, 1, 2), 93 )
  findFourElts2(Array(10, 20, 30, 40, 1, 2), 94 )
  findFourElts2(Array(10, 20, 30, 40, 1, 2), 95 )
  findFourElts2(Array(10, 20, 30, 40, 1, 2), 96 )
  findFourElts2(Array(10, 2, 3, 4, 5, 9, 7, 8), 23 )
                                                  //> List(8, 10, 2, 3)
                                                  //| List(7, 10, 2, 4)
                                                  //| List(7, 9, 2, 5)
                                                  //| List(7, 9, 3, 4)
                                                  //| List(7, 8, 3, 5)
                               
  findFourElts2(Array(10, 2, 3, 4, 5, 9, 7, 8), 27 )
                                                  //> List(8, 10, 2, 7)
                                                  //| List(9, 10, 3, 5)
                                                  //| List(8, 9, 3, 7)
                                                  //| List(8, 10, 4, 5)
  
                                    
  
  findFourElts2(Array(10, 2, 3, 4, 5, 9, 7, 8), 28 )
                                                  //> List(9, 10, 2, 7)
                                                  //| List(8, 10, 3, 7)
                                                  //| List(9, 10, 4, 5)
                                                  //| List(8, 9, 4, 7)
  
  findFourElts2(Array(10, 2, 3, 4, 5, 9, 7, 8), 29 )
                                                  //> List(9, 10, 2, 8)
                                                  //| List(9, 10, 3, 7)
                                                  //| List(8, 10, 4, 7)
                                                  //| List(8, 9, 5, 7)
  findFourElts2(Array(10, 2, 3, 4, 5, 9, 7, 8), 30 )
                                                  //> List(9, 10, 3, 8)
                                                  //| List(9, 10, 4, 7)
                                                  //| List(8, 10, 5, 7)
  
  findFourElts2(Array(10, 2, 3, 4, 5, 9, 7, 8), 31 )
                                                  //> List(9, 10, 4, 8)
                                                  //| List(9, 10, 5, 7)
  
  findFourElts2(Array(10, 2, 3, 4, 5, 9, 7, 8), 32 )
                                                  //> List(9, 10, 5, 8)
  
  findFourElt(Array(10, 20, 30, 40, 1, 2), 91 )   //> res0: List[Int] = List(20, 30, 40, 1)
  findFourElt(Array(10, 20, 30, 40, 1, 2), 92 )   //> res1: List[Int] = List(20, 30, 40, 2)
  findFourElt(Array(10, 20, 30, 40, 1, 2), 93 )   //> res2: List[Int] = List()
  findFourElt(Array(10, 20, 30, 40, 1, 2), 94 )   //> res3: List[Int] = List()
  findFourElt(Array(10, 20, 30, 40, 1, 2), 95 )   //> res4: List[Int] = List()
  findFourElt(Array(10, 20, 30, 40, 1, 2), 96 )   //> res5: List[Int] = List()
  findFourElt(Array(10, 2, 3, 4, 5, 9, 7, 8), 23 )//> res6: List[Int] = List(10, 2, 3, 8)
  findFourElt(Array(10, 2, 3, 4, 5, 9, 7, 8), 27 )//> res7: List[Int] = List(10, 2, 7, 8)
  
  findFourElt(Array(10, 2, 3, 4, 5, 9, 7, 8), 28 )//> res8: List[Int] = List(10, 2, 9, 7)
  
  findFourElt(Array(10, 2, 3, 4, 5, 9, 7, 8), 29 )//> res9: List[Int] = List(10, 2, 9, 8)
  findFourElt(Array(10, 2, 3, 4, 5, 9, 7, 8), 30 )//> res10: List[Int] = List(10, 3, 9, 8)
  
  findFourElt(Array(10, 2, 3, 4, 5, 9, 7, 8), 31 )//> res11: List[Int] = List(10, 4, 9, 8)
  
  findFourElt(Array(10, 2, 3, 4, 5, 9, 7, 8), 32 )//> res12: List[Int] = List(10, 5, 9, 8)
  
}