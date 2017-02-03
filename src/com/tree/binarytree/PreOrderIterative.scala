package com.tree.binarytree

import scala.collection.mutable.Stack

/**
 * @author: Navneet Gupta
 * @createdOn: 03-Feb-2017
 */
object PreOrderIterative {
  /*
   * 1) Create an empty stack nodeStack and push root node to stack.
		 2) Do following while nodeStack is not empty.
		    ….a) Pop an item from stack and print it.
        ….b) Push right child of popped item to stack
        ….c) Push left child of popped item to stack

				Right child is pushed before left child to make sure that left subtree is processed first.
	*/
  
  def preOrderIterative[A](tree: BinaryTree[A]):Unit = tree match {
    case EmptyTree => 
    case Node(v,l,r) => {
      val stack1 = new Stack[BinaryTree[A]]()
      stack1.push(tree)
      while(stack1.size>0) {
        stack1.pop() match {
          case EmptyTree =>
          case Node(v1,l1,r1) => {
            print(v1 + " , ")
            (l1,r1) match {
              case (EmptyTree,EmptyTree) =>
              case (EmptyTree,Node(v2,l2,r2)) => stack1.push(r1)
              case (Node(v2,l2,r2),EmptyTree) => stack1.push(l1)
              case _ => stack1.push(r1);stack1.push(l1);
            }
          }
        }
      } 
    }  
  }
}