package com.tree.binarytree

import scala.collection.mutable.HashMap

/**
 * @author: Navneet Gupta
 * @createdOn: 09-Feb-2017
 */

object PairSumInRootToPathEqualRootData {
  /*
   * The idea is based on hashing and tree traversal. The idea is similar to method 2 of array pair sum problem.

	 *	Create an empty hash table.
	 *	Start traversing tree in Preorder fashion.
	 *	If we reach a leaf node, we return false.
	 *	For every visited node, check if root’s data minus current node’s data exists in hash table or not. If yes, return true. Else insert current node in hash table.
	 *	Recursively check in left and right subtrees.
	 *	Remove current node from hash table so that it doesn’t appear in other root to leaf paths.
   */
  
  def printPathUtil(tree: BinaryTree[Int],list:List[Int],rootData: Int) : (Boolean,List[Int]) = tree match {
    case EmptyTree => (false,list)
    case Node(v,l,r) => 
      if(list.contains(rootData-v)) (true,list)
      else {
        val xs_new  = (rootData-v)::list
        val lt = printPathUtil(l, list, rootData)
        if(!lt._1) printPathUtil(r, lt._2, rootData)
        else lt
      }
  }
  
  def isPrintSum(tree: BinaryTree[Int]): Boolean = tree match {
    case EmptyTree => true
    case Node(v,l,r) => 
       printPathUtil(tree, Nil, v)._1
  }
}