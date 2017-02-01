package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 06-Jan-2017
 */

object RootToLeafPathSum {
  
  def isRootToLeafPathSumEqualGivenX2(tree: BinaryTree[Int], x: Int) : Boolean = tree match {
    case EmptyTree => x==0
    case Node(v,l,r) => {
      val subSum = x-v
      (l,r) match {
        case (EmptyTree,EmptyTree) => subSum==0
        case (EmptyTree,Node(v1,l1,r1)) => isRootToLeafPathSumEqualGivenX2(r, x-v)
        case (Node(v1,l1,r1),EmptyTree) => isRootToLeafPathSumEqualGivenX2(l, x-v)
        case (_,_) => isRootToLeafPathSumEqualGivenX2(l, x-v) || isRootToLeafPathSumEqualGivenX2(r, x-v)
      }  
    }
  }
}