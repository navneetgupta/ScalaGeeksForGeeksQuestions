package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 15-Feb-2017
 */

object SumOfAllLeftLeaves {
  /*
   * http://www.geeksforgeeks.org/find-sum-left-leaves-given-binary-tree/
   * 
   * The idea is to traverse the tree, starting from root. For every node, check if its left subtree is a leaf. If it is, then add it to the result. 
   * 
   * */
  
  def sumAllLeftLeaves(tree: BinaryTree[Int]):Int = tree match {
    case EmptyTree => 0
    case Node(v,l,r) => {
      val res = 0
      (l,r) match {
        case (Node(v,EmptyTree,EmptyTree),_) => res+v+sumAllLeftLeaves(r);
        case _ => res + sumAllLeftLeaves(l) + sumAllLeftLeaves(r)
      }
    }
  }
}