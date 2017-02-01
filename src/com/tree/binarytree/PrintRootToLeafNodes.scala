package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 06-Jan-2017
 */


import scala.annotation.tailrec

object PrintRootToLeafNodes {
  
  //@tailrec
  def printAllPathsFromRootToLeaf[A](tree: BinaryTree[A],xs:List[A]): Unit = tree match {
    case EmptyTree => return
    case Node(v,l,r) => {
      (l,r) match {
        case (EmptyTree,EmptyTree) => print(v::xs)
        case (_,_) => printAllPathsFromRootToLeaf(l, v::xs);printAllPathsFromRootToLeaf(r, v::xs)
      }
    }
  } 
  
}
