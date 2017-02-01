package com.tree.binarytree
import com.tree.binarytree.PreOrderTraversal.preOrderTraversalRecursive

/**
 * @author: Navneet Gupta
 * @createdOn: 07-Jan-2017
 */


object BuildTreeFromInAndPreOrder {
  def buildTree[A](inOrder: Array[A],preOrder: Array[A], inStrt:Int,inEnd:Int,preIndex:Int): (BinaryTree[A],Int) =  {
    if(inStrt>inEnd) return (EmptyTree,preIndex);
    val data = preOrder(preIndex);
    if(inStrt == inEnd) {
      (Node(data,EmptyTree,EmptyTree),preIndex+1)
    } else {
      val inIndex = search(inOrder,inStrt,inEnd,data)
      val left = buildTree(inOrder,preOrder,inStrt,inIndex-1, preIndex+1)
      val right = buildTree(inOrder,preOrder,inIndex+1,inEnd, left._2)
      (Node(data,left._1,right._1),right._2)
    }
  }
  
  //Will fail in certian case if node data are same,
  def search[A](inOrder: Array[A],inStrt:Int,inEnd:Int,data:A):Int = {
    val a = for{
      i <- (inStrt to inEnd) 
      if(inOrder(i).equals(data))
    } yield(i)
    
    if(a.isEmpty) inEnd+1 else a.head
  }
  
}