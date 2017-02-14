package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.MinimumDepthOfBT.minDepth
object MinimumDepthOfBTTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  minDepth(tree1)                                 //> res0: Int = 3
  minDepth(childrenSumPropertyTree)               //> res1: Int = 3
  minDepth(childrenSumPropertyTree1)              //> res2: Int = 3
  minDepth(leftSkewedtree)                        //> res3: Int = 11
  minDepth(rightSkewTree)                         //> res4: Int = 11
  
  minDepth(balancedtree)                          //> res5: Int = 4
  minDepth(balancedtree2)                         //> res6: Int = 4
  minDepth(binarySearchTree)                      //> res7: Int = 2
  minDepth(childrenSumTest)                       //> res8: Int = 3
  minDepth(doubleTreeTest1)                       //> res9: Int = 2
  minDepth(doubleTreeTest2)                       //> res10: Int = 2
  minDepth(testTree)                              //> res11: Int = 2
  minDepth(tree2)                                 //> res12: Int = 2
  minDepth(sumTreeTest)                           //> res13: Int = 3
  minDepth(isSumtreeTest)                         //> res14: Int = 3
  minDepth(isSubSetTreeTest1)                     //> res15: Int = 3
  minDepth(isSubSetTreeTest2)                     //> res16: Int = 2
  minDepth(maxSumLeafToRoot)                      //> res17: Int = 2
  minDepth(isoMorphismTree1)                      //> res18: Int = 3
  minDepth(isoMorphismTree2)                      //> res19: Int = 3
  minDepth(bstToBalancedBSTTest1)                 //> res20: Int = 3
  minDepth(bstToBalancedBSTTest2)                 //> res21: Int = 4
  minDepth(bstToBalancedBSTTest)                  //> res22: Int = 5
  minDepth(maxConcurrentIncreasing2)              //> res23: Int = 4
  minDepth(maxConcurrentIncreasing)               //> res24: Int = 3
  minDepth(pairSumTree)                           //> res25: Int = 3
  minDepth(onlyChildren)                          //> res26: Int = 2
  minDepth(sumCoveredAndUncoveredNodes)           //> res27: Int = 3
  minDepth(symmetricTree)                         //> res28: Int = 3
}