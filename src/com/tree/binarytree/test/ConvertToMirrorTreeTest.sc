package com.tree.binarytree.test

object ConvertToMirrorTreeTest {
	import com.tree.binarytree.BinaryTree._
	import com.tree.binarytree.ConvertToMirrorTree.convertToMirrorTree
	import com.tree.binarytree.InOrderTraversal.inOrderTraversalRecursive
	import com.tree.binarytree.PreOrderTraversal.preOrderTraversalRecursive
	
 
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  inOrderTraversalRecursive(tree1)                //> 20 , 7 , 6 , 18 , 13 , 14 , 5 , 8 , 4 , 15 , 11 , 3 , 12 , 16 , 2 , 17 , 9 ,
                                                  //|  1 , 10 , 19 , 
  inOrderTraversalRecursive(convertToMirrorTree(tree1))
                                                  //> 19 , 10 , 1 , 9 , 17 , 2 , 16 , 12 , 3 , 11 , 15 , 4 , 8 , 5 , 14 , 13 , 18 
                                                  //| , 6 , 7 , 20 , 
  inOrderTraversalRecursive(tree2)                //> 4 , 8 , 10 , 12 , 14 , 20 , 22 , 
  preOrderTraversalRecursive(tree2)               //> 20 , 8 , 4 , 12 , 10 , 14 , 22 , 
  preOrderTraversalRecursive(convertToMirrorTree(tree2))
                                                  //> 20 , 22 , 8 , 12 , 14 , 10 , 4 , 
  
  inOrderTraversalRecursive(leftSkewedtree)       //> 11 , 10 , 9 , 8 , 7 , 6 , 5 , 4 , 3 , 2 , 1 , 
  inOrderTraversalRecursive(convertToMirrorTree(leftSkewedtree))
                                                  //> 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11 , 
  
  inOrderTraversalRecursive(rightSkewTree)        //> 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11 , 
  inOrderTraversalRecursive(convertToMirrorTree(rightSkewTree))
                                                  //> 11 , 10 , 9 , 8 , 7 , 6 , 5 , 4 , 3 , 2 , 1 , 
  
  inOrderTraversalRecursive(balancedtree)         //> 8 , 4 , 9 , 2 , 10 , 5 , 11 , 1 , 12 , 6 , 13 , 3 , 14 , 7 , 15 , 
  inOrderTraversalRecursive(convertToMirrorTree(balancedtree))
                                                  //> 15 , 7 , 14 , 3 , 13 , 6 , 12 , 1 , 11 , 5 , 10 , 2 , 9 , 4 , 8 , 
  
  inOrderTraversalRecursive(onlyRoot)             //> 1 , 
  inOrderTraversalRecursive(convertToMirrorTree(onlyRoot))
                                                  //> 1 , 
                                                  
  inOrderTraversalRecursive(binarySearchTree)     //> 1 , 2 , 3 , 4 , 5 , 
  inOrderTraversalRecursive(convertToMirrorTree(binarySearchTree))
                                                  //> 5 , 4 , 3 , 2 , 1 , 
  
  inOrderTraversalRecursive(emptytree)
  inOrderTraversalRecursive(convertToMirrorTree(emptytree))
  
  
  

}