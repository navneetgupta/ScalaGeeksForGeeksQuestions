package com.array.test

import com.array.MaxAndMinProductSubSets.getMaxAndMinProduct

object MaxAndMinProductSubSetsTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  getMaxAndMinProduct(Array(4, -2, 5))            //> res0: (Int, Int) = (20,-40)
  getMaxAndMinProduct(Array(-4, -2, 3, 7, 5, 0, 1))
                                                  //> res1: (Int, Int) = (840,-420)
  
}