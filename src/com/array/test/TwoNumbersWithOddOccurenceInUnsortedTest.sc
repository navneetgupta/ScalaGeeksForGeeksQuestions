package com.array.test

import com.array.TwoNumbersWithOddOccurenceInUnsorted.printTwoOdd
object TwoNumbersWithOddOccurenceInUnsortedTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  printTwoOdd(Array(4, 2, 4, 5, 2, 3, 3, 1))      //> res0: (Int, Int) = (5,1)
  printTwoOdd(Array(12, 23, 34, 12, 12, 23, 12, 45))
                                                  //> res1: (Int, Int) = (45,34)
  printTwoOdd(Array(4, 4, 100, 5000, 4, 4, 4, 4, 100, 100))
                                                  //> res2: (Int, Int) = (100,5000)
  printTwoOdd(Array(10, 20))                      //> res3: (Int, Int) = (10,20)
}