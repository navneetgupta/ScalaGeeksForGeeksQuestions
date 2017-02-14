package com.tree.binarytree

import scala.collection.mutable.Stack

/**
 * @author: Navneet Gupta
 * @createdOn: 14-Feb-2017
 */

object IsValidPreorderOfBST {
  /*
   * http://www.geeksforgeeks.org/check-if-a-given-array-can-represent-preorder-traversal-of-binary-search-tree/
   * 
   * Given an array of numbers, return true if given array can represent preorder traversal of a Binary Search Tree, 
   * else return false. Expected time complexity is O(n).
   * 
   * A Simple Solution is to do following for every node pre[i] starting from first one.
	 *
	 *		1) Find the first greater value on right side of current node. 
   *				Let the index of this node be j. Return true if following 
   *				conditions hold. Else return false
   * 				(i)  All values after the above found greater value are 
   *             greater than current node.
   * 				(ii) Recursive calls for the subarrays pre[i+1..j-1] and 
   *      			 pre[j+1..n-1] also return true. 
   *   Efficient Sloution   
   *      1) Create an empty stack.
   *			2) Initialize root as INT_MIN.
	 *			3) Do following for every element pre[i]
   *  					a) If pre[i] is smaller than current root, return false.
   *  					b) Keep removing elements from stack while pre[i] is greater
   *     				 then stack top. Make the last removed item as new root (to
   *     				 be compared next).
   *     				 At this point, pre[i] is greater than the removed root
   *     				 (That is why if we see a smaller element in step a), we 
   *     				 return false)
   *  					c) push pre[i] to stack (All elements in stack are in decreasing
   *     				 order) 
   */
  def canRepresentBST(pre:Array[Int],size:Int) : Boolean = {
    val stk = Stack[Int]()
    var root = Int.MinValue
    val xs = for{
      i <- List.range(0, size)
    } yield {
      if(pre(i)<root) false
      else {
        while(stk.size>0 && stk.top< pre(i)) {
          root = stk.pop()
        }
        stk.push(pre(i))
        true
      }
    }
    xs.foldLeft(true)((a,b) => a &&b)
  }
}