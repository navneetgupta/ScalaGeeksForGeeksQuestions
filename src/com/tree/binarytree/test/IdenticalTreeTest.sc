package com.tree.binarytree.test

object IdenticalTreeTest {
	import com.tree.binarytree.BinaryTree._
	import com.tree.binarytree.IdenticalTree.identicalTree
	
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  identicalTree(tree1, tree1)                     //> res0: Option[Boolean] = Some(true)
  
  identicalTree(leftSkewedtree,leftSkewedtree)    //> res1: Option[Boolean] = Some(true)
  
  identicalTree(rightSkewTree, rightSkewTree)     //> res2: Option[Boolean] = Some(true)
  
  identicalTree(balancedtree, balancedtree)       //> res3: Option[Boolean] = Some(true)
  
  identicalTree(emptytree, emptytree)             //> res4: Option[Boolean] = Some(true)
  
  identicalTree(onlyRoot, onlyRoot)               //> res5: Option[Boolean] = Some(true)
  
  identicalTree(onlyRoot, emptytree)              //> res6: Option[Boolean] = Some(false)
  
  identicalTree(onlyRoot, tree1)                  //> res7: Option[Boolean] = Some(false)
  
  identicalTree(tree1,balancedtree)               //> res8: Option[Boolean] = Some(false)
  
  identicalTree(balancedtree, rightSkewTree)      //> res9: Option[Boolean] = Some(false)
  
  identicalTree(rightSkewTree, leftSkewedtree)    //> res10: Option[Boolean] = Some(false)
}