package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 10-Feb-2017
 */

object RootToPathSequenceExists {
  /*
   * A simple solution for this problem is to find all root to leaf paths in given tree and for each root to leaf path check 
   * that path and given sequence in array both are identical or not.

	 * An efficient solution for this problem is to traverse the tree once and while traversing the tree we have to check that 
	 * if path from root to current node is identical to the given sequence of root to leaf path. Here is the algorithm :

	 *	Start traversing tree in preorder fashion.
	 *	Whenever we moves down in tree then we also move by one index in given sequence of root to leaf path .
	 *	If current node is equal to the arr[index] this means that till this level of tree path is identical.
	 *	Now remaining path will either be in left subtree or in right subtree.
	 *	If any node gets mismatched with arr[index] this means that current path is not identical to the given sequence of root to leaf path,
	 *	so we return back and move in right subtree.
	 *	Now when we are at leaf node and it is equal to arr[index] and there is no further element in given sequence of root to leaf path, 
	 *	this means that path exist in given tree.
	 * */
  
  def pathExistsUtil[A](tree: BinaryTree[A], arr: Array[A],n: Int, index: Int): Boolean = tree match {
    case EmptyTree => (n==0)
    case Node(v,EmptyTree,EmptyTree) if(v ==arr(index) && index == n-1) => true
    case Node(v,l,r) => (index < n) && (arr(index) == v) && (pathExistsUtil(l, arr, n, index+1) || pathExistsUtil(r, arr, n, index+1))
  }
  
  def pathExists[A](tree: BinaryTree[A],arr: Array[A]): Boolean = {
    pathExistsUtil(tree, arr, arr.length, 0)
  }
}