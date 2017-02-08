package com.tree.binarytree

import scala.collection.mutable.Queue
import com.tree.binarytree.BinaryTree._


/**
 * @author: Navneet Gupta
 * @createdOn: 08-Feb-2017
 */

object ExtremesNodesInATree extends App{
  def printExtremeNodes[A](tree: BinaryTree[A]): Unit = tree match {
    case EmptyTree => 
    case Node(v,l,r) => {
      val queue = Queue[BinaryTree[A]]()
      queue.enqueue(tree);
      var flag = false
      while(queue.size>0) {
        val nodeCount = queue.size;
        //println("nodeCount is = "+ nodeCount)
        for {
          i <- (nodeCount to 1 by -1)
        } yield {
          //println(" i " + i)
          val temp = queue.dequeue()
          temp match {
            case EmptyTree => 
            case Node(v,l,r) => {
              l match {
                case EmptyTree =>
                case _ => queue.enqueue(l); 
              }
              r match {
                case EmptyTree =>
                case _ => queue.enqueue(r);
              }
              if(flag && (i-1 == nodeCount-1)) print(v + " , ")
              if(!flag && (i-1 == 0)) print(v + " , ")
            }
          }
        }
        flag = !flag
      }
    }
  }
  
  printExtremeNodes(balancedtree)
}