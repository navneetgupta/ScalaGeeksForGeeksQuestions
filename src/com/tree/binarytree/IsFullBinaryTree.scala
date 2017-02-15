package com.tree.binarytree

object IsFullBinaryTree {
  /*
   * http://www.geeksforgeeks.org/check-whether-binary-tree-full-binary-tree-not/
   * 
   * A full binary tree is defined as a binary tree in which all nodes have either zero or two child nodes.
   * Conversely, there is no node in a full binary tree, which has one child node.
   * 
   * To check whether a binary tree is a full binary tree we need to test the following cases:-
	 *
	 *		1) If a binary tree node is NULL then it is a full binary tree.
	 *		2) If a binary tree node does have empty left and right sub-trees, then it is a full binary tree by definition
	 *		3) If a binary tree node has left and right sub-trees, then it is a part of a full binary tree by definition. In this case recursively check if the left and right sub-trees are also binary trees themselves.
	 *		4) In all other combinations of right and left sub-trees, the binary tree is not a full binary tree.
   * */
  
  def isFullBinaryTree[A](tree: BinaryTree[A]): Boolean = tree match {
    case EmptyTree => true
    case Node(v,EmptyTree,EmptyTree) => true
    case Node(v,Node(v1,l1,r1),Node(v2,l2,r2)) => isFullBinaryTree(Node(v1,l1,r1)) && isFullBinaryTree(Node(v2,l2,r2))
    case _ => false
  }
  
}