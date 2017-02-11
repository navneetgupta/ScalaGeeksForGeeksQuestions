package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.DepthOfDeepestOddLevelNode.depthDeepestOddLevelNode
object DepthOfDeepestOddLevelNodeTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  depthDeepestOddLevelNode(tree1)                 //> res0: Int = 5
  depthDeepestOddLevelNode(deepestNodeTest)       //> res1: Int = 3
  depthDeepestOddLevelNode(deepestNodeTest2)      //> res2: Int = 5
  
}