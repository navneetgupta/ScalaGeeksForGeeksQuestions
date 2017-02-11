package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 11-Feb-2017
 */

/*
 * http://www.geeksforgeeks.org/print-left-view-binary-tree/
 * Left view of a Binary Tree is set of nodes visible when tree is visited from left side. 
 */
 
object LeftViewOfTree {
  def leftViewUtil[A](tree: BinaryTree[A],level: Int,maxLevel:Int,xs :List[A]): (List[A],Int) = tree match {
    case EmptyTree => (xs,maxLevel)
    case Node(v,l,r) => 
      if(maxLevel < level) {
        val lt = leftViewUtil(l, level+1, level,v::xs)
        leftViewUtil(r, level+1, lt._2,lt._1)
      } else {
        val lt = leftViewUtil(l, level+1, maxLevel,xs)
        leftViewUtil(r, level+1, lt._2,lt._1)
      }
  }
  
  def leftView[A](tree: BinaryTree[A]) : List[A] = {
    leftViewUtil(tree, 1, 0,Nil)._1.reverse
  }
}