package com.array.test

import com.array.MajorityElementInSortedArray.{majorityElement,majorityElement2}

object MajorityElementInSortedArrayTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  majorityElement(Array(1, 1, 2, 4, 4, 4, 6, 6), 4)
                                                  //> last_index 5
                                                  //| res0: Boolean = false
                           
  majorityElement(Array(1, 1, 1, 2, 2), 1)        //> last_index 2
                                                  //| res1: Boolean = true
  majorityElement2(Array(1, 1, 1, 2, 2), 1)       //> res2: Boolean = true
  majorityElement(Array(1, 2, 3, 3, 3, 3, 10), 3) //> last_index 3
                                                  //| res3: Boolean = true
  majorityElement2(Array(1, 2, 3, 3, 3, 3, 10), 3)//> res4: Boolean = true
  majorityElement2(Array(1, 1, 2, 4, 4, 4, 6, 6), 4)
                                                  //> res5: Boolean = false
  majorityElement2(Array(1, 1, 2, 4, 4, 4, 6, 6,4,4), 4)
                                                  //> res6: Boolean = true
}