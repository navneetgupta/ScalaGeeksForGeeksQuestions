package com.tree.binarytree.test

import com.tree.binarytree.HtOfBinaryTreeFromParentArray.getDepth

object HtOfBinaryTreeFromParentArrayTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val xs = List(1,2,3,4)                          //> xs  : List[Int] = List(1, 2, 3, 4)
  xs.toArray                                      //> res0: Array[Int] = Array(1, 2, 3, 4)
  val pArray = Array(-1, 0, 0, 1, 1, 3, 5)        //> pArray  : Array[Int] = Array(-1, 0, 0, 1, 1, 3, 5)
  pArray.length                                   //> res1: Int = 7
  getDepth(pArray, pArray.length)                 //> [I@54a097cc
                                                  //| res2: Int = 5
  val pArray2 = Array(1, 5, 5, 2, 2, -1, 3)       //> pArray2  : Array[Int] = Array(1, 5, 5, 2, 2, -1, 3)
  getDepth(pArray2, pArray2.length)               //> [I@337d0578
                                                  //| res3: Int = 4
                                                  
}