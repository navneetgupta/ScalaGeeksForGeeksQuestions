package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.AllNodesWithKLeaves.allNodesWithKLeaves
object AllNodesWithKLeavesTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  allNodesWithKLeaves(tree1, 1)                   //> 7 , 11 , 12 , 9 , 10 , res0: Int = 8
  allNodesWithKLeaves(childrenSumPropertyTree,1)  //> 4 , res1: Int = 5
  allNodesWithKLeaves(childrenSumPropertyTree1,1) //> 2 , res2: Int = 3
  allNodesWithKLeaves(leftSkewedtree,1)           //> 10 , 9 , 8 , 7 , 6 , 5 , 4 , 3 , 2 , 1 , res3: Int = 1
  allNodesWithKLeaves(rightSkewTree,1)            //> 10 , 9 , 8 , 7 , 6 , 5 , 4 , 3 , 2 , 1 , res4: Int = 1
  
  allNodesWithKLeaves(balancedtree,1)             //> res5: Int = 8
  allNodesWithKLeaves(balancedtree2,1)            //> res6: Int = 8
  allNodesWithKLeaves(binarySearchTree,1)         //> res7: Int = 3
  allNodesWithKLeaves(childrenSumTest,1)          //> res8: Int = 4
  allNodesWithKLeaves(doubleTreeTest1,1)          //> res9: Int = 2
  allNodesWithKLeaves(doubleTreeTest2,1)          //> res10: Int = 3
  allNodesWithKLeaves(testTree,1)                 //> res11: Int = 3
  allNodesWithKLeaves(tree2,1)                    //> res12: Int = 4
  allNodesWithKLeaves(sumTreeTest,1)              //> res13: Int = 4
  allNodesWithKLeaves(isSumtreeTest,1)            //> 3 , res14: Int = 3
  allNodesWithKLeaves(isSubSetTreeTest1,1)        //> 4 , 3 , res15: Int = 3
  allNodesWithKLeaves(isSubSetTreeTest2,1)        //> 4 , res16: Int = 2
  allNodesWithKLeaves(maxSumLeafToRoot,1)         //> res17: Int = 3
  allNodesWithKLeaves(isoMorphismTree1,1)         //> 3 , res18: Int = 4
  allNodesWithKLeaves(isoMorphismTree2,1)         //> 3 , res19: Int = 4
  allNodesWithKLeaves(bstToBalancedBSTTest1,1)    //> 20 , 30 , res20: Int = 1
  allNodesWithKLeaves(bstToBalancedBSTTest2,1)    //> 2 , 3 , 6 , 5 , res21: Int = 2
  allNodesWithKLeaves(bstToBalancedBSTTest,1)     //> 6 , 7 , 8 , 10 , res22: Int = 1
  allNodesWithKLeaves(maxConcurrentIncreasing2,1) //> 9 , 8 , 10 , 11 , res23: Int = 2
  allNodesWithKLeaves(maxConcurrentIncreasing,1)  //> res24: Int = 4
  allNodesWithKLeaves(pairSumTree,1)              //> 12 , 11 , 4 , res25: Int = 4
  allNodesWithKLeaves(onlyRoot,1)                 //> res26: Int = 1
  allNodesWithKLeaves(onlyChildren,1)             //> res27: Int = 2
}