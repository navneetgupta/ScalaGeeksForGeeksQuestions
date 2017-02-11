package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.DiffrenceOddLevelSumAndEvenLevelSum.getLevelDiff
object DiffrenceOddLevelSumAndEvenLevelSumTEst {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  getLevelDiff(tree1)                             //> res0: Int = -42
  getLevelDiff(tree2)                             //> res1: Int = -18
  getLevelDiff(binarySearchTree)                  //> res2: Int = 1
  getLevelDiff(balancedtree)                      //> res3: Int = -74
  
}