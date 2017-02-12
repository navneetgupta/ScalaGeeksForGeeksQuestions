package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 12-Feb-2017
 */

import scala.collection.mutable.Queue

/*
 * http://www.geeksforgeeks.org/print-leftmost-and-rightmost-nodes-of-a-binary-tree/
 * 
 * Print the corner nodes at each level. The node at the leftmost and the node at the rightmost
 * he idea is to use Level Order Traversal. To find first node, we use a variable isFirst.
 * To separate levels, we enqueue NULL after every level. So in level order traversal, if we see a NULL, 
 * we know next node would be first node of its level and therefore we set isFirst.
 * */
object PrintLeftMostRightMostNodes {
  
  def getCornerNodes[A](tree:BinaryTree[A]):Unit = tree match {
    case EmptyTree => 
    case Node(v,l,r) => {
      val queue = Queue[BinaryTree[A]]()
      queue.enqueue(tree)
      queue.enqueue(EmptyTree)
      var isFirst = false
      var isOne = false
      var last:List[A] = Nil
      while(queue.size>0) {
        queue.dequeue() match {
          case EmptyTree => {
            if(queue.size>=1)
              queue.enqueue(EmptyTree)
            isFirst = true
            if(!isOne) print(last.head + " , ")
          }
          case Node(v1,l1,r1) => {
            if(isFirst) {
              print(v1 + " , ")
              (l1,r1) match {
                case (EmptyTree,EmptyTree) =>
                case (Node(v11,l11,r11),EmptyTree) => queue.enqueue(l1)
                case (EmptyTree,Node(v12,l12,r12)) => queue.enqueue(r1)
                case (Node(v11,l11,r11),Node(v12,l12,r12)) => queue.enqueue(l1);queue.enqueue(r1)
              }
              isFirst=false
              isOne = true
            } else {
              last = List(v1)
              isOne = false
              (l1,r1) match {
                case (EmptyTree,EmptyTree) =>
                case (Node(v11,l11,r11),EmptyTree) => queue.enqueue(l1)
                case (EmptyTree,Node(v12,l12,r12)) => queue.enqueue(r1)
                case (Node(v11,l11,r11),Node(v12,l12,r12)) => queue.enqueue(l1);queue.enqueue(r1)
              }
            }
          }
        }
      }
    }
  }
  
  def getCornerNodes2[A](tree:BinaryTree[A]):Unit = tree match {
    case EmptyTree => 
    case Node(v,l,r) => {
      val queue = Queue[BinaryTree[A]]()
      queue.enqueue(tree)
      queue.enqueue(EmptyTree)
      queueProcessing(queue, false, false, Nil)
    }
  }
  
  def queueProcessing[A](queue: Queue[BinaryTree[A]],isFirst:Boolean,isOne: Boolean,last:List[A]): Unit = {
    if(queue.size>0) {
      queue.dequeue() match {
        case EmptyTree => {
          if(queue.size>=1)
              queue.enqueue(EmptyTree)
          if(!isOne) print(last.head + " , ")
          queueProcessing(queue, true, isOne, last)
        }
        case Node(v,l,r) => {
          if(isFirst) {
            print(v + " , ")
            (l,r) match {
              case (EmptyTree,EmptyTree) =>
              case (Node(v11,l11,r11),EmptyTree) => queue.enqueue(l)
              case (EmptyTree,Node(v12,l12,r12)) => queue.enqueue(r)
              case (Node(v11,l11,r11),Node(v12,l12,r12)) => queue.enqueue(l);queue.enqueue(r)
            }
            queueProcessing(queue, false, true, last)
          } else {
            (l,r) match {
              case (EmptyTree,EmptyTree) =>
              case (Node(v11,l11,r11),EmptyTree) => queue.enqueue(l)
              case (EmptyTree,Node(v12,l12,r12)) => queue.enqueue(r)
              case (Node(v11,l11,r11),Node(v12,l12,r12)) => queue.enqueue(l);queue.enqueue(r)
            }
            queueProcessing(queue, isFirst, false, List(v))
          }
        }
      }
    }
  }
}