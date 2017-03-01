package com.array.test

import com.array.MinDistanceBtwnTwoNumber.{findMinDistance2,findMinDistance,findMinDistance3,findMinDistance4}
object MinDistanceBtwnTwoNumberTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  
  findMinDistance(Array(3, 5, 4, 2, 6, 3, 0, 0, 5, 4, 8, 3), 12, 3, 6)
                                                  //> res0: Int = 1
  findMinDistance(Array(3, 5, 4, 2, 6, 3, 0, 0, 5, 4, 8, 3), 12, 3, 4)
                                                  //> res1: Int = 2
  findMinDistance(Array(3, 5, 4, 2, 6, 3, 0, 0, 5, 4, 8, 3), 12, 3, 2)
                                                  //> res2: Int = 2
  
  findMinDistance2(Array(3, 5, 4, 2, 6, 3, 0, 0, 5, 4, 8, 3), 12, 3, 6)
                                                  //> res3: Int = 1
  findMinDistance2(Array(3, 5, 4, 2, 6, 3, 0, 0, 5, 4, 8, 3), 12, 3, 4)
                                                  //> res4: Int = 2
  findMinDistance2(Array(3, 5, 4, 2, 6, 3, 0, 0, 5, 4, 8, 3), 12, 3, 2)
                                                  //> res5: Int = 2
  
  findMinDistance3(Array(3, 5, 4, 2, 6, 3, 0, 0, 5, 4, 8, 3), 12, 3, 6)
                                                  //> res6: Int = 1
  findMinDistance3(Array(3, 5, 4, 2, 6, 3, 0, 0, 5, 4, 8, 3), 12, 3, 4)
                                                  //> res7: Int = 2
  findMinDistance3(Array(3, 5, 4, 2, 6, 3, 0, 0, 5, 4, 8, 3), 12, 3, 2)
                                                  //> res8: Int = 2
  
  findMinDistance4(Array(3, 5, 4, 2, 6, 3, 0, 0, 5, 4, 8, 3), 12, 3, 6)
                                                  //> res9: Int = 1
  findMinDistance4(Array(3, 5, 4, 2, 6, 3, 0, 0, 5, 4, 8, 3), 12, 3, 4)
                                                  //> res10: Int = 2
  findMinDistance4(Array(3, 5, 4, 2, 6, 3, 0, 0, 5, 4, 8, 3), 12, 3, 2)
                                                  //> res11: Int = 2
                                                  
}