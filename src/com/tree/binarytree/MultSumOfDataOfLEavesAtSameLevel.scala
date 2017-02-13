package com.tree.binarytree

import scala.collection.mutable.Queue
import com.tree.binarytree.BinaryTree._

/**
 * @author: Navneet Gupta
 * @createdOn: 13-Feb-2017
 */

object MultSumOfDataOfLEavesAtSameLevel extends App {
  /*
   * http://www.geeksforgeeks.org/find-multiplication-of-sums-of-data-of-all-leaves-at-sane-levels/
   * 
   * One Simple Solution is to recursively compute leaf sum for all level starting from top to bottom. 
   * Then multiply sums of levels which have leaves. Time complexity of this solution would be O(n2).
   * An Efficient Solution is to use Queue based level order traversal. While doing the traversal, process all different levels separately. 
   * For every processed level, check if it has a leaves. If it has then compute sum of leaf nodes. Finally return product of all sums.
   * */
  
  def sumAndMultiplyLevelData(tree: BinaryTree[Int]): Int = tree match {
    case EmptyTree => 0
    case Node(v,l,r) => 
      var mul = 1
      val queue = Queue[BinaryTree[Int]]()
      queue.enqueue(tree)
      var continue =  true
      while(continue && true) {
        val nodeCount = queue.size
        if(nodeCount==0)
          continue=false
        else {
          val xs: IndexedSeq[(Int,Boolean)] = for{
            i <- (nodeCount to 1 by -1)
          } yield {
            queue.dequeue() match {
              case EmptyTree => (0,false)
              case Node(v,l,r) => {
                (l,r) match {
                  case (EmptyTree,EmptyTree) => (v, true)
                  case (Node(v1,l1,r1),EmptyTree) => queue.enqueue(l);(0,false)
                  case (EmptyTree,Node(v2,l2,r2)) => queue.enqueue(r);(0,false)
                  case (Node(v1,l1,r1),Node(v2,l2,r2)) => queue.enqueue(l);queue.enqueue(r);(0,false)
                }
              }
            }
          }
          val res = xs.foldLeft((0,false))((a,b) => ((a._1 + b._1),(a._2||b._2)))
          if(res._2) {
            mul = mul * res._1
          }
        }
      }
      mul
  }
  
  sumAndMultiplyLevelData(binarySearchTree) 
}