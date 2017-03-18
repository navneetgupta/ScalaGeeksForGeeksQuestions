package com.array.test

import com.array.FreqOfEachEltInLimitedRangeArray.findFreq

object FreqOfEachEltInLimitedRangeArrayTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  findFreq(Array(1, 1, 1, 2, 3, 3, 5, 5,8, 8, 8, 9, 9, 10))
                                                  //>  Element 1 occurs 3 times.
                                                  //|  Element 2 occurs 1 times.
                                                  //|  Element 3 occurs 2 times.
                                                  //|  Element 5 occurs 2 times.
                                                  //|  Element 8 occurs 3 times.
                                                  //|  Element 9 occurs 2 times.
                                                  //|  Element 10 occurs 1 times.
}