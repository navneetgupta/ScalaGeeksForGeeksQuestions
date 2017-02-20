package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.PrintAllNodesAtKDistanceFromLeaf.printNodesAtKDistanceFromLeaf

object PrintAllNodesAtKDistanceFromLeafTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  printNodesAtKDistanceFromLeaf(tree1,4)          //> 4 , 2 , 1 , 
  printNodesAtKDistanceFromLeaf(childrenSumPropertyTree,4)
  printNodesAtKDistanceFromLeaf(childrenSumPropertyTree1,4)
  printNodesAtKDistanceFromLeaf(leftSkewedtree,4) //> 7 , 
  printNodesAtKDistanceFromLeaf(rightSkewTree,4)  //> 7 , 
  
  printNodesAtKDistanceFromLeaf(balancedtree,2)   //> 2 , 3 , 
  
  printNodesAtKDistanceFromLeaf(balancedtree,1)   //> 4 , 5 , 6 , 7 , 
  printNodesAtKDistanceFromLeaf(balancedtree2,2)  //> 2 , 60 , 
  printNodesAtKDistanceFromLeaf(binarySearchTree,2)
                                                  //> 4 , 
  printNodesAtKDistanceFromLeaf(childrenSumTest,2)//> 50 , 
  printNodesAtKDistanceFromLeaf(doubleTreeTest1,2)
  printNodesAtKDistanceFromLeaf(doubleTreeTest2,2)//> 1 , 
  printNodesAtKDistanceFromLeaf(testTree,2)       //> 1 , 
  printNodesAtKDistanceFromLeaf(tree2,2)          //> 20 , 8 , 
  printNodesAtKDistanceFromLeaf(sumTreeTest,2)    //> 10 , 
  printNodesAtKDistanceFromLeaf(isSumtreeTest,2)  //> 26 , 
  printNodesAtKDistanceFromLeaf(isSubSetTreeTest1,2)
                                                  //> 10 , 26 , 
  printNodesAtKDistanceFromLeaf(isSubSetTreeTest2,2)
                                                  //> 10 , 
  printNodesAtKDistanceFromLeaf(maxSumLeafToRoot,2)
                                                  //> 10 , 
  printNodesAtKDistanceFromLeaf(isoMorphismTree1,2)
                                                  //> 1 , 2 , 
  printNodesAtKDistanceFromLeaf(isoMorphismTree2,2)
                                                  //> 1 , 2 , 
  printNodesAtKDistanceFromLeaf(bstToBalancedBSTTest1,2)
                                                  //> 30 , 
  printNodesAtKDistanceFromLeaf(bstToBalancedBSTTest2,2)
                                                  //> 3 , 5 , 
  printNodesAtKDistanceFromLeaf(bstToBalancedBSTTest,2)
                                                  //> 7 , 
  printNodesAtKDistanceFromLeaf(maxConcurrentIncreasing2,2)
                                                  //> 8 , 11 , 
  printNodesAtKDistanceFromLeaf(maxConcurrentIncreasing,2)
                                                  //> 10 , 
  printNodesAtKDistanceFromLeaf(pairSumTree,2)    //> 8 , 5 , 7 , 4 , 
  printNodesAtKDistanceFromLeaf(onlyChildren,1)   //> 1 , 
  printNodesAtKDistanceFromLeaf(sumCoveredAndUncoveredNodes,2)
                                                  //> 8 , 3 , 10 , 
  printNodesAtKDistanceFromLeaf(symmetricTree,2)
}