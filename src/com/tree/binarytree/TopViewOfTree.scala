package com.tree.binarytree

import scala.collection.mutable.Queue

/**
 * @author: Navneet Gupta
 * @createdOn: 16-Feb-2017
 */


object TopViewOfTree {
  /*
   * http://www.geeksforgeeks.org/print-nodes-top-view-binary-tree/ 
   * 
   * A node x is there in output if x is the topmost node at its horizontal distance. Horizontal distance of left child of a node x 
   * is equal to horizontal distance of x minus 1, and that of right child is horizontal distance of x plus 1. 
   * 
   */
  
  def topView[A](tree: BinaryTree[A]): List[A] = tree match {
    case EmptyTree => Nil
    case Node(v,l,r) => 
      val queue = Queue[(BinaryTree[A],Int)]()
      queue.enqueue((tree,0))
      processQueue(queue,Set.empty,Nil)
  }
  
  def processQueue[A](queue: Queue[(BinaryTree[A],Int)],set: Set[Int],xs:List[A]): List[A]= {
    if(queue.size>0) {
      val node = queue.dequeue()
      node._1 match {
        case EmptyTree => xs
        case Node(v,l,r) => {
          if(!l.isEmptyTree) queue.enqueue((l,node._2-1))
          if(!r.isEmptyTree) queue.enqueue((r,node._2+1))
          if(!set.contains(node._2)) {
            val updated_set = set + (node._2)
            val updated_list = v::xs
            processQueue(queue, updated_set, updated_list)
          } else {
            processQueue(queue, set, xs)
          }
        }
      }
    } else {
      xs
    }
  }
}