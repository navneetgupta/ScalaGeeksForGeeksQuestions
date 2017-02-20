package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.VerticalOrderOfTree.verticalOrder
object VerticalOrderOfTreeTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  verticalOrder(tree1)                            //> 20 , 
                                                  //| 7 , 
                                                  //| 6 , 18 , 
                                                  //| 5 , 13 , 
                                                  //| 4 , 14 , 8 , 15 , 
                                                  //| 3 , 11 , 
                                                  //| 2 , 12 , 17 , 
  verticalOrder(childrenSumPropertyTree)          //> 2 , 
                                                  //| 2 , 
                                                  //| 6 , 0 , 3 , 
  verticalOrder(childrenSumPropertyTree1)         //> 3 , 
                                                  //| 8 , 
  verticalOrder(leftSkewedtree)
  verticalOrder(rightSkewTree)
  
  
  verticalOrder(balancedtree)                     //> 8 , 
                                                  //| 4 , 
                                                  //| 2 , 9 , 10 , 12 , 
  verticalOrder(balancedtree2)                    //> 8 , 
                                                  //| 4 , 
                                                  //| 2 , 9 , 10 , 12 , 
  verticalOrder(binarySearchTree)                 //> 1 , 
                                                  //| 2 , 
  verticalOrder(childrenSumTest)                  //> 3 , 
                                                  //| 7 , 
  verticalOrder(doubleTreeTest1)                  //> 2 , 
  verticalOrder(doubleTreeTest2)                  //> 4 , 
                                                  //| 2 , 
  verticalOrder(testTree)                         //> 4 , 
                                                  //| 2 , 
  verticalOrder(tree2)                            //> 
                                                  //| 4 , 
                                                  //| 8 , 10 , 
  verticalOrder(sumTreeTest)                      //> 8 , 
                                                  //| -2 , 
  verticalOrder(isSumtreeTest)                    //> 4 , 
                                                  //| 10 , 
  verticalOrder(isSubSetTreeTest1)                //> 
                                                  //| 4 , 
                                                  //| 10 , 30 , 
  verticalOrder(isSubSetTreeTest2)                //> 
                                                  //| 4 , 
  verticalOrder(maxSumLeafToRoot)                 //> 8 , 
                                                  //| -2 , 
  verticalOrder(isoMorphismTree1)                 //> 
                                                  //| 4 , 
                                                  //| 2 , 7 , 
  verticalOrder(isoMorphismTree2)                 //> 
                                                  //| 3 , 
  verticalOrder(bstToBalancedBSTTest1)
  verticalOrder(bstToBalancedBSTTest2)            //> 1 , 
                                                  //| 2 , 
                                                  //| 3 , 
  verticalOrder(bstToBalancedBSTTest)
  verticalOrder(maxConcurrentIncreasing2)         //> 6 , 
                                                  //| 9 , 
                                                  //| 8 , 
  verticalOrder(maxConcurrentIncreasing)          //> 13 , 
                                                  //| 11 , 
  verticalOrder(pairSumTree)                      //> 
                                                  //| 9 , 
                                                  //| 5 , 1 , 
  verticalOrder(onlyChildren)                     //> 2 , 
  verticalOrder(sumCoveredAndUncoveredNodes)      //> 
                                                  //| 1 , 
                                                  //| 3 , 4 , 
  verticalOrder(symmetricTree)                    //> 3 , 
                                                  //| 2 , 
}