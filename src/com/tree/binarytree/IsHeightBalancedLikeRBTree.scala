package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 20-Feb-2017
 */

object IsHeightBalancedLikeRBTree {
  /*
   * http://www.geeksforgeeks.org/check-given-binary-tree-follows-height-property-red-black-tree/
   * 
   * In a Red-Black Tree, the maximum height of a node is at most twice the minimum height (The four Red-Black tree properties make 
   * sure this is always followed). Given a Binary Search Tree, we need to check for following property.For every node, 
   * length of the longest leaf to node path has not more than twice the nodes on shortest path from node to leaf.
   * 
   * */
  
  def isBalanacedUtil[A](tree: BinaryTree[A],maxh: Int, minh: Int): (Int,Int,Boolean) = tree match {
    case EmptyTree => 
      (0,0,true)
    case Node(v,l,r) => {
      val lt = isBalanacedUtil(l, Int.MinValue, Int.MaxValue)
      if(!lt._3) lt
      else {
        val rt = isBalanacedUtil(r, Int.MinValue, Int.MaxValue)
        if(!rt._3) rt
        else {
          val max = List(lt._1,rt._1).max + 1
          val min = List(lt._2,rt._2).min + 1
          if(max <= 2* min) (max,min,true)
          else (max,min,false)
        }
      }
    }
  }
  
  def isBalanced[A](tree: BinaryTree[A]): Boolean = {
    isBalanacedUtil(tree,Int.MinValue, Int.MaxValue)._3
  }
}