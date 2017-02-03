package com.tree.binarytree.test

import com.tree.binarytree.PostOrderTraversal.postOrderTraversalRecursive
import com.tree.binarytree.PostOrderIterative.postOrderIterativeUsing2Stk
import com.tree.binarytree.BinaryTree._

object PostOrderTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  postOrderTraversalRecursive(tree1)              //> 20 , 7 , 18 , 14 , 13 , 6 , 8 , 5 , 15 , 11 , 4 , 16 , 12 , 3 , 17 , 9 , 2 ,
                                                  //|  19 , 10 , 1 , 
                                                    
  postOrderTraversalRecursive(leftSkewedtree)     //> 11 , 10 , 9 , 8 , 7 , 6 , 5 , 4 , 3 , 2 , 1 , 
                                                   
  postOrderTraversalRecursive(rightSkewTree)      //> 11 , 10 , 9 , 8 , 7 , 6 , 5 , 4 , 3 , 2 , 1 , 
  postOrderTraversalRecursive(balancedtree)       //> 8 , 9 , 4 , 10 , 11 , 5 , 2 , 12 , 13 , 6 , 14 , 15 , 7 , 3 , 1 , 
  postOrderIterativeUsing2Stk(tree1)              //> 20 , 7 , 18 , 14 , 13 , 6 , 8 , 5 , 15 , 11 , 4 , 16 , 12 , 3 , 17 , 9 , 2 ,
                                                  //|  19 , 10 , 1 , 
                                                    
  postOrderIterativeUsing2Stk(leftSkewedtree)     //> 11 , 10 , 9 , 8 , 7 , 6 , 5 , 4 , 3 , 2 , 1 , 
                                                   
  postOrderIterativeUsing2Stk(rightSkewTree)      //> 11 , 10 , 9 , 8 , 7 , 6 , 5 , 4 , 3 , 2 , 1 , 
  postOrderIterativeUsing2Stk(balancedtree)       //> 8 , 9 , 4 , 10 , 11 , 5 , 2 , 12 , 13 , 6 , 14 , 15 , 7 , 3 , 1 , 
  postOrderTraversalRecursive(emptytree)
  
  
  
  //20,7,18,14,13,6,8,5,15,11,4,16,12,3,17,9,2,19,10,1    11,10,9,8,7,6,5,4,3,2,1   11,10,9,8,7,6,5,4,3,2,1   8,9,4,10,11,5,2,12,13,6,14,15,7,3,1
}