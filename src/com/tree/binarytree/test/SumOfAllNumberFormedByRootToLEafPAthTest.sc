package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.SumOfAllNumberFormedByRootToLEafPAth.treePathsSum

object SumOfAllNumberFormedByRootToLEafPAthTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  treePathsSum(tree1)                             //> res0: Int = 37298127
  treePathsSum(childrenSumPropertyTree)           //> res1: Int = 43570
  treePathsSum(childrenSumPropertyTree1)          //> res2: Int = 3190
  treePathsSum(leftSkewedtree)                    //> res3: Int = -539222877
  treePathsSum(rightSkewTree)                     //> res4: Int = -539222877
  
  treePathsSum(balancedtree)                      //> res5: Int = 10532
  treePathsSum(balancedtree2)                     //> res6: Int = 1625332
  treePathsSum(binarySearchTree)                  //> res7: Int = 889
  treePathsSum(childrenSumTest)                   //> res8: Int = 20219
  treePathsSum(doubleTreeTest1)                   //> res9: Int = 25
  treePathsSum(doubleTreeTest2)                   //> res10: Int = 262
  treePathsSum(testTree)                          //> res11: Int = 262
  treePathsSum(tree2)                             //> res12: Int = 44170
  treePathsSum(sumTreeTest)                       //> res13: Int = 4096
  treePathsSum(isSumtreeTest)                     //> res14: Int = 8043
  treePathsSum(isSubSetTreeTest1)                 //> res15: Int = 32409
  treePathsSum(isSubSetTreeTest2)                 //> res16: Int = 1176
  treePathsSum(maxSumLeafToRoot)                  //> res17: Int = 2071
  treePathsSum(isoMorphismTree1)                  //> res18: Int = 2775
  treePathsSum(isoMorphismTree2)                  //> res19: Int = 2775
  treePathsSum(bstToBalancedBSTTest1)             //> res20: Int = 3210
  treePathsSum(bstToBalancedBSTTest2)             //> res21: Int = 8888
  treePathsSum(bstToBalancedBSTTest)              //> res22: Int = 108765
  treePathsSum(maxConcurrentIncreasing2)          //> res23: Int = 12111
  treePathsSum(maxConcurrentIncreasing)           //> res24: Int = 4446
  treePathsSum(pairSumTree)                       //> res25: Int = 103765
  treePathsSum(onlyChildren)                      //> res26: Int = 25
  treePathsSum(sumCoveredAndUncoveredNodes)       //> res27: Int = 26584
  treePathsSum(symmetricTree)                     //> res28: Int = 494
}