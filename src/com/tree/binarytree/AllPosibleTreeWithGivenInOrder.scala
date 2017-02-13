package com.tree.binarytree

import scala.collection.immutable.Vector

/**
 * @author: Navneet Gupta
 * @createdOn: 13-Feb-2017
 */


object AllPosibleTreeWithGivenInOrder extends App {
  /*
   * http://www.geeksforgeeks.org/find-all-possible-trees-with-given-inorder-traversal/
   * 
   * Let given inorder traversal be in[]. In the given traversal, all nodes in left subtree of in[i] must appear before 
   * it and in right subtree must appear after it. So when we consider in[i] as root, all elements from in[0] to in[i-1] 
   * will be in left subtree and in[i+1] to n-1 will be in right subtree. If in[0] to in[i-1] can form x different trees 
   * and in[i+1] to in[n-1] can from y different trees then we will have x*y total trees when in[i] as root. So we simply 
   * iterate from 0 to n-1 for root. For every node in[i], recursively find different left and right subtrees. 
   * If we take a closer look, we can notice that the count is basically n’th Catalan number. 
   * */
  
  def getAllPosibleTrees[A](inOrder: Array[A],start:Int,end:Int):List[BinaryTree[A]]  = {
    if(start > end) List(EmptyTree)
    else {
      val xs = for {
        i <- List.range(start , end+1)
      } yield {
        //println(" i  " + i)
        val lTrees = getAllPosibleTrees(inOrder, start, i-1).toArray
        val rTrees = getAllPosibleTrees(inOrder, i+1, end).toArray
       // println("lTrees   " + lTrees + "   length = " +lTrees.length)
        //println("rTrees   " + rTrees + "   length = " +rTrees.length)
        for {
          j <- (0 to lTrees.length-1)
          k <- (0 to rTrees.length-1)
        } yield {
          //println(" j  " + j+ "    k    "+ k )
          Node(inOrder(i),lTrees(j),rTrees(k))
        }
      }
      val a = (xs.flatMap(x => x))
      a
    }
  }
  
//   def getAllPosibleTrees[A](inOrder: Array[A],start:Int,end:Int):List[BinaryTree[A]]  = {
//    if(start > end) Nil
//    else {
//      val xs = for {
//        i <- List.range(start , end)
//      } yield {
//        println(" i  " + i)
//        val lTrees = getAllPosibleTrees(inOrder, start, i-1).toArray
//        val rTrees = getAllPosibleTrees(inOrder, i+1, end).toArray
//        println("lTrees   " + lTrees + "   length = " +lTrees.length)
//        println("rTrees   " + rTrees + "   length = " +rTrees.length)
//        for {
//          j <- (0 to lTrees.length-1)
//          k <- (0 to rTrees.length-1)
//        } yield {
//          println(" j  " + j+ "    k    "+ k )
//          Node(inOrder(i),lTrees(j),rTrees(k))
//        }
//      }
//      val a = (xs.flatMap(x => x))
//      a
//    }
//  }
  
//   def getAllPosibleTrees[A](inOrder: Array[A],start:Int,end:Int,trees:List[BinaryTree[A]]):List[BinaryTree[A]]  = {
//    val 
//    if(start > end) trees
//    else {
//      val xs = for {
//        i <- List.range(start , end)
//      } yield {
//        println(" i  " + i)
//        val lTrees = getAllPosibleTrees(inOrder, start, i-1,trees).toArray
//        val rTrees = getAllPosibleTrees(inOrder, i+1, end,trees).toArray
//        println("lTrees   " + lTrees + "   length = " +lTrees.length)
//        println("rTrees   " + rTrees + "   length = " +rTrees.length)
//        for {
//          j <- (0 to lTrees.length-1)
//          k <- (0 to rTrees.length-1)
//        } yield {
//          println(" j  " + j+ "    k    "+ k )
//          Node(inOrder(i),lTrees(j),rTrees(k))
//        }
//      }
//      val a = (xs.flatMap(x => x))
//      a
//    }
//  }
  
  val a = getAllPosibleTrees(Array(4,5,7), 0, 2)
  println(a)
}