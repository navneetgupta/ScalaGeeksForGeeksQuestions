package com.tree.binarytree


/**
 * @author: Navneet Gupta
 * @createdOn: 11-Feb-2017
 */

/*
 * http://www.geeksforgeeks.org/print-right-view-binary-tree-2/
 * Right view of a Binary Tree is set of nodes visible when tree is visited from Right side.
 */

object RightViewOfTree {
  
  /*
   * http://www.geeksforgeeks.org/print-right-view-binary-tree-2/
   * */
  def rightViewUtil[A](tree: BinaryTree[A],level: Int,maxLevel:Int,xs :List[A]): (List[A],Int) = tree match {
    case EmptyTree => (xs,maxLevel)
    case Node(v,l,r) => 
      if(maxLevel < level) {
        val rt = rightViewUtil(r, level+1, level,v::xs)
        rightViewUtil(l, level+1, rt._2,rt._1)
      } else {
        val rt = rightViewUtil(r, level+1, maxLevel,xs)
        rightViewUtil(l, level+1, rt._2,rt._1)
      }
  }
  
  def rightView[A](tree: BinaryTree[A]) : List[A] = {
    rightViewUtil(tree, 1, 0,Nil)._1.reverse
  }
}