package com.tree.binarytree

import scala.collection.mutable.Queue
import scala.concurrent.forkjoin.ForkJoinPool.EmptyTask

/**
 * @author: Navneet Gupta
 * @createdOn: 04-Feb-2017
 */

object IsTreeComplete {
  /*
   * A complete binary tree is a binary tree in which every level, except possibly the last, 
   * is completely filled, and all nodes are as far left as possible. 
   * The approach is to do a level order traversal starting from root. In the traversal, once a node is found which is 
   * NOT a Full Node, all the following nodes must be leaf nodes.Also, one more thing needs to be checked to handle 
   * the below case: If a node has empty left child, then the right child must be empty.
   * */
  def isTreeComplete[A](tree: BinaryTree[A]): Boolean = tree match {
    case EmptyTree => true
    case Node(v,l,r) => 
      val queue = Queue[BinaryTree[A]]()
      var flag = false
      queue += tree
      while(queue.size>0) {
        val temp = queue.dequeue()
        temp.getLeft match {
          case EmptyTree => flag = true
          case l1 => 
            if(flag) return false;
            else queue += l1
        }
        temp.getRight match {
          case EmptyTree => flag=true
          case r1 => 
            if(flag) return false
            else queue += r1
        }
      }
      true
  }
}