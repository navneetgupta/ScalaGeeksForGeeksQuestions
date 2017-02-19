package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 03-Jan-2017
 */

sealed trait BinaryTree[+A] {
  def hasLeft:Boolean = this match {
    case EmptyTree => false
    case Node(v,l,r) => l match {
      case Node(v1,l1,r1) => true
      case _ => false
    }
  }
  def hasRight:Boolean = this match {
    case EmptyTree => false
    case Node(v,l,r) => r match {
      case Node(v1,l1,r1) => true
      case _ => false
    }
  }
  def getLeft:BinaryTree[A] = this match {
    case Node(v,Node(v1,l1,r1),_) => Node(v1,l1,r1)
    case _ => EmptyTree
  }
  def getRight:BinaryTree[A] = this match {
    case Node(v,_,Node(v1,l1,r1)) => Node(v1,l1,r1)
    case _ => EmptyTree
  }
  def isLeafNode: Boolean = this match {
    case Node(v,EmptyTree,EmptyTree) => true
    case _ => false
  }
  
  def isEmptyTree: Boolean = this match {
    case EmptyTree => true
    case _ => false
  }
  
  def getNodeValue: Option[A] = this match {
    case Node(v,l,r) => Some(v)
    case _ => None
  }
  def isSameTree[A](tree:BinaryTree[A]) : Boolean = (this,tree) match {
    case (EmptyTree,EmptyTree) => true
    case (Node(v1,l1,r1),Node(v2,l2,r2)) if(v1 == v2) => l1.isSameTree(l2) && r1.isSameTree(r2)
    case _ => false
  }
}

case object EmptyTree extends BinaryTree[Nothing]
case class Node[A](value : A, left: BinaryTree[A] , right: BinaryTree[A]) extends BinaryTree[A]

//case class Leaf[A](value : A) extends BinaryTree[A] special case of Node with right and left node as EmptyTree

object BinaryTree {
  
  def empty[A]: BinaryTree[A] = EmptyTree
  
  def node[A](value: A, left: BinaryTree[A] = empty, right: BinaryTree[A] = empty) =
    Node(value,left,right)
    
    
  def fold[A,B](tree : BinaryTree[A],z: B)(f: A => B)(g: (B,B) => B) : B = tree match {
    case EmptyTree => z
    case Node(v,l,r) => g(fold(l,z)(f)(g),fold(r,z)(f)(g))
  }
  
  
  def map[A,B](tree: BinaryTree[A])(f:A => B) : BinaryTree[B] = tree match {
    case EmptyTree => EmptyTree 
    case Node(v,l,r) => Node(f(v),map(l)(f),map(r)(f))
  }
  
  
  val tree1 : BinaryTree[Int] = 
    node(1,
      node(2,
          node(3,
              node(4,
                  node(5,
                      node(6,
                          node(7,node(20,empty,empty),empty),
                          node(13,node(18,empty,empty),node(14,empty,empty))),
                      node(8,empty,empty)),
                  node(11,node(15,empty,empty),empty)),
              node(12,empty,node(16,empty,empty))),
          node(9,node(17,empty,empty),empty)),
      node(10,empty,node(19,empty,empty)));
  
  val emptytree = empty
  
  val onlyChildren = node(1,node(2,empty,empty),node(3,empty,empty))
  
  val onlyRoot = node(1,empty,empty)
  
  val childrenSumPropertyTree = node(10,node(6,node(2,node(2,empty,empty),node(0,empty,empty)),node(4,node(3,empty,empty),node(1,empty,empty))),node(4,empty,node(4,empty,empty)))
  val childrenSumPropertyTree1 = node(10,node(8,node(3,empty,empty),node(5,empty,empty)),node(2,empty,node(2,empty,empty)))
  
  val leftSkewedtree = node(1,node(2,node(3,node(4,node(5,node(6,node(7,node(8,
      node(9,node(10,node(11,empty,empty),empty),empty),empty),empty),empty),empty),empty),empty),empty),empty)
   
  val rightSkewTree =  node(1,empty,node(2,empty,node(3,empty,node(4,empty,node(5,empty,node(6,empty,node(7,empty,
      node(8,empty,node(9,empty,node(10,empty,node(11,empty,empty)))))))))))
      
