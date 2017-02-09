package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 09-Feb-2017
 */

object LongestConsecutiveSequence {
  /* Given a Binary Tree find the length of the longest path which comprises of nodes with consecutive values in increasing order. 
   * Every node is considered as a path of length 1.
   * We can solve above problem recursively. At each node we need information of its parent node, if current node has value one 
   * more than its parent node then it makes a consecutive path, at each node we will compare node’s value with its parent value 
   * and update the longest consecutive path accordingly.
   */
  
  def longestConsecutiveUtil(tree: BinaryTree[Int],curr_len:Int,expeceted:Int,res:Int):Int = tree match {
    case EmptyTree => res
    case Node(v,l,r) => {
      var current = 1
      if(v == expeceted)
        current = curr_len+1
        
      val res1 = List(res,current).max
      val lt = longestConsecutiveUtil(l,current,v+1,res1)
      longestConsecutiveUtil(r, current, v+1, lt)
    }
  }
  
  def longestConsecutive(tree: BinaryTree[Int]) :Int = tree match {
    case EmptyTree => 0
    case Node(v,l,r) => longestConsecutiveUtil(tree, 0, v, 0)
  }
}