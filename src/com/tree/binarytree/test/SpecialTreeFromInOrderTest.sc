package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.SpecialTreeFromInOrder.buildTree
object SpecialTreeFromInOrderTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val inOrder = Array(5, 10, 40, 30, 28)          //> inOrder  : Array[Int] = Array(5, 10, 40, 30, 28)
  
  buildTree(inOrder, 0, inOrder.length-1)         //> start = 0 end 4 max 40
                                                  //| start = 0 end 1 max 10
                                                  //| start = 0 end 0 max 5
                                                  //| start = 3 end 4 max 30
                                                  //| start = 4 end 4 max 28
                                                  //| res0: com.tree.binarytree.BinaryTree[Int] = Node(40,Node(10,Node(5,EmptyTree
                                                  //| ,EmptyTree),EmptyTree),Node(30,EmptyTree,Node(28,EmptyTree,EmptyTree)))
 
                                                
                                
}