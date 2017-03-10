package com.array.test

import com.array.AllSortedArrayFromAltEltsFrm2SortedArr.generate

object AllSortedArrayFromAltEltsFrm2SortedArrTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
	generate(Array(10, 15, 25), Array(5, 20, 30))
                                                  //> List(10, 20)
                                                  //| List(10, 20, 25, 30)
                                                  //| List(10, 30)
                                                  //| List(15, 20)
                                                  //| List(15, 20, 25, 30)
                                                  //| List(15, 30)
                                                  //| List(25, 30)
                                                  
                                                  
}