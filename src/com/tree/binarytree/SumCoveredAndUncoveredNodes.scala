package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 12-Feb-2017
 */


/*
 * http://www.geeksforgeeks.org/check-sum-covered-uncovered-nodes-binary-tree/
 * 
 * You need to check whether sum of all covered elements is equal to sum of all uncovered elements or not.
 * In a binary tree, a node is called Uncovered if it appears either on left boundary or right boundary. Rest of the nodes are called covered.
 */
// For Equality Of CoveredNodesSum and UncoveredNodesSum , calculate UncoveredNodesSum by left and RegihtBoundary traversal and if this sum is half of total sum return true.

object SumCoveredAndUncoveredNodes {
  
  def totalSum(tree: BinaryTree[Int]): Int = tree match {
    case EmptyTree => 0
    case Node(v,l,r) => v + totalSum(l) + totalSum(r)
  }
  
  def unCoveredNodeSum(tree: BinaryTree[Int]) : Int = tree match {
    case EmptyTree => 0
    case Node(v,l,r) => {
      v + unCoveredLeftNodeSum(l) + unCoveredRightNodeSum(r)
    }
  }
  
  def unCoveredLeftNodeSum(tree: BinaryTree[Int]) : Int = tree match {
    case EmptyTree => 0
    case Node(v,l,r) => {
      (l,r) match {
        case (EmptyTree,EmptyTree) => v
        case (Node(v1,l1,r1),_) => v + unCoveredLeftNodeSum(l)
        case (EmptyTree,_) => v + unCoveredLeftNodeSum(r)
      }
    }
  }
  
  
  def unCoveredRightNodeSum(tree: BinaryTree[Int]) : Int = tree match {
    case EmptyTree => 0
    case Node(v,l,r) => {
      (l,r) match {
        case (EmptyTree,EmptyTree) => v
        case (_,Node(v2,l2,r2)) => v + unCoveredLeftNodeSum(r)
        case (_,EmptyTree) => v + unCoveredLeftNodeSum(l)
      }
    }
  }
  
  def isSumSame(tree: BinaryTree[Int]): Boolean = {
    (totalSum(tree) == (2 * unCoveredNodeSum(tree)))
  }
  
  
}