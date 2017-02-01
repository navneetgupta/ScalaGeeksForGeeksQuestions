package com.tree.binarytree.test

object MaxDepthOrHeightTest {
	import com.tree.binarytree.BinaryTree._
	import com.tree.binarytree.MaxDepthOrHeight.{maxDepthOrHeight,maxDepthOrHeightViaFold}
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  maxDepthOrHeight(tree1)                         //> res0: Int = 8
  maxDepthOrHeightViaFold(tree1)                  //> res1: Int = 8
  
  maxDepthOrHeight(leftSkewedtree)                //> res2: Int = 11
  maxDepthOrHeightViaFold(leftSkewedtree)         //> res3: Int = 11
	
	maxDepthOrHeight(rightSkewTree)           //> res4: Int = 11
	maxDepthOrHeightViaFold(rightSkewTree)    //> res5: Int = 11
	
	maxDepthOrHeight(emptytree)               //> res6: Int = 0
	maxDepthOrHeightViaFold(emptytree)        //> res7: Int = 0
	
	maxDepthOrHeight(onlyRoot)                //> res8: Int = 1
	maxDepthOrHeightViaFold(onlyRoot)         //> res9: Int = 1
	
	maxDepthOrHeight(balancedtree)            //> res10: Int = 4
	maxDepthOrHeightViaFold(balancedtree)     //> res11: Int = 4
}