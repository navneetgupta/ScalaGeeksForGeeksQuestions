package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.AllPathsFromRootWithGivenSum.printPaths
import com.tree.binarytree.PreOrderTraversal.preOrderTraversalRecursive
object AllPathsFromRootWithGivenSumTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  printPaths(tree1, 28)                           //> path Found
                                                  //|  path is List(1, 2, 3, 4, 5, 6, 7)
                                                  //| res0: List[Int] = List(1)
 
  printPaths(pathWithGivenSum, 38)                //> path Found
                                                  //|  path is List(10, 28)
                                                  //| path Found
                                                  //|  path is List(10, 13, 15)
                                                  //| res1: List[Int] = List(10)
 
                                                  
  preOrderTraversalRecursive(tree1)               //> 1 , 2 , 3 , 4 , 5 , 6 , 7 , 20 , 13 , 18 , 14 , 8 , 11 , 15 , 12 , 16 , 9 , 
                                                  //| 17 , 10 , 19 , 
  
  preOrderTraversalRecursive(tree2)
}