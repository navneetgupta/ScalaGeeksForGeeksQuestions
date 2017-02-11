package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 11-Feb-2017
 */

/* 
 * http://www.geeksforgeeks.org/depth-deepest-odd-level-node-binary-tree/
 * 
 * We can traverse the tree starting from the root level and keep curr_level of the node.
 * Increment the curr_level each time we go to left or a right subtree.
 * Return the max depth of an odd level,if it exists.
 */
object DepthOfDeepestOddLevelNode {
  
  def depthDeepestOddLevelNodeUtil[A](tree: BinaryTree[A],current_level:Int): Int = tree match {
    case EmptyTree => 0
    case Node(v,l,r) => 
      val current_level_update = current_level+1
      if(current_level_update%2 != 0  && tree.isLeafNode) current_level_update
      else List(depthDeepestOddLevelNodeUtil(l, current_level_update),depthDeepestOddLevelNodeUtil(r, current_level_update)).max
  }
  
  def depthDeepestOddLevelNode[A](tree: BinaryTree[A]) : Int = {
    depthDeepestOddLevelNodeUtil(tree, 0);
  }
  
  
}