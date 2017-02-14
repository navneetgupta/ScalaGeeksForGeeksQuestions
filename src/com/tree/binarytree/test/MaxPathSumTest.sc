package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.MaxPathSum.findMax
object MaxPathSumTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  findMax(tree1)                                  //> res0: Int = 52
  findMax(childrenSumPropertyTree)                //> res1: Int = 23
  findMax(childrenSumPropertyTree1)               //> res2: Int = 23
  findMax(leftSkewedtree)                         //> res3: Int = 66
  findMax(rightSkewTree)                          //> res4: Int = 66
  
  findMax(balancedtree)                           //> res5: Int = 26
  findMax(balancedtree2)                          //> res6: Int = 282
  findMax(binarySearchTree)                       //> res7: Int = 9
  findMax(childrenSumTest)                        //> res8: Int = 82
  findMax(doubleTreeTest1)                        //> res9: Int = 4
  findMax(doubleTreeTest2)                        //> res10: Int = 8
  findMax(testTree)                               //> res11: Int = 8
  findMax(tree2)                                  //> res12: Int = 54
  findMax(sumTreeTest)                            //> res13: Int = 23
  findMax(isSumtreeTest)                          //> res14: Int = 42
  findMax(isSubSetTreeTest1)                      //> res15: Int = 70
  findMax(isSubSetTreeTest2)                      //> res16: Int = 44
  findMax(maxSumLeafToRoot)                       //> res17: Int = 17
  findMax(isoMorphismTree1)                       //> res18: Int = 16
  findMax(isoMorphismTree2)                       //> res19: Int = 16
  findMax(bstToBalancedBSTTest1)                  //> res20: Int = 60
  findMax(bstToBalancedBSTTest2)                  //> res21: Int = 22
  findMax(bstToBalancedBSTTest)                   //> res22: Int = 36
  findMax(maxConcurrentIncreasing2)               //> res23: Int = 41
  findMax(maxConcurrentIncreasing)                //> res24: Int = 34
  findMax(pairSumTree)                            //> res25: Int = 34
  findMax(onlyChildren)                           //> res26: Int = 4
  findMax(sumCoveredAndUncoveredNodes)            //> res27: Int = 33
  findMax(symmetricTree)                          //> res28: Int = 7
}