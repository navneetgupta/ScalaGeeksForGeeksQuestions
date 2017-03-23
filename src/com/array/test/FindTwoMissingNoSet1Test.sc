package com.array.test

import com.array.FindTwoMissingNoSet1.{findTwoMissingNo,findTwoMissingNo2}

object FindTwoMissingNoSet1Test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

	findTwoMissingNo(Array(1, 3, 5, 6), 6)    //> res0: List[Int] = List(2, 4)
	findTwoMissingNo2(Array(1, 3, 5, 6), 6)   //> res1: List[Int] = List(2, 4)
}