package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.SymmetricTree.isSymmetric
object SymmetricTreeTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  isSymmetric(tree1)                              //> res0: Boolean = false
  isSymmetric(childrenSumPropertyTree)            //> res1: Boolean = false
  isSymmetric(childrenSumPropertyTree1)           //> res2: Boolean = false
  isSymmetric(leftSkewedtree)                     //> res3: Boolean = false
  isSymmetric(rightSkewTree)                      //> res4: Boolean = false
  
  isSymmetric(balancedtree)                       //> res5: Boolean = false
  isSymmetric(balancedtree2)                      //> res6: Boolean = false
  isSymmetric(binarySearchTree)                   //> res7: Boolean = false
  isSymmetric(childrenSumTest)                    //> res8: Boolean = false
  isSymmetric(doubleTreeTest1)                    //> res9: Boolean = false
  isSymmetric(doubleTreeTest2)                    //> res10: Boolean = false
  isSymmetric(testTree)                           //> res11: Boolean = false
  isSymmetric(tree2)                              //> res12: Boolean = false
  isSymmetric(sumTreeTest)                        //> res13: Boolean = false
  isSymmetric(isSumtreeTest)                      //> res14: Boolean = false
  isSymmetric(isSubSetTreeTest1)                  //> res15: Boolean = false
  isSymmetric(isSubSetTreeTest2)                  //> res16: Boolean = false
  isSymmetric(maxSumLeafToRoot)                   //> res17: Boolean = false
  isSymmetric(isoMorphismTree1)                   //> res18: Boolean = false
  isSymmetric(isoMorphismTree2)                   //> res19: Boolean = false
  isSymmetric(bstToBalancedBSTTest1)              //> res20: Boolean = false
  isSymmetric(bstToBalancedBSTTest2)              //> res21: Boolean = false
  isSymmetric(bstToBalancedBSTTest)               //> res22: Boolean = false
  isSymmetric(maxConcurrentIncreasing2)           //> res23: Boolean = false
  isSymmetric(maxConcurrentIncreasing)            //> res24: Boolean = false
  isSymmetric(pairSumTree)                        //> res25: Boolean = false
  isSymmetric(onlyChildren)                       //> res26: Boolean = false
  isSymmetric(sumCoveredAndUncoveredNodes)        //> res27: Boolean = false
  isSymmetric(symmetricTree)                      //> res28: Boolean = true
  
}