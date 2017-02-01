package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 05-Jan-2017
 */

object IsHeightBalancedTree {
  def isHeightBalanacedTree[A](tree: BinaryTree[A]) : Boolean = tree match {
    case EmptyTree => true
    case Node(v,l,r) => {
      isHeightBalanacedTree(l) && 
      isHeightBalanacedTree(r) && 
      ((MaxDepthOrHeight.maxDepthOrHeightViaFold(l)-MaxDepthOrHeight.maxDepthOrHeightViaFold(r)).abs <= 1)
    }
  }
}