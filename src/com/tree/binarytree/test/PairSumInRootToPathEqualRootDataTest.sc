package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.PairSumInRootToPathEqualRootData.isPrintSum
object PairSumInRootToPathEqualRootDataTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val xs = List(1,2,3,4,5)                        //> xs  : List[Int] = List(1, 2, 3, 4, 5)
  
  xs.contains(6)                                  //> res0: Boolean = false
  
  isPrintSum(tree1)                               //> res1: Boolean = false
  isPrintSum(tree2)                               //> res2: Boolean = false
  isPrintSum(binarySearchTree)                    //> res3: Boolean = false
  isPrintSum(balancedtree)                        //> res4: Boolean = false
  isPrintSum(balancedtree2)                       //> res5: Boolean = false
  isPrintSum(isoMorphismTree1)                    //> res6: Boolean = false
  isPrintSum(isoMorphismTree2)                    //> res7: Boolean = false
  isPrintSum(isSumtreeTest)                       //> res8: Boolean = false
  isPrintSum(isSubSetTreeTest1)                   //> res9: Boolean = false
  isPrintSum(isSubSetTreeTest2)                   //> res10: Boolean = false
  isPrintSum(pairSumTree)                         //> res11: Boolean = false
}