package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.ReverseLevelOrderTraversal._


object ReverseLevelOrderTraversalTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  reverseLevelOrder(tree1)                        //> 20 , 18 , 14 , 7 , 13 , 6 , 8 , 15 , 5 , 11 , 16 , 4 , 12 , 17 , 3 , 9 , 19 
                                                  //| , 2 , 10 , 1 , 
  reverseLevelOrderUsingStackAndQueue(tree1)      //> 20 , 18 , 14 , 7 , 13 , 6 , 8 , 15 , 5 , 11 , 16 , 4 , 12 , 17 , 3 , 9 , 19 
                                                  //| , 2 , 10 , 1 , 
 
  reverseLevelOrder(leftSkewedtree)               //> 11 , 10 , 9 , 8 , 7 , 6 , 5 , 4 , 3 , 2 , 1 , 
  reverseLevelOrderUsingStackAndQueue(leftSkewedtree)
                                                  //> 11 , 10 , 9 , 8 , 7 , 6 , 5 , 4 , 3 , 2 , 1 , 
  
  reverseLevelOrder(rightSkewTree)                //> 11 , 10 , 9 , 8 , 7 , 6 , 5 , 4 , 3 , 2 , 1 , 
  reverseLevelOrderUsingStackAndQueue(rightSkewTree)
                                                  //> 11 , 10 , 9 , 8 , 7 , 6 , 5 , 4 , 3 , 2 , 1 , 
  
  reverseLevelOrder(balancedtree)                 //> 8 , 9 , 10 , 11 , 12 , 13 , 14 , 15 , 4 , 5 , 6 , 7 , 2 , 3 , 1 , 
  reverseLevelOrderUsingStackAndQueue(balancedtree)
                                                  //> 8 , 9 , 10 , 11 , 12 , 13 , 14 , 15 , 4 , 5 , 6 , 7 , 2 , 3 , 1 , 
  
  reverseLevelOrder(balancedtree2)                //> 8 , 9 , 10 , 11 , 12 , 13 , 14 , 15 , 4 , 5 , 6 , 7 , 2 , 60 , 200 , 
  reverseLevelOrderUsingStackAndQueue(balancedtree2)
                                                  //> 8 , 9 , 10 , 11 , 12 , 13 , 14 , 15 , 4 , 5 , 6 , 7 , 2 , 60 , 200 , 
  
  reverseLevelOrder(binarySearchTree)             //> 1 , 3 , 2 , 5 , 4 , 
  reverseLevelOrderUsingStackAndQueue(binarySearchTree)
                                                  //> 1 , 3 , 2 , 5 , 4 , 
  
  reverseLevelOrder(childrenSumPropertyTree1)     //> 3 , 5 , 2 , 8 , 2 , 10 , 
  reverseLevelOrderUsingStackAndQueue(childrenSumPropertyTree1)
                                                  //> 3 , 5 , 2 , 8 , 2 , 10 , 
  
  reverseLevelOrder(childrenSumTest)              //> 3 , 5 , 1 , 30 , 7 , 2 , 50 , 
  
  
  reverseLevelOrderUsingStackAndQueue(childrenSumTest)
}