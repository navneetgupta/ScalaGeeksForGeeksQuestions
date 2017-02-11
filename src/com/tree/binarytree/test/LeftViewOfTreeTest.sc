package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.LeftViewOfTree.leftView

object LeftViewOfTreeTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  leftView(tree1)                                 //> 1 , 2 , 3 , 4 , 5 , 6 , 7 , 20 , res0: List[Int] = List(20, 7, 6, 5, 4, 3, 2
                                                  //| , 1)
  leftView(tree2)                                 //> 20 , 8 , 4 , 10 , res1: List[Int] = List(10, 4, 8, 20)
  leftView(binarySearchTree)                      //> 4 , 2 , 1 , res2: List[Int] = List(1, 2, 4)
  leftView(balancedtree)                          //> 1 , 2 , 4 , 8 , res3: List[Int] = List(8, 4, 2, 1)
}