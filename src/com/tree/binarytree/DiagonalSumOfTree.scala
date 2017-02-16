package com.tree.binarytree

import scala.collection.mutable.Queue

/**
 * @author: Navneet Gupta
 * @createdOn: 16-Feb-2017
 */

object DiagonalSumOfTree {
  /*
   * http://www.geeksforgeeks.org/diagonal-sum-binary-tree/
   * 
   * Consider lines of slope -1 passing between nodes (dotted lines in below diagram). Diagonal sum in a binary tree is sum of 
   * all node’s data lying between these lines. Given a Binary Tree, print all diagonal sums.
   * 
   * The idea is to keep track of vertical distance from top diagonal passing through root. We increment the vertical distance we go down to next diagonal.
   *   1. Add root with vertical distance as 0 to the queue.
   *   2. Process the sum of all right child and right of right child and so on.
   *   3. Add left child current node into the queue for later processing. The vertical distance of left child is vertical distance of current node plus 1.
   *   4. Keep doing 2nd, 3rd and 4th step till the queue is empty.
   * */
  
  def diagonalSum(tree:BinaryTree[Int]): Map[Int,Int] = {
    val queue = Queue[(BinaryTree[Int],Int)]()
    var map : Map[Int,Int] = Map.empty
    queue.enqueue((tree,0))
    while(queue.size>0) {
      val node  = queue.dequeue();
      val vd = node._2
      
      def processQueueNode(tree1: BinaryTree[Int],map1: Map[Int,Int]): Map[Int,Int] = {
        tree1 match {
          case EmptyTree => map1
          case Node(v,l,r) => 
            val prev_sum = map1.getOrElse(vd, 0)
            val updated_map = map1 + (vd -> (prev_sum+v))
            if(!l.isEmptyTree) {
              queue.enqueue((l,vd+1))
            }
            processQueueNode(r,updated_map)
        }
      }
      map = processQueueNode(node._1,map)
    }
    map
  }
  
  def diagonalSum2(tree:BinaryTree[Int]): Map[Int,Int] = {
    val queue = Queue[(BinaryTree[Int],Int)]()
    queue.enqueue((tree,0))
    processQueue(queue, Map.empty)
  }
  
  def processQueue(queue:Queue[(BinaryTree[Int],Int)],map: Map[Int,Int]) : Map[Int,Int] = {
    if(queue.size>0) {
      val node  = queue.dequeue();
      val vd = node._2
      
      def processQueueNode(tree1: BinaryTree[Int],map1: Map[Int,Int]): Map[Int,Int] = {
        tree1 match {
          case EmptyTree => map1
          case Node(v,l,r) => 
            val prev_sum = map1.getOrElse(vd, 0)
            val updated_map = map1 + (vd -> (prev_sum+v))
            if(!l.isEmptyTree) {
              queue.enqueue((l,vd+1))
            }
            processQueueNode(r,updated_map)
        }
      }
      val map1 = processQueueNode(node._1,map)
      processQueue(queue,map1)
    } else {
      map
    }
  }
  
  
}