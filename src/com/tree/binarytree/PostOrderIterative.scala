package com.tree.binarytree

import scala.collection.mutable.Stack

/**
 * @author: Navneet Gupta
 * @createdOn: 03-Feb-2017
 */
//Test in PostOrderTest.sc

object PostOrderIterative {
  //---------------------------------- Using two stack---------------------------------------
  /*
   *  more complex than the other two traversals (due to its nature of non-tail recursion, there is an extra statement 
   *  after the final recursive call to itself)
   *  1. Push root to first stack.
			2. Loop while first stack is not empty
   			2.1 Pop a node from first stack and push it to second stack
   			2.2 Push left and right children of the popped node to first stack
			3. Print contents of second stack
	 */
  
  def postOrderIterativeUsing2Stk[A](tree: BinaryTree[A]):Unit = tree match {
    case EmptyTree => 
    case Node(v,l,r) => {
      val stack1 = new Stack[BinaryTree[A]]()
      val stack2 = new Stack[BinaryTree[A]]()
      stack1.push(tree)
      while(stack1.size>0) {
        stack1.pop() match {
          case EmptyTree =>
          case Node(v1,l1,r1) => {
            stack2.push(Node(v1,l1,r1))
            (l1,r1) match {
              case (EmptyTree,EmptyTree) =>
              case (Node(v2,l2,r2),EmptyTree) => stack1.push(l1)
              case (EmptyTree,Node(v2,l2,r2)) => stack1.push(r1)
              case _ => stack1.push(l1);stack1.push(r1);
            }
          }
        }
      }
      while(stack2.size>0) {
        stack2.pop() match {
          case EmptyTree =>
          case Node(v,l,r) => print(v + " , ")
        }
      }
    }
  }

  
  //---------------------------------- Using one stack---------------------------------------
  /*
   * 1.1 Create an empty stack
		 2.1 Do following while root is not NULL
   		 a) Push root's right child and then root to stack.
    	 b) Set root as root's left child.
		 2.2 Pop an item from stack and set it as root.
    	 a) If the popped item has a right child and the right child 
       		is at top of stack, then remove the right child from stack,
       		push the root back and set root as root's right child.
    	 b) Else print root's data and set root as NULL.
		 2.3 Repeat steps 2.1 and 2.2 while stack is not empty.
		
		* */
  
  def postOrderTraversalUsing1Stk[A](tree: BinaryTree[A]): Unit = tree match {
    case EmptyTree => 
    case Node(v,l,r) => {
      val stack1 = new Stack[BinaryTree[A]]()
      stack1.push(tree)
      while(stack1.size>0) {
        stack1.pop() match {
          case EmptyTree => 
          case Node(v1,l1,r1) => 
        }
      }

    }
  }

}