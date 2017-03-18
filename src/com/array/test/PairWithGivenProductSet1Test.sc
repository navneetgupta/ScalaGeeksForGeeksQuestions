package com.array.test

import com.array.PairWithGivenProductSet1.{isPairExist,isPairExist2}

object PairWithGivenProductSet1Test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  isPairExist(Array(10, 20, 9, 40),1)             //> res0: (Boolean, List[(Int, Int)]) = (false,List())
  isPairExist(Array(10, 20, 9, 40),400)           //> res1: (Boolean, List[(Int, Int)]) = (true,List((0,3), (1,1)))
  isPairExist(Array(10, 20, 9, 40),180)           //> res2: (Boolean, List[(Int, Int)]) = (true,List((1,2)))
  isPairExist(Array(10, 20, 9, 40),800)           //> res3: (Boolean, List[(Int, Int)]) = (true,List((1,3)))
  isPairExist(Array(10, 20, 9, 40),200)           //> res4: (Boolean, List[(Int, Int)]) = (true,List((0,1)))
  isPairExist2(Array(10, 20, 9, 40),1)            //> res5: (Boolean, List[(Int, Int)]) = (false,List())
  isPairExist2(Array(10, 20, 9, 40),400)          //> res6: (Boolean, List[(Int, Int)]) = (true,List((40,10)))
  isPairExist2(Array(10, 20, 9, 40),180)          //> res7: (Boolean, List[(Int, Int)]) = (true,List((9,20)))
  isPairExist2(Array(10, 20, 9, 40),800)          //> res8: (Boolean, List[(Int, Int)]) = (true,List((40,20)))
  isPairExist2(Array(10, 20, 9, 40),200)          //> res9: (Boolean, List[(Int, Int)]) = (true,List((20,10)))
  
}