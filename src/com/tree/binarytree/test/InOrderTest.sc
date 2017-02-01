package com.tree.binarytree.test

import com.tree.binarytree.InOrderTraversal.{inOrderTraversalRecursive,inOrderTraversalUsingStack}
import com.tree.binarytree.BinaryTree._

object InOrderTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
   inOrderTraversalRecursive(tree1)               //> 20 , 7 , 6 , 18 , 13 , 14 , 5 , 8 , 4 , 15 , 11 , 3 , 12 , 16 , 2 , 17 , 9 ,
                                                  //|  1 , 10 , 19 , 
                                                    
  inOrderTraversalRecursive(leftSkewedtree)       //> 11 , 10 , 9 , 8 , 7 , 6 , 5 , 4 , 3 , 2 , 1 , 
                                                   
  inOrderTraversalRecursive(rightSkewTree)        //> 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11 , 
  inOrderTraversalRecursive(balancedtree)         //> 8 , 4 , 9 , 2 , 10 , 5 , 11 , 1 , 12 , 6 , 13 , 3 , 14 , 7 , 15 , 
  
  
 
 //in:  20,7,6,18,13,14,5,8,4,15,11,3,12,16,2,17,9,1,10,19     11,10,9,8,7,6,5,4,3,2,1    1,2,3,4,5,6,7,8,9,10,11   8,4,9,2,10,5,11,1,12,6,13,3,14,7,15
 
  
   inOrderTraversalUsingStack(tree1)              //> 20 7 6 18 13 14 5 8 4 15 11 3 12 16 2 17 9 1 10 19 
                                                    
  inOrderTraversalUsingStack(leftSkewedtree)      //> 11 10 9 8 7 6 5 4 3 2 1 
                                                   
  inOrderTraversalUsingStack(rightSkewTree)       //> 1 2 3 4 5 6 7 8 9 10 11 
  inOrderTraversalUsingStack(balancedtree)        //> 8 4 9 2 10 5 11 1 12 6 13 3 14 7 15 
  
 
 //in:  20,7,6,18,13,14,5,8,4,15,11,3,12,16,2,17,9,1,10,19     11,10,9,8,7,6,5,4,3,2,1    1,2,3,4,5,6,7,8,9,10,11   8,4,9,2,10,5,11,1,12,6,13,3,14,7,15
 
  
  inOrderTraversalUsingStack(emptytree)
  inOrderTraversalRecursive(emptytree)
  
}