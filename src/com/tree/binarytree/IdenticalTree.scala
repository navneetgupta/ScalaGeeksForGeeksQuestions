package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 06-Jan-2017
 */


object IdenticalTree {
  
  def identicalTree[A](tree1: BinaryTree[A] ,tree2: BinaryTree[A]): Option[Boolean] = (tree1,tree2) match {
    case (EmptyTree,EmptyTree) => Some(true)
    case (Node(v1,l1,r1),Node(v2,l2,r2)) => 
      Some((v1==v2) && identicalTree(l1, l2).getOrElse(false) && identicalTree(r1,r2).getOrElse(false))
    case (_,_) => Some(false)
  }
  
}