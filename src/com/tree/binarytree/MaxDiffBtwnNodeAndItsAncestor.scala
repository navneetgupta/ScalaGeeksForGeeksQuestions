package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 13-Feb-2017
 */


object MaxDiffBtwnNodeAndItsAncestor {
  /*
   * http://www.geeksforgeeks.org/maximum-difference-between-node-and-its-ancestor-in-binary-tree/
   * 
   * 1.	Get all difference of nodes and its ancestor get Maximum of the list and return it
   * 2. If we are at leaf node then just return its value because it can’t be ancestor of any node. 
   * Then at each internal node we will try to get minimum value from left subtree and right subtree and 
   * calculate the difference between node value and this minimum value and according to that we will update the result.
   */
  
//  def maxDiffUtil(tree: BinaryTree[Int],maxDiff:Int):Int = tree match {
//    case EmptyTree => Integer.MAX_VALUE
//    case Node(v,EmptyTree,EmptyTree) => v
//    case Node(v,l,r) => {
//      val lt = maxDiffUtil(l, maxDiff)
//      val rt = maxDiffUtil(r,lt)
//      
//    }
//  }
  
  def maxDiffUtil2(tree: BinaryTree[Int],maxDiff:Resp):Int = tree match {
    case EmptyTree => Integer.MAX_VALUE
    case Node(v,EmptyTree,EmptyTree) => v
    case Node(v,l,r) => {
      val res = List(maxDiffUtil2(l,maxDiff),maxDiffUtil2(r,maxDiff)).min
      maxDiff.res = List(maxDiff.res,v-res).max
      List(res,v).min
    }
  }
  
  def maxDiff(tree: BinaryTree[Int]):Int = {
    val maxDiff = Resp(Integer.MIN_VALUE)
    maxDiffUtil2(tree, maxDiff)
    maxDiff.res
  }
}
case class Resp(var res:Int)