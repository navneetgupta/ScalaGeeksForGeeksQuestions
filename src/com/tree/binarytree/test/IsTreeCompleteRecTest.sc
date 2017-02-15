package com.tree.binarytree.test
import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.IsTreeCompleteRec.isComplete
object IsTreeCompleteRecTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  isComplete(tree1)                               //> res0: Boolean = false
  isComplete(childrenSumPropertyTree)             //> res1: Boolean = false
  isComplete(childrenSumPropertyTree1)            //> res2: Boolean = false
  isComplete(leftSkewedtree)                      //> res3: Boolean = false
  isComplete(rightSkewTree)                       //> res4: Boolean = false
  
  isComplete(balancedtree)                        //> res5: Boolean = true
  isComplete(balancedtree2)                       //> res6: Boolean = true
  isComplete(binarySearchTree)                    //> res7: Boolean = true
  isComplete(childrenSumTest)                     //> res8: Boolean = true
  isComplete(doubleTreeTest1)                     //> res9: Boolean = true
  isComplete(doubleTreeTest2)                     //> res10: Boolean = true
  isComplete(testTree)                            //> res11: Boolean = true
  isComplete(tree2)                               //> res12: Boolean = false
  isComplete(sumTreeTest)                         //> res13: Boolean = true
  isComplete(isSumtreeTest)                       //> res14: Boolean = false
  isComplete(isSubSetTreeTest1)                   //> res15: Boolean = false
  isComplete(isSubSetTreeTest2)                   //> res16: Boolean = false
  isComplete(maxSumLeafToRoot)                    //> res17: Boolean = true
  isComplete(isoMorphismTree1)                    //> res18: Boolean = false
  isComplete(isoMorphismTree2)                    //> res19: Boolean = false
  isComplete(bstToBalancedBSTTest1)               //> res20: Boolean = false
  isComplete(bstToBalancedBSTTest2)               //> res21: Boolean = false
  isComplete(bstToBalancedBSTTest)                //> res22: Boolean = false
  isComplete(maxConcurrentIncreasing2)            //> res23: Boolean = false
  isComplete(maxConcurrentIncreasing)             //> res24: Boolean = true
  isComplete(pairSumTree)                         //> res25: Boolean = false
  isComplete(onlyChildren)                        //> res26: Boolean = true
  isComplete(sumCoveredAndUncoveredNodes)         //> res27: Boolean = false
  isComplete(symmetricTree)                       //> res28: Boolean = true
}