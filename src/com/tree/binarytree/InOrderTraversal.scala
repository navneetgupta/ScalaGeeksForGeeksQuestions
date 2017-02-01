package com.tree.binarytree

import scala.collection.mutable.Stack

/**
 * @author: Navneet Gupta
 * @createdOn: 04-Jan-2017
 */


object InOrderTraversal {
  
  //------------------------- Recursive -------------------------------------
  def inOrderTraversalRecursive[A](tree: BinaryTree[A]) : Unit = tree match {
    case EmptyTree =>
    case Node(v,l,r) => {
      inOrderTraversalRecursive(l);
      print(v + " , ");
      inOrderTraversalRecursive(r);
    }
  }
  //--------------------------------------------------------------------------
  
  //-------------------------- Using stack -----------------------------------
  
  def inOrderTraversalUsingStack[A](tree: BinaryTree[A]) : Unit = tree match {
    case EmptyTree =>
    case Node(v,l,r) => {
      val stack = new Stack[BinaryTree[A]]()
      pushLeftBranches(tree,stack)
      while(stack.size>0) {
        stack.pop() match {
          case EmptyTree => print("Some Error emptytre should not be pushed to stack");
          case Node(v1,l1,r1) =>{
            print( v1+ " ")
            r1 match {
              case EmptyTree => 
              case Node(v2,l2,r2) => pushLeftBranches(r1, stack)
            }
          }
        }
      }
      
    }
  }
  
  def pushLeftBranches[A](tree: BinaryTree[A],stack: Stack[BinaryTree[A]]): Unit = {
    tree match {
      case Node(v,l,r) => pushLeftBranches(l, stack.push(Node(v,l,r)))
      case EmptyTree => 
    }
  }
  
  //-----------------------------------------------------------------------------
  
  //--------------------------- Without Using Stack/Recursion (Morris Traversal)---------------------
  /*
   * Morris Traversal is based on Threaded Binary Tree. In this traversal, we first create links to Inorder successor 
   * and print the data using these links, and finally revert the changes to restore original tree.
   */
  
  def inOrderMorrisTraversal[A](tree:BinaryTree[A]) : Unit = tree match {
    case EmptyTree =>
    case Node(v,l,r) =>
  }
  
  //--------------------------- Without Using Stack/Recursion (Morris Traversal)---------------------

}