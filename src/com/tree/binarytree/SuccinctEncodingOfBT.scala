package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 19-Feb-2017
 */

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.PreOrderTraversal.preOrderTraversalRecursive

object SuccinctEncodingOfBT extends App {
  /*
   * http://www.geeksforgeeks.org/succinct-encoding-of-binary-tree/
   * 
   * function EncodeSuccinct(node n, bitstring structure, array data) {
        if n = nil then
            append 0 to structure;
        else
            append 1 to structure;
            append n.data to data;
            EncodeSuccinct(n.left, structure, data);
            EncodeSuccinct(n.right, structure, data);
    	}
   * */
  def encodeSuccinct[A](tree: BinaryTree[A], xs: List[Boolean],data: List[A]):(List[Boolean],List[A])  = tree match {
    case EmptyTree => (false::xs,data)
    case Node(v,l,r) => 
      val lt = encodeSuccinct(l, true::xs, v::data)
      encodeSuccinct(r, lt._1,lt._2)
  }
  
  def decodeSuucinct[A](xs: List[Boolean],data: List[A]): BinaryTree[A] = {
    if(xs.size <= 0) {
      EmptyTree
    } else {
      if(xs.head) {
        val key = data.head
        val lt = decodeSuucinct(xs.tail, data.tail)
        val rt = decodeSuucinct(xs.tail, data.tail)
        Node(key,lt,rt)
      } else {
        EmptyTree
      }
    }
  }
   val as = encodeSuccinct(succinctTreeTest, Nil, Nil)
   println(as)
   preOrderTraversalRecursive(decodeSuucinct(as._1.reverse,as._2.reverse))
}