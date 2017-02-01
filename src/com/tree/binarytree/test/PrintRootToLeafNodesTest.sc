package com.tree.binarytree.test

object PrintRootToLeafNodesTest {

	import com.tree.binarytree.BinaryTree._
	import com.tree.binarytree.PrintRootToLeafNodes.printAllPathsFromRootToLeaf
	import com.tree.binarytree.RootToLeafPathSum.isRootToLeafPathSumEqualGivenX2
	
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  printAllPathsFromRootToLeaf(binarySearchTree, Nil)
                                                  //> List(1, 2, 4)List(3, 2, 4)List(5, 4)
                                                  
  isRootToLeafPathSumEqualGivenX2(binarySearchTree,6)
                                                  //> res0: Boolean = false
  isRootToLeafPathSumEqualGivenX2(binarySearchTree,9)
                                                  //> res1: Boolean = true
  isRootToLeafPathSumEqualGivenX2(binarySearchTree,10)
                                                  //> res2: Boolean = false
  isRootToLeafPathSumEqualGivenX2(binarySearchTree,3)
                                                  //> res3: Boolean = false
  isRootToLeafPathSumEqualGivenX2(binarySearchTree,5)
                                                  //> res4: Boolean = false
  isRootToLeafPathSumEqualGivenX2(binarySearchTree,7)
                                                  //> res5: Boolean = true
                                                  
                                                  
                                                  
                                                  
  printAllPathsFromRootToLeaf(tree1, Nil)         //> List(20, 7, 6, 5, 4, 3, 2, 1)List(18, 13, 6, 5, 4, 3, 2, 1)List(14, 13, 6, 5
                                                  //| , 4, 3, 2, 1)List(8, 5, 4, 3, 2, 1)List(15, 11, 4, 3, 2, 1)List(16, 12, 3, 2
                                                  //| , 1)List(17, 9, 2, 1)List(19, 10, 1)
                                                  
  isRootToLeafPathSumEqualGivenX2(tree1,48)       //> res6: Boolean = true
  isRootToLeafPathSumEqualGivenX2(tree1,52)       //> res7: Boolean = true
  isRootToLeafPathSumEqualGivenX2(tree1,23)       //> res8: Boolean = true
    
  isRootToLeafPathSumEqualGivenX2(tree1,36)       //> res9: Boolean = true
  isRootToLeafPathSumEqualGivenX2(tree1,30)       //> res10: Boolean = true
   
  isRootToLeafPathSumEqualGivenX2(tree1,15)       //> res11: Boolean = false
  isRootToLeafPathSumEqualGivenX2(tree1,29)       //> res12: Boolean = true
    
  isRootToLeafPathSumEqualGivenX2(tree1,21)       //> res13: Boolean = false
  isRootToLeafPathSumEqualGivenX2(tree1,34)       //> res14: Boolean = true
  isRootToLeafPathSumEqualGivenX2(tree1,28)       //> res15: Boolean = false
                                                  
  printAllPathsFromRootToLeaf(leftSkewedtree,Nil) //> List(11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
  
  isRootToLeafPathSumEqualGivenX2(leftSkewedtree,66)
                                                  //> res16: Boolean = true
  isRootToLeafPathSumEqualGivenX2(leftSkewedtree,55)
                                                  //> res17: Boolean = false
   
  isRootToLeafPathSumEqualGivenX2(leftSkewedtree,45)
                                                  //> res18: Boolean = false
  
  printAllPathsFromRootToLeaf(rightSkewTree, Nil) //> List(11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
  
   
  isRootToLeafPathSumEqualGivenX2(rightSkewTree ,65)
                                                  //> res19: Boolean = false
  isRootToLeafPathSumEqualGivenX2(rightSkewTree ,24)
                                                  //> res20: Boolean = false
  
  printAllPathsFromRootToLeaf(balancedtree, Nil)  //> List(8, 4, 2, 1)List(9, 4, 2, 1)List(10, 5, 2, 1)List(11, 5, 2, 1)List(12, 
                                                  //| 6, 3, 1)List(13, 6, 3, 1)List(14, 7, 3, 1)List(15, 7, 3, 1)
 
  isRootToLeafPathSumEqualGivenX2(balancedtree ,15)
                                                  //> res21: Boolean = true
  isRootToLeafPathSumEqualGivenX2(balancedtree ,16)
                                                  //> res22: Boolean = true
  
  isRootToLeafPathSumEqualGivenX2(balancedtree ,18)
                                                  //> res23: Boolean = true
  isRootToLeafPathSumEqualGivenX2(balancedtree ,19)
                                                  //> res24: Boolean = true
 	 
  isRootToLeafPathSumEqualGivenX2(balancedtree ,7)//> res25: Boolean = false
  isRootToLeafPathSumEqualGivenX2(balancedtree ,15)
                                                  //> res26: Boolean = true
  isRootToLeafPathSumEqualGivenX2(balancedtree ,17)
                                                  //> res27: Boolean = false
  isRootToLeafPathSumEqualGivenX2(balancedtree ,14)
                                                  //> res28: Boolean = false

}