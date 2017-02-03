package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.IsSumTree._
import com.tree.binarytree.SumTree.toSumTree2
object IsSumTreeTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  isSumTreeOptimised(tree1)                       //> res0: Boolean = false
  isSumTreeOptimised(toSumTree2(tree1)._1)        //> res1: Boolean = false
  isSumTreeOptimised(onlyChildren)                //> res2: Boolean = false
  isSumTreeOptimised(toSumTree2(onlyChildren)._1) //> res3: Boolean = false
  isSumTreeOptimised(childrenSumPropertyTree)     //> res4: Boolean = false
  isSumTreeOptimised(toSumTree2(childrenSumPropertyTree)._1)
                                                  //> res5: Boolean = false
  isSumTreeOptimised(childrenSumPropertyTree1)    //> res6: Boolean = false
  isSumTreeOptimised(toSumTree2(childrenSumPropertyTree1)._1)
                                                  //> res7: Boolean = false
  isSumTreeOptimised(leftSkewedtree)              //> res8: Boolean = false
  isSumTreeOptimised(toSumTree2(leftSkewedtree)._1)
                                                  //> res9: Boolean = false
  isSumTreeOptimised(rightSkewTree)               //> res10: Boolean = false
  isSumTreeOptimised(toSumTree2(rightSkewTree)._1)//> res11: Boolean = false
  isSumTreeOptimised(balancedtree)                //> res12: Boolean = false
  isSumTreeOptimised(toSumTree2(balancedtree)._1) //> res13: Boolean = false
  isSumTreeOptimised(balancedtree2)               //> res14: Boolean = false
  isSumTreeOptimised(toSumTree2(balancedtree2)._1)//> res15: Boolean = false
  isSumTreeOptimised(binarySearchTree)            //> res16: Boolean = false
  isSumTreeOptimised(toSumTree2(binarySearchTree)._1)
                                                  //> res17: Boolean = false
  isSumTreeOptimised(childrenSumTest)             //> res18: Boolean = false
  isSumTreeOptimised(toSumTree2(childrenSumTest)._1)
                                                  //> res19: Boolean = false
  
  isSumTreeOptimised(doubleTreeTest1)             //> res20: Boolean = false
  isSumTreeOptimised(toSumTree2(doubleTreeTest1)._1)
                                                  //> res21: Boolean = false
  isSumTreeOptimised(doubleTreeTest2)             //> res22: Boolean = false
  isSumTreeOptimised(toSumTree2(doubleTreeTest2)._1)
                                                  //> res23: Boolean = false
  isSumTreeOptimised(testTree)                    //> res24: Boolean = false
  isSumTreeOptimised(toSumTree2(testTree)._1)     //> res25: Boolean = false
  
  isSumTreeOptimised(tree2)                       //> res26: Boolean = false
  isSumTreeOptimised(toSumTree2(tree2)._1)        //> res27: Boolean = false
  isSumTreeOptimised(sumTreeTest)                 //> res28: Boolean = false
  isSumTreeOptimised(toSumTree2(sumTreeTest)._1)  //> res29: Boolean = false
 
 
  
  isSumTreeOptimised(isSumtreeTest)               //> res30: Boolean = true
  
  
  isSumTree(tree1)                                //> res31: Boolean = false
  isSumTree(toSumTree2(tree1)._1)                 //> res32: Boolean = false
  isSumTree(onlyChildren)                         //> res33: Boolean = false
  isSumTree(toSumTree2(onlyChildren)._1)          //> res34: Boolean = false
  isSumTree(childrenSumPropertyTree)              //> res35: Boolean = false
  isSumTree(toSumTree2(childrenSumPropertyTree)._1)
                                                  //> res36: Boolean = false
  isSumTree(childrenSumPropertyTree1)             //> res37: Boolean = false
  isSumTree(toSumTree2(childrenSumPropertyTree1)._1)
                                                  //> res38: Boolean = false
  isSumTree(leftSkewedtree)                       //> res39: Boolean = false
  isSumTree(toSumTree2(leftSkewedtree)._1)        //> res40: Boolean = false
  isSumTree(rightSkewTree)                        //> res41: Boolean = false
  isSumTree(toSumTree2(rightSkewTree)._1)         //> res42: Boolean = false
  isSumTree(balancedtree)                         //> res43: Boolean = false
  isSumTree(toSumTree2(balancedtree)._1)          //> res44: Boolean = false
  isSumTree(balancedtree2)                        //> res45: Boolean = false
  isSumTree(toSumTree2(balancedtree2)._1)         //> res46: Boolean = false
  isSumTree(binarySearchTree)                     //> res47: Boolean = false
  isSumTree(toSumTree2(binarySearchTree)._1)      //> res48: Boolean = false
  isSumTree(childrenSumTest)                      //> res49: Boolean = false
  isSumTree(toSumTree2(childrenSumTest)._1)       //> res50: Boolean = false
  
  isSumTree(doubleTreeTest1)                      //> res51: Boolean = false
  isSumTree(toSumTree2(doubleTreeTest1)._1)       //> res52: Boolean = false
  isSumTree(doubleTreeTest2)                      //> res53: Boolean = false
  isSumTree(toSumTree2(doubleTreeTest2)._1)       //> res54: Boolean = false
  isSumTree(testTree)                             //> res55: Boolean = false
  isSumTree(toSumTree2(testTree)._1)              //> res56: Boolean = false
  
  isSumTree(tree2)                                //> res57: Boolean = false
  isSumTree(toSumTree2(tree2)._1)                 //> res58: Boolean = false
  isSumTree(sumTreeTest)                          //> res59: Boolean = false
  isSumTree(toSumTree2(sumTreeTest)._1)           //> res60: Boolean = false
 
 
  
  isSumTree(isSumtreeTest)                        //> res61: Boolean = true
}