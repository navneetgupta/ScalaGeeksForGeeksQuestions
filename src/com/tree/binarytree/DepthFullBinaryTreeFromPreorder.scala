package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 11-Feb-2017
 */

object DepthFullBinaryTreeFromPreorder {
  /*
   * Given preorder of a binary tree, calculate its depth(or height) [starting from depth 0]. 
   * The preorder is given as a string with two possible characters.

	 *	‘l’ denotes the leaf
   *  ‘n’ denotes internal node
   * The given tree can be seen as a full binary tree where every node has 0 or two children. 
   * The two children of a node can ‘n’ or ‘l’ or mix of both.
   * */
  
  /*
   * The recursion function would be:
			1) Base Case: return 0; when tree[i] = ‘l’ or i >= strlen(tree)
			2) find_depth( tree[i++] ) //left subtree
			3) find_depth( tree[i++] ) //right subtree

	    Where i is the index of the string tree.
	 */
  
  def findDepthRec(arr: Array[Char],n:Int,index:Int): (Int,Int) = {
    if(index >= n || arr(index) == 'l') {
      (0,index)
    } else {
      val lt = findDepthRec(arr, n, index+1)
      val rt = findDepthRec(arr, n, lt._2+1)
      (List(lt._1,rt._1).max +1, rt._2)
    }
  }
  
  def findDepth(arr: Array[Char]) : Int = {
    findDepthRec(arr, arr.length, 0)._1
  }
}