package com.tree.binarytree

import scala.collection.mutable.Queue

/**
 * @author: Navneet Gupta
 * @createdOn: 16-Feb-2017
 */

object BottomViewOfTree {
  /*
   * http://www.geeksforgeeks.org/bottom-view-binary-tree/
   * 
   *  A node x is there in output if x is the bottommost node at its horizontal distance. Horizontal distance of left child of a node x 
   *  is equal to horizontal distance of x minus 1, and that of right child is horizontal distance of x plus 1
   * 	1. We put tree nodes in a queue for the level order traversal.
	 *	2. Start with the horizontal distance(hd) 0 of the root node, keep on adding left child to queue along with the horizontal 
	 *     distance as hd-1 and right child as hd+1.
	 *	3. Also, use a TreeMap which stores key value pair sorted on key.
	 *	4. Every time, we encounter a new horizontal distance or an existing horizontal distance put the node data for the horizontal distance 
	 *     as key. For the first time it will add to the map, next time it will replace the value. This will make sure that the bottom most 
	 *     element for that horizontal distance is present in the map and if you see the tree from beneath that you will see that element.
   * 
   * */
  
  def bottomView[A](tree: BinaryTree[A]) : List[A] = tree match {
    case EmptyTree => Nil
    case Node(v,l,r) => {
      val queue = Queue[(BinaryTree[A],Int)]()
      queue.enqueue((tree,0))
      val map = processQueue(queue,Map.empty)
      println(map.toSeq.sortBy(_._1))
      map.toSeq.sortBy(_._1).map(x => x._2).toList
    }
  }
  
  def processQueue[A](queue: Queue[(BinaryTree[A],Int)],map: Map[Int,A]) : Map[Int,A] = {
    if(queue.size>0)  {
      val node = queue.dequeue()
      node._1 match {
        case EmptyTree => map
        case Node(v,l,r) => {
          val updatedMap = map + (node._2 -> v)
          if(!l.isEmptyTree) {
            queue.enqueue((l,node._2-1))
          }
          if(!r.isEmptyTree) {
            queue.enqueue((r,node._2+1))
          }
          processQueue(queue, updatedMap)
        }
      }
      
    } else {
      map
    }
  }
}