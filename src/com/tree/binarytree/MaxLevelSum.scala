package com.tree.binarytree

import scala.collection.mutable.Queue

/**
 * @author: Navneet Gupta
 * @createdOn: 10-Feb-2017
 */

object MaxLevelSum {
  /*Given a Binary Tree having positive and negative nodes, the task is to find maximum sum level in it.
   * 
   * This problem is a variation of maximum width problem. The idea is to do level order traversal of tree.
   *  While doing traversal, process nodes of different level separately. For every level being processed, '
   *  compute sum of nodes in the level and keep track of maximum sum.
   */
  
  def maxLevelSum(tree: BinaryTree[Int]) :Int = tree match {
    case EmptyTree => 0
    case Node(v,l,r) =>  {
      val queue = Queue[BinaryTree[Int]]()
      queue.enqueue(tree)
      var result = v
      while(queue.size>0) {
         val n = queue.size
         val lt:IndexedSeq[Int] = for {
           i <- (n to 1 by -1)
         } yield {
           queue.dequeue() match {
             case EmptyTree => 0
             case Node(v,l,r) =>  
               (l,r) match {
                 case (EmptyTree,EmptyTree) =>
                 case (Node(v1,l1,r1),EmptyTree) => queue.enqueue(l)
                 case (EmptyTree,Node(v2,l2,r2)) =>queue.enqueue(r)
                 case (Node(v1,l1,r1),Node(v2,l2,r2)) => queue.enqueue(l);queue.enqueue(r);
               }
               v
           }
         }
         result = List(v,lt.foldLeft(0)((a,b) => a+b)).max
      }
      result
    }
  }
  
}