  val balancedtree =  node(1,node(2,node(4,node(8,empty,empty),node(9,empty,empty)),node(5,node(10,empty,empty),node(11,empty,empty))),
      node(3,node(6,node(12,empty,empty),node(13,empty,empty)),node(7,node(14,empty,empty),node(15,empty,empty))))
  val balancedtree2 =  node(200,node(2,node(4,node(8,empty,empty),node(9,empty,empty)),node(5,node(10,empty,empty),node(11,empty,empty))),
 
      node(60,node(6,node(12,empty,empty),node(13,empty,empty)),node(7,node(14,empty,empty),node(15,empty,empty))))
      
      
  val binarySearchTree = Node(4,Node(2,Node(1,empty,empty),Node(3,empty,empty)),Node(5,empty,empty))
  
  val childrenSumTest = Node(50,Node(7,Node(3,EmptyTree,EmptyTree),Node(5,EmptyTree,EmptyTree)),Node(2,Node(1,EmptyTree,EmptyTree),Node(30,EmptyTree,EmptyTree)))
  
  val doubleTreeTest1 = Node(1,Node(2,EmptyTree,EmptyTree),Node(3,EmptyTree,EmptyTree))
  val doubleTreeTest2 = Node(1,Node(2,Node(4,EmptyTree,EmptyTree),Node(5,EmptyTree,EmptyTree)),Node(3,EmptyTree,EmptyTree))
  
  val testTree = Node(1,Node(2,Node(4,EmptyTree,EmptyTree),Node(5,EmptyTree,EmptyTree)),Node(3,EmptyTree,EmptyTree))
  
  val tree2 = Node(20,Node(8,Node(4,EmptyTree,EmptyTree),Node(12,Node(10,EmptyTree,EmptyTree),Node(14,EmptyTree,EmptyTree))),Node(22,EmptyTree,EmptyTree))
  
  val sumTreeTest = Node(10,Node(-2,Node(8,empty,empty),Node(-4,empty,empty)),Node(6,Node(7,empty,empty),Node(5,empty,empty)))
  val isSumtreeTest= Node(26,Node(10,Node(4,empty,empty),Node(6,empty,empty)),Node(3,empty,Node(3,empty,empty)))
  
  val isSubSetTreeTest1 = Node(26,Node(10,Node(4,empty,Node(30,empty,empty)),Node(6,empty,empty)),Node(3,empty,Node(3,empty,empty)))
  val isSubSetTreeTest2 = Node(10,Node(4,empty,Node(30,empty,empty)),Node(6,empty,empty))
  val maxSumLeafToRoot = Node(10,Node(-2,Node(8,empty,empty),Node(-4,empty,empty)),Node(7,empty,empty))
  val isoMorphismTree1 = Node(1,Node(2,Node(4,empty,empty),Node(5,Node(7,empty,empty),Node(8,empty,empty))),Node(3,Node(6,empty,empty),empty))
  val isoMorphismTree2 = Node(1,Node(3,empty,Node(6,empty,empty)),Node(2,Node(4,empty,empty),Node(5,Node(8,empty,empty),Node(7,empty,empty))))
  
  val bstToBalancedBSTTest = Node(10,Node(8,Node(7,Node(6,Node(5,empty,empty),empty),empty),empty),empty)
  val bstToBalancedBSTTest1 = Node(30,Node(20,Node(10,empty,empty),empty),empty)
  val bstToBalancedBSTTest2 = Node(4,Node(3,Node(2,Node(1,empty,empty),empty),empty),Node(5,empty,Node(6,empty,Node(7,empty,empty))))
  
  val maxConcurrentIncreasing = Node(10,Node(11,Node(13,empty,empty),Node(12,empty,empty)),Node(9,Node(13,empty,empty),Node(8,empty,empty)))
  val maxConcurrentIncreasing2 = Node(5,Node(8,Node(9,Node(6,empty,empty),empty),empty),Node(11,empty,Node(10,Node(15,empty,empty),empty)))

  val expresiionTree = Node("+",Node("*",Node("5",empty,empty),Node("4",empty,empty)),Node("-",Node("100",empty,empty),Node("20",empty,empty)))
  val expresiionTree1 = Node("+",Node("*",Node("5",empty,empty),Node("4",empty,empty)),Node("-",Node("100",empty,empty),Node("/",Node("20",empty,empty),Node("2",empty,empty))))
  val pairSumTree = Node(8,Node(5,Node(9,empty,empty),Node(7,Node(1,empty,empty),Node(12,empty,Node(2,empty,empty)))),Node(4,empty,Node(11,Node(3,empty,empty),empty)))
  val deepestNodeTest = Node(10,Node(28,empty,empty),Node(13,Node(14,empty,empty),Node(15,Node(23,empty,empty),Node(24,empty,empty))))
  val deepestNodeTest2 = Node(5,Node(10,Node(3,empty,empty),Node(4,Node(44,empty,Node(12,empty,empty)),empty)),Node(2,empty,Node(15,Node(9,empty,empty),Node(8,empty,empty))))
  
  val pathWithGivenSum = Node(10,Node(28,empty,empty),Node(13,Node(14,Node(21,empty,empty),Node(22,empty,empty)),Node(15,Node(23,empty,empty),Node(24,empty,empty))))
  val sumCoveredAndUncoveredNodes = Node(8,Node(3,Node(1,empty,empty),Node(6,Node(4,empty,empty),Node(16,empty,empty))),Node(10,empty,Node(1,Node(3,empty,empty),empty)))
  
  val singleValuedSubTree1 = Node(5,Node(1,Node(5,empty,empty),Node(5,empty,empty)),Node(5,empty,Node(5,empty,empty)))
  val singleValuedSubTree2= Node(5,Node(4,Node(4,empty,empty),Node(4,empty,empty)),Node(5,empty,Node(5,empty,empty))) 
  val multSumLevelNods = Node(2,Node(7,Node(8,empty,empty),Node(6,Node(1,empty,empty),Node(11,empty,empty))),Node(5,empty,Node(9,Node(4,empty,empty),Node(10,empty,empty))))
  val symmetricTree = Node(1,Node(2,Node(3,empty,empty),Node(4,empty,empty)),Node(2,Node(4,empty,empty),Node(3,empty,empty)))
  val findClosestTestTree = Node("A",Node("B",empty,empty),Node("C",Node("E",Node("G",Node("I",empty,empty),Node("J",empty,empty)),empty),Node("F",empty,Node("H",Node("K",empty,empty),empty))))
  val cousinNodeTest = Node(6,Node(3,Node(7,empty,empty),Node(8,empty,empty)),Node(5,Node(1,empty,empty),Node(3,empty,empty)))
  val succinctTreeTest = Node(10, Node(20, Node(40,empty,empty), Node(50,empty,empty)), Node(30,empty, Node(70,empty,empty)))
  
  
  
  
  
}
//     emptytree      onlyRoot                tree1                                       leftskeewtree    rightskewTree
//                       1                                                                          1      1
//											/	 \	  							  	1                                               /        \
//                                              /    \                                           2          2
//																			      2(-1)   10(1)                                     /            \
//                                          /   \       \                                     3              3
//                                        /      \       \                                   /                \
//											  						  3(-2)    9(0)   19(2)                               4                  4
//                                    /   \      /                                         /                    \
//                                   /     \     /                                        5                      5
//  														(-3)4   (-1)12  17(-1)                                   /                        \
//                                /  \        \                                         6                          6
//                               /    \        \                                       /                            \
//												(-4)	5      11(-2)      16(0)                              7                              7
//                             /  \    /                                             /                                \
//											(-5)	6(-3)8  15(-3)                                        8                                  8
//                          /  \                                                   /                                    \
//									(-6)	7	(-4)13                                                9                                      9
//                      /      /  \                                              /                                        \
//							(-7)	20	(-5)18  14(-3)                                       10                                         10
//                                                                            /                                            \
//           30  29   34 36  23  48 52  48                                  11                                              11                                             11

//post: 20,7,18,14,13,6,8,5,15,11,4,16,12,3,17,9,3,19,10,1    11,10,9,8,7,6,5,4,3,2,1   11,10,9,8,7,6,5,4,3,2,1  8,9,4,10,11,5,2,12,13,6,14,15,7,3,1
//pre : 1,2,3,4,5,6,7,20,13,18,14,8,11,15,12,16,9,17,10,19    1,2,3,4,5,6,7,8,9,10,11                              1,2,4,8,9,5,10,11,3,6,12,13,7,14,15
//in:  20,7,6,18,13,14,5,8,4,15,11,3,12,16,2,17,9,1,10,19     11,10,9,8,7,6,5,4,3,2,1    1,2,3,4,5,6,7,8,9,10,11   8,4,9,2,10,5,11,1,12,6,13,14,7,15,3  


//                                                       balancedtree       
//                                                                           1(0)
//                                                                   /               \
//                                                                2 (-1)               3 (1)
//                                                              /    \              /     \
//                                                            /       \            /       \  
//                                                     (-2)  4      (0)5          6(0)      7(2)
//                                                         /   \      / \        / \          /   \
//                                                        /     \    /   \      /   \        /     \
//                                                   (-3)8  (-1) 9  10(-1)11(1)12(-1)13(1) 14(1)   15(3) 
//
//
// post:   pre  in:                                         4
//                                                       /     \
//                                                      /       \
//                                                     2         5
//                                                   /   \
//                                                  1     3
//
//
//
//
//
//
//