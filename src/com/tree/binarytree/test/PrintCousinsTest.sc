package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._

import com.tree.binarytree.PrintCousins.{printCousins,getLevel}

object PrintCousinsTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  tree1                                           //> res0: com.tree.binarytree.BinaryTree[Int] = Node(1,Node(2,Node(3,Node(4,Node
                                                  //| (5,Node(6,Node(7,Node(20,EmptyTree,EmptyTree),EmptyTree),Node(13,Node(18,Emp
                                                  //| tyTree,EmptyTree),Node(14,EmptyTree,EmptyTree))),Node(8,EmptyTree,EmptyTree)
                                                  //| ),Node(11,Node(15,EmptyTree,EmptyTree),EmptyTree)),Node(12,EmptyTree,Node(16
                                                  //| ,EmptyTree,EmptyTree))),Node(9,Node(17,EmptyTree,EmptyTree),EmptyTree)),Node
                                                  //| (10,EmptyTree,Node(19,EmptyTree,EmptyTree)))
  tree1.getLeft.getRight                          //> res1: com.tree.binarytree.BinaryTree[Int] = Node(9,Node(17,EmptyTree,EmptyTr
                                                  //| ee),EmptyTree)
  getLevel(tree1, 9, 1)                           //> res2: Int = 9
  
  getLevel(tree1, 17, 1)                          //> res3: Int = 9
}