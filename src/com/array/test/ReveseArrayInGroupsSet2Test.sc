package com.array.test

import com.array.ReveseArrayInGroupsSet2.{reverseByDoublingGroupSize,reverseAlternateGroups,reverseAtGivenDistInGroups}
object ReveseArrayInGroupsSet2Test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  reverseByDoublingGroupSize(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16), 1)
                                                  //> res0: Array[Int] = Array(2, 5, 4, 11, 10, 9, 8, 16, 15, 14, 13, 12, 3, 1, 6,
                                                  //|  7)
  reverseByDoublingGroupSize(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14), 1)
                                                  //> res1: Array[Int] = Array(2, 5, 4, 11, 10, 9, 8, 14, 13, 12, 3, 1, 6, 7)
  reverseByDoublingGroupSize(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 1)
                                                  //> res2: Array[Int] = Array(2, 5, 4, 10, 9, 8, 7, 3, 1, 6)
  reverseByDoublingGroupSize(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16), 2)
                                                  //> res3: Array[Int] = Array(2, 5, 4, 11, 10, 9, 8, 16, 15, 14, 13, 12, 3, 1, 6,
                                                  //|  7)
  reverseByDoublingGroupSize(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14), 2)
                                                  //> res4: Array[Int] = Array(2, 5, 4, 11, 10, 9, 8, 14, 13, 12, 3, 1, 6, 7)
  reverseByDoublingGroupSize(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 2)
                                                  //> res5: Array[Int] = Array(2, 5, 4, 10, 9, 8, 7, 3, 1, 6)
  reverseByDoublingGroupSize(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16), 3)
                                                  //> res6: Array[Int] = Array(3, 7, 6, 5, 16, 15, 14, 13, 12, 11, 4, 1, 2, 8, 9, 
                                                  //| 10)
  reverseByDoublingGroupSize(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14), 3)
                                                  //> res7: Array[Int] = Array(3, 7, 6, 5, 14, 13, 12, 11, 10, 9, 4, 1, 2, 8)
  reverseByDoublingGroupSize(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 3)
                                                  //> res8: Array[Int] = Array(3, 7, 6, 5, 10, 9, 8, 2, 1, 4)
  reverseByDoublingGroupSize(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16), 4)
                                                  //> res9: Array[Int] = Array(4, 3, 10, 9, 8, 7, 16, 15, 14, 13, 12, 11, 2, 1, 6
                                                  //| , 5)
  reverseByDoublingGroupSize(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14), 4)
                                                  //> res10: Array[Int] = Array(4, 3, 10, 9, 8, 7, 14, 13, 12, 11, 2, 1, 5, 6)
  reverseByDoublingGroupSize(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 4)
                                                  //> res11: Array[Int] = Array(4, 3, 10, 9, 8, 7, 2, 1, 5, 6)
  reverseAlternateGroups(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16), 1)
                                                  //> res12: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15
                                                  //| , 16)
  reverseAlternateGroups(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14), 1)
                                                  //> res13: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14)
  reverseAlternateGroups(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 1)
                                                  //> res14: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  reverseAlternateGroups(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16), 2)
                                                  //> res15: Array[Int] = Array(2, 1, 3, 4, 6, 5, 7, 8, 10, 9, 11, 12, 14, 13, 15
                                                  //| , 16)
  reverseAlternateGroups(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14), 2)
                                                  //> res16: Array[Int] = Array(2, 1, 3, 4, 6, 5, 7, 8, 10, 9, 11, 12, 14, 13)
  reverseAlternateGroups(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 2)
                                                  //> res17: Array[Int] = Array(2, 1, 3, 4, 6, 5, 7, 8, 10, 9)
  reverseAlternateGroups(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16), 3)
                                                  //> res18: Array[Int] = Array(3, 2, 1, 4, 5, 6, 9, 8, 7, 10, 11, 12, 15, 14, 13
                                                  //| , 16)
  reverseAlternateGroups(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14), 3)
                                                  //> res19: Array[Int] = Array(3, 2, 1, 4, 5, 6, 9, 8, 7, 10, 11, 12, 14, 13)
  reverseAlternateGroups(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 3)
                                                  //> res20: Array[Int] = Array(3, 2, 1, 4, 5, 6, 9, 8, 7, 10)
  reverseAlternateGroups(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16), 4)
                                                  //> res21: Array[Int] = Array(4, 3, 2, 1, 5, 6, 7, 8, 12, 11, 10, 9, 13, 14, 15
                                                  //| , 16)
  reverseAlternateGroups(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14), 4)
                                                  //> res22: Array[Int] = Array(4, 3, 2, 1, 5, 6, 7, 8, 12, 11, 10, 9, 13, 14)
  reverseAlternateGroups(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 4)
                                                  //> res23: Array[Int] = Array(4, 3, 2, 1, 5, 6, 7, 8, 10, 9)
  
  reverseAtGivenDistInGroups(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16), 1,2)
                                                  //> res24: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15
                                                  //| , 16)
  reverseAtGivenDistInGroups(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14), 1,2)
                                                  //> res25: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14)
  reverseAtGivenDistInGroups(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 1,2)
                                                  //> res26: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  reverseAtGivenDistInGroups(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16), 2,3)
                                                  //> res27: Array[Int] = Array(2, 1, 3, 4, 5, 7, 6, 8, 9, 10, 12, 11, 13, 14, 15
                                                  //| , 16)
  reverseAtGivenDistInGroups(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14), 2,3)
                                                  //> res28: Array[Int] = Array(2, 1, 3, 4, 5, 7, 6, 8, 9, 10, 12, 11, 13, 14)
  reverseAtGivenDistInGroups(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 2,3)
                                                  //> res29: Array[Int] = Array(2, 1, 3, 4, 5, 7, 6, 8, 9, 10)
  reverseAtGivenDistInGroups(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16), 3,4)
                                                  //> res30: Array[Int] = Array(3, 2, 1, 4, 5, 6, 7, 10, 9, 8, 11, 12, 13, 14, 16
                                                  //| , 15)
  reverseAtGivenDistInGroups(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14), 3,4)
                                                  //> res31: Array[Int] = Array(3, 2, 1, 4, 5, 6, 7, 10, 9, 8, 11, 12, 13, 14)
  reverseAtGivenDistInGroups(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 3,4)
                                                  //> res32: Array[Int] = Array(3, 2, 1, 4, 5, 6, 7, 10, 9, 8)
  reverseAtGivenDistInGroups(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16), 4,1)
                                                  //> res33: Array[Int] = Array(4, 3, 2, 1, 5, 9, 8, 7, 6, 10, 14, 13, 12, 11, 15
                                                  //| , 16)
  reverseAtGivenDistInGroups(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14), 4,1)
                                                  //> res34: Array[Int] = Array(4, 3, 2, 1, 5, 9, 8, 7, 6, 10, 14, 13, 12, 11)
  reverseAtGivenDistInGroups(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 4,1)
                                                  //> res35: Array[Int] = Array(4, 3, 2, 1, 5, 9, 8, 7, 6, 10)
  
}