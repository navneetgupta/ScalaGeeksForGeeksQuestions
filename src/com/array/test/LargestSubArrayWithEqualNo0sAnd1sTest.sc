package com.array.test

import com.array.LargestSubArrayWithEqualNo0sAnd1s.{findSubArray,findSubArray2}
object LargestSubArrayWithEqualNo0sAnd1sTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  findSubArray(Array(1, 0, 0, 1, 0, 1, 1))        //> Array Exist from 0 to 5
  findSubArray(Array(1, 0, 1, 1, 1, 0, 0))        //> Array Exist from 1 to 6
                                               
  findSubArray(Array(1, 1, 1, 1))                 //>  No Such Array Exists
  findSubArray(Array(0, 0, 1, 1, 0))              //> Array Exist from 0 to 3
  findSubArray2(Array(1, 0, 0, 1, 0, 1, 1))       //> List(1, -1, -1, 1, -1, 1, 1)
                                                  //| subArray Exists from 0 to 5
  findSubArray2(Array(1, 0, 1, 1, 1, 0, 0))       //> List(1, -1, 1, 1, 1, -1, -1)
                                                  //| subArray Exists from 0 to 1
                                               
  findSubArray2(Array(1, 1, 1, 1))                //> List(1, 1, 1, 1)
                                                  //| No SubArray Exist
  
  findSubArray2(Array(0, 0, 1, 1, 0))             //> List(-1, -1, 1, 1, -1)
                                                  //| subArray Exists from 0 to 3
  
}