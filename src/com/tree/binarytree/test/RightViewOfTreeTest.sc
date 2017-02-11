package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.RightViewOfTree.rightView
object RightViewOfTreeTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  rightView(tree1)                                //> res0: List[Int] = List(1, 10, 19, 17, 16, 15, 13, 14)
  rightView(tree2)                                //> res1: List[Int] = List(20, 22, 12, 14)
  rightView(binarySearchTree)                     //> res2: List[Int] = List(4, 5, 3)
  rightView(balancedtree)                         //> res3: List[Int] = List(1, 3, 7, 15)
}