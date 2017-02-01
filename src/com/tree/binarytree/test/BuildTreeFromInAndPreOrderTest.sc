package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.InOrderTraversal._
import com.tree.binarytree.PreOrderTraversal._
import com.tree.binarytree.BuildTreeFromInAndPreOrder._
object BuildTreeFromInAndPreOrderTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  val inOrder:Array[Char] = Array('D', 'B', 'E', 'A', 'F', 'C')
                                                  //> inOrder  : Array[Char] = Array(D, B, E, A, F, C)
  val preOrder: Array[Char] = Array('A', 'B', 'D', 'E', 'C', 'F')
                                                  //> preOrder  : Array[Char] = Array(A, B, D, E, C, F)
  
  val a = buildTree(inOrder,preOrder,0,inOrder.length-1,0)
                                                  //> a  : (com.tree.binarytree.BinaryTree[Char], Int) = (Node(A,Node(B,Node(D,Emp
                                                  //| tyTree,EmptyTree),Node(E,EmptyTree,EmptyTree)),Node(C,Node(F,EmptyTree,Empty
                                                  //| Tree),EmptyTree)),6)
               
  preOrderTraversalRecursive(a._1)                //> A , B , D , E , C , F , 
  
  preOrderTraversalRecursive(tree1)               //> 1 , 2 , 3 , 4 , 5 , 6 , 7 , 20 , 13 , 18 , 14 , 8 , 11 , 15 , 12 , 16 , 9 , 
                                                  //| 17 , 10 , 19 , 
                                      
	inOrderTraversalRecursive(tree1)          //> 20 , 7 , 6 , 18 , 13 , 14 , 5 , 8 , 4 , 15 , 11 , 3 , 12 , 16 , 2 , 17 , 9 ,
                                                  //|  1 , 10 , 19 , 
  
  val in2 = Array(20 , 7 , 6 , 18 , 13 , 14 , 5 , 8 , 4 , 15 , 11 , 3 , 12 , 16 , 2 , 17 , 9)
                                                  //> in2  : Array[Int] = Array(20, 7, 6, 18, 13, 14, 5, 8, 4, 15, 11, 3, 12, 16, 
                                                  //| 2, 17, 9)
  val pre2 = Array(1 , 2 , 3 , 4 , 5 , 6 , 7 , 20 , 13 , 18 , 14 , 8 , 11 , 15 , 12 , 16 , 9 ,17 , 10 , 19)
                                                  //> pre2  : Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 20, 13, 18, 14, 8, 11, 15, 1
                                                  //| 2, 16, 9, 17, 10, 19)
  
  val a2 = buildTree(in2, pre2, 0, in2.length-1, 0)
                                                  //> a2  : (com.tree.binarytree.BinaryTree[Int], Int) = (Node(1,Node(2,Node(3,Nod
                                                  //| e(4,Node(5,Node(6,Node(7,Node(20,EmptyTree,EmptyTree),EmptyTree),Node(13,Nod
                                                  //| e(18,EmptyTree,EmptyTree),Node(14,EmptyTree,EmptyTree))),Node(8,EmptyTree,Em
                                                  //| ptyTree)),Node(11,Node(15,EmptyTree,EmptyTree),EmptyTree)),Node(12,EmptyTree
                                                  //| ,Node(16,EmptyTree,EmptyTree))),Node(9,Node(17,EmptyTree,EmptyTree),EmptyTre
                                                  //| e)),EmptyTree),18)
  preOrderTraversalRecursive(a2._1)               //> 1 , 2 , 3 , 4 , 5 , 6 , 7 , 20 , 13 , 18 , 14 , 8 , 11 , 15 , 12 , 16 , 9 , 
                                                  //| 17 , 
  
  preOrderTraversalRecursive(tree2)               //> 20 , 8 , 4 , 12 , 10 , 14 , 22 , 
  inOrderTraversalRecursive(tree2)
                                                
}