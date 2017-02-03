package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 03-Feb-2017
 */

case class PIndex(var index:Int)

object BuildTreeFromPostAndInOrder {
   def buildUtil[A](inOrder: Array[A],postOrder:Array[A],inStart: Int,inEnd: Int, pIndex: PIndex): BinaryTree[A] =  {
     if(inStart> inEnd) EmptyTree
     else {
       val indx = pIndex.index
       pIndex.index = indx -1;
       if(inStart == inEnd) Node(postOrder(indx),EmptyTree,EmptyTree)
       else {
         val inIndex = search(inOrder,inStart,inEnd,postOrder(indx))
         val r = buildUtil(inOrder,postOrder,inIndex+1,inEnd,pIndex)
         val l = buildUtil(inOrder, postOrder, inStart, inIndex-1, pIndex)
         Node(postOrder(indx),l,r)
       }
     }
   }
   
   def search[A](inOrder: Array[A],inStart: Int,inEnd: Int,data :A) : Int = {
     val a = for{
        i <- (inStart to inEnd) 
        if(inOrder(i).equals(data))
      } yield(i)
      if(a.isEmpty) inEnd+1 else a.head
   }
   
   def buildTree[A](inOrder: Array[A],postOrder:Array[A],data: Int):BinaryTree[A] = {
     buildUtil(inOrder,postOrder,0,data-1,PIndex(data-1))
   }
}