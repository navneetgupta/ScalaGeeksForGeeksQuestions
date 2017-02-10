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
  
  def printPathUtil(tree: BinaryTree[Int],list:List[Int],rootData: Int,res:Boolean) : (Boolean,List[Int]) = tree match {
    case EmptyTree => println("res = "+ res+"  " +list);(res,list)
    case Node(v,l,r) => 
       println(" rootData-v = "+(rootData-v) )
      if(list.contains(rootData-v)) {
         println("res = "+ res+"  " +list);
        (true,list)
      }
      else {
        val xs_new  = (v)::list
        val lt = printPathUtil(l, xs_new, rootData,res)
        if(!lt._1)printPathUtil(r, lt._2, rootData,lt._1)
        else lt
      }
  }
  
  def isPrintSum(tree: BinaryTree[Int]): Boolean = tree match {
    case EmptyTree => true
    case Node(v,l,r) => 
       var lt = printPathUtil(l, Nil, v,false) 
       println("left side done found " + lt._1 +" list is "+ lt._2)
       if(!lt._1) printPathUtil(r, Nil, v,false)._1
       else lt._1
  }
}

//                                                          4
//                                                       /     \
//                                                      /       \
//                                                     2         5
//                                                   /   \
//                                                  1     3








