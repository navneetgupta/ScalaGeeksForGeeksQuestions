package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 20-Feb-2017
 */


object SumOfAllNumberFormedByRootToLEafPAth {
  /*
   * http://www.geeksforgeeks.org/sum-numbers-formed-root-leaf-paths/
   * 
   * Given a binary tree, where every node value is a Digit from 1-9 .
   * Find the sum of all the numbers which are formed from root to leaf paths.
   * */
  
  def treePathsSumUtil(tree: BinaryTree[Int],value : Int) : Int = tree match {
    case EmptyTree => 0
    case Node(v,l,r) => 
      val newValue = value*10 + v
      (l,r) match {
        case (EmptyTree,EmptyTree) => newValue
        case _ => treePathsSumUtil(l, newValue) + treePathsSumUtil(r, newValue)
      }
  }
  
  def treePathsSum(tree: BinaryTree[Int]): Int = {
    treePathsSumUtil(tree, 0)
  }
}