package com.tree.binarytree.test

import com.tree.binarytree.BuildFullBinaryTreeFromPreAndPostOrder.buildFullBinaryTreeFromPreAndPostOrder
import com.tree.binarytree.InOrderTraversal._

object BuildFullBinaryTreeFromPreAndPostOrderTest {

  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  val pre2 = Array(1, 2, 4, 8, 9, 5, 3, 6, 7)     //> pre2  : Array[Int] = Array(1, 2, 4, 8, 9, 5, 3, 6, 7)
  val post2 = Array(8, 9, 4, 5, 2, 6, 7, 3, 1)    //> post2  : Array[Int] = Array(8, 9, 4, 5, 2, 6, 7, 3, 1)
  val treerr = buildFullBinaryTreeFromPreAndPostOrder(pre2,post2,pre2.length)
                                                  //> pIndex is == 0
                                                  //| pIndex is == 1
                                                  //| pIndex is == 2
                                                  //| pIndex is == 3
                                                  //| pIndex is == 4
                                                  //| pIndex is == 5
                                                  //| pIndex is == 6
                                                  //| pIndex is == 7
                                                  //| pIndex is == 8
                                                  //| treerr  : com.tree.binarytree.BinaryTree[Int] = Node(1,Node(2,Node(4,Node(8,
                                                  //| EmptyTree,EmptyTree),Node(9,EmptyTree,EmptyTree)),Node(5,EmptyTree,EmptyTree
                                                  //| )),Node(3,Node(6,EmptyTree,EmptyTree),Node(7,EmptyTree,EmptyTree)))
                                            
                                         
                                              
 
                                                  
                                                  
  inOrderTraversalRecursive(treerr)
                                                  
}

//																													1
//																					2	                         3
//																4             5                    6     7
//                         	  8       9
//
//
//
//      pre=                         1,2,4,8,9,5,3,6,7
//      in =              8,4,9,2,5,1,6,3,7
//      post 8,9,4,,5,2,6,7,3,1
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//