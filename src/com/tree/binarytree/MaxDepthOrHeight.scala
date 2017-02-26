package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 04-Jan-2017
 */

object MaxDepthOrHeight {
  import com.tree.binarytree.BinaryTree._
  /*
   * http://www.geeksforgeeks.org/write-a-c-program-to-find-the-maximum-depth-or-height-of-a-tree/
   * */
  def maxDepthOrHeight[A](tree: BinaryTree[A]): Int = tree match {
    case EmptyTree => 0
    case Node(v,l,r) => { 
      val lh = maxDepthOrHeight(l)
      val rh = maxDepthOrHeight(r)
      if(lh > rh) lh+1 else rh+1
    }
  }
  
  def maxDepthOrHeightViaFold[A](tree : BinaryTree[A]): Int = fold(tree,0)(_ => 0)((l,r) => (l max r) +1)
  
}