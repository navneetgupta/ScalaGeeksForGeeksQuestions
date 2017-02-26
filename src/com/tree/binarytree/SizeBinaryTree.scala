package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 04-Jan-2017
 */


object SizeBinaryTree {
  import com.tree.binarytree.BinaryTree._
  /*
   * http://www.geeksforgeeks.org/write-a-c-program-to-calculate-size-of-a-tree/
   * */
  def size[A](tree: BinaryTree[A]): Int = tree match {
    case EmptyTree => 0
    case Node(v,l,r) => {1 + size(l) + size(r)}
  }
  
  def sizeViaFold[A](tree:BinaryTree[A]):Int = fold(tree,0)(a => 1)((b,c) => b+c+1)
}