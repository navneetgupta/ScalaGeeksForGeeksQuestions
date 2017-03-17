package com.array.test

import com.array.LostEltFromDuplicatedArray.{findLostElt,findLostElt2}
object LostEltFromDuplicatedArrayTest {
	
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  findLostElt(Array(1, 4, 5, 7, 9), Array(4, 5, 7, 9))
                                                  //> res0: Int = 1
  findLostElt(Array(1, 4, 5, 7, 9), Array(1, 5, 7, 9))
                                                  //> res1: Int = 4
  findLostElt(Array(1, 4, 5, 7, 9), Array(1, 4, 7, 9))
                                                  //> res2: Int = 5
  findLostElt(Array(1, 4, 5, 7, 9), Array(1, 4, 5, 9))
                                                  //> res3: Int = 7
  findLostElt(Array(1, 4, 5, 7, 9), Array(1, 4, 5, 7))
                                                  //> res4: Int = 9
  findLostElt2(Array(1, 4, 5, 7, 9), Array(4, 5, 7, 9))
                                                  //> res5: Option[Int] = Some(1)
  findLostElt2(Array(1, 4, 5, 7, 9), Array(1, 5, 7, 9))
                                                  //> res6: Option[Int] = Some(4)
  findLostElt2(Array(1, 4, 5, 7, 9), Array(1, 4, 7, 9))
                                                  //> res7: Option[Int] = Some(5)
  findLostElt2(Array(1, 4, 5, 7, 9), Array(1, 4, 5, 9))
                                                  //> res8: Option[Int] = Some(7)
  findLostElt2(Array(1, 4, 5, 7, 9), Array(1, 4, 5, 7))
                                                  //> res9: Option[Int] = Some(9)
}