package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 05-Jan-2017
 */

object CountLeafNodes {
  def noOfLeafNodes[A](tree: BinaryTree[A]):Int = tree match {
    case EmptyTree => 0
    case Node(v,EmptyTree,EmptyTree) => 1
    case Node(v,l,r) => noOfLeafNodes(l)+noOfLeafNodes(r)
  }
}