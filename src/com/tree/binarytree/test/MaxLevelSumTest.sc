package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.MaxLevelSum.maxLevelSum
object MaxLevelSumTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  maxLevelSum(tree1)                              //> res0: Int = 52
  maxLevelSum(childrenSumPropertyTree)            //> res1: Int = 10
  maxLevelSum(childrenSumPropertyTree1)           //> res2: Int = 10
  maxLevelSum(leftSkewedtree)                     //> res3: Int = 11
  maxLevelSum(rightSkewTree)                      //> res4: Int = 11
  
  maxLevelSum(balancedtree)                       //> res5: Int = 92
  maxLevelSum(balancedtree2)                      //> res6: Int = 200
  maxLevelSum(binarySearchTree)                   //> res7: Int = 4
  maxLevelSum(childrenSumTest)                    //> res8: Int = 50
  maxLevelSum(doubleTreeTest1)                    //> res9: Int = 5
  maxLevelSum(doubleTreeTest2)                    //> res10: Int = 9
  maxLevelSum(testTree)                           //> res11: Int = 9
  maxLevelSum(tree2)                              //> res12: Int = 24
  maxLevelSum(sumTreeTest)                        //> res13: Int = 16
  maxLevelSum(isSumtreeTest)                      //> res14: Int = 26
  maxLevelSum(isSubSetTreeTest1)                  //> res15: Int = 30
  maxLevelSum(isSubSetTreeTest2)                  //> res16: Int = 30
  maxLevelSum(maxSumLeafToRoot)                   //> res17: Int = 10
  maxLevelSum(isoMorphismTree1)                   //> res18: Int = 15
  maxLevelSum(isoMorphismTree2)                   //> res19: Int = 15
  maxLevelSum(bstToBalancedBSTTest1)              //> res20: Int = 30
  maxLevelSum(bstToBalancedBSTTest2)              //> res21: Int = 8
  maxLevelSum(bstToBalancedBSTTest)               //> res22: Int = 10
  maxLevelSum(maxConcurrentIncreasing2)           //> res23: Int = 21
  maxLevelSum(maxConcurrentIncreasing)            //> res24: Int = 46
  maxLevelSum(pairSumTree)                        //> res25: Int = 8
  maxLevelSum(onlyRoot)                           //> res26: Int = 1
  maxLevelSum(onlyChildren)                       //> res27: Int = 5
  maxLevelSum(emptytree)                          //> res28: Int = 0
}