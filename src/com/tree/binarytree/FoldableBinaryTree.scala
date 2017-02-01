package com.tree.binarytree

import com.tree.binarytree.ConvertToMirrorTree.convertToMirrorTree
/**
 * @author: Navneet Gupta
 * @createdOn: 07-Jan-2017
 */

/*
 * A tree can be folded if left and right subtrees of the tree are structure wise mirror image of each other. 
 * An empty tree is considered as foldable.
 */

object FoldableBinaryTree {
  def isFoldable[A](tree: BinaryTree[A]):Boolean = {
    tree match {
      case EmptyTree => true
      case Node(v,l,r) => isStructureSame(convertToMirrorTree(l),r)
    }
  }
  
  def isStructureSame[A](treeLeft:BinaryTree[A],treeRight:BinaryTree[A]):Boolean = {
    (treeLeft,treeRight) match {
      case (EmptyTree,EmptyTree) => true
      case (Node(v1,l1,r1),Node(v2,l2,r2)) => isStructureSame(l1, l2) && isStructureSame(r1,r2)
      case (_,_) => false
    }
  }
  
  def isFoldable2[A](tree: BinaryTree[A]):Boolean = {
    tree match {
      case EmptyTree => true
      case Node(v,l,r) => isStructureMirror(l,r)
    }
  }
  
  def isStructureMirror[A](treeLeft:BinaryTree[A],treeRight:BinaryTree[A]):Boolean = {
    (treeLeft,treeRight) match {
      case (EmptyTree,EmptyTree) => true
      case (Node(v1,l1,r1),Node(v2,l2,r2)) => isStructureSame(l1, r2) && isStructureSame(r1,l2)
      case (_,_) => false
    }
  }
}