package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.DepthOfDeepestOddLevelLeafNode.depthOfOddLevelLeaf
object DepthOfDeepestOddLevelLeafNodeTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  depthOfOddLevelLeaf(tree1)                      //> Node is with value ==16
                                                  //| Node is with value ==19
                                                  //| res0: Int = 5
  
  depthOfOddLevelLeaf(tree2)                      //> Node is with value ==4
                                                  //| res1: Int = 3
  depthOfOddLevelLeaf(leftSkewedtree)             //> Node is with value ==11
                                                  //| res2: Int = 11
  depthOfOddLevelLeaf(rightSkewTree)              //> Node is with value ==11
                                                  //| res3: Int = 11
  depthOfOddLevelLeaf(binarySearchTree)           //> Node is with value ==1
                                                  //| Node is with value ==3
                                                  //| res4: Int = 3
  depthOfOddLevelLeaf(balancedtree)               //> res5: Int = 0
  depthOfOddLevelLeaf(balancedtree2)              //> res6: Int = 0
}