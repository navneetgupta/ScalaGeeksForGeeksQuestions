package com.tree.binarytree.test

import com.tree.binarytree.VerticalSumOfTree._
import com.tree.binarytree.BinaryTree._

object VerticalSumTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  verticalSum(tree1)                              //> res0: Map[Int,Int] = Map(0 -> 26, -7 -> 20, -3 -> 41, 1 -> 10, -4 -> 18, 2 -
                                                  //| > 19, -5 -> 24, -1 -> 31, -6 -> 7, -2 -> 14)
  verticalSum(onlyRoot)                           //> res1: Map[Int,Int] = Map(0 -> 1)
  
}