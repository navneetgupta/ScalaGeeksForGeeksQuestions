package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 11-Feb-2017
 */

/*
 * http://www.geeksforgeeks.org/find-depth-of-the-deepest-odd-level-node
 * */
object DepthOfDeepestOddLevelLeafNode {
  def depthOfOddLevelLeafUtil[A](tree:BinaryTree[A],level:Int) :Int = tree match {
    case EmptyTree => 0
    case Node(v,EmptyTree,EmptyTree) if((level&1).equals(1)) => 
       println("Node is with value =="+v);level
    case Node(v,l,r) => List(depthOfOddLevelLeafUtil(l, level+1),depthOfOddLevelLeafUtil(r, level+1)).max
  }
  
  def depthOfOddLevelLeaf[A](tree:BinaryTree[A]):Int = depthOfOddLevelLeafUtil(tree, 1)
}