package com.tree.binarytree.test

import com.tree.binarytree.PreOrderTraversal.preOrderTraversalRecursive
import com.tree.binarytree.BinaryTree._

object PreOrderTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  preOrderTraversalRecursive(tree1)               //> 1 , 2 , 3 , 4 , 5 , 6 , 7 , 20 , 13 , 18 , 14 , 8 , 11 , 15 , 12 , 16 , 9 , 
                                                  //| 17 , 10 , 19 , 
                                                   
  preOrderTraversalRecursive(leftSkewedtree)      //> 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11 , 
                                                   
  preOrderTraversalRecursive(rightSkewTree)       //> 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11 , 
  
  preOrderTraversalRecursive(balancedtree)        //> 1 , 2 , 4 , 8 , 9 , 5 , 10 , 11 , 3 , 6 , 12 , 13 , 7 , 14 , 15 , 
  
  
  //pre : 1,2,3,4,5,6,7,20,13,18,14,8,11,15,12,16,9,17,10,19    1,2,3,4,5,6,7,8,9,10,11    1,2,4,8,9,5,10,11,3,6,12,13,7,14,15
  
  preOrderTraversalRecursive(emptytree)
  
 

 }