package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 04-Jan-2017
 */

object PostOrderTraversal {
  def postOrderTraversalRecursive[A](tree: BinaryTree[A]) : Unit = tree match {
    case EmptyTree =>
    case Node(v,l,r) => {
      postOrderTraversalRecursive(l);
      postOrderTraversalRecursive(r);
      print(v + " , ")
    }
  }
}