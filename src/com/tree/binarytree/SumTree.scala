package com.tree.binarytree

/*
 * Given a Binary Tree where each node has positive and negative values. Convert this to a tree where each
 *  node contains the sum of the left and right sub trees in the original tree. The values of leaf nodes are changed to 0.

For example, the following tree

           10
        /       \
	    -2         6
     /   \      /  \ 
	 8     -4    7    5
should be changed to

           20(4-2+12+6)
        /      \
	   4(8-4)     12(7+5)
     /   \      /  \ 
	 0      0    0    0
 * 
 */

object SumTree {
  def toSumTree(tree: BinaryTree[Int]):BinaryTree[Int] = tree match {
    case EmptyTree => Node(0,EmptyTree,EmptyTree)
    case Node(v,l,r) => {
      (l,r) match {
        case (EmptyTree,EmptyTree) => Node(v,toSumTree(l),toSumTree(r))
        case (EmptyTree,Node(v2,l2,r2)) => Node(v+v2,toSumTree(l),toSumTree(r))
        case (Node(v1,l1,r1),EmptyTree) => Node(v+v1,toSumTree(l),toSumTree(r))
        case (Node(v1,l1,r1),Node(v2,l2,r2)) => Node(v+v1+v2,toSumTree(l),toSumTree(r))
      }
    }
  }
  
  def toSumTree2(tree: BinaryTree[Int]):(BinaryTree[Int],Int) = tree match {
    case EmptyTree => (EmptyTree,0)
    case Node(v,l,r) => {
      (l,r) match {
        case (EmptyTree,EmptyTree) => (Node(0,EmptyTree,EmptyTree),v)
        case _ => {
          val l1 = toSumTree2(l)
          val l2 = toSumTree2(r)
          (Node(l1._2+l2._2,l1._1,l2._1),l1._2+l2._2+v)
        }
      }
    }
  }
}