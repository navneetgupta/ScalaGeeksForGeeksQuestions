package com.array.test

import com.array.NutsAndBoltsPrblm.matchPairs
object NutsAndBoltsPrblmTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  matchPairs(Array('@', '#', '$', '%', '^', '&'), Array('$', '%', '&', '^', '@', '#'), 0, 5)
                                                  //> res0: (Array[Char], Array[Char]) = (Array(#, $, %, &, @, ^),Array(#, $, %, &
                                                  //| , @, ^))
                                                  
}