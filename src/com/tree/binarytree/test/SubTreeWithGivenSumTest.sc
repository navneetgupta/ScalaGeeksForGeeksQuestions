package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.SubTreeWithGivenSum.subTreeSum
object SubTreeWithGivenSumTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  subTreeSum(tree1,32)                            //> res0: Boolean = false
                                
  subTreeSum(tree1,45)                            //> res1: Boolean = true
  subTreeSum(tree1,78)                            //> res2: Boolean = true
  subTreeSum(tree1,79)                            //> res3: Boolean = false
  subTreeSum(tree1,91)                            //> res4: Boolean = true
  subTreeSum(tree1,92)                            //> res5: Boolean = false
  subTreeSum(tree1,117)                           //> res6: Boolean = false
  subTreeSum(tree1,121)                           //> res7: Boolean = true
  subTreeSum(childrenSumPropertyTree,4)           //> res8: Boolean = true
  subTreeSum(childrenSumPropertyTree1,8)          //> res9: Boolean = false
  subTreeSum(leftSkewedtree,21)                   //> res10: Boolean = true
  subTreeSum(leftSkewedtree,22)                   //> res11: Boolean = false
  subTreeSum(leftSkewedtree,23)                   //> res12: Boolean = false
  subTreeSum(leftSkewedtree,24)                   //> res13: Boolean = false
  subTreeSum(leftSkewedtree,25)                   //> res14: Boolean = false
  subTreeSum(rightSkewTree,21)                    //> res15: Boolean = true
  
  
  subTreeSum(balancedtree,21)                     //> res16: Boolean = true
                                                  
  subTreeSum(balancedtree2,29)                    //> res17: Boolean = false
  subTreeSum(binarySearchTree,4)                  //> res18: Boolean = false
  subTreeSum(childrenSumTest,31)                  //> res19: Boolean = false
  subTreeSum(doubleTreeTest1,5)                   //> res20: Boolean = false
  subTreeSum(doubleTreeTest2,9)                   //> res21: Boolean = false
  subTreeSum(testTree,14)                         //> res22: Boolean = false
  subTreeSum(tree2,24)                            //> res23: Boolean = false
  subTreeSum(sumTreeTest,12)                      //> res24: Boolean = false
  subTreeSum(isSumtreeTest,3)                     //> res25: Boolean = true
  subTreeSum(isSubSetTreeTest1,3)                 //> res26: Boolean = true
  subTreeSum(isSubSetTreeTest2,23)                //> res27: Boolean = false
  subTreeSum(maxSumLeafToRoot,23)                 //> res28: Boolean = false
  subTreeSum(isoMorphismTree1,12)                 //> res29: Boolean = false
  subTreeSum(isoMorphismTree2,54)                 //> res30: Boolean = false
  subTreeSum(bstToBalancedBSTTest1,31)            //> res31: Boolean = false
  subTreeSum(bstToBalancedBSTTest2,12)            //> res32: Boolean = false
  subTreeSum(bstToBalancedBSTTest,10)             //> res33: Boolean = false
  subTreeSum(maxConcurrentIncreasing2,18)         //> res34: Boolean = false
  subTreeSum(maxConcurrentIncreasing,8)           //> res35: Boolean = true
  subTreeSum(pairSumTree,5)                       //> res36: Boolean = false
  subTreeSum(onlyRoot,1)                          //> res37: Boolean = true
  subTreeSum(onlyChildren,0)                      //> res38: Boolean = false
}