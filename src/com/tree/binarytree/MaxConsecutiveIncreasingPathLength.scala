package com.tree.binarytree

import com.tree.binarytree.BinaryTree.maxConcurrentIncreasing

/**
 * @author: Navneet Gupta
 * @createdOn: 08-Feb-2017
 */

object MaxConsecutiveIncreasingPathLength extends App {
   /*
 		* http://www.geeksforgeeks.org/maximum-consecutive-increasing-path-length-in-binary-tree/
 		* Given a Binary Tree find the length of the longest path which comprises of nodes with consecutive values in increasing order.*/

  def maxPathLengthUtil(tree: BinaryTree[Int],prev_val:Int,prev_len:Int):Int = tree match {
    case EmptyTree => prev_len
    case Node(v,l,r) if(v == prev_val+1) =>  {
      List(maxPathLengthUtil(l,v,prev_len+1),maxPathLengthUtil(r, v, prev_len+1)).max
    }
    case Node(v,l,r) => 
      val newPathLen = List(maxPathLengthUtil(l,v,1),maxPathLengthUtil(r, v,1)).max
      List(prev_len,newPathLen).max
  }
  
  def maxConsecutiveIncresaingPathLength(tree:BinaryTree[Int]): Int = tree match {
    case EmptyTree => 0
    case Node(v,l,r) => maxPathLengthUtil(tree, v-1, 0)
  }
  
  
  maxConsecutiveIncresaingPathLength(maxConcurrentIncreasing)
}