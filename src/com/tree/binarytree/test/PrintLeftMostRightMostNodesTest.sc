package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.PrintLeftMostRightMostNodes.{getCornerNodes,getCornerNodes2}

object PrintLeftMostRightMostNodesTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  getCornerNodes(tree1)                           //> 1 , 2 , 10 , 3 , 19 , 4 , 17 , 5 , 16 , 6 , 15 , 7 , 13 , 20 , 14 , 
  getCornerNodes(childrenSumPropertyTree)         //> 10 , 6 , 4 , 2 , 4 , 2 , 1 , 
  getCornerNodes(childrenSumPropertyTree1)        //> 10 , 8 , 2 , 3 , 2 , 
  getCornerNodes(leftSkewedtree)                  //> 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11 , 
  getCornerNodes(rightSkewTree)                   //> 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11 , 
  
  getCornerNodes(balancedtree)                    //> 1 , 2 , 3 , 4 , 7 , 8 , 15 , 
  getCornerNodes(balancedtree2)                   //> 200 , 2 , 60 , 4 , 7 , 8 , 15 , 
  getCornerNodes(binarySearchTree)                //> 4 , 2 , 5 , 1 , 3 , 
  getCornerNodes(childrenSumTest)                 //> 50 , 7 , 2 , 3 , 30 , 
  getCornerNodes(doubleTreeTest1)                 //> 1 , 2 , 3 , 
  getCornerNodes(doubleTreeTest2)                 //> 1 , 2 , 3 , 4 , 5 , 
  getCornerNodes(testTree)                        //> 1 , 2 , 3 , 4 , 5 , 
  getCornerNodes(tree2)                           //> 20 , 8 , 22 , 4 , 12 , 10 , 14 , 
  getCornerNodes(sumTreeTest)                     //> 10 , -2 , 6 , 8 , 5 , 
  getCornerNodes(isSumtreeTest)                   //> 26 , 10 , 3 , 4 , 3 , 
  getCornerNodes(isSubSetTreeTest1)               //> 26 , 10 , 3 , 4 , 3 , 30 , 
  getCornerNodes(isSubSetTreeTest2)               //> 10 , 4 , 6 , 30 , 
  getCornerNodes(maxSumLeafToRoot)                //> 10 , -2 , 7 , 8 , -4 , 
  getCornerNodes(isoMorphismTree1)                //> 1 , 2 , 3 , 4 , 6 , 7 , 8 , 
  getCornerNodes(isoMorphismTree2)                //> 1 , 3 , 2 , 6 , 5 , 8 , 7 , 
  getCornerNodes(bstToBalancedBSTTest1)           //> 30 , 20 , 10 , 
  getCornerNodes(bstToBalancedBSTTest2)           //> 4 , 3 , 5 , 2 , 6 , 1 , 7 , 
  getCornerNodes(bstToBalancedBSTTest)            //> 10 , 8 , 7 , 6 , 5 , 
  getCornerNodes(maxConcurrentIncreasing2)        //> 5 , 8 , 11 , 9 , 10 , 6 , 15 , 
  getCornerNodes(maxConcurrentIncreasing)         //> 10 , 11 , 9 , 13 , 8 , 
  getCornerNodes(pairSumTree)                     //> 8 , 5 , 4 , 9 , 11 , 1 , 3 , 2 , 
  getCornerNodes(onlyChildren)                    //> 1 , 2 , 3 , 
  
  
  getCornerNodes2(tree1)                          //> 1 , 2 , 10 , 3 , 19 , 4 , 17 , 5 , 16 , 6 , 15 , 7 , 13 , 20 , 14 , 
  getCornerNodes2(childrenSumPropertyTree)        //> 10 , 6 , 4 , 2 , 4 , 2 , 1 , 
  getCornerNodes2(childrenSumPropertyTree1)       //> 10 , 8 , 2 , 3 , 2 , 
  getCornerNodes2(leftSkewedtree)                 //> 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11 , 
  getCornerNodes2(rightSkewTree)                  //> 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11 , 
  
  getCornerNodes2(balancedtree)                   //> 1 , 2 , 3 , 4 , 7 , 8 , 15 , 
  getCornerNodes2(balancedtree2)                  //> 200 , 2 , 60 , 4 , 7 , 8 , 15 , 
  getCornerNodes2(binarySearchTree)               //> 4 , 2 , 5 , 1 , 3 , 
  getCornerNodes2(childrenSumTest)                //> 50 , 7 , 2 , 3 , 30 , 
  getCornerNodes2(doubleTreeTest1)                //> 1 , 2 , 3 , 
  getCornerNodes2(doubleTreeTest2)                //> 1 , 2 , 3 , 4 , 5 , 
  getCornerNodes2(testTree)                       //> 1 , 2 , 3 , 4 , 5 , 
  getCornerNodes2(tree2)                          //> 20 , 8 , 22 , 4 , 12 , 10 , 14 , 
  getCornerNodes2(sumTreeTest)                    //> 10 , -2 , 6 , 8 , 5 , 
  getCornerNodes2(isSumtreeTest)                  //> 26 , 10 , 3 , 4 , 3 , 
  getCornerNodes2(isSubSetTreeTest1)              //> 26 , 10 , 3 , 4 , 3 , 30 , 
  getCornerNodes2(isSubSetTreeTest2)              //> 10 , 4 , 6 , 30 , 
  getCornerNodes2(maxSumLeafToRoot)               //> 10 , -2 , 7 , 8 , -4 , 
  getCornerNodes2(isoMorphismTree1)               //> 1 , 2 , 3 , 4 , 6 , 7 , 8 , 
  getCornerNodes2(isoMorphismTree2)               //> 1 , 3 , 2 , 6 , 5 , 8 , 7 , 
  getCornerNodes2(bstToBalancedBSTTest1)          //> 30 , 20 , 10 , 
  getCornerNodes2(bstToBalancedBSTTest2)          //> 4 , 3 , 5 , 2 , 6 , 1 , 7 , 
  getCornerNodes2(bstToBalancedBSTTest)           //> 10 , 8 , 7 , 6 , 5 , 
  getCornerNodes2(maxConcurrentIncreasing2)       //> 5 , 8 , 11 , 9 , 10 , 6 , 15 , 
  getCornerNodes2(maxConcurrentIncreasing)        //> 10 , 11 , 9 , 13 , 8 , 
  getCornerNodes2(pairSumTree)                    //> 8 , 5 , 4 , 9 , 11 , 1 , 3 , 2 , 
  getCornerNodes2(onlyChildren)                   //> 1 , 2 , 3 , 
  getCornerNodes2(onlyRoot)
}