package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.GetLevelOfANode.getLevelOfANode

object GetLevelOfANodeTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
	getLevelOfANode(tree1, 2)                 //> res0: Int = 2
	getLevelOfANode(tree1, 3)                 //> res1: Int = 3
	getLevelOfANode(tree1, 4)                 //> res2: Int = 4
	getLevelOfANode(tree1, 5)                 //> res3: Int = 5
	getLevelOfANode(tree1, 16)                //> res4: Int = 5
	getLevelOfANode(tree1, 20)                //> res5: Int = 8
	getLevelOfANode(tree2, 2)                 //> res6: Int = 0
}