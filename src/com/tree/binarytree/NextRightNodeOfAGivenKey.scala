package com.tree.binarytree

import scala.collection.mutable.Queue

/**
 * @author: Navneet Gupta
 * @createdOn: 20-Feb-2017
 */

object NextRightNodeOfAGivenKey {
  /*
   * http://www.geeksforgeeks.org/find-next-right-node-of-a-given-key/
   * 
   * Given a Binary tree and a key in the binary tree, find the node right to the given key. 
   * If there is no node on right side, then return NULL. Expected time complexity is O(n)
   * 
   * The idea is to do level order traversal of given Binary Tree. When we find the given key, we just check if the next node in 
   * level order traversal is of same level, if yes, we return the next node, otherwise return NULL.
   * */
  def nextRightNode[A](tree: BinaryTree[A],key: A) : BinaryTree[A] = tree match {
    case EmptyTree => tree
    case Node(v,l,r) =>  {
      val queue = Queue[BinaryTree[A]]()
      val queueLevels = Queue[Int]()
      queue.enqueue(tree)
      queueLevels.enqueue(0)
      var break = false
      var result:BinaryTree[A] = EmptyTree
      while(queue.size > 0 && !break) {
        val level = queueLevels.dequeue()
        queue.dequeue() match {
          case EmptyTree => 
          case Node(v1,l1,r1) if(v1 == key)=> {
            if((queueLevels.size == 0) || (queueLevels.front != level)) EmptyTree 
            else result = queue.front
            break = true
          }
          case Node(v1,l1,r1) => {
            if(!l1.isEmptyTree) {
              queue.enqueue(l1)
              queueLevels.enqueue(level+1)
            } 
            if(!r1.isEmptyTree) {
              queue.enqueue(r1)
              queueLevels.enqueue(level+1)
            }
          } 
        }
      }
      if(break) result
      else EmptyTree
    }
  }
}