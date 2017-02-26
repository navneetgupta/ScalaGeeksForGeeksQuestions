package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 04-Feb-2017
 */

import com.tree.binarytree.BinaryTree._

object MaxSumRootToLeafPath extends App {
  
  /*
   * http://www.geeksforgeeks.org/find-the-maximum-sum-path-in-a-binary-tree/
   * */
  
  var at:BinaryTree[Int] = EmptyTree
  
   def printPath[A](tree: BinaryTree[A],target_tree: BinaryTree[A]):Boolean = {
     tree match {
       case Node(v,l,r) if((tree == target_tree) || printPath(l, target_tree) || printPath(r, target_tree)) => 
         print(v + " , ")
         true
       case _ => false
     }
   }
   
   def getTargetLeaf(tree: BinaryTree[Int],pIndex: PIndex,current_sum : Int): Unit= tree match {
     case EmptyTree => 
     case Node(v,l,r) => 
       val nowSum = current_sum + v
       val a = pIndex.index
       //println("v " + v +" current_sum = "+ current_sum + " now_sum  " + nowSum + " max_sum " + a)
       (l,r) match {
         case (EmptyTree,EmptyTree) if(nowSum > a) =>
           pIndex.index = nowSum
           at = tree
          
         case _ => 
       }
       getTargetLeaf(l, pIndex, nowSum)
       getTargetLeaf(r, pIndex, nowSum)
   } 
   
   def getMaxSumPath(tree: BinaryTree[Int]): Int  = tree match {
     case EmptyTree => 0
     case _ => 
       val pIndex = PIndex(Integer.MIN_VALUE)
       getTargetLeaf(tree, pIndex, 0)
       
       printPath(tree, at)
       pIndex.index
   }
   
  getMaxSumPath(tree1)
}