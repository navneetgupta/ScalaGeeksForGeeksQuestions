package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.IsSumTree._
import com.tree.binarytree.SumTree.toSumTree2
object IsSumTreeTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  isSumTree(tree1)                                //> res0: Boolean = false
  isSumTree(toSumTree2(tree1)._1)                 //> res1: Boolean = false
  isSumTree(onlyChildren)                         //> res2: Boolean = false
  isSumTree(toSumTree2(onlyChildren)._1)          //> res3: Boolean = false
  isSumTree(childrenSumPropertyTree)              //> res4: Boolean = false
  isSumTree(toSumTree2(childrenSumPropertyTree)._1)
                                                  //> res5: Boolean = false
  isSumTree(childrenSumPropertyTree1)             //> res6: Boolean = false
  isSumTree(toSumTree2(childrenSumPropertyTree1)._1)
                                                  //> res7: Boolean = false
  isSumTree(leftSkewedtree)                       //> res8: Boolean = false
  isSumTree(toSumTree2(leftSkewedtree)._1)        //> res9: Boolean = false
  isSumTree(rightSkewTree)                        //> res10: Boolean = false
  isSumTree(toSumTree2(rightSkewTree)._1)         //> res11: Boolean = false
  isSumTree(balancedtree)                         //> res12: Boolean = false
  isSumTree(toSumTree2(balancedtree)._1)          //> res13: Boolean = false
  isSumTree(balancedtree2)                        //> res14: Boolean = false
  isSumTree(toSumTree2(balancedtree2)._1)         //> res15: Boolean = false
  isSumTree(binarySearchTree)                     //> res16: Boolean = false
  isSumTree(toSumTree2(binarySearchTree)._1)      //> res17: Boolean = false
  isSumTree(childrenSumTest)                      //> res18: Boolean = false
  isSumTree(toSumTree2(childrenSumTest)._1)       //> res19: Boolean = false
  
  isSumTree(doubleTreeTest1)                      //> res20: Boolean = false
  isSumTree(toSumTree2(doubleTreeTest1)._1)       //> res21: Boolean = false
  isSumTree(doubleTreeTest2)                      //> res22: Boolean = false
  isSumTree(toSumTree2(doubleTreeTest2)._1)       //> res23: Boolean = false
  isSumTree(testTree)                             //> res24: Boolean = false
  isSumTree(toSumTree2(testTree)._1)              //> res25: Boolean = false
  
  isSumTree(tree2)                                //> res26: Boolean = false
  isSumTree(toSumTree2(tree2)._1)                 //> res27: Boolean = false
  isSumTree(sumTreeTest)                          //> res28: Boolean = false
  isSumTree(toSumTree2(sumTreeTest)._1)           //> res29: Boolean = false
 
 
  
  isSumTree(isSumtreeTest)                        //> res30: Boolean = true
}