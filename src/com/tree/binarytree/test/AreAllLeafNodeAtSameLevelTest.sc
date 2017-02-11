package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.AreAllLeafNodeAtSameLevel.checkLeavesLevel
object AreAllLeafNodeAtSameLevelTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  checkLeavesLevel(tree1)                         //> res0: Boolean = false
  checkLeavesLevel(tree2)                         //> res1: Boolean = false
  checkLeavesLevel(binarySearchTree)              //> res2: Boolean = false
  checkLeavesLevel(balancedtree)                  //> res3: Boolean = true
  checkLeavesLevel(balancedtree2)                 //> res4: Boolean = true
 
 
}