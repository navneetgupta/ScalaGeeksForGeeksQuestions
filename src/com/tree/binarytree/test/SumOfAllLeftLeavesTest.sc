package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.SumOfAllLeftLeaves.sumAllLeftLeaves

object SumOfAllLeftLeavesTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  sumAllLeftLeaves(tree1)                         //> res0: Int = 70
  sumAllLeftLeaves(childrenSumPropertyTree)       //> res1: Int = 5
  sumAllLeftLeaves(childrenSumPropertyTree1)      //> res2: Int = 3
  sumAllLeftLeaves(leftSkewedtree)                //> res3: Int = 11
  sumAllLeftLeaves(rightSkewTree)                 //> res4: Int = 0
  
  sumAllLeftLeaves(balancedtree)                  //> res5: Int = 44
  sumAllLeftLeaves(balancedtree2)                 //> res6: Int = 44
  sumAllLeftLeaves(binarySearchTree)              //> res7: Int = 1
  sumAllLeftLeaves(childrenSumTest)               //> res8: Int = 4
  sumAllLeftLeaves(doubleTreeTest1)               //> res9: Int = 2
  sumAllLeftLeaves(doubleTreeTest2)               //> res10: Int = 4
  sumAllLeftLeaves(testTree)                      //> res11: Int = 4
  sumAllLeftLeaves(tree2)                         //> res12: Int = 14
  sumAllLeftLeaves(sumTreeTest)                   //> res13: Int = 15
  sumAllLeftLeaves(isSumtreeTest)                 //> res14: Int = 4
  sumAllLeftLeaves(isSubSetTreeTest1)             //> res15: Int = 0
  sumAllLeftLeaves(isSubSetTreeTest2)             //> res16: Int = 0
  sumAllLeftLeaves(maxSumLeafToRoot)              //> res17: Int = 8
  sumAllLeftLeaves(isoMorphismTree1)              //> res18: Int = 17
  sumAllLeftLeaves(isoMorphismTree2)              //> res19: Int = 12
  sumAllLeftLeaves(bstToBalancedBSTTest1)         //> res20: Int = 10
  sumAllLeftLeaves(bstToBalancedBSTTest2)         //> res21: Int = 1
  sumAllLeftLeaves(bstToBalancedBSTTest)          //> res22: Int = 5
  sumAllLeftLeaves(maxConcurrentIncreasing2)      //> res23: Int = 21
  sumAllLeftLeaves(maxConcurrentIncreasing)       //> res24: Int = 26
  sumAllLeftLeaves(pairSumTree)                   //> res25: Int = 13
  sumAllLeftLeaves(onlyChildren)                  //> res26: Int = 2
  sumAllLeftLeaves(sumCoveredAndUncoveredNodes)   //> res27: Int = 8
  sumAllLeftLeaves(symmetricTree)                 //> res28: Int = 7
}