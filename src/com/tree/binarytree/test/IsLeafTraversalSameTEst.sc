package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.IsLeafTraversalSame.isSame2

object IsLeafTraversalSameTEst {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  isSame2(tree1,tree1)                            //> res0: Boolean = false
  isSame2(childrenSumPropertyTree,childrenSumPropertyTree)
                                                  //> res1: Boolean = false
  isSame2(childrenSumPropertyTree1,childrenSumPropertyTree1)
                                                  //> res2: Boolean = false
  isSame2(leftSkewedtree,leftSkewedtree)          //> res3: Boolean = false
  isSame2(rightSkewTree,rightSkewTree)            //> res4: Boolean = false
  
  isSame2(balancedtree,balancedtree)              //> res5: Boolean = false
  isSame2(balancedtree2,balancedtree2)            //> res6: Boolean = false
  isSame2(binarySearchTree,binarySearchTree)      //> res7: Boolean = false
  isSame2(childrenSumTest,childrenSumTest)        //> res8: Boolean = false
  
  isSame2(doubleTreeTest1,doubleTreeTest1)        //> res9: Boolean = false
  isSame2(doubleTreeTest2,doubleTreeTest2)        //> res10: Boolean = false
  isSame2(testTree,testTree)                      //> res11: Boolean = false
  isSame2(tree2,tree2)                            //> res12: Boolean = false
  isSame2(sumTreeTest,sumTreeTest)                //> res13: Boolean = false
  isSame2(isSumtreeTest,isSumtreeTest)            //> res14: Boolean = false
  isSame2(isSubSetTreeTest1,isSubSetTreeTest1)    //> res15: Boolean = false
  isSame2(isSubSetTreeTest2,isSubSetTreeTest2)    //> res16: Boolean = false
  isSame2(maxSumLeafToRoot,maxSumLeafToRoot)      //> res17: Boolean = false
  isSame2(isoMorphismTree1,isoMorphismTree1)      //> res18: Boolean = false
  isSame2(isoMorphismTree2,isoMorphismTree2)      //> res19: Boolean = false
  isSame2(bstToBalancedBSTTest1,bstToBalancedBSTTest1)
                                                  //> res20: Boolean = false
  isSame2(bstToBalancedBSTTest2,bstToBalancedBSTTest2)
                                                  //> res21: Boolean = false
  isSame2(bstToBalancedBSTTest,bstToBalancedBSTTest)
                                                  //> res22: Boolean = false
  isSame2(maxConcurrentIncreasing2,maxConcurrentIncreasing2)
                                                  //> res23: Boolean = false
  isSame2(maxConcurrentIncreasing,maxConcurrentIncreasing)
                                                  //> res24: Boolean = false
  isSame2(pairSumTree,pairSumTree)                //> res25: Boolean = false
  isSame2(onlyChildren,onlyChildren)              //> res26: Boolean = false
  
  

  

  
  
  
  isSame2(tree1,childrenSumPropertyTree)          //> res27: Boolean = false
  isSame2(childrenSumPropertyTree,childrenSumPropertyTree1)
                                                  //> res28: Boolean = false
  isSame2(childrenSumPropertyTree1,leftSkewedtree)//> res29: Boolean = false
  isSame2(leftSkewedtree,rightSkewTree)           //> res30: Boolean = false
  isSame2(rightSkewTree,balancedtree)             //> res31: Boolean = false
  
  isSame2(balancedtree,balancedtree2)             //> res32: Boolean = false
  isSame2(balancedtree2,binarySearchTree)         //> res33: Boolean = false
  isSame2(binarySearchTree,childrenSumTest)       //> res34: Boolean = false
  isSame2(childrenSumTest,doubleTreeTest1)        //> res35: Boolean = false
  isSame2(doubleTreeTest1,doubleTreeTest2)        //> res36: Boolean = false
  isSame2(doubleTreeTest2,testTree)               //> res37: Boolean = false
  isSame2(testTree,tree2)                         //> res38: Boolean = false
  isSame2(tree2,sumTreeTest)                      //> res39: Boolean = false
  isSame2(sumTreeTest,isSumtreeTest)              //> res40: Boolean = false
  isSame2(isSumtreeTest,isSubSetTreeTest1)        //> res41: Boolean = false
  isSame2(isSubSetTreeTest1,isSubSetTreeTest2)    //> res42: Boolean = false
  isSame2(isSubSetTreeTest2,maxSumLeafToRoot)     //> res43: Boolean = false
  isSame2(maxSumLeafToRoot,isoMorphismTree1)      //> res44: Boolean = false
  isSame2(isoMorphismTree1,isoMorphismTree2)      //> res45: Boolean = false
  isSame2(isoMorphismTree2,bstToBalancedBSTTest1) //> res46: Boolean = false
  isSame2(bstToBalancedBSTTest1,bstToBalancedBSTTest2)
                                                  //> res47: Boolean = false
  isSame2(bstToBalancedBSTTest2,bstToBalancedBSTTest)
                                                  //> res48: Boolean = false
  isSame2(bstToBalancedBSTTest,maxConcurrentIncreasing2)
                                                  //> res49: Boolean = false
  isSame2(maxConcurrentIncreasing2,maxConcurrentIncreasing)
                                                  //> res50: Boolean = false
  isSame2(maxConcurrentIncreasing,pairSumTree)    //> res51: Boolean = false
  isSame2(pairSumTree,onlyChildren)               //> res52: Boolean = false
  isSame2(onlyChildren,tree1)                     //> res53: Boolean = false
}