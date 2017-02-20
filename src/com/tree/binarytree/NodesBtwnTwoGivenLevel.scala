package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 19-Feb-2017
 */

import scala.collection.mutable.Queue

object NodesBtwnTwoGivenLevel {
  /*
   * http://www.geeksforgeeks.org/given-binary-tree-print-nodes-two-given-level-numbers/
   * 
   * Given a binary tree and two level numbers ‘low’ and ‘high’, print nodes from level low to level high.
   * 
   * 
   * A Simple Method is to first write a recursive function that prints nodes of a given level number. 
   * Then call recursive function in a loop from low to high. Time complexity of this method is O(n2)
   * We can print nodes in O(n) time using queue based iterative level order traversal. 
   * The idea is to do simple queue based level order traversal. While doing inorder traversal, add a marker node at the end. 
   * Whenever we see a marker node, we increase level number. If level number is between low and high, then print nodes. 
   * */
  
  def printLevels[A](tree: BinaryTree[Int],low: Int, high: Int): Unit = {
    val queue = Queue[BinaryTree[Int]]()
    val marker:BinaryTree[Int] = Node(4,EmptyTree,EmptyTree)
    var level =1
    queue.enqueue(tree)
    queue.enqueue(marker)
    var breakLoop = false
    while(queue.size>0 && !breakLoop) {
      val temp = queue.dequeue()
      if(temp.isSameTree(marker)) {
        println("  ")
        level = level+1
        if(queue.size ==0  || level > high) {
          breakLoop=true;
        }
        queue.enqueue(marker)
      } else {
        if(level >= low) {
          print(temp.getNodeValue.get + " , ")
        } 
        temp.getLeft match {
          case Node(v,l,r) => queue.enqueue(temp.getLeft) 
          case _ =>
        }
        temp.getRight match {
          case Node(v,l,r) => queue.enqueue(temp.getRight)
          case _ =>
        }
      }
    }
  }
}