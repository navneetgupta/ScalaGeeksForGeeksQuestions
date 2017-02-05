package com.tree.binarytree

import scala.collection.mutable.Queue

/**
 * @author: Navneet Gupta
 * @createdOn: 05-Feb-2017
 */

object IterativeHeightOfTree {
  def heightOfTreeIterative[A](tree: BinaryTree[A]):Int = tree match {
    case EmptyTree => 0
    case Node(v,l,r) => 
      val queue = Queue[BinaryTree[A]]()
      queue.enqueue(tree);
      var height = 0
      while(true) {
        var nodeCount = queue.size
        if(nodeCount==0) {
          return height;
        } else {
          height = height +1;
          while(nodeCount>0) {
            queue.dequeue() match {
              case EmptyTree =>
              case Node(v1,l1,r1) => (l1,r1) match {
                case (EmptyTree,EmptyTree) => 
                case (Node(v2,l2,r2),EmptyTree) => queue.enqueue(l1)
                case (EmptyTree,Node(v2,l2,r2)) => queue.enqueue(r1)
                case _ => queue.enqueue(l1);queue.enqueue(r1);
              }
            }
            nodeCount = nodeCount -1
          }
        }
      }
      height
  }
}