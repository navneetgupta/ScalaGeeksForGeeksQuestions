package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 07-Jan-2017
 */


object MaxWidth {
  
  //-----------------------------Method 1 with mutable Varriable Start--------------------------
  def maxWidth1[A](tree: BinaryTree[A]): Int = {
    var maxWidth = 0
     val ht:Int = MaxDepthOrHeight.maxDepthOrHeight(tree)
     for {
       i <- (1 to ht)
     } yield {
       val lWidth:Int = levelWidth(tree,i)
       if(maxWidth< lWidth) maxWidth=lWidth
     }
     return maxWidth;
  }
  
  //-----------------------------Method 1 with mutable Varriable End--------------------------
  
  //-----------------------------Method 1 without mutable Varriable Start--------------------------
  
  def maxWidth2[A](tree: BinaryTree[A]): Int = {
     val ht:Int = MaxDepthOrHeight.maxDepthOrHeight(tree)
     val a = for {
       i <- (1 to ht)
     } yield {
       levelWidth(tree,i)
     }
     return if(!a.isEmpty)a.max else 0
  }
  
  //-----------------------------Method 1 without mutable Varriable End--------------------------
  
  //-----------------------------Method 1 common Util--------------------------
  
  def levelWidth[A](tree: BinaryTree[A],level: Int): Int = {
    tree match {
      case EmptyTree => 0
      case Node(v,l,r) if(level==1)  => 1
      case Node(v1,l1,r1) if(level>1) => levelWidth(l1,level-1)+levelWidth(r1,level-1)
      case _ => 0
    }
  }
  //-----------------------------Method 1 common Util--------------------------
  
  //-----------------------------Method 2 Start --------------------------
  def maxWidthViaPreOrder[A](tree: BinaryTree[A]):Int = {
    val count = new Array[Int](MaxDepthOrHeight.maxDepthOrHeight(tree))
    val level = 0
    maxWidthRecursivePreOrder(tree,count,level)
    if(!count.isEmpty)count.max else 0
  }
  
  def maxWidthRecursivePreOrder[A](tree: BinaryTree[A],count: Array[Int],level: Int) {
    tree match {
      case EmptyTree => 
      case Node(v,l,r) => {
        count(level)  = count(level)+1
        maxWidthRecursivePreOrder(l,count,level+1)
        maxWidthRecursivePreOrder(r,count,level+1)
      }
    }
  }
   
  //-----------------------------Method 2 end ----------------------------
  


}