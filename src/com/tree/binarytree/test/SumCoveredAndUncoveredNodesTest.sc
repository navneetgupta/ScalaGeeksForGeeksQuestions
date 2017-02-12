package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.SumCoveredAndUncoveredNodes.isSumSame
import com.tree.binarytree.IsSumTree

object SumCoveredAndUncoveredNodesTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  isSumSame(tree1)                                //> res0: Boolean = false
  isSumSame(childrenSumPropertyTree)              //> res1: Boolean = false
  isSumSame(childrenSumPropertyTree1)             //> res2: Boolean = false
  isSumSame(leftSkewedtree)                       //> res3: Boolean = false
  isSumSame(rightSkewTree)                        //> res4: Boolean = false
  
  isSumSame(balancedtree)                         //> res5: Boolean = false
  isSumSame(balancedtree2)                        //> res6: Boolean = false
  isSumSame(binarySearchTree)                     //> res7: Boolean = false
  isSumSame(childrenSumTest)                      //> res8: Boolean = false
  isSumSame(doubleTreeTest1)                      //> res9: Boolean = false
  isSumSame(doubleTreeTest2)                      //> res10: Boolean = false
  isSumSame(testTree)                             //> res11: Boolean = false
  isSumSame(tree2)                                //> res12: Boolean = false
  isSumSame(sumTreeTest)                          //> res13: Boolean = false
  isSumSame(isSumtreeTest)                        //> res14: Boolean = false
  isSumSame(isSubSetTreeTest1)                    //> res15: Boolean = false
  isSumSame(isSubSetTreeTest2)                    //> res16: Boolean = false
  isSumSame(maxSumLeafToRoot)                     //> res17: Boolean = false
  isSumSame(isoMorphismTree1)                     //> res18: Boolean = false
  isSumSame(isoMorphismTree2)                     //> res19: Boolean = false
  isSumSame(bstToBalancedBSTTest1)                //> res20: Boolean = false
  isSumSame(bstToBalancedBSTTest2)                //> res21: Boolean = false
  isSumSame(bstToBalancedBSTTest)                 //> res22: Boolean = false
  isSumSame(maxConcurrentIncreasing2)             //> res23: Boolean = false
  isSumSame(maxConcurrentIncreasing)              //> res24: Boolean = false
  isSumSame(pairSumTree)                          //> res25: Boolean = false
  isSumSame(onlyChildren)                         //> res26: Boolean = false
  isSumSame(sumCoveredAndUncoveredNodes)          //> res27: Boolean = true
  
  
}