package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 10-Feb-2017
 */

object AllNodesWithKLeaves {
  /*
   * http://www.geeksforgeeks.org/print-nodes-binary-tree-k-leaves/
   * Given a binary tree and a integer value K, the task is to find all nodes in given binary tree having K leaves in subtree rooted with them.*/
 
  def allNodesWithKLeaves[A](tree: BinaryTree[A],k: Int): Int = tree match {
    case EmptyTree => 0
    case Node(v,EmptyTree,EmptyTree) => 1
    case Node(v,l,r) => 
      val lt = allNodesWithKLeaves(l, k)
      val rt = allNodesWithKLeaves(r, k)
      if(lt+rt == k) print(v + " , ")
      lt+rt
  }
}