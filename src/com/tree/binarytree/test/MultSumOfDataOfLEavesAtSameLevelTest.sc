package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.MultSumOfDataOfLEavesAtSameLevel.sumAndMultiplyLevelData

object MultSumOfDataOfLEavesAtSameLevelTest {

  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  sumAndMultiplyLevelData(balancedtree)           //> res0: Int = 92
  sumAndMultiplyLevelData(tree1)                  //> res1: Int = 6180928
  sumAndMultiplyLevelData(childrenSumPropertyTree)//> res2: Int = 24
  sumAndMultiplyLevelData(childrenSumPropertyTree1)
                                                  //> res3: Int = 10
  sumAndMultiplyLevelData(leftSkewedtree)         //> res4: Int = 11
  sumAndMultiplyLevelData(rightSkewTree)          //> res5: Int = 11
  
  sumAndMultiplyLevelData(balancedtree)           //> res6: Int = 92
  sumAndMultiplyLevelData(balancedtree2)          //> res7: Int = 92
  sumAndMultiplyLevelData(binarySearchTree)       //> res8: Int = 20
  sumAndMultiplyLevelData(childrenSumTest)        //> res9: Int = 39
  sumAndMultiplyLevelData(doubleTreeTest1)        //> res10: Int = 5
  sumAndMultiplyLevelData(doubleTreeTest2)        //> res11: Int = 27
  sumAndMultiplyLevelData(testTree)               //> res12: Int = 27
  sumAndMultiplyLevelData(tree2)                  //> res13: Int = 2112
  sumAndMultiplyLevelData(sumTreeTest)            //> res14: Int = 16
  sumAndMultiplyLevelData(isSumtreeTest)          //> res15: Int = 13
  sumAndMultiplyLevelData(isSubSetTreeTest1)      //> res16: Int = 270
  sumAndMultiplyLevelData(isSubSetTreeTest2)      //> res17: Int = 180
  sumAndMultiplyLevelData(maxSumLeafToRoot)       //> res18: Int = 28
  sumAndMultiplyLevelData(isoMorphismTree1)       //> res19: Int = 150
  sumAndMultiplyLevelData(isoMorphismTree2)       //> res20: Int = 150
  sumAndMultiplyLevelData(bstToBalancedBSTTest1)  //> res21: Int = 10
  sumAndMultiplyLevelData(bstToBalancedBSTTest2)  //> res22: Int = 8
  sumAndMultiplyLevelData(bstToBalancedBSTTest)   //> res23: Int = 5
  sumAndMultiplyLevelData(maxConcurrentIncreasing2)
                                                  //> res24: Int = 21
  sumAndMultiplyLevelData(maxConcurrentIncreasing)//> res25: Int = 46
  sumAndMultiplyLevelData(pairSumTree)            //> res26: Int = 72
  sumAndMultiplyLevelData(onlyChildren)           //> res27: Int = 5
  sumAndMultiplyLevelData(sumCoveredAndUncoveredNodes)
                                                  //> res28: Int = 23
  
    
  sumAndMultiplyLevelData(singleValuedSubTree1)   //> res29: Int = 15
  sumAndMultiplyLevelData(singleValuedSubTree2)   //> res30: Int = 13
  
  sumAndMultiplyLevelData(multSumLevelNods)       //> res31: Int = 208
}