package com.array.test

import com.array.SortedSubSequenceOfSize3LinearTimeO1Space.find3Numbers

object SortedSubSequenceOfSize3LinearTimeO1SpaceTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  find3Numbers(Array(5, 7, 4, 8))                 //> Triplet Found ==5 7  8
  find3Numbers(Array(12, 11, 10, 5, 2, 6, 30))    //> Triplet Found ==5 6  30
}