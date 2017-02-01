package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 05-Jan-2017
 */

object DiameterOfTree {
  def diameterOfTree[A](tree: BinaryTree[A]):Int = tree match {
    case EmptyTree => 0
    case Node(v,l,r) => {
      val lh = MaxDepthOrHeight.maxDepthOrHeight(l)
      val rh = MaxDepthOrHeight.maxDepthOrHeight(r)
      val lDiameter = diameterOfTree(l)
      val rDiameter = diameterOfTree(r)
      List(lh+rh+1,lDiameter,rDiameter).max
    }
  }
  
  def diameterOfTreeViaFold[A](tree: BinaryTree[A]):Int = ???
  
  def diameterOfTreeOptimised[A](tree: BinaryTree[A],height:Int): (Int,Int) = tree match {
    case EmptyTree => (0,0)
    case Node(v,l,r) => {
      val lDia = diameterOfTreeOptimised(l,0)
      val rDia = diameterOfTreeOptimised(r, 0)
      val ht = Math.max(lDia._2, rDia._2) + 1 //ht need to be passed to the recursive calll
      (List(lDia._2+rDia._2+1,lDia._1,rDia._1).max,ht)
    }
  }
  
  def diameterOfTreeOptimised2[A](tree: BinaryTree[A]): (Int,Int) = tree match {
    case EmptyTree => (0,0)
    case Node(v,l,r) => {
      val lDia = diameterOfTreeOptimised2(l)
      val rDia = diameterOfTreeOptimised2(r)
      val ht = Math.max(lDia._2, rDia._2) + 1
      (List(lDia._2+rDia._2+1,lDia._1,rDia._1).max,ht)
    }
  }
}