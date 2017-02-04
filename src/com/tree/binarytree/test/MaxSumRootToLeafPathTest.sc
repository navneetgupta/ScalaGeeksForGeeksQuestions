package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.MaxSumRootToLeafPath._
import com.tree.binarytree.PIndex

object MaxSumRootToLeafPathTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  getMaxSumPath(tree1)                            //> 18 , 13 , 6 , 5 , 4 , 3 , 2 , 1 , res0: Int = 52
                                      
 
  getMaxSumPath(maxSumLeafToRoot)                 //> 7 , 10 , res1: Int = 17
  getMaxSumPath(onlyChildren)                     //> 3 , 1 , res2: Int = 4
  getMaxSumPath(onlyRoot)                         //> 1 , res3: Int = 1
  getMaxSumPath(childrenSumPropertyTree)          //> 3 , 4 , 6 , 10 , res4: Int = 23
  getMaxSumPath(childrenSumPropertyTree1)         //> 5 , 8 , 10 , res5: Int = 23
  getMaxSumPath(leftSkewedtree)                   //> 11 , 10 , 9 , 8 , 7 , 6 , 5 , 4 , 3 , 2 , 1 , res6: Int = 66
  getMaxSumPath(rightSkewTree)                    //> 11 , 10 , 9 , 8 , 7 , 6 , 5 , 4 , 3 , 2 , 1 , res7: Int = 66
  getMaxSumPath(balancedtree)                     //> 15 , 7 , 3 , 1 , res8: Int = 26
  getMaxSumPath(balancedtree2)                    //> 15 , 7 , 60 , 200 , res9: Int = 282
  getMaxSumPath(binarySearchTree)                 //> 3 , 2 , 4 , res10: Int = 9
  getMaxSumPath(childrenSumTest)                  //> 30 , 2 , 50 , res11: Int = 82
  getMaxSumPath(doubleTreeTest1)                  //> 3 , 1 , res12: Int = 4
  getMaxSumPath(doubleTreeTest2)                  //> 5 , 2 , 1 , res13: Int = 8
  getMaxSumPath(testTree)                         //> 5 , 2 , 1 , res14: Int = 8
  getMaxSumPath(tree2)                            //> 14 , 12 , 8 , 20 , res15: Int = 54
  getMaxSumPath(sumTreeTest)                      //> 7 , 6 , 10 , res16: Int = 23
  getMaxSumPath(isSumtreeTest)                    //> 6 , 10 , 26 , res17: Int = 42
  getMaxSumPath(isSubSetTreeTest1)                //> 30 , 4 , 10 , 26 , res18: Int = 70
  getMaxSumPath(isSubSetTreeTest2)                //> 30 , 4 , 10 , res19: Int = 44
  
  
}