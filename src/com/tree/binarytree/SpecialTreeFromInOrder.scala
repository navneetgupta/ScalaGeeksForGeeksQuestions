package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 04-Feb-2017
 */

object SpecialTreeFromInOrder {
  /*
   * Given Inorder Traversal of a Special Binary Tree in which key of every node is greater than keys in left and right children, 
   * construct the Binary Tree and return root
   * 
   * The idea used in Construction of Tree from given Inorder and Preorder traversals can be used here. 
   * Let the given array is {1, 5, 10, 40, 30, 15, 28, 20}. The maximum element in given array must be root. 
   * The elements on left side of the maximum element are in left subtree and elements on right side are in right subtree.
   * We recursively follow above step for left and right subtrees, and finally get the following tree
   */
  
  def buildTree(inOrder: Array[Int],start: Int,end:Int):BinaryTree[Int] = {
    if(start > end) EmptyTree
    else {
      val i = getMax(inOrder,start,end)
      if(start == end) Node(inOrder(i),EmptyTree,EmptyTree)
      else {
        val lt = buildTree(inOrder, start, i-1)
        val rt = buildTree(inOrder, i+1, end)
        Node(inOrder(i),lt,rt)
      }
    }
  }
  
  def getMax(inOrder: Array[Int],start: Int,end:Int) : Int = {
    var maxInd = start
    for {
      k <- (start+1 to end)
      if(inOrder(maxInd) < inOrder(k))
    } yield (maxInd = k)
    println("start = "+ start+ " end "+ end + " max " +inOrder(maxInd))
    maxInd
  }
  
}