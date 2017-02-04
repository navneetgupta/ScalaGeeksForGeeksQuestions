package com.tree.binarytree

import com.tree.binarytree.MaxDepthOrHeight.maxDepthOrHeight
import scala.collection.mutable.Stack
import scala.collection.mutable.Queue

/**
 * @author: Navneet Gupta
 * @createdOn: 04-Feb-2017
 */

object ReverseLevelOrderTraversal {
  def reverseLevelOrder[A](tree:BinaryTree[A]):Unit = {
    val ht = maxDepthOrHeight(tree)
    for{
      i <- (ht to 1 by -1)
    } yield (printGivenLevel(tree,i))
  }
  
  def printGivenLevel[A](tree:BinaryTree[A],level: Int):Unit = {
    tree match {
      case EmptyTree => 
      case Node(v,l,r) if(level==1) => print(v+ " , ")
      case Node(v,l,r) if(level >1 ) => 
        printGivenLevel(l, level-1)
        printGivenLevel(r, level-1)
    }
  }
  
  def reverseLevelOrderUsingStackAndQueue[A](tree:BinaryTree[A]):Unit = {
    val stack = Stack[BinaryTree[A]]()
    val queue = Queue[BinaryTree[A]]()
    queue.enqueue(tree)
    while(queue.size>0) {
      queue.dequeue() match {
        case EmptyTree =>
        case Node(v,l,r) => {
          stack.push(Node(v,l,r))
          (l,r) match {
            case (EmptyTree,EmptyTree) =>
            case (EmptyTree,Node(v2,l2,r2)) => queue.enqueue(r)
            case (Node(v1,l1,r1),EmptyTree) => queue.enqueue(l)
            case _ => queue.enqueue(r);queue.enqueue(l);
          }
        } 
      }
    }
    while(stack.size>0) {
      stack.pop() match {
        case EmptyTree => 
        case Node(v,l,r) => print(v +" , ")
      }
    }
  }
}