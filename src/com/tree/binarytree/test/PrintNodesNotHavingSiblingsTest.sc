package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.PrintNodesNotHavingSiblings.printSingleNodes
object PrintNodesNotHavingSiblingsTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  printSingleNodes(tree1)                         //> 20 , 15 , 16 , 17 , 19 , 
  printSingleNodes(childrenSumPropertyTree)       //> 4 , 
  printSingleNodes(childrenSumPropertyTree1)      //> 2 , 
  printSingleNodes(leftSkewedtree)                //> 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11 , 
  printSingleNodes(rightSkewTree)                 //> 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11 , 
  
  printSingleNodes(balancedtree)
  printSingleNodes(balancedtree2)
  printSingleNodes(binarySearchTree)
  printSingleNodes(childrenSumTest)
  printSingleNodes(doubleTreeTest1)
  printSingleNodes(doubleTreeTest2)
  printSingleNodes(testTree)
  printSingleNodes(tree2)
  printSingleNodes(sumTreeTest)
  printSingleNodes(isSumtreeTest)                 //> 3 , 
  printSingleNodes(isSubSetTreeTest1)             //> 30 , 3 , 
  printSingleNodes(isSubSetTreeTest2)             //> 30 , 
  printSingleNodes(maxSumLeafToRoot)
  printSingleNodes(isoMorphismTree1)              //> 6 , 
  printSingleNodes(isoMorphismTree2)              //> 6 , 
  printSingleNodes(bstToBalancedBSTTest1)         //> 20 , 10 , 
  printSingleNodes(bstToBalancedBSTTest2)         //> 2 , 1 , 6 , 7 , 
  printSingleNodes(bstToBalancedBSTTest)          //> 8 , 7 , 6 , 5 , 
  printSingleNodes(maxConcurrentIncreasing2)      //> 9 , 6 , 10 , 15 , 
  printSingleNodes(maxConcurrentIncreasing)
  printSingleNodes(pairSumTree)                   //> 2 , 11 , 3 , 
  printSingleNodes(onlyChildren)
  printSingleNodes(sumCoveredAndUncoveredNodes)   //> 1 , 3 , 
  printSingleNodes(symmetricTree)
}