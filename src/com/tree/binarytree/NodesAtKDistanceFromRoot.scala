package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 01-Feb-2017
 */


object NodesAtKDistanceFromRoot {
  /*
   * http://www.geeksforgeeks.org/print-nodes-at-k-distance-from-root/
   * */
  def getNodesAtKDistanceFromRoot(tree: BinaryTree[Int],k:Int,xs:List[Int]): List[Int] = {
    tree match {
      case EmptyTree => Nil
      case Node(v,l,r) => 
        if(k==0) (v::xs)
        else {
          getNodesAtKDistanceFromRoot(l,k-1,xs)
          getNodesAtKDistanceFromRoot(r, k-1,xs)
        }
    }
  }
  
  
  def printNodesAtKDistanceFromRoot(tree: BinaryTree[Int],k:Int): Unit = {
    tree match {
      case EmptyTree => 
      case Node(v,l,r) => 
        if(k==0) println(v + " ")
        else {
          printNodesAtKDistanceFromRoot(l,k-1)
          printNodesAtKDistanceFromRoot(r, k-1)
        }
    }
  }
}