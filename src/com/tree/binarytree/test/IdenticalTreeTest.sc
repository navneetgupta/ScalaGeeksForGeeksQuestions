package com.tree.binarytree.test

object IdenticalTreeTest {
	import com.tree.binarytree.BinaryTree._
	import com.tree.binarytree.IdenticalTree.identicalTree
	import com.tree.binarytree.IdenticalTreeIterative.areIdenticalTree
	
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  identicalTree(tree1, tree1)                     //> res0: Option[Boolean] = Some(true)
  areIdenticalTree(tree1, tree1)                  //> res1: Boolean = true
  
  identicalTree(leftSkewedtree,leftSkewedtree)    //> res2: Option[Boolean] = Some(true)
  
  identicalTree(rightSkewTree, rightSkewTree)     //> res3: Option[Boolean] = Some(true)
  
  identicalTree(balancedtree, balancedtree)       //> res4: Option[Boolean] = Some(true)
  
  identicalTree(emptytree, emptytree)             //> res5: Option[Boolean] = Some(true)
  
  identicalTree(onlyRoot, onlyRoot)               //> res6: Option[Boolean] = Some(true)
  
  identicalTree(onlyRoot, emptytree)              //> res7: Option[Boolean] = Some(false)
  
  identicalTree(onlyRoot, tree1)                  //> res8: Option[Boolean] = Some(false)
  
  identicalTree(tree1,balancedtree)               //> res9: Option[Boolean] = Some(false)
  
  identicalTree(balancedtree, rightSkewTree)      //> res10: Option[Boolean] = Some(false)
  
  identicalTree(rightSkewTree, leftSkewedtree)    //> res11: Option[Boolean] = Some(false)
  
  
  areIdenticalTree(leftSkewedtree,leftSkewedtree) //> res12: Boolean = true
  
  areIdenticalTree(rightSkewTree, rightSkewTree)  //> res13: Boolean = true
  
  areIdenticalTree(balancedtree, balancedtree)    //> res14: Boolean = true
  
  areIdenticalTree(emptytree, emptytree)          //> res15: Boolean = true
  
  areIdenticalTree(onlyRoot, onlyRoot)            //> res16: Boolean = true
  
  areIdenticalTree(onlyRoot, emptytree)           //> res17: Boolean = false
  
  areIdenticalTree(onlyRoot, tree1)               //> res18: Boolean = false
  
  areIdenticalTree(tree1,balancedtree)            //> res19: Boolean = false
  
  areIdenticalTree(balancedtree, rightSkewTree)   //> res20: Boolean = false
  
  areIdenticalTree(rightSkewTree, leftSkewedtree) //> res21: Boolean = false
}