package com.tree.binarytree.test

object IsHeightBalancedTreeTest {
	
	import com.tree.binarytree.IsHeightBalancedTree.isHeightBalanacedTree
	import com.tree.binarytree.BinaryTree._
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  isHeightBalanacedTree(tree1)                    //> res0: Boolean = false
  isHeightBalanacedTree(leftSkewedtree)           //> res1: Boolean = false
  isHeightBalanacedTree(rightSkewTree)            //> res2: Boolean = false
  isHeightBalanacedTree(balancedtree)             //> res3: Boolean = true
	isHeightBalanacedTree(binarySearchTree)   //> res4: Boolean = true
	isHeightBalanacedTree(balancedtree2)      //> res5: Boolean = true
	isHeightBalanacedTree(childrenSumPropertyTree1)
                                                  //> res6: Boolean = true
	isHeightBalanacedTree(childrenSumPropertyTree)
                                                  //> res7: Boolean = true
	isHeightBalanacedTree(onlyRoot)           //> res8: Boolean = true
	isHeightBalanacedTree(onlyChildren)       //> res9: Boolean = true
}