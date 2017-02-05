package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 05-Feb-2017
 */

import com.tree.binarytree.BinaryTree._

object DiagonalTraversal extends App {
  def diaGonalPrintUtil[A](tree:BinaryTree[A],map: Map[Int,List[A]],d:Int): Map[Int,List[A]] = tree match{
    case EmptyTree => map
    case Node(v,l,r) => 
      val newMap = map + (d -> (v::(map.getOrElse(d, Nil))))
      diaGonalPrintUtil(r, diaGonalPrintUtil(l, newMap, d+1), d)
  }
  def diaGonalPrint[A](tree:BinaryTree[A]): Unit = {
    val map = diaGonalPrintUtil(tree, Map.empty, 0)
    map.foreach(x => println(x._2))
  }
}