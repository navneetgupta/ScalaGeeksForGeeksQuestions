package com.tree.binarytree

import com.tree.binarytree.BinaryTree._

/**
 * @author: Navneet Gupta
 * @createdOn: 03-Feb-2017
 */

object BoundaryTraversal extends App{
  /*Given a binary tree, print boundary nodes of the binary tree Anti-Clockwise starting from the root. 
   * For example, boundary traversal of the following tree is “20 8 4 10 14 25 22”
   *   We break the problem in 3 parts:
   *   1. Print the left boundary in top-down manner.
   *   2. Print all leaf nodes from left to right, which can again be sub-divided into two sub-parts:
   *   …..2.1 Print all leaf nodes of left sub-tree from left to right.
   *   …..2.2 Print all leaf nodes of right subtree from left to right.
   *   3. Print the right boundary in bottom-up manner.
   * */
 
  def printLeaves[A](tree: BinaryTree[A]):Unit = {
    tree match {
      case EmptyTree => 
      case Node(v,l,r) =>
        printLeaves(l)
        (l,r) match {
          case (EmptyTree,EmptyTree) => print(v + " , ")
          case _ =>printLeaves(r)
        }
    }
  }
  
  def printBoundaryLeft[A](tree: BinaryTree[A]):Unit = tree match {
    case EmptyTree =>
    case Node(v,l,r) => (l,r) match {
      case (EmptyTree,EmptyTree) => 
      case (Node(v1,l1,r1),_) => 
        print(v + " , ");printBoundaryLeft(l);
      case (EmptyTree,Node(v2,l2,r2)) =>
        print(v + " , ");printBoundaryLeft(r);
    }
  }
  
  def printBoundaryRight[A](tree: BinaryTree[A]):Unit = tree match {
    case EmptyTree =>
    case Node(v,l,r) => (l,r) match {
      case (EmptyTree,EmptyTree) => 
      case (_,Node(v2,l2,r2)) => 
        printBoundaryRight(r);print(v + " , ");
      case (Node(v2,l2,r2),EmptyTree) =>
        printBoundaryRight(l);print(v + " , ");
    }
  }
  
  def boundaryTraversal[A](tree: BinaryTree[A]):Unit = tree match {
    case EmptyTree => 
    case Node(v,l,r) => 
      print(v + " , ")
      printBoundaryLeft(l)
      printLeaves(l)
      printLeaves(r)
      printBoundaryRight(r)
  }
  
  boundaryTraversal(tree1)
}