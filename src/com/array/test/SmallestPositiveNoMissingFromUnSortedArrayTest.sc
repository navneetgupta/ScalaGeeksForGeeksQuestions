package com.array.test

import com.array.SmallestPositiveNoMissingFromUnSortedArray.{findMissing,segregratePositivenegatives}
object SmallestPositiveNoMissingFromUnSortedArrayTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  segregratePositivenegatives(Array(0, 10, 2, -10, -20))
                                                  //> res0: (Array[Int], Int) = (Array(0, -10, -20, 10, 2),3)
  Array(0, -10, -20, 10, 2).drop(3)               //> res1: Array[Int] = Array(10, 2)
  segregratePositivenegatives(Array(2, 3, 7, 6, 8, -1, -10, 15))
                                                  //> res2: (Array[Int], Int) = (Array(-1, -10, 7, 6, 8, 2, 3, 15),2)
  segregratePositivenegatives(Array(2, 3, -7, 6, 8, 1, -10, 15))
                                                  //> res3: (Array[Int], Int) = (Array(-7, -10, 2, 6, 8, 1, 3, 15),2)
  segregratePositivenegatives(Array(1, 1, 0, -1, -2))
                                                  //> res4: (Array[Int], Int) = (Array(0, -1, -2, 1, 1),3)
                                            
                                     
                                            
  findMissing(Array(0, 10, 2, -10, -20))          //> res5: Int = 1
  findMissing(Array(2, 3, 7, 6, 8, -1, -10, 15))  //> res6: Int = 1
 
  findMissing(Array(2, 3, -7, 6, 8, 1, -10, 15))  //> res7: Int = 4
                                     
                                           
  findMissing(Array(1, 1, 0, -1, -2))             //> res8: Int = 2
  
  
}