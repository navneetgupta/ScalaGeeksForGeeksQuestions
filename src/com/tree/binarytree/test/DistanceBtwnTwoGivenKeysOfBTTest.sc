package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.DistanceBtwnTwoGivenKeysOfBT.findDistance

object DistanceBtwnTwoGivenKeysOfBTTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  findDistance(tree1,1,20)                        //> res0: Int = 7
  findDistance(childrenSumPropertyTree,2,1)       //> res1: Int = -1
  findDistance(childrenSumPropertyTree1,10,5)     //> res2: Int = 2
  findDistance(leftSkewedtree,2,9)                //> res3: Int = 7
  findDistance(rightSkewTree,3,11)                //> res4: Int = 8
  
  findDistance(balancedtree,8,15)                 //> res5: Int = -1
  findDistance(balancedtree2,200,15)              //> res6: Int = 3
  findDistance(binarySearchTree,3,5)              //> res7: Int = -1
  findDistance(childrenSumTest,5,30)              //> res8: Int = -1
  findDistance(doubleTreeTest1,1,3)               //> res9: Int = 1
  findDistance(doubleTreeTest2,1,5)               //> res10: Int = 2
  findDistance(testTree,1,14)                     //> res11: Int = -1
  findDistance(tree2,14,22)                       //> res12: Int = -1
  findDistance(sumTreeTest,-4,5)                  //> res13: Int = -1
  findDistance(isSumtreeTest,6,3)                 //> res14: Int = -1
  findDistance(isSubSetTreeTest1,10,6)            //> res15: Int = 1
  findDistance(isSubSetTreeTest2,10,6)            //> res16: Int = 1
  findDistance(maxSumLeafToRoot,-2,7)             //> res17: Int = -1
  findDistance(isoMorphismTree1,2,6)              //> res18: Int = -1
  findDistance(isoMorphismTree2,6,7)              //> res19: Int = -1
  findDistance(bstToBalancedBSTTest1,30,10)       //> res20: Int = 2
  findDistance(bstToBalancedBSTTest2,1,7)         //> res21: Int = -1
  findDistance(bstToBalancedBSTTest,10,5)         //> res22: Int = 4
  findDistance(maxConcurrentIncreasing2,6,15)     //> res23: Int = -1
  findDistance(maxConcurrentIncreasing,12,8)      //> res24: Int = -1
  findDistance(pairSumTree,2,3)                   //> res25: Int = -1
  findDistance(onlyChildren,1,3)                  //> res26: Int = 1
  
}