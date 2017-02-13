package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.AllPosibleTreeWithGivenInOrder.getAllPosibleTrees
import com.tree.binarytree.PreOrderTraversal.preOrderTraversalRecursive

object AllPosibleTreeWithGivenInOrderTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  getAllPosibleTrees(Array(4,5,7), 0, 2).map(preOrderTraversalRecursive)
                                                  //> 4 , 5 , 7 , 4 , 7 , 5 , 5 , 4 , 7 , 7 , 4 , 5 , 7 , 5 , 4 , res0: List#8617[
                                                  //| Unit#2634] = List((), (), (), (), ())
  
}