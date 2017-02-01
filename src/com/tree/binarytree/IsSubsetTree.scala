package com.tree.binarytree

/*
 * Check if a binary tree is subtree of another binary tree 
 * Given two binary trees, check if the first tree is subtree of the second one.
 * */

/**
 * @author: Navneet Gupta
 * @createdOn: 01-Feb-2017
 */

object IsSubsetTree {
  
  def isIdenticalTree(tree1: BinaryTree[Int],tree2: BinaryTree[Int]) : Boolean = (tree1,tree2) match {
    case (EmptyTree,EmptyTree) => true
    case (Node(v1,l1,r1),Node(v2,l2,r2)) => (v1==v2) && isIdenticalTree(l1, l2) && isIdenticalTree(r1, r2)
    case _ => false
  }
  
  def isSubsetTree(tree1:BinaryTree[Int],tree2: BinaryTree[Int]): Boolean = {
    (tree1,tree2) match {
      case (EmptyTree,EmptyTree) => true
      case (EmptyTree,_) => false
      case (_,EmptyTree) => true
      case (Node(v,l,r),_) => if(isIdenticalTree(tree1, tree2)) true
      else isSubsetTree(l, tree2) || isSubsetTree(r, tree2)
    }
  }
}