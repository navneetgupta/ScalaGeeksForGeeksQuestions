package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 04-Jan-2017
 */

object PreOrderTraversal {
  import com.tree.binarytree.BinaryTree._
  
  def preOrderTraversalRecursive[A](tree: BinaryTree[A]) : Unit = tree match {
    case EmptyTree =>  
    case Node(v,l,r) => {
      print( v + " , ");
      preOrderTraversalRecursive(l);
      preOrderTraversalRecursive(r);
    }
  }
  
  //def preOrderTraversalViaFold[A](tree: BinaryTree[A]) : Unit = fold(tree,Unit)(a => print(a))((b,c) => {})
}