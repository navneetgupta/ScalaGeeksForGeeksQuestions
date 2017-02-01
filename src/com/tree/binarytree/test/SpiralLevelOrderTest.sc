package com.tree.binarytree

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.SpiralLevelOrder.{spiralLevelOrderTraversal,printSpiralViaStack}
object SpiralLevelOrderTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  spiralLevelOrderTraversal(tree1)                //> 
                                                  //| 1 , 
                                                  //| 10 , 2 , 
                                                  //| 3 , 9 , 19 , 
                                                  //| 17 , 12 , 4 , 
                                                  //| 5 , 11 , 16 , 
                                                  //| 15 , 8 , 6 , 
                                                  //| 7 , 13 , 
                                                  //| 14 , 18 , 20 , 
  printSpiralViaStack(tree1)                      //> 1 , 10 , 2 , 3 , 9 , 19 , 17 , 12 , 4 , 5 , 11 , 16 , 15 , 8 , 6 , 7 , 13 , 
                                                  //| 14 , 18 , 20 , 
                                           
  
  spiralLevelOrderTraversal(leftSkewedtree)       //> 
                                                  //| 1 , 
                                                  //| 2 , 
                                                  //| 3 , 
                                                  //| 4 , 
                                                  //| 5 , 
                                                  //| 6 , 
                                                  //| 7 , 
                                                  //| 8 , 
                                                  //| 9 , 
                                                  //| 10 , 
                                                  //| 11 , 
    printSpiralViaStack(leftSkewedtree)           //> 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11 , 
  
  spiralLevelOrderTraversal(rightSkewTree)        //> 
                                                  //| 1 , 
                                                  //| 2 , 
                                                  //| 3 , 
                                                  //| 4 , 
                                                  //| 5 , 
                                                  //| 6 , 
                                                  //| 7 , 
                                                  //| 8 , 
                                                  //| 9 , 
                                                  //| 10 , 
                                                  //| 11 , 
    printSpiralViaStack(rightSkewTree)            //> 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11 , 
  
  spiralLevelOrderTraversal(balancedtree)         //> 
                                                  //| 1 , 
                                                  //| 3 , 2 , 
                                                  //| 4 , 5 , 6 , 7 , 
                                                  //| 15 , 14 , 13 , 12 , 11 , 10 , 9 , 8 , 
    printSpiralViaStack(balancedtree)             //> 1 , 3 , 2 , 4 , 5 , 6 , 7 , 15 , 14 , 13 , 12 , 11 , 10 , 9 , 8 , 
  
  spiralLevelOrderTraversal(binarySearchTree)     //> 
                                                  //| 4 , 
                                                  //| 5 , 2 , 
                                                  //| 1 , 3 , 
    printSpiralViaStack(binarySearchTree)         //> 4 , 5 , 2 , 1 , 3 , 
  
  spiralLevelOrderTraversal(onlyRoot)             //> 
                                                  //| 1 , 
    printSpiralViaStack(onlyRoot)                 //> 1 , 
  
  spiralLevelOrderTraversal(emptytree)
    printSpiralViaStack(emptytree)
  
  
}