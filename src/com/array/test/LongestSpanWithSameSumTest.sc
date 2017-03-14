package com.array.test

import com.array.LongestSpanWithSameSum.{longestSpanWithSameSum2,longestSpanWithSameSum}
object LongestSpanWithSameSumTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  longestSpanWithSameSum2(Array(0, 1, 0, 1, 1, 1, 1), Array(1, 1, 1, 1, 1, 0, 1))
                                                  //> res0: Int = 6
  longestSpanWithSameSum2(Array(0, 1, 0, 0, 0, 0), Array(1, 0, 1, 0, 0, 1))
                                                  //> res1: Int = 4
  longestSpanWithSameSum2(Array(0, 0, 0), Array(1, 1, 1))
                                                  //> res2: Int = 0
  longestSpanWithSameSum2(Array(0, 0, 1, 0), Array(1, 1, 1, 1))
                                                  //> res3: Int = 1
  
  longestSpanWithSameSum(Array(0, 1, 0, 1, 1, 1, 1), Array(1, 1, 1, 1, 1, 0, 1))
                                                  //> res4: Int = 6
  longestSpanWithSameSum(Array(0, 1, 0, 0, 0, 0), Array(1, 0, 1, 0, 0, 1))
                                                  //> res5: Int = 4
  longestSpanWithSameSum(Array(0, 0, 0), Array(1, 1, 1))
                                                  //> res6: Int = 0
  longestSpanWithSameSum(Array(0, 0, 1, 0), Array(1, 1, 1, 1))
                                                  //> res7: Int = 1
                                                  
                                                  
  
  
}