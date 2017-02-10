package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.ContinuousTree.continuousTree
object ContinuousTreeTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  (4-6).abs                                       //> res0: Int = 2
  
  continuousTree(leftSkewedtree)                  //> res1: Boolean = true
  continuousTree(rightSkewTree)                   //> res2: Boolean = true
  continuousTree(balancedtree)                    //> res3: Boolean = false
  continuousTree(balancedtree2)                   //> res4: Boolean = false
  continuousTree(tree1)                           //> res5: Boolean = false
}