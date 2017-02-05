package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.DiagonalTraversal.diaGonalPrint
object DiagonalTraversalTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  diaGonalPrint(tree1)                            //> List(19, 10, 1)
                                                  //| List(14, 13, 6)
                                                  //| List(9, 2)
                                                  //| List(18, 7)
                                                  //| List(17, 16, 12, 3)
                                                  //| List(20)
                                                  //| List(11, 4)
                                                  //| List(15, 8, 5)
                                                  
                                  
}