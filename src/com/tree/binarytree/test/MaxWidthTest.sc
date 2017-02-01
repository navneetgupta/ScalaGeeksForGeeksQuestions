package com.tree.binarytree.test

import com.tree.binarytree.MaxWidth._
import com.tree.binarytree.BinaryTree._
object MaxWidthTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  maxWidth1(tree1)                                //> res0: Int = 3
  maxWidth1(tree2)                                //> res1: Int = 2
  maxWidth1(onlyChildren)                         //> res2: Int = 2
  maxWidth1(onlyRoot)                             //> res3: Int = 1
  maxWidth1(leftSkewedtree)                       //> res4: Int = 1
  maxWidth1(rightSkewTree)                        //> res5: Int = 1
  maxWidth1(balancedtree)                         //> res6: Int = 8
  maxWidth1(balancedtree2)                        //> res7: Int = 8
  maxWidth1(binarySearchTree)                     //> res8: Int = 2
  maxWidth1(childrenSumPropertyTree1)             //> res9: Int = 3
  maxWidth1(childrenSumPropertyTree)              //> res10: Int = 4
  maxWidth1(doubleTreeTest1)                      //> res11: Int = 2
  maxWidth1(doubleTreeTest2)                      //> res12: Int = 2
  
  
  maxWidth2(tree1)                                //> res13: Int = 3
  maxWidth2(tree2)                                //> res14: Int = 2
  maxWidth2(onlyChildren)                         //> res15: Int = 2
  maxWidth2(onlyRoot)                             //> res16: Int = 1
  maxWidth2(leftSkewedtree)                       //> res17: Int = 1
  maxWidth2(rightSkewTree)                        //> res18: Int = 1
  maxWidth2(balancedtree)                         //> res19: Int = 8
  maxWidth2(balancedtree2)                        //> res20: Int = 8
  maxWidth2(binarySearchTree)                     //> res21: Int = 2
  maxWidth2(childrenSumPropertyTree1)             //> res22: Int = 3
  maxWidth2(childrenSumPropertyTree)              //> res23: Int = 4
  maxWidth2(doubleTreeTest1)                      //> res24: Int = 2
  maxWidth2(doubleTreeTest2)                      //> res25: Int = 2
  
  
  maxWidthViaPreOrder(tree1)                      //> res26: Int = 3
  maxWidthViaPreOrder(tree2)                      //> res27: Int = 2
  maxWidthViaPreOrder(onlyChildren)               //> res28: Int = 2
  maxWidthViaPreOrder(onlyRoot)                   //> res29: Int = 1
  maxWidthViaPreOrder(leftSkewedtree)             //> res30: Int = 1
  maxWidthViaPreOrder(rightSkewTree)              //> res31: Int = 1
  maxWidthViaPreOrder(balancedtree)               //> res32: Int = 8
  maxWidthViaPreOrder(balancedtree2)              //> res33: Int = 8
  maxWidthViaPreOrder(binarySearchTree)           //> res34: Int = 2
  maxWidthViaPreOrder(childrenSumPropertyTree1)   //> res35: Int = 3
  maxWidthViaPreOrder(childrenSumPropertyTree)    //> res36: Int = 4
  maxWidthViaPreOrder(doubleTreeTest1)            //> res37: Int = 2
  maxWidthViaPreOrder(doubleTreeTest2)            //> res38: Int = 2
  
  
  maxWidth1(emptytree)                            //> res39: Int = 0
  maxWidth2(emptytree)                            //> res40: Int = 0
  maxWidthViaPreOrder(emptytree)                  //> res41: Int = 0
  
}