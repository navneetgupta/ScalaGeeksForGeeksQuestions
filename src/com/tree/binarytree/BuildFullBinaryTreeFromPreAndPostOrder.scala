package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 03-Feb-2017
 */

case class PIndex2(var index:Int)

object BuildFullBinaryTreeFromPreAndPostOrder {
  /*A Full Binary Tree is a binary tree where every node has either 0 or 2 children
   * 
   * It is not possible to construct a general Binary Tree from preorder and postorder traversals (See this). 
   * But if know that the Binary Tree is Full, we can construct the tree without ambiguity. Let us understand this with the 
   * help of following example.
   * */
  
  def constructUtil[A](preOrder:Array[A],postOrder: Array[A],pIndex:PIndex2, l: Int,h: Int, size: Int):BinaryTree[A] =  {
     if(pIndex.index >= size || l > h) EmptyTree
     else {
       val indx = pIndex.index
       pIndex.index = indx +1;
       if(l == h || pIndex.index>=size) Node(preOrder(indx),EmptyTree,EmptyTree)
       else {
         val i = search(postOrder,l,h,preOrder(pIndex.index))
         if(i<=h) {
           val lt = constructUtil(preOrder,postOrder,pIndex,l,i,size)
           val rt = constructUtil(preOrder,postOrder,pIndex,i+1,h,size)
           Node(preOrder(indx),lt,rt)
         } else 
           Node(preOrder(indx),EmptyTree,EmptyTree)
       }
     }
  }
  
  def search[A](postOrder: Array[A],inStart: Int,inEnd: Int,data :A) : Int = {
     val a = for{
        i <- (inStart to inEnd) 
        if(postOrder(i).equals(data))
      } yield(i)
      if(a.isEmpty) inEnd+1 else a.head
   }
  
  def buildFullBinaryTreeFromPreAndPostOrder[A](preOrder: Array[A],postOrder:Array[A],size:Int) :BinaryTree[A] = {
    constructUtil(preOrder, postOrder, PIndex2(0), 0, size-1, size)
  }
  
}