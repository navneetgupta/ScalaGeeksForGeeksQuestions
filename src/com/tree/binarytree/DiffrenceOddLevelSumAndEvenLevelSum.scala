package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 11-Feb-2017
 */


/*
 * http://www.geeksforgeeks.org/difference-between-sums-of-odd-and-even-levels/
 * 
 * A straightforward method is to use level order traversal. In the traversal, check level of current node, 
 * if it is odd, increment odd sum by data of current node, otherwise increment even sum. Finally return difference 
 * between odd sum and even sum
 * */
object DiffrenceOddLevelSumAndEvenLevelSum {
  def getLevelDiff(tree: BinaryTree[Int]) : Int = tree match {
    case EmptyTree => 0
    case Node(v,l,r) => v - getLevelDiff(l) - getLevelDiff(r)
  }
}