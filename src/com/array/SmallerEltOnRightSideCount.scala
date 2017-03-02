package com.array


/**
 * @author: Navneet Gupta
 * @createdOn: 02-Mar-2017
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
      if(arr(i)<arr(j))
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
  
  
  
}

sealed trait AVLTree[+A] {
  
}
case object EmptyAvlNode extends AVLTree[Nothing]
case class AVLNode[A](value:A,left: AVLTree[A],right:AVLTree[A],heigth: Int,size:Int) extends AVLTree[A]