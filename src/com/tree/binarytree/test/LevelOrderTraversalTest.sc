package com.tree.binarytree.test

import com.tree.binarytree.LevelOrderTraversal.printLevelOrderRecursive
import com.tree.binarytree.SpiralLevelOrder.{spiralLevelOrderTraversal,spiralLevelOrderTraversal2}

object LevelOrderTraversalTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  import com.tree.binarytree.BinaryTree._
  
  
  printLevelOrderRecursive(tree1)                 //> 
                                                  //| 1,
                                                  //| 2,10,
                                                  //| 3,9,19,
                                                  //| 4,12,17,
                                                  //| 5,11,16,
                                                  //| 6,8,15,
                                                  //| 7,13,
                                                  //| 20,18,14,
  spiralLevelOrderTraversal(tree1)                //> 
                                                  //| 1 , 
                                                  //| 10 , 2 , 
                                                  //| 3 , 9 , 19 , 
                                                  //| 17 , 12 , 4 , 
                                                  //| 5 , 11 , 16 , 
                                                  //| 15 , 8 , 6 , 
                                                  //| 7 , 13 , 
                                                  //| 14 , 18 , 20 , 
  spiralLevelOrderTraversal2(tree1)               //> 
                                                  //| 1 , 
                                                  //| 10 , 2 , 
                                                  //| 3 , 9 , 19 , 
                                                  //| 17 , 12 , 4 , 
                                                  //| 5 , 11 , 16 , 
                                                  //| 15 , 8 , 6 , 
                                                  //| 7 , 13 , 
                                                  //| 14 , 18 , 20 , 
  printLevelOrderRecursive(leftSkewedtree)        //> 
                                                  //| 1,
                                                  //| 2,
                                                  //| 3,
                                                  //| 4,
                                                  //| 5,
                                                  //| 6,
                                                  //| 7,
                                                  //| 8,
                                                  //| 9,
                                                  //| 10,
                                                  //| 11,
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
  spiralLevelOrderTraversal2(leftSkewedtree)      //> 
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
  printLevelOrderRecursive(rightSkewTree)         //> 
                                                  //| 1,
                                                  //| 2,
                                                  //| 3,
                                                  //| 4,
                                                  //| 5,
                                                  //| 6,
                                                  //| 7,
                                                  //| 8,
                                                  //| 9,
                                                  //| 10,
                                                  //| 11,
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
  spiralLevelOrderTraversal2(rightSkewTree)       //> 
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
  printLevelOrderRecursive(balancedtree)          //> 
                                                  //| 1,
                                                  //| 2,3,
                                                  //| 4,5,6,7,
                                                  //| 8,9,10,11,12,13,14,15,
  spiralLevelOrderTraversal(balancedtree)         //> 
                                                  //| 1 , 
                                                  //| 3 , 2 , 
                                                  //| 4 , 5 , 6 , 7 , 
                                                  //| 15 , 14 , 13 , 12 , 11 , 10 , 9 , 8 , 
  spiralLevelOrderTraversal2(balancedtree)        //> 
                                                  //| 1 , 
                                                  //| 3 , 2 , 
                                                  //| 4 , 5 , 6 , 7 , 
                                                  //| 15 , 14 , 13 , 12 , 11 , 10 , 9 , 8 , 
  printLevelOrderRecursive(binarySearchTree)      //> 
                                                  //| 4,
                                                  //| 2,5,
                                                  //| 1,3,
  spiralLevelOrderTraversal(binarySearchTree)     //> 
                                                  //| 4 , 
                                                  //| 5 , 2 , 
                                                  //| 1 , 3 , 
  spiralLevelOrderTraversal2(binarySearchTree)    //> 
                                                  //| 4 , 
                                                  //| 5 , 2 , 
                                                  //| 1 , 3 , 
  printLevelOrderRecursive(onlyRoot)              //> 
                                                  //| 1,
  spiralLevelOrderTraversal(onlyRoot)             //> 
                                                  //| 1 , 
  spiralLevelOrderTraversal2(onlyRoot)            //> 
                                                  //| 1 , 
  printLevelOrderRecursive(emptytree)
  spiralLevelOrderTraversal(emptytree)
  spiralLevelOrderTraversal2(emptytree)
 
}