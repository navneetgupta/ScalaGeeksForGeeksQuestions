package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.PairSumInRootToPathEqualRootData.isPrintSum
object PairSumInRootToPathEqualRootDataTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val xs = List(1,2,3,4,5)                        //> xs  : List[Int] = List(1, 2, 3, 4, 5)
  
  xs.contains(6)                                  //> res0: Boolean = false
  
  isPrintSum(pairSumTree)                         //>  rootData-v = 3
                                                  //|  rootData-v = -1
                                                  //| res = false  List(9, 5)
                                                  //| res = false  List(9, 5)
                                                  //|  rootData-v = 1
                                                  //|  rootData-v = 7
                                                  //| res = false  List(7, 9, 5)
                                                  //| left side done found true list is List(7, 9, 5)
                                                  //| res1: Boolean = true
  
                                      
                                                  
                                
  
  
}