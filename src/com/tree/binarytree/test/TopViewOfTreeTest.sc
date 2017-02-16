package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.TopViewOfTree.topView

object TopViewOfTreeTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  topView(tree1)                                  //> res0: List[Int] = List(20, 7, 6, 5, 4, 19, 3, 10, 2, 1)
  topView(childrenSumPropertyTree)                //> res1: List[Int] = List(2, 4, 2, 4, 6, 10)
  topView(childrenSumPropertyTree1)               //> res2: List[Int] = List(2, 3, 2, 8, 10)
  topView(leftSkewedtree)                         //> res3: List[Int] = List(11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
  topView(rightSkewTree)                          //> res4: List[Int] = List(11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
  
  topView(balancedtree)                           //> res5: List[Int] = List(15, 8, 7, 4, 3, 2, 1)
  topView(balancedtree2)                          //> res6: List[Int] = List(15, 8, 7, 4, 60, 2, 200)
  topView(binarySearchTree)                       //> res7: List[Int] = List(1, 5, 2, 4)
  topView(childrenSumTest)                        //> res8: List[Int] = List(30, 3, 2, 7, 50)
  topView(doubleTreeTest1)                        //> res9: List[Int] = List(3, 2, 1)
  topView(doubleTreeTest2)                        //> res10: List[Int] = List(4, 3, 2, 1)
  topView(testTree)                               //> res11: List[Int] = List(4, 3, 2, 1)
  topView(tree2)                                  //> res12: List[Int] = List(4, 22, 8, 20)
  topView(sumTreeTest)                            //> res13: List[Int] = List(5, 8, 6, -2, 10)
  topView(isSumtreeTest)                          //> res14: List[Int] = List(3, 4, 3, 10, 26)
  topView(isSubSetTreeTest1)                      //> res15: List[Int] = List(3, 4, 3, 10, 26)
  topView(isSubSetTreeTest2)                      //> res16: List[Int] = List(6, 4, 10)
  topView(maxSumLeafToRoot)                       //> res17: List[Int] = List(8, 7, -2, 10)
  topView(isoMorphismTree1)                       //> res18: List[Int] = List(4, 3, 2, 1)
  topView(isoMorphismTree2)                       //> res19: List[Int] = List(7, 5, 2, 3, 1)
  topView(bstToBalancedBSTTest1)                  //> res20: List[Int] = List(10, 20, 30)
  topView(bstToBalancedBSTTest2)                  //> res21: List[Int] = List(7, 1, 6, 2, 5, 3, 4)
  topView(bstToBalancedBSTTest)                   //> res22: List[Int] = List(5, 6, 7, 8, 10)
  topView(maxConcurrentIncreasing2)               //> res23: List[Int] = List(6, 10, 9, 11, 8, 5)
  topView(maxConcurrentIncreasing)                //> res24: List[Int] = List(8, 13, 9, 11, 10)
  topView(pairSumTree)                            //> res25: List[Int] = List(11, 9, 4, 5, 8)
  topView(onlyChildren)                           //> res26: List[Int] = List(3, 2, 1)
  topView(sumCoveredAndUncoveredNodes)            //> res27: List[Int] = List(1, 1, 10, 3, 8)
  topView(symmetricTree)                          //> res28: List[Int] = List(3, 3, 2, 2, 1)
}