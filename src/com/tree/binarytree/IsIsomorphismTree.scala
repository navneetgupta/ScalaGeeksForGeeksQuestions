package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 05-Feb-2017
 */

object IsIsomorphismTree {
  /*
   * Two trees are called isomorphic if one of them can be obtained from other by a series of flips, i.e. 
   * by swapping left and right children of a number of nodes. Any number of nodes at any level can have their children swapped. 
   * Two empty trees are isomorphic.
   * 
   */
  
  def isIsomorphismTree[A](tree1: BinaryTree[A],tree2:BinaryTree[A]):Boolean = (tree1,tree2) match {
    case (EmptyTree,EmptyTree) => true
    case (Node(v1,l1,r1),Node(v2,l2,r2)) if(v1 == v2) => 
      (isIsomorphismTree(l1, l2) && isIsomorphismTree(r1, r2)) || 
      (isIsomorphismTree(l1, r2) && isIsomorphismTree(r1, l2)) 
    case _ => false
  }
}