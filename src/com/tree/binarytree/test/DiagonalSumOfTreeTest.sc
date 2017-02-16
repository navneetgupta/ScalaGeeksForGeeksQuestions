package com.tree.binarytree.test
import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.DiagonalSumOfTree.{diagonalSum2,diagonalSum}
object DiagonalSumOfTreeTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  diagonalSum2(tree1)                             //> res0: Map[Int,Int] = Map(0 -> 30, 5 -> 33, 1 -> 11, 6 -> 25, 2 -> 48, 7 -> 2
                                                  //| 0, 3 -> 15, 4 -> 28)
  diagonalSum2(tree1)                             //> res1: Map[Int,Int] = Map(0 -> 30, 5 -> 33, 1 -> 11, 6 -> 25, 2 -> 48, 7 -> 2
                                                  //| 0, 3 -> 15, 4 -> 28)
  diagonalSum2(childrenSumPropertyTree)           //> res2: Map[Int,Int] = Map(0 -> 18, 1 -> 11, 2 -> 5, 3 -> 2)
  diagonalSum2(childrenSumPropertyTree1)          //> res3: Map[Int,Int] = Map(0 -> 14, 1 -> 13, 2 -> 3)
  diagonalSum2(leftSkewedtree)                    //> res4: Map[Int,Int] = Map(0 -> 1, 5 -> 6, 10 -> 11, 1 -> 2, 6 -> 7, 9 -> 10, 
                                                  //| 2 -> 3, 7 -> 8, 3 -> 4, 8 -> 9, 4 -> 5)
  diagonalSum2(rightSkewTree)                     //> res5: Map[Int,Int] = Map(0 -> 66)
  
  diagonalSum2(balancedtree)                      //> res6: Map[Int,Int] = Map(0 -> 26, 1 -> 51, 2 -> 35, 3 -> 8)
  diagonalSum2(balancedtree2)                     //> res7: Map[Int,Int] = Map(0 -> 282, 1 -> 51, 2 -> 35, 3 -> 8)
  diagonalSum2(binarySearchTree)                  //> res8: Map[Int,Int] = Map(0 -> 9, 1 -> 5, 2 -> 1)
  diagonalSum2(childrenSumTest)                   //> res9: Map[Int,Int] = Map(0 -> 82, 1 -> 13, 2 -> 3)
  diagonalSum2(doubleTreeTest1)                   //> res10: Map[Int,Int] = Map(0 -> 4, 1 -> 2)
  diagonalSum2(doubleTreeTest2)                   //> res11: Map[Int,Int] = Map(0 -> 4, 1 -> 7, 2 -> 4)
  diagonalSum2(testTree)                          //> res12: Map[Int,Int] = Map(0 -> 4, 1 -> 7, 2 -> 4)
  diagonalSum2(tree2)                             //> res13: Map[Int,Int] = Map(0 -> 42, 1 -> 34, 2 -> 14)
  diagonalSum2(sumTreeTest)                       //> res14: Map[Int,Int] = Map(0 -> 21, 1 -> 1, 2 -> 8)
  diagonalSum2(isSumtreeTest)                     //> res15: Map[Int,Int] = Map(0 -> 32, 1 -> 16, 2 -> 4)
  diagonalSum2(isSubSetTreeTest1)                 //> res16: Map[Int,Int] = Map(0 -> 32, 1 -> 16, 2 -> 34)
  diagonalSum2(isSubSetTreeTest2)                 //> res17: Map[Int,Int] = Map(0 -> 16, 1 -> 34)
  diagonalSum2(maxSumLeafToRoot)                  //> res18: Map[Int,Int] = Map(0 -> 17, 1 -> -6, 2 -> 8)
  diagonalSum2(isoMorphismTree1)                  //> res19: Map[Int,Int] = Map(0 -> 4, 1 -> 21, 2 -> 11)
  diagonalSum2(isoMorphismTree2)                  //> res20: Map[Int,Int] = Map(0 -> 15, 1 -> 21)
  diagonalSum2(bstToBalancedBSTTest1)             //> res21: Map[Int,Int] = Map(0 -> 30, 1 -> 20, 2 -> 10)
  diagonalSum2(bstToBalancedBSTTest2)             //> res22: Map[Int,Int] = Map(0 -> 22, 1 -> 3, 2 -> 2, 3 -> 1)
  diagonalSum2(bstToBalancedBSTTest)              //> res23: Map[Int,Int] = Map(0 -> 10, 1 -> 8, 2 -> 7, 3 -> 6, 4 -> 5)
  diagonalSum2(maxConcurrentIncreasing2)          //> res24: Map[Int,Int] = Map(0 -> 26, 1 -> 23, 2 -> 9, 3 -> 6)
  diagonalSum2(maxConcurrentIncreasing)           //> res25: Map[Int,Int] = Map(0 -> 27, 1 -> 36, 2 -> 13)
  diagonalSum2(pairSumTree)                       //> res26: Map[Int,Int] = Map(0 -> 23, 1 -> 29, 2 -> 10)
  diagonalSum2(onlyChildren)                      //> res27: Map[Int,Int] = Map(0 -> 4, 1 -> 2)
  diagonalSum2(sumCoveredAndUncoveredNodes)       //> res28: Map[Int,Int] = Map(0 -> 19, 1 -> 28, 2 -> 5)
  diagonalSum2(symmetricTree)                     //> res29: Map[Int,Int] = Map(0 -> 6, 1 -> 10, 2 -> 3)
  diagonalSum(tree1)                              //> res30: Map[Int,Int] = Map(0 -> 30, 5 -> 33, 1 -> 11, 6 -> 25, 2 -> 48, 7 ->
                                                  //|  20, 3 -> 15, 4 -> 28)
  diagonalSum(tree1)                              //> res31: Map[Int,Int] = Map(0 -> 30, 5 -> 33, 1 -> 11, 6 -> 25, 2 -> 48, 7 ->
                                                  //|  20, 3 -> 15, 4 -> 28)
                                                  
  diagonalSum(childrenSumPropertyTree)            //> res32: Map[Int,Int] = Map(0 -> 18, 1 -> 11, 2 -> 5, 3 -> 2)
  diagonalSum(childrenSumPropertyTree1)           //> res33: Map[Int,Int] = Map(0 -> 14, 1 -> 13, 2 -> 3)
  diagonalSum(leftSkewedtree)                     //> res34: Map[Int,Int] = Map(0 -> 1, 5 -> 6, 10 -> 11, 1 -> 2, 6 -> 7, 9 -> 10
                                                  //| , 2 -> 3, 7 -> 8, 3 -> 4, 8 -> 9, 4 -> 5)
  diagonalSum(rightSkewTree)                      //> res35: Map[Int,Int] = Map(0 -> 66)
  
  diagonalSum(balancedtree)                       //> res36: Map[Int,Int] = Map(0 -> 26, 1 -> 51, 2 -> 35, 3 -> 8)
  diagonalSum(balancedtree2)                      //> res37: Map[Int,Int] = Map(0 -> 282, 1 -> 51, 2 -> 35, 3 -> 8)
  diagonalSum(binarySearchTree)                   //> res38: Map[Int,Int] = Map(0 -> 9, 1 -> 5, 2 -> 1)
  diagonalSum(childrenSumTest)                    //> res39: Map[Int,Int] = Map(0 -> 82, 1 -> 13, 2 -> 3)
  diagonalSum(doubleTreeTest1)                    //> res40: Map[Int,Int] = Map(0 -> 4, 1 -> 2)
  diagonalSum(doubleTreeTest2)                    //> res41: Map[Int,Int] = Map(0 -> 4, 1 -> 7, 2 -> 4)
  diagonalSum(testTree)                           //> res42: Map[Int,Int] = Map(0 -> 4, 1 -> 7, 2 -> 4)
  diagonalSum(tree2)                              //> res43: Map[Int,Int] = Map(0 -> 42, 1 -> 34, 2 -> 14)
  diagonalSum(sumTreeTest)                        //> res44: Map[Int,Int] = Map(0 -> 21, 1 -> 1, 2 -> 8)
  diagonalSum(isSumtreeTest)                      //> res45: Map[Int,Int] = Map(0 -> 32, 1 -> 16, 2 -> 4)
  diagonalSum(isSubSetTreeTest1)                  //> res46: Map[Int,Int] = Map(0 -> 32, 1 -> 16, 2 -> 34)
  diagonalSum(isSubSetTreeTest2)                  //> res47: Map[Int,Int] = Map(0 -> 16, 1 -> 34)
  diagonalSum(maxSumLeafToRoot)                   //> res48: Map[Int,Int] = Map(0 -> 17, 1 -> -6, 2 -> 8)
  diagonalSum(isoMorphismTree1)                   //> res49: Map[Int,Int] = Map(0 -> 4, 1 -> 21, 2 -> 11)
  diagonalSum(isoMorphismTree2)                   //> res50: Map[Int,Int] = Map(0 -> 15, 1 -> 21)
  diagonalSum(bstToBalancedBSTTest1)              //> res51: Map[Int,Int] = Map(0 -> 30, 1 -> 20, 2 -> 10)
  diagonalSum(bstToBalancedBSTTest2)              //> res52: Map[Int,Int] = Map(0 -> 22, 1 -> 3, 2 -> 2, 3 -> 1)
  diagonalSum(bstToBalancedBSTTest)               //> res53: Map[Int,Int] = Map(0 -> 10, 1 -> 8, 2 -> 7, 3 -> 6, 4 -> 5)
  diagonalSum(maxConcurrentIncreasing2)           //> res54: Map[Int,Int] = Map(0 -> 26, 1 -> 23, 2 -> 9, 3 -> 6)
  diagonalSum(maxConcurrentIncreasing)            //> res55: Map[Int,Int] = Map(0 -> 27, 1 -> 36, 2 -> 13)
  diagonalSum(pairSumTree)                        //> res56: Map[Int,Int] = Map(0 -> 23, 1 -> 29, 2 -> 10)
  diagonalSum(onlyChildren)                       //> res57: Map[Int,Int] = Map(0 -> 4, 1 -> 2)
  diagonalSum(sumCoveredAndUncoveredNodes)        //> res58: Map[Int,Int] = Map(0 -> 19, 1 -> 28, 2 -> 5)
  diagonalSum(symmetricTree)                      //> res59: Map[Int,Int] = Map(0 -> 6, 1 -> 10, 2 -> 3)
}