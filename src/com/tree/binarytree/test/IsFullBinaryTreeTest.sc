package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.IsFullBinaryTree.isFullBinaryTree

object IsFullBinaryTreeTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  isFullBinaryTree(tree1)                         //> res0: Boolean = false
  isFullBinaryTree(childrenSumPropertyTree)       //> res1: Boolean = false
  isFullBinaryTree(childrenSumPropertyTree1)      //> res2: Boolean = false
  isFullBinaryTree(leftSkewedtree)                //> res3: Boolean = false
  isFullBinaryTree(rightSkewTree)                 //> res4: Boolean = false
  
  isFullBinaryTree(balancedtree)                  //> res5: Boolean = true
  isFullBinaryTree(balancedtree2)                 //> res6: Boolean = true
  isFullBinaryTree(binarySearchTree)              //> res7: Boolean = true
  isFullBinaryTree(childrenSumTest)               //> res8: Boolean = true
  isFullBinaryTree(doubleTreeTest1)               //> res9: Boolean = true
  isFullBinaryTree(doubleTreeTest2)               //> res10: Boolean = true
  isFullBinaryTree(testTree)                      //> res11: Boolean = true
  isFullBinaryTree(tree2)                         //> res12: Boolean = true
  isFullBinaryTree(sumTreeTest)                   //> res13: Boolean = true
  isFullBinaryTree(isSumtreeTest)                 //> res14: Boolean = false
  isFullBinaryTree(isSubSetTreeTest1)             //> res15: Boolean = false
  isFullBinaryTree(isSubSetTreeTest2)             //> res16: Boolean = false
  isFullBinaryTree(maxSumLeafToRoot)              //> res17: Boolean = true
  isFullBinaryTree(isoMorphismTree1)              //> res18: Boolean = false
  isFullBinaryTree(isoMorphismTree2)              //> res19: Boolean = false
  isFullBinaryTree(bstToBalancedBSTTest1)         //> res20: Boolean = false
  isFullBinaryTree(bstToBalancedBSTTest2)         //> res21: Boolean = false
  isFullBinaryTree(bstToBalancedBSTTest)          //> res22: Boolean = false
  isFullBinaryTree(maxConcurrentIncreasing2)      //> res23: Boolean = false
  isFullBinaryTree(maxConcurrentIncreasing)       //> res24: Boolean = true
  isFullBinaryTree(pairSumTree)                   //> res25: Boolean = false
  isFullBinaryTree(onlyChildren)                  //> res26: Boolean = true
  isFullBinaryTree(sumCoveredAndUncoveredNodes)   //> res27: Boolean = false
  isFullBinaryTree(symmetricTree)                 //> res28: Boolean = true
}