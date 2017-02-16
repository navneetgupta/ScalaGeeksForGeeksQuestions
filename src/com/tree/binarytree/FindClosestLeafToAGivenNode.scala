package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 16-Feb-2017
 */

object FindClosestLeafToAGivenNode {
  /*
   * http://www.geeksforgeeks.org/find-closest-leaf-binary-tree/
   * 
   * The main point to note here is that a closest key can either be a descendent of given key or can be reached through one of the ancestors.
	 * The idea is to traverse the given tree in preorder and keep track of ancestors in an array. When we reach the given key, we evaluate distance
	 * of the closest leaf in subtree rooted with given key. We also traverse all ancestors one by one and find distance of the closest leaf in the 
	 * subtree rooted with ancestor. We compare all distances and return minimum.
   * */
  
  def closestLeafToANodeUtil[A](tree: BinaryTree[A],key: A,ancestors: Array[BinaryTree[A]],index: Int) : Int = tree match {
    case EmptyTree => Int.MaxValue
    case Node(v,l,r) if(v == key) => {
      var res = closestDown(tree)
      for {
        i <- (index-1 to 0 by -1)
      } yield {
        res = List(res,index-i+closestDown(ancestors(i))).min
      }
      res
    } 
    case Node(v,l,r) => 
      ancestors(index) = tree
      List(closestLeafToANodeUtil(l, key, ancestors, index+1),closestLeafToANodeUtil(r, key, ancestors, index+1)).min
  }
  
//  def closestLeafToANodeUtil[A](tree: BinaryTree[A],key: A,ancestors: Array[BinaryTree[A]],index: Int) : (Array[BinaryTree[A]],Int) = tree match {
//    case EmptyTree => (ancestors,Int.MaxValue)
//    case Node(v,l,r) if(v == key) => {
//      var res = closestDown(tree)
//      for {
//        i <- (index-1 to 0 by -1)
//      } yield {
//        res = List(res,index-i+closestDown(ancestors(i))).min
//      }
//      (ancestors,res)
//    } 
//    case Node(v,l,r) => 
//  }
//    
  def closestDown[A](tree: BinaryTree[A]):Int = tree match {
    case EmptyTree => Int.MaxValue
    case Node(v,EmptyTree,EmptyTree) => 0
    case Node(v,l,r) => 1 + List(closestDown(l),closestDown(r)).min
  }
  
  def findClosest[A](tree:BinaryTree[A],key:A): Int = {
    val array : Array[BinaryTree[A]] = new Array[BinaryTree[A]](100)
    
    closestLeafToANodeUtil(tree, key, array, 0)
  }
}