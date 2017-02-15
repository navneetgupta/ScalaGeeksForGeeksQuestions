package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 15-Feb-2017
 */

object IsTreeCompleteRec {
  /*
   * http://www.geeksforgeeks.org/check-whether-binary-tree-complete-not-set-2-recursive-solution/
   * 
   * A complete binary tree is a binary tree whose all levels except the last level are completely filled and all the
   * leaves in the last level are all to the left side. 
   */
  def isCompleteUtil[A](tree: BinaryTree[A],index: Int,noOfNodes: Int) : Boolean = tree match {
    case EmptyTree => true
    case Node(v,l,r) => {
      if(index >= noOfNodes) false
      else isCompleteUtil(l, 2*index+1, noOfNodes) && isCompleteUtil(r, 2*index+2, noOfNodes)
    }
  }
  
  def count_nodes[A](tree: BinaryTree[A]): Int = tree match {
    case EmptyTree => 0
    case Node(v,l,r) => 1 + count_nodes(l) + count_nodes(r)
  }
  
  def isComplete[A](tree: BinaryTree[A]): Boolean = {
    isCompleteUtil(tree, 0, count_nodes(tree))
  }
}