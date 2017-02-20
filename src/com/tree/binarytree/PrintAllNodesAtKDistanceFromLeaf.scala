package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 20-Feb-2017
 */

object PrintAllNodesAtKDistanceFromLeaf {
  /*
   * http://www.geeksforgeeks.org/print-nodes-distance-k-leaf-node/
   * 
   * Given a Binary Tree and a positive integer k, print all nodes that are distance k from a leaf node.
   * Here the meaning of distance is different from previous post. Here k distance from a leaf means k levels higher than a leaf node. 
   * For example if k is more than height of Binary Tree, then nothing should be printed. Expected time complexity is O(n) where n 
   * is the number nodes in the given Binary Tree.
   * */
  
  def kDistanceFormLeafUtil[A](tree: BinaryTree[A],path: Array[A],visited:Array[Boolean],pathLen: Int, k: Int): Unit = tree match {
    case EmptyTree => 
    case Node(v,l,r) => 
      path(pathLen) = v
      visited(pathLen) = false
      val newPathLen = pathLen +1
      (l,r) match {
        case (EmptyTree,EmptyTree) if(newPathLen-k-1 >= 0 && !visited(newPathLen-k-1)) => 
          print(path(newPathLen-k-1) + " , ")
          visited(newPathLen-k-1) = true
        case _ => 
          kDistanceFormLeafUtil(l, path, visited, newPathLen, k)
          kDistanceFormLeafUtil(r, path, visited, newPathLen, k)
      }
  }
  
  def printNodesAtKDistanceFromLeaf[A](tree: BinaryTree[Int],k :Int): Unit = {
    val array:Array[Int] = new Array[Int](100)
    kDistanceFormLeafUtil(tree, array, new Array[Boolean](100), 0, k)
  }
  
}