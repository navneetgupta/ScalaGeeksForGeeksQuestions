package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 06-Feb-2017
 */

/*
 * if left and right subtrees of the tree are structure wise mirror image of each other. 
 */

object IsMirrorTree {
  def isMirrorTree[A](tree1: BinaryTree[A],tree2: BinaryTree[A]): Boolean = (tree1,tree2) match {
    case (EmptyTree,EmptyTree) => true
    case (Node(v1,l1,r1),Node(v2,l2,r2)) => 
      (v1 == v2) && isMirrorTree(l1, r2) && isMirrorTree(r1, l2)
    case _ => false
  }
}