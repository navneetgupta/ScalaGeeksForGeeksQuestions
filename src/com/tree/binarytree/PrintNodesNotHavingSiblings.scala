package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 20-Feb-2017
 */

object PrintNodesNotHavingSiblings {
  /*
   * http://www.geeksforgeeks.org/print-nodes-dont-sibling-binary-tree/ 
   * 
   * Given a Binary Tree, print all nodes that don’t have a sibling (a sibling is a node that has same parent. In a Binary Tree, 
   * there can be at most one sibling). Root should not be printed as root cannot have a sibling.
   * */
  
  def printSingleNodes[A](tree: BinaryTree[A]) : Unit = tree match {
    case EmptyTree =>  
    case Node(v,l,r) => 
      (l,r) match {
        case (EmptyTree,EmptyTree) => 
        case (Node(v1,l1,r1),EmptyTree) => print(v1 + " , ");printSingleNodes(l)
        case (EmptyTree,Node(v2,l2,r2)) => print(v2 + " , "); printSingleNodes(r)
        case (Node(v1,l1,r1),Node(v2,l2,r2)) => printSingleNodes(l); printSingleNodes(r)
      }
  }
}