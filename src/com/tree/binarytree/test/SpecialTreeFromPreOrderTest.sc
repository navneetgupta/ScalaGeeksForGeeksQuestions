package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.SpecialTreeFromPreOrder.specialTreeFromPreOrder
object SpecialTreeFromPreOrderTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val preOrder = Array(10, 30, 20, 5, 15)         //> preOrder  : Array[Int] = Array(10, 30, 20, 5, 15)
  val preLN = Array('N', 'N', 'L', 'L', 'L')      //> preLN  : Array[Char] = Array(N, N, L, L, L)
  
  specialTreeFromPreOrder(preOrder, preLN, preOrder.length)
                                                  //> res0: com.tree.binarytree.BinaryTree[Int] = Node(10,Node(30,Node(20,EmptyTre
                                                  //| e,EmptyTree),Node(5,EmptyTree,EmptyTree)),Node(15,EmptyTree,EmptyTree))
}