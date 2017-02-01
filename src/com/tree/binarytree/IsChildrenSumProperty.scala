package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 05-Jan-2017
 */


object IsChildrenSumProperty {
  
  def isChildrenSumProperty(tree: BinaryTree[Int]): Boolean = {
    tree match {
      case EmptyTree => true
      case Node(v,EmptyTree,EmptyTree) => true
      case Node(v,l,r) =>  {
        val ld = l match { 
                   case Node(v1,l1,r1) => v1
                   case _ => 0
                 }
        val rd = r match { 
                   case Node(v1,l1,r1) => v1
                   case _ => 0
                 }
        ((ld+rd) == v) && isChildrenSumProperty(l) && isChildrenSumProperty(r)
      }

    }
  }
    
}