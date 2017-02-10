package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 10-Feb-2017
 */

object ContinuousTree {
  /*
   * A tree is Continuous tree if in each root to leaf path, absolute difference between keys of two adjacent is 1. 
   * We are given a binary tree, we need to check if tree is continuous or not.
   * */
  
  def continuousTree(tree: BinaryTree[Int]):Boolean = tree match {
    case EmptyTree => true
    case Node(v,l,r) => 
      (l,r) match {
        case (EmptyTree,EmptyTree) => true
        case (Node(v1,l1,r1),EmptyTree) => ((v-v1).abs == 1) && continuousTree(l)
        case (EmptyTree,Node(v2,l2,r2)) => ((v-v2).abs == 1) && continuousTree(r)
        case (Node(v1,l1,r1),Node(v2,l2,r2)) => ((v-v1).abs == 1) && continuousTree(l) && ((v-v2).abs == 1) && continuousTree(r)
      }
  }
}