package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.MaxDiffBtwnNodeAndItsAncestor.maxDiff

object MaxDiffBtwnNodeAndItsAncestorTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  maxDiff(balancedtree)                           //> res0: Int = -1
  maxDiff(tree1)                                  //> res1: Int = -1
  maxDiff(childrenSumPropertyTree)                //> res2: Int = 10
  maxDiff(childrenSumPropertyTree1)               //> res3: Int = 8
  maxDiff(leftSkewedtree)                         //> res4: Int = -1
  maxDiff(rightSkewTree)                          //> res5: Int = -1
  
  maxDiff(balancedtree)                           //> res6: Int = -1
  maxDiff(balancedtree2)                          //> res7: Int = 198
  maxDiff(binarySearchTree)                       //> res8: Int = 3
  maxDiff(childrenSumTest)                        //> res9: Int = 49
  maxDiff(doubleTreeTest1)                        //> res10: Int = -1
  maxDiff(doubleTreeTest2)                        //> res11: Int = -1
  maxDiff(testTree)                               //> res12: Int = -1
  maxDiff(tree2)                                  //> res13: Int = 16
  maxDiff(sumTreeTest)                            //> res14: Int = 14
  maxDiff(isSumtreeTest)                          //> res15: Int = 23
  maxDiff(isSubSetTreeTest1)                      //> res16: Int = 23
  maxDiff(isSubSetTreeTest2)                      //> res17: Int = 6
  maxDiff(maxSumLeafToRoot)                       //> res18: Int = 14
  maxDiff(isoMorphismTree1)                       //> res19: Int = -1
  maxDiff(isoMorphismTree2)                       //> res20: Int = -1
  maxDiff(bstToBalancedBSTTest1)                  //> res21: Int = 20
  maxDiff(bstToBalancedBSTTest2)                  //> res22: Int = 3
  maxDiff(bstToBalancedBSTTest)                   //> res23: Int = 5
  maxDiff(maxConcurrentIncreasing2)               //> res24: Int = 3
  maxDiff(maxConcurrentIncreasing)                //> res25: Int = 2
  maxDiff(pairSumTree)                            //> res26: Int = 10
  maxDiff(onlyChildren)                           //> res27: Int = -1
  maxDiff(sumCoveredAndUncoveredNodes)            //> res28: Int = 9
  
    
  maxDiff(singleValuedSubTree1)                   //> res29: Int = 4
  maxDiff(singleValuedSubTree2)                   //> res30: Int = 1
}