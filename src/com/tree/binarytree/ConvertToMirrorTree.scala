package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 05-Jan-2017
 */

object ConvertToMirrorTree {
  
  def convertToMirrorTree[A](tree: BinaryTree[A]): BinaryTree[A] = tree match {
    case EmptyTree => EmptyTree
    case Node(v,l,r) => Node(v,convertToMirrorTree(r),convertToMirrorTree(l))
  }
  
//  def mirrorTailRec[A](tree: BinaryTree[A]): BinaryTree[A] = {
//    def convertToMirrorTreeTailRec[A](tree: BinaryTree[A],mirrorTree: BinaryTree[A]): BinaryTree[A] = tree match {
//      case EmptyTree => mirrorTree
//      case Node(v,l,r) => convertToMirrorTreeTailRec(tree, mirrorTree)
//    }
//  }
  
}