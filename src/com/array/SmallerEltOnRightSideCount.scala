package com.array

import com.tree.AVLTree.AVLNode
import com.tree.AVLTree.EmptyAvlNode
import com.tree.AVLTree.AVLTree
import com.tree.AVLTree.AVLTree._


/**
 * @author: Navneet Gupta
 * @createdOn: 03-Mar-2017
 */

object SmallerEltOnRightSideCount {
  /*
   * http://www.geeksforgeeks.org/count-smaller-elements-on-right-side/
   * function to count number of smaller elements on right of each element in an array. 
   * 
   * */
  
  /*
   * Method 1 (Simple)
   * Use two loops. The outer loop picks all elements from left to right. The inner loop iterates through all the elements on 
   * right side of the picked element and updates countSmaller[].
   */
  
  def constructSmallerEltCount(arr:Array[Int]): Array[Int] = {
    val n = arr.length
    val smallerEltArray = Array.fill(n){0}
    for {
      i <- (0 to n-1)
      j <- (i+1 to n-1)
    } yield {
      if(arr(j)<arr(i))
        smallerEltArray(i) = smallerEltArray(i)+1
    }
    smallerEltArray
  }
  
  /*
   * Method2 : 
   * Method 2 (Use Self Balancing BST)
   * A Self Balancing Binary Search Tree (AVL, Red Black,.. etc) can be used to get the solution in O(nLogn) time complexity. 
   * We can augment these trees so that every node N contains size the subtree rooted with N. 
   * We have used AVL tree in the following implementation.
   * 
   * We traverse the array from right to left and insert all elements one by one in an AVL tree. 
   * While inserting a new key in an AVL tree, we first compare the key with root. If key is greater than root, 
   * then it is greater than all the nodes in left subtree of root. So we add the size of left subtree to the count 
   * of smaller element for the key being inserted. We recursively follow the same approach for all nodes down the root.
   */
  
  def insert[A:Ordering](tree: AVLTree[A], a: A,count:Int): (AVLTree[A],Int) = tree match {
    case EmptyAvlNode => (node(a),count)
    case AVLNode(v,l,r,h,s) => 
      val order = implicitly[Ordering[A]]
      val (newNode,newCount) = if(order.lt(a, v)) {
        val lt = insert(l,a,count)
        val ht = List(lt._1.getHeight,r.getHeight).max +1
        val sz = lt._1.getSize + r.getSize + 1
        (AVLNode(v,lt._1,r,ht,sz),lt._2)
      } else {
        val rt = insert(r,a,count)
        val ht = List(l.getHeight,rt._1.getHeight).max + 1
        val sz = l.getSize + rt._1.getSize + 1
        val newC = rt._2 + l.getSize +1
        (AVLNode(v,l,rt._1,ht,sz),newC)
      }
      
      val balance = getBalance(newNode)
      val nodeLeft:AVLNode[A] = newNode.getLeft.asInstanceOf[AVLNode[A]]
      val rightNode:AVLNode[A] = newNode.getRight.asInstanceOf[AVLNode[A]]
      
      (if(balance > 1 && order.lt(a,nodeLeft.value)) {
        //Left Left Case
        rightRotate(newNode)
      } else if(balance < -1 && order.gt(a,rightNode.value)) {
        //Right Right case
        leftRotate(newNode)
      } else if(balance > 1 && order.gt(a,nodeLeft.value)) {
        //Left Right case
        val newNode1 = AVLNode(newNode.value,leftRotate(newNode.left),newNode.right,newNode.heigth,newNode.size)
        rightRotate(newNode1)
      } else if( balance < -1 && order.lt(a,rightNode.value)) {
        //Right Left Case
        val newNode1 = AVLNode(newNode.value,newNode.left,rightRotate(newNode.right),newNode.heigth,newNode.size)
        leftRotate(newNode1)
      } else {
        newNode
      },newCount)
  }
  
  def constructLowerArray[A:Ordering](arr: Array[A]):Array[Int] = {
    val n = arr.length
    val countArray = Array.fill(n){0}
    processArray(EmptyAvlNode, countArray, arr, n-1)
  }
  
  def processArray[A:Ordering](tree: AVLTree[A],countArray:Array[Int],arr:Array[A],idx:Int):Array[Int] = {
    if(idx >= 0) {
      val order = implicitly[Ordering[A]]
      val as = insert[A](tree,arr(idx),0)
      countArray(idx) = as._2
      processArray(as._1,countArray,arr,idx-1)
    } else {
      countArray
    }
  }
  
}