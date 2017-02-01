package com.tree.binarytree.test

object IsChildrenSumPropertyTest {
	import com.tree.binarytree.BinaryTree._
	import com.tree.binarytree.IsChildrenSumProperty.isChildrenSumProperty
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  isChildrenSumProperty(tree1)                    //> res0: Boolean = false
  isChildrenSumProperty(leftSkewedtree)           //> res1: Boolean = false
  isChildrenSumProperty(rightSkewTree)            //> res2: Boolean = false
  isChildrenSumProperty(binarySearchTree)         //> res3: Boolean = false
  isChildrenSumProperty(balancedtree)             //> res4: Boolean = false
  isChildrenSumProperty(onlyRoot)                 //> res5: Boolean = true
  isChildrenSumProperty(emptytree)                //> res6: Boolean = true
  isChildrenSumProperty(childrenSumPropertyTree)  //> res7: Boolean = true
  isChildrenSumProperty(childrenSumPropertyTree1) //> res8: Boolean = true
  
 
}