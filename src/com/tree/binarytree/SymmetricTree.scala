package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 14-Feb-2017
 */

object SymmetricTree {
  /*
   * http://www.geeksforgeeks.org/symmetric-tree-tree-which-is-mirror-image-of-itself/
   * 
   * Given a binary tree, check whether it is a mirror of itself
   * */
  
  def isMirror[A](tree1: BinaryTree[A],tree2: BinaryTree[A]): Boolean = (tree1,tree2) match {
    case (EmptyTree,EmptyTree) => true
    case (Node(v1,l1,r1),Node(v2,l2,r2)) if(v1 == v2) => isMirror(l1, r2) && isMirror(r1, l2)
    case _ => false
  }
  
  def isSymmetric[A](tree: BinaryTree[A]) = isMirror(tree,tree)
}