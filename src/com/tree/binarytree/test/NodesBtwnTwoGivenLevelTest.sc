package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.NodesBtwnTwoGivenLevel.printLevels
import com.tree.binarytree.LevelOrderTraversal.printLevelOrderRecursive
object NodesBtwnTwoGivenLevelTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  

  printLevelOrderRecursive(tree1)                 //> 
                                                  //| 1,
                                                  //| 2,10,
                                                  //| 3,9,19,
                                                  //| 4,12,17,
                                                  //| 5,11,16,
                                                  //| 6,8,15,
                                                  //| 7,13,
                                                  //| 20,18,14,
  printLevels(tree1,1,3)                          //> 1 ,   
                                                  //| 2 , 10 ,   
                                                  //| 3 , 9 , 19 ,   
  printLevels(tree1,2,5)                          //>   
                                                  //| 2 , 10 ,   
                                                  //| 3 , 9 , 19 ,   
                                                  //| 4 , 12 , 17 ,   
                                                  //| 5 , 11 , 16 ,   
  printLevels(tree1,3,7)                          //>   
                                                  //|   
                                                  //| 3 , 9 , 19 ,   
                                                  //| 4 , 12 , 17 ,   
                                                  //| 5 , 11 , 16 ,   
                                                  //| 6 , 8 , 15 ,   
                                                  //| 7 , 13 ,   
  printLevelOrderRecursive(childrenSumPropertyTree)
                                                  //> 
                                                  //| 10,
                                                  //| 6,4,
                                                  //| 2,4,4,
                                                  //| 2,0,3,1,
   printLevels(childrenSumPropertyTree, 1,3)      //> 10 ,   
                                                  //| 6 , 4 ,   
                                                  //| 2 , 4 ,   
  printLevels(childrenSumPropertyTree, 1,4)       //> 10 ,   
                                                  //| 6 , 4 ,   
                                                  //| 2 , 4 ,   
                                                  //|   
  printLevels(childrenSumPropertyTree, 2,4)       //>   
                                                  //| 6 , 4 ,   
                                                  //| 2 , 4 ,   
                                                  //|   
  printLevelOrderRecursive(childrenSumPropertyTree1)
                                                  //> 
                                                  //| 10,
                                                  //| 8,2,
                                                  //| 3,5,2,
  printLevels(childrenSumPropertyTree1, 1,2)      //> 10 ,   
                                                  //| 8 , 2 ,   
  printLevels(childrenSumPropertyTree1, 2,3)      //>   
                                                  //| 8 , 2 ,   
                                                  //| 3 , 5 , 2 ,   
  printLevels(childrenSumPropertyTree1, 1,3)      //> 10 ,   
                                                  //| 8 , 2 ,   
                                                  //| 3 , 5 , 2 ,   
  printLevelOrderRecursive(leftSkewedtree)        //> 
                                                  //| 1,
                                                  //| 2,
                                                  //| 3,
                                                  //| 4,
                                                  //| 5,
                                                  //| 6,
                                                  //| 7,
                                                  //| 8,
                                                  //| 9,
                                                  //| 10,
                                                  //| 11,
  printLevels(leftSkewedtree, 1,2)                //> 1 ,   
                                                  //| 2 ,   
  printLevels(leftSkewedtree, 2,5)                //>   
                                                  //| 2 ,   
                                                  //| 3 ,   
                                                  //| 4 ,   
                                                  //| 5 ,   
  printLevels(leftSkewedtree, 3,9)                //>   
                                                  //|   
                                                  //| 3 ,   
                                                  //| 4 ,   
                                                  //| 5 ,   
                                                  //| 6 ,   
                                                  //| 7 ,   
                                                  //| 8 ,   
                                                  //| 9 ,   
  printLevelOrderRecursive(rightSkewTree)         //> 
                                                  //| 1,
                                                  //| 2,
                                                  //| 3,
                                                  //| 4,
                                                  //| 5,
                                                  //| 6,
                                                  //| 7,
                                                  //| 8,
                                                  //| 9,
                                                  //| 10,
                                                  //| 11,
  printLevels(rightSkewTree, 1,2)                 //> 1 ,   
                                                  //| 2 ,   
  printLevels(rightSkewTree, 2,5)                 //>   
                                                  //| 2 ,   
                                                  //| 3 ,   
                                                  //| 4 ,   
                                                  //| 5 ,   
  printLevels(rightSkewTree, 3,10)                //>   
                                                  //|   
                                                  //| 3 ,   
                                                  //| 4 ,   
                                                  //| 5 ,   
                                                  //| 6 ,   
                                                  //| 7 ,   
                                                  //| 8 ,   
                                                  //| 9 ,   
                                                  //| 10 ,   
  
  printLevelOrderRecursive(balancedtree)          //> 
                                                  //| 1,
                                                  //| 2,3,
                                                  //| 4,5,6,7,
                                                  //| 8,9,10,11,12,13,14,15,
  printLevels(balancedtree, 1,2)                  //> 1 ,   
                                                  //| 2 , 3 ,   
  printLevels(balancedtree, 2,3)                  //>   
                                                  //| 2 , 3 ,   
                                                  //| 4 , 5 , 6 , 7 ,   
  printLevels(balancedtree, 1,3)                  //> 1 ,   
                                                  //| 2 , 3 ,   
                                                  //| 4 , 5 , 6 , 7 ,   
  printLevelOrderRecursive(balancedtree2)         //> 
                                                  //| 200,
                                                  //| 2,60,
                                                  //| 4,5,6,7,
                                                  //| 8,9,10,11,12,13,14,15,
  printLevels(balancedtree2, 1,2)                 //> 200 ,   
                                                  //| 2 , 60 ,   
  printLevels(balancedtree2, 2,3)                 //>   
                                                  //| 2 , 60 ,   
                                                  //| 4 , 5 , 6 , 7 ,   
  printLevels(balancedtree2, 1,3)                 //> 200 ,   
                                                  //| 2 , 60 ,   
                                                  //| 4 , 5 , 6 , 7 ,   
  printLevelOrderRecursive(binarySearchTree)      //> 
                                                  //| 4,
                                                  //| 2,5,
                                                  //| 1,3,
  printLevels(binarySearchTree, 1,2)              //> 4 ,   
                                                  //| 2 , 5 ,   
  printLevels(binarySearchTree, 2,3)              //>   
                                                  //| 2 , 5 ,   
                                                  //| 1 , 3 ,   
  printLevels(binarySearchTree, 1,3)              //> 4 ,   
                                                  //| 2 , 5 ,   
                                                  //| 1 , 3 ,   
  printLevelOrderRecursive(childrenSumTest)       //> 
                                                  //| 50,
                                                  //| 7,2,
                                                  //| 3,5,1,30,
  printLevels(childrenSumTest, 1,2)               //> 50 ,   
                                                  //| 7 , 2 ,   
  printLevels(childrenSumTest, 2,3)               //>   
                                                  //| 7 , 2 ,   
                                                  //| 3 , 5 , 1 , 30 ,   
  printLevels(childrenSumTest, 1,3)               //> 50 ,   
                                                  //| 7 , 2 ,   
                                                  //| 3 , 5 , 1 , 30 ,   
  printLevelOrderRecursive(doubleTreeTest1)       //> 
                                                  //| 1,
                                                  //| 2,3,
  printLevels(doubleTreeTest1, 1,2)               //> 1 ,   
                                                  //| 2 , 3 ,   
  printLevels(doubleTreeTest1, 2,3)               //>   
                                                  //| 2 , 3 ,   
  printLevels(doubleTreeTest1, 1,3)               //> 1 ,   
                                                  //| 2 , 3 ,   
  
  
  printLevelOrderRecursive(doubleTreeTest2)       //> 
                                                  //| 1,
                                                  //| 2,3,
                                                  //| 4,5,
  printLevels(doubleTreeTest2, 1,2)               //> 1 ,   
                                                  //| 2 , 3 ,   
  printLevels(doubleTreeTest2, 2,3)               //>   
                                                  //| 2 , 3 ,   
                                                  //|   
  printLevels(doubleTreeTest2, 1,3)               //> 1 ,   
                                                  //| 2 , 3 ,   
                                                  //|   
  printLevelOrderRecursive(testTree)              //> 
                                                  //| 1,
                                                  //| 2,3,
                                                  //| 4,5,
  printLevels(testTree, 1,2)                      //> 1 ,   
                                                  //| 2 , 3 ,   
  printLevels(testTree, 2,3)                      //>   
                                                  //| 2 , 3 ,   
                                                  //|   
  printLevels(testTree, 1,3)                      //> 1 ,   
                                                  //| 2 , 3 ,   
                                                  //|   
  printLevelOrderRecursive(tree2)                 //> 
                                                  //| 20,
                                                  //| 8,22,
                                                  //| 4,12,
                                                  //| 10,14,
  printLevels(tree2, 1,2)                         //> 20 ,   
                                                  //| 8 , 22 ,   
  printLevels(tree2, 2,3)                         //>   
                                                  //| 8 , 22 ,   
                                                  //|   
  printLevels(tree2, 1,3)                         //> 20 ,   
                                                  //| 8 , 22 ,   
                                                  //|   
  printLevelOrderRecursive(sumTreeTest)           //> 
                                                  //| 10,
                                                  //| -2,6,
                                                  //| 8,-4,7,5,
  printLevels(sumTreeTest, 1,2)                   //> 10 ,   
                                                  //| -2 , 6 ,   
  printLevels(sumTreeTest, 2,3)                   //>   
                                                  //| -2 , 6 ,   
                                                  //| 8 , -4 , 7 , 5 ,   
  printLevels(sumTreeTest, 1,3)                   //> 10 ,   
                                                  //| -2 , 6 ,   
                                                  //| 8 , -4 , 7 , 5 ,   
  printLevelOrderRecursive(isSumtreeTest)         //> 
                                                  //| 26,
                                                  //| 10,3,
                                                  //| 4,6,3,
  printLevels(isSumtreeTest, 1,2)                 //> 26 ,   
                                                  //| 10 , 3 ,   
  printLevels(isSumtreeTest, 2,3)                 //>   
                                                  //| 10 , 3 ,   
                                                  //|   
  printLevels(isSumtreeTest, 1,3)                 //> 26 ,   
                                                  //| 10 , 3 ,   
                                                  //|   
  printLevelOrderRecursive(isSubSetTreeTest1)     //> 
                                                  //| 26,
                                                  //| 10,3,
                                                  //| 4,6,3,
                                                  //| 30,
  printLevels(isSubSetTreeTest1, 1,2)             //> 26 ,   
                                                  //| 10 , 3 ,   
  printLevels(isSubSetTreeTest1, 2,3)             //>   
                                                  //| 10 , 3 ,   
                                                  //| 4 , 6 , 3 ,   
  printLevels(isSubSetTreeTest1, 1,3)             //> 26 ,   
                                                  //| 10 , 3 ,   
                                                  //| 4 , 6 , 3 ,   
  printLevelOrderRecursive(isSubSetTreeTest2)     //> 
                                                  //| 10,
                                                  //| 4,6,
                                                  //| 30,
  printLevels(isSubSetTreeTest2, 1,2)             //> 10 ,   
                                                  //| 4 , 6 ,   
  printLevels(isSubSetTreeTest2, 2,3)             //>   
                                                  //| 4 , 6 ,   
                                                  //| 30 ,   
  printLevels(isSubSetTreeTest2, 1,3)             //> 10 ,   
                                                  //| 4 , 6 ,   
                                                  //| 30 ,   
  printLevelOrderRecursive(maxSumLeafToRoot)      //> 
                                                  //| 10,
                                                  //| -2,7,
                                                  //| 8,-4,
  printLevels(maxSumLeafToRoot, 1,2)              //> 10 ,   
                                                  //| -2 , 7 ,   
  printLevels(maxSumLeafToRoot, 2,3)              //>   
                                                  //| -2 , 7 ,   
                                                  //| 8 , -4 ,   
  printLevels(maxSumLeafToRoot, 1,3)              //> 10 ,   
                                                  //| -2 , 7 ,   
                                                  //| 8 , -4 ,   
  printLevelOrderRecursive(isoMorphismTree1)      //> 
                                                  //| 1,
                                                  //| 2,3,
                                                  //| 4,5,6,
                                                  //| 7,8,
  printLevels(isoMorphismTree1, 1,2)              //> 1 ,   
                                                  //| 2 , 3 ,   
  printLevels(isoMorphismTree1, 2,3)              //>   
                                                  //| 2 , 3 ,   
                                                  //|   
  printLevels(isoMorphismTree1, 1,3)              //> 1 ,   
                                                  //| 2 , 3 ,   
                                                  //|   
  printLevelOrderRecursive(isoMorphismTree2)      //> 
                                                  //| 1,
                                                  //| 3,2,
                                                  //| 6,4,5,
                                                  //| 8,7,
  printLevels(isoMorphismTree2, 1,2)              //> 1 ,   
                                                  //| 3 , 2 ,   
  printLevels(isoMorphismTree2, 2,3)              //>   
                                                  //| 3 , 2 ,   
                                                  //| 6 ,   
  printLevels(isoMorphismTree2, 1,3)              //> 1 ,   
                                                  //| 3 , 2 ,   
                                                  //| 6 ,   
  printLevelOrderRecursive(bstToBalancedBSTTest1) //> 
                                                  //| 30,
                                                  //| 20,
                                                  //| 10,
  printLevels(bstToBalancedBSTTest1, 1,2)         //> 30 ,   
                                                  //| 20 ,   
  printLevels(bstToBalancedBSTTest1, 2,3)         //>   
                                                  //| 20 ,   
                                                  //| 10 ,   
  printLevels(bstToBalancedBSTTest1, 1,3)         //> 30 ,   
                                                  //| 20 ,   
                                                  //| 10 ,   
  printLevelOrderRecursive(bstToBalancedBSTTest2) //> 
                                                  //| 4,
                                                  //| 3,5,
                                                  //| 2,6,
                                                  //| 1,7,
  printLevels(bstToBalancedBSTTest2, 1,2)         //> 4 ,   
                                                  //| 3 , 5 ,   
  printLevels(bstToBalancedBSTTest2, 2,3)         //>   
                                                  //| 3 , 5 ,   
                                                  //| 2 , 6 ,   
  printLevels(bstToBalancedBSTTest2, 1,3)         //> 4 ,   
                                                  //| 3 , 5 ,   
                                                  //| 2 , 6 ,   
  printLevelOrderRecursive(bstToBalancedBSTTest)  //> 
                                                  //| 10,
                                                  //| 8,
                                                  //| 7,
                                                  //| 6,
                                                  //| 5,
  printLevels(bstToBalancedBSTTest, 1,2)          //> 10 ,   
                                                  //| 8 ,   
  printLevels(bstToBalancedBSTTest, 2,3)          //>   
                                                  //| 8 ,   
                                                  //| 7 ,   
  printLevels(bstToBalancedBSTTest, 1,3)          //> 10 ,   
                                                  //| 8 ,   
                                                  //| 7 ,   
  printLevelOrderRecursive(maxConcurrentIncreasing2)
                                                  //> 
                                                  //| 5,
                                                  //| 8,11,
                                                  //| 9,10,
                                                  //| 6,15,
  printLevels(maxConcurrentIncreasing2, 1,2)      //> 5 ,   
                                                  //| 8 , 11 ,   
  printLevels(maxConcurrentIncreasing2, 2,3)      //>   
                                                  //| 8 , 11 ,   
                                                  //| 9 , 10 ,   
  printLevels(maxConcurrentIncreasing2, 1,3)      //> 5 ,   
                                                  //| 8 , 11 ,   
                                                  //| 9 , 10 ,   
  printLevelOrderRecursive(maxConcurrentIncreasing)
                                                  //> 
                                                  //| 10,
                                                  //| 11,9,
                                                  //| 13,12,13,8,
  printLevels(maxConcurrentIncreasing, 1,2)       //> 10 ,   
                                                  //| 11 , 9 ,   
  printLevels(maxConcurrentIncreasing, 2,3)       //>   
                                                  //| 11 , 9 ,   
                                                  //| 13 , 12 , 13 , 8 ,   
  printLevels(maxConcurrentIncreasing, 1,3)       //> 10 ,   
                                                  //| 11 , 9 ,   
                                                  //| 13 , 12 , 13 , 8 ,   
  printLevelOrderRecursive(pairSumTree)           //> 
                                                  //| 8,
                                                  //| 5,4,
                                                  //| 9,7,11,
                                                  //| 1,12,3,
                                                  //| 2,
  printLevels(pairSumTree, 1,2)                   //> 8 ,   
                                                  //| 5 , 4 ,   
  printLevels(pairSumTree, 2,3)                   //>   
                                                  //| 5 , 4 ,   
                                                  //| 9 , 7 , 11 ,   
  printLevels(pairSumTree, 1,3)                   //> 8 ,   
                                                  //| 5 , 4 ,   
                                                  //| 9 , 7 , 11 ,   
  printLevelOrderRecursive(onlyChildren)          //> 
                                                  //| 1,
                                                  //| 2,3,
  printLevels(onlyChildren, 1,2)                  //> 1 ,   
                                                  //| 2 , 3 ,   
  printLevelOrderRecursive(sumCoveredAndUncoveredNodes)
                                                  //> 
                                                  //| 8,
                                                  //| 3,10,
                                                  //| 1,6,1,
                                                  //| 4,16,3,
  printLevels(sumCoveredAndUncoveredNodes, 1,2)   //> 8 ,   
                                                  //| 3 , 10 ,   
  printLevels(sumCoveredAndUncoveredNodes, 2,3)   //>   
                                                  //| 3 , 10 ,   
                                                  //| 1 , 6 , 1 ,   
  printLevels(sumCoveredAndUncoveredNodes, 1,3)   //> 8 ,   
                                                  //| 3 , 10 ,   
                                                  //| 1 , 6 , 1 ,   
  printLevelOrderRecursive(symmetricTree)         //> 
                                                  //| 1,
                                                  //| 2,2,
                                                  //| 3,4,4,3,
  printLevels(symmetricTree, 1,2)                 //> 1 ,   
                                                  //| 2 , 2 ,   
  printLevels(symmetricTree, 2,3)                 //>   
                                                  //| 2 , 2 ,   
                                                  //| 3 ,   
  printLevels(symmetricTree, 1,3)                 //> 1 ,   
                                                  //| 2 , 2 ,   
                                                  //| 3 ,   
}