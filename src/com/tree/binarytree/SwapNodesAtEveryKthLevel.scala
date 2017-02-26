package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 09-Feb-2017
 */

object SwapNodesAtEveryKthLevel {
  /*
   * http://www.geeksforgeeks.org/swap-nodes-binary-tree-every-kth-level/
   * 
   * A simple solution of this problem is that for each is to find sibling nodes for each multiple of k and swap them.

	 * An efficient solution is to keep track of level number in recursive calls. And for every node being visited, 
	 * check if level number of its children is a multiple of k. If yes, then swap the two children of the node. 
	 * Else, recur for left and right children.
	 */
  
  def swapNodesAtEachKthLevel[A](tree: BinaryTree[A],k:Int) = swapNodesAtEachKthLevelUtil(tree, k, 1, tree)
  
  def swapNodesAtEachKthLevelUtil[A](tree: BinaryTree[A],k: Int,level: Int,res: BinaryTree[A]):BinaryTree[A] = tree match {
    case EmptyTree => tree
    case Node(v,EmptyTree,EmptyTree) => tree
    case Node(v,l,r) => {
      if((level+1)%k==0) {
        val temp = Node(v,r,l)
        val ll = swapNodesAtEachKthLevelUtil(temp.getLeft,k,level+1,temp)
        val rr = swapNodesAtEachKthLevelUtil(temp.getRight, k, level+1, temp)
        Node(v,ll,rr)
      } else {
        val ll = swapNodesAtEachKthLevelUtil(l,k,level+1,tree)
        val rr = swapNodesAtEachKthLevelUtil(r, k, level+1, tree)
        Node(v,ll,rr)
      }
    }
  }

}