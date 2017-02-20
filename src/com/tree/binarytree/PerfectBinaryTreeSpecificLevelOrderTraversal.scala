package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 19-Feb-2017
 */

import scala.collection.mutable.Queue
import com.tree.binarytree.BinaryTree._

object PerfectBinaryTreeSpecificLevelOrderTraversal extends App {
  /*
   * http://www.geeksforgeeks.org/perfect-binary-tree-specific-level-order-traversal/
   * 
   * Approach 1:
			We can do standard level order traversal here too but instead of printing nodes directly, we have to store nodes in current 
			level in a temporary array or list 1st and then take nodes from alternate ends (left and right) and print nodes. 
			Keep repeating this for all levels.
			This approach takes more memory than standard traversal.

		Approach 2:
			The standard level order traversal idea will slightly change here. Instead of processing ONE node at a time, we will process TWO 
			nodes at a time. And while pushing children into queue, the enqueue order will be: 1st node’s left child, 2nd node’s right child, 
			1st node’s right child and 2nd node’s left child
			
		**/
  
  def printSpecificLevelOrder[A](tree:BinaryTree[A]): Unit = tree match {
    case EmptyTree => 
    case Node(v,l,r) => {
      print(v +" , ")
      val queue = Queue[BinaryTree[A]]()
      (l,r) match {
        case (EmptyTree,_) => 
        case (Node(v1,EmptyTree,r),Node(v2,l2,r2)) => print(v1 + " , " + v2);
        case (Node(v1,l1,r1),Node(v2,l2,r2)) =>  
          print(v1 + " , " + v2 + " , ");
          queue.enqueue(l)
          queue.enqueue(r)
        case _ =>
          queue.enqueue(l)
          queue.enqueue(r)
      }
      while(queue.size>0) {
        val first = queue.dequeue()
        val second = queue.dequeue()
        (first,second) match {
          case (Node(v1,Node(v11,l11,r11),Node(v12,l12,r12)),Node(v2,Node(v21,l21,r21),Node(v22,l22,r22))) => 
            print(v11 + " , " + v22+ " , ")
            print(v12 + " , " + v21+ " , ")
            l11 match {
              case Node(vl11,ll11,rl11) => 
                queue.enqueue(Node(v11,l11,r11))
                queue.enqueue(Node(v22,l22,r22))
                queue.enqueue(Node(v12,l12,r12))
                queue.enqueue(Node(v21,l21,r21))
              case _ =>
            }
          case _ => 
            
        }
      }
    }
  }
  
  printSpecificLevelOrder(balancedtree)
}