package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 13-Feb-2017
 */

case class Count(var count:Int)
object CountSingledValueSubTrees {
  /*
   * http://www.geeksforgeeks.org/find-count-of-singly-subtrees/
   * 
   * A Single Valued Subtree is one in which all the nodes have same value.
   * 
   * A Simple Solution is to traverse the tree. For every traversed node, check if all values under this node are same or not. 
   * If same, then increment count. Time complexity of this solution is O(n2).
   * 
   * An Efficient Solution is to traverse the tree in bottom up manner. For every subtree visited, return true 
   * if subtree rooted under it is single valued and increment count. So the idea is to use count as a reference parameter 
   * in recursive calls and use returned values to find out if left and right subtrees are single valued or not. 
   * */
  
  def countSingleValuedTreeRec[A](tree: BinaryTree[A],count: Count):Boolean = tree match {
    case EmptyTree => true
    case Node(v,l,r) => 
      val lt = countSingleValuedTreeRec(l, count)
      val rt = countSingleValuedTreeRec(r, count)
      if(!lt || !rt)
        false
      else {
        (l,r) match {
          case (Node(v1,l1,r1),_) if(v != v1) => false
          case (EmptyTree,Node(v2,l2,r2)) if(v != v2) => false
          case _ => count.count = count.count +1;true
        }
      }
  }
  
  def countSingle[A](tree: BinaryTree[A]) : Int = {
    val ct = Count(0)
    countSingleValuedTreeRec(tree, ct)
    ct.count
  }
  
}