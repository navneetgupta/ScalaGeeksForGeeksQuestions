package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.IsCousindNodesInBT.isCousin

object IsCousindNodesInBTTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  isCousin(cousinNodeTest,cousinNodeTest.getLeft.getLeft,cousinNodeTest.getRight.getRight)
                                                  //> res0: Boolean = true
  
  isCousin(cousinNodeTest,cousinNodeTest.getLeft.getRight,cousinNodeTest.getRight.getLeft)
                                                  //> res1: Boolean = true
  
  isCousin(cousinNodeTest,cousinNodeTest.getRight.getLeft,cousinNodeTest.getLeft.getRight)
                                                  //> res2: Boolean = true
  
  isCousin(cousinNodeTest,cousinNodeTest.getRight.getLeft,cousinNodeTest.getRight.getRight)
                                                  //> res3: Boolean = false
  
  isCousin(cousinNodeTest,cousinNodeTest.getLeft.getLeft,cousinNodeTest.getLeft.getRight)
                                                  //> res4: Boolean = false
  
}