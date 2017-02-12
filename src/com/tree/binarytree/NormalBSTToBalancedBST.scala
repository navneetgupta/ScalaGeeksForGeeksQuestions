package com.tree.binarytree

import com.tree.binarytree.BinaryTree._

/**
 * @author: Navneet Gupta
 * @createdOn: 05-Feb-2017
 */

object NormalBSTToBalancedBST extends App{
  /*
   * http://www.geeksforgeeks.org/convert-normal-bst-balanced-bst/
   * 
   * Given a BST (Binary Search Tree) that may be unbalanced, convert it into a balanced BST that has minimum possible height.*/
  
  /*
   * Method 1:: traverse nodes in Inorder and one by one insert into a self-balancing BST like AVL tree. 
   * Time complexity of this solution is O(n Log n) and this solution doesn’t guarantee
   * 
   * Method 2: Efficient Solution can construct balanced BST in O(n) time with minimum possible height. Below are steps.
   *
	 *		1.  Traverse given BST in inorder and store result in an array. This step takes O(n) time. 
	 *        Note that this array would be sorted as inorder traversal of BST always produces sorted sequence.
	 *		2.  Build a balanced BST from the above created sorted array using the recursive approach discussed here. 
	 *        This step also takes O(n) time as we traverse every element exactly once and processing an element takes O(1) time.
	 *        
	 * */
	 
	 
	 // Step 1:
	 def storeNormalBST(tree: BinaryTree[Int],xs: List[Int]):List[Int] = tree match {
	   case EmptyTree => xs
	   case Node(v,l,r) => 
	     val a = storeNormalBST(l, xs)
	     storeNormalBST(r,v::a)
	 }

	 //step 2
	 def buildTreeUtil(xs:Array[Int],start: Int,end: Int) : BinaryTree[Int] = {
	   if(start>end) EmptyTree
	   else {
	     val mid:Int = (start+end)/2
	     val lt = buildTreeUtil(xs, start, mid-1)
	     val rt = buildTreeUtil(xs, mid+1 , end)
	     Node(xs(mid),lt,rt)
	   }
	 }
	 
	 def bstToBalanacedBST(tree:BinaryTree[Int]) : BinaryTree[Int] = {
	   val xs = storeNormalBST(tree, Nil).toArray
	   buildTreeUtil(xs.reverse, 0, xs.length-1)
	 }
	 
	 bstToBalanacedBST(bstToBalancedBSTTest)
}