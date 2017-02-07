package com.tree.binarytree

import scala.collection.mutable.Queue

/**
 * @author: Navneet Gupta
 * @createdOn: 07-Feb-2017
 */

object IdenticalTreeIterative {
  def areIdenticalTree[A](tree: BinaryTree[A],tree1:BinaryTree[A]) : Boolean = (tree,tree1) match {
    case (EmptyTree,EmptyTree) => true
    case (Node(v1,l1,r1),Node(v2,l2,r2)) => {
      val q1 = Queue[BinaryTree[A]]()
      val q2 = Queue[BinaryTree[A]]()
      q1.enqueue(tree)
      q2.enqueue(tree1)
      while(q1.size>0 && q2.size>0) {
        val t1 = q1.dequeue()
        val t2 = q2.dequeue()
        (t1,t2) match {
          case (EmptyTree,EmptyTree) => true
          case (Node(v1,l1,r1),Node(v2,l2,r2)) => {
            if(v1 == v2) {
              (l1,l2) match {
                case (Node(v3,l3,r3),Node(v4,l4,r4)) => q1.enqueue(l1);q2.enqueue(l2); 
                case (EmptyTree,EmptyTree) =>
                case _ => return false
              }
              (r1,r2) match {
                case (Node(v3,l3,r3),Node(v4,l4,r4)) => q1.enqueue(r1);q2.enqueue(r2);
                case (EmptyTree,EmptyTree) =>
                case _ => return false
              }
            } else return false
          }
          case _ => false
        }
      }
      true
    }
    case _ => false
  }
}