package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 10-Feb-2017
 */

object SubTreeWithGivenSum {
  /*
   * http://www.geeksforgeeks.org/subtree-given-sum-binary-tree/
   */
  def subTreeSumUtil(tree: BinaryTree[Int],current_sum : Int,sum:Int,res:Boolean): (Int,Boolean) = tree match {
    case EmptyTree => (0,false)
    case Node(v,l,r) => 
      val lt = subTreeSumUtil(l, 0, sum, res)
      val rt = subTreeSumUtil(r, 0, sum, res)
      //println("lt = " + lt + "  rt = "+ rt + " lt._1+rt._1 == " +(lt._1+rt._1) + "  v = " +v)
      (lt._1+rt._1+v,(lt._2 ||rt._2 || (lt._1+rt._1+v == sum)))
  }
  
  def subTreeSum(tree: BinaryTree[Int],sum: Int) : Boolean = {
    subTreeSumUtil(tree, 0, sum, false)._2
  }
}