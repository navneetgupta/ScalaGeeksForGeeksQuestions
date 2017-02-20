package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.IsHeightBalancedLikeRBTree.isBalanced

object IsHeightBalancedLikeRBTreeTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  isBalanced(tree1)                               //> res0: Boolean = false
  isBalanced(childrenSumPropertyTree)             //> res1: Boolean = true
  isBalanced(childrenSumPropertyTree1)            //> res2: Boolean = true
  isBalanced(leftSkewedtree)                      //> res3: Boolean = false
  isBalanced(rightSkewTree)                       //> res4: Boolean = false
  
  isBalanced(balancedtree)                        //> res5: Boolean = true
  isBalanced(balancedtree2)                       //> res6: Boolean = true
  isBalanced(binarySearchTree)                    //> res7: Boolean = true
  isBalanced(childrenSumTest)                     //> res8: Boolean = true
  isBalanced(doubleTreeTest1)                     //> res9: Boolean = true
  isBalanced(doubleTreeTest2)                     //> res10: Boolean = true
  isBalanced(testTree)                            //> res11: Boolean = true
  isBalanced(tree2)                               //> res12: Boolean = true
  isBalanced(sumTreeTest)                         //> res13: Boolean = true
  isBalanced(isSumtreeTest)                       //> res14: Boolean = true
  isBalanced(isSubSetTreeTest1)                   //> res15: Boolean = true
  isBalanced(isSubSetTreeTest2)                   //> res16: Boolean = true
  isBalanced(maxSumLeafToRoot)                    //> res17: Boolean = true
  isBalanced(isoMorphismTree1)                    //> res18: Boolean = true
  isBalanced(isoMorphismTree2)                    //> res19: Boolean = true
  isBalanced(bstToBalancedBSTTest1)               //> res20: Boolean = false
  isBalanced(bstToBalancedBSTTest2)               //> res21: Boolean = false
  isBalanced(bstToBalancedBSTTest)                //> res22: Boolean = false
  isBalanced(maxConcurrentIncreasing2)            //> res23: Boolean = false
  isBalanced(maxConcurrentIncreasing)             //> res24: Boolean = true
  isBalanced(pairSumTree)                         //> res25: Boolean = false
  isBalanced(onlyChildren)                        //> res26: Boolean = true
  isBalanced(sumCoveredAndUncoveredNodes)         //> res27: Boolean = false
  isBalanced(symmetricTree)                       //> res28: Boolean = true
  isBalanced(heightRBTreeBalnaces)                //> res29: Boolean = false
  isBalanced(heightRBTreeBalnaces2)               //> res30: Boolean = true
  isBalanced(heightRBTreeBalnaces3)               //> res31: Boolean = true
}