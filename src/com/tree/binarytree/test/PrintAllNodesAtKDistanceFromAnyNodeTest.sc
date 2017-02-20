package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.PrintAllNodesAtKDistanceFromAnyNode.printKDistanceNode

object PrintAllNodesAtKDistanceFromAnyNodeTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  printKDistanceNode(tree1, tree1.getLeft.getLeft.getLeft, 3)
                                                  //> 7 , 
                                                  //| 13 , 
                                                  //| 16 , 
                                                  //| 9 , 
                                                  //| 1 , 
                                                  //| res0: Int = 3
                                                  
 printKDistanceNode(leftSkewedtree, leftSkewedtree.getLeft.getLeft.getLeft.getLeft, 4)
                                                  //> 9 , 
                                                  //| 1 , 
                                                  //| res1: Int = 4
}