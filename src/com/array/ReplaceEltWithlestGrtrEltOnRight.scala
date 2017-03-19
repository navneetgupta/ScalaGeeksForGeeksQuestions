package com.array

import com.tree.binarytree.{Node,EmptyTree,BinaryTree}

/**
 * @author: Navneet Gupta
 * @createdOn: 18-Mar-2017
 */

object ReplaceEltWithlestGrtrEltOnRight {
  /*
   * http://www.geeksforgeeks.org/replace-every-element-with-the-least-greater-element-on-its-right/ 
   * */
  
  /*
   * A naive method is to run two loops. The outer loop will one by one pick array elements from left to right. 
   * The inner loop will find the smallest element greater than the picked element on its right side. Finally the outer 
   * loop will replace the picked element with the element found by inner loop. The time complexity of this method will be O(n2).
   * A tricky solution would be to use Binary Search Trees. We start scanning the array from right to left and insert each
   * element into the BST. For each inserted element, we replace it in the array by its inorder successor in BST. 
   * If the element inserted is the maximum so far (i.e. its inorder successor doesn’t exists), we replace it by -1.
   */
  
  def insert[A:Ordering](tree: BinaryTree[A],data: A,succ:Option[A]): (BinaryTree[A],Option[A]) = {
    val ord = implicitly[Ordering[A]]
    tree match {
      case EmptyTree => 
        (Node(data,EmptyTree,EmptyTree),succ)
      case Node(v,l,r) =>
        if(ord.lt(data, v)) {
          val lt = insert(l,data,Some(v))
          (Node(v,lt._1,r),lt._2)
        } else if(ord.gt(data,v)) {
          val rt = insert(r, data, succ)
          (Node(v,l,rt._1),rt._2)
        }
        else (tree,succ)
    }
  }
  
  def replace(arr: Array[Int]): Array[Int] = {
    val n = arr.length
    arr.foldRight((EmptyTree:BinaryTree[Int],n-1))((b,a) => {
      val (newTree,succ) = insert(a._1,b,None)
      succ match {
        case None => arr(a._2) = -1
        case Some(v) => arr(a._2) = v
      }
      (newTree,a._2-1)
    })
    arr
  }
}