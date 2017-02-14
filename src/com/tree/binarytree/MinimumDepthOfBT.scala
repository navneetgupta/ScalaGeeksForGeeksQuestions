package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 14-Feb-2017
 */

object MinimumDepthOfBT {
  /*
   * http://www.geeksforgeeks.org/find-minimum-depth-of-a-binary-tree/
   * 
   * The minimum depth is the number of nodes along the shortest path from root node down to the nearest leaf node.
   */
  
  def minDepth[A](tree: BinaryTree[A]):Int = tree match {
    case EmptyTree => 0
    case Node(v,l,r) => 
      (l,r) match {
        case (EmptyTree,EmptyTree) => 1
        case (EmptyTree,_) => minDepth(r)+1
        case (Node(v1,l1,r1),EmptyTree) => minDepth(l) +1
        case _ => List(minDepth(l),minDepth(r)).min +1
      }
  }
}