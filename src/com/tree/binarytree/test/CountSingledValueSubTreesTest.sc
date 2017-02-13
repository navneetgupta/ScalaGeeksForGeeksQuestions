package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.CountSingledValueSubTrees.countSingle

object CountSingledValueSubTreesTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
    
  countSingle(singleValuedSubTree1)               //> res0: Int = 4
  countSingle(singleValuedSubTree2)               //> res1: Int = 5
  
  
  
  
  countSingle(balancedtree)                       //> res2: Int = 8
  countSingle(tree1)                              //> res3: Int = 8
  countSingle(childrenSumPropertyTree)            //> res4: Int = 7
  countSingle(childrenSumPropertyTree1)           //> res5: Int = 4
  countSingle(leftSkewedtree)                     //> res6: Int = 1
  countSingle(rightSkewTree)                      //> res7: Int = 1
  
  countSingle(balancedtree)                       //> res8: Int = 8
  countSingle(balancedtree2)                      //> res9: Int = 8
  countSingle(binarySearchTree)                   //> res10: Int = 3
  countSingle(childrenSumTest)                    //> res11: Int = 4
  countSingle(doubleTreeTest1)                    //> res12: Int = 2
  countSingle(doubleTreeTest2)                    //> res13: Int = 3
  countSingle(testTree)                           //> res14: Int = 3
  countSingle(tree2)                              //> res15: Int = 4
  countSingle(sumTreeTest)                        //> res16: Int = 4
  countSingle(isSumtreeTest)                      //> res17: Int = 4
  countSingle(isSubSetTreeTest1)                  //> res18: Int = 4
  countSingle(isSubSetTreeTest2)                  //> res19: Int = 2
  countSingle(maxSumLeafToRoot)                   //> res20: Int = 3
  countSingle(isoMorphismTree1)                   //> res21: Int = 4
  countSingle(isoMorphismTree2)                   //> res22: Int = 4
  countSingle(bstToBalancedBSTTest1)              //> res23: Int = 1
  countSingle(bstToBalancedBSTTest2)              //> res24: Int = 2
  countSingle(bstToBalancedBSTTest)               //> res25: Int = 1
  countSingle(maxConcurrentIncreasing2)           //> res26: Int = 2
  countSingle(maxConcurrentIncreasing)            //> res27: Int = 4
  countSingle(pairSumTree)                        //> res28: Int = 4
  countSingle(onlyChildren)                       //> res29: Int = 2
  countSingle(sumCoveredAndUncoveredNodes)        //> res30: Int = 4

}