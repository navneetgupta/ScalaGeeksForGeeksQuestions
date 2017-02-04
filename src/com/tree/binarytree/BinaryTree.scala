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
}
//     emptytree      onlyRoot                tree1                                       leftskeewtree    rightskewTree
//                       1                                                                          1      1
//											/	 \	  							  	 1                                               /        \
//                                              /    \                                            2          2
//																			      2       10                                         /            \
//                                          /   \       \                                       3              3
//                                        /      9       19                                    /                \
//											  						  3       /                                             4                  4
//                                    /   \    17                                            /                    \
//                                   /     \                                                5                      5
//  																4       12                                             /                        \
//                                /  \        \                                           6                          6
//                               /    \        16                                        /                            \
//															5      11                                               7                              7
//                             /  \    /                                               /                                \
//														6    8  15                                              8                                  8
//                          /  \                                                     /                                    \
//												7			13                                                  9                                      9
//                      /      /  \                                                /                                        \
//										20			18  14                                             10                                         10
//                                                                               /                                            \
//           30  29   34 36  23  48 52  48                                     11                                              11                                             11

//post: 20,7,18,14,13,6,8,5,15,11,4,16,12,3,17,9,3,19,10,1    11,10,9,8,7,6,5,4,3,2,1   11,10,9,8,7,6,5,4,3,2,1  8,9,4,10,11,5,2,12,13,6,14,15,7,3,1
//pre : 1,2,3,4,5,6,7,20,13,18,14,8,11,15,12,16,9,17,10,19    1,2,3,4,5,6,7,8,9,10,11                              1,2,4,8,9,5,10,11,3,6,12,13,7,14,15
//in:  20,7,6,18,13,14,5,8,4,15,11,3,12,16,2,17,9,1,10,19     11,10,9,8,7,6,5,4,3,2,1    1,2,3,4,5,6,7,8,9,10,11   8,4,9,2,10,5,11,1,12,6,13,14,7,15,3  


//                                                       balancedtree       
//                                                                           1
//                                                                   /               \
//                                                                2                    3
//                                                              /    \              /     \
//                                                            /       \            /       \  
//                                                           4         5          6         7
//                                                         /   \      / \        / \      /   \
//                                                        /     \    /   \      /   \    /     \
//                                                       8       9  10   11    12   13  14      15 
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