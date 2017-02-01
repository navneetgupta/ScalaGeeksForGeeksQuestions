package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.IsSubsetTree.isSubsetTree

object IsSubsetTreeTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  isSubsetTree(isSubSetTreeTest1,isSubSetTreeTest2)
                                                  //> res0: Boolean = true
  isSubsetTree(tree1, tree1)                      //> res1: Boolean = true
  
  isSubsetTree(tree1, tree2)                      //> res2: Boolean = false
  
  isSubsetTree(isSubSetTreeTest2, isSubSetTreeTest2)
                                                  //> res3: Boolean = true
  isSubsetTree(isSubSetTreeTest1, isSubSetTreeTest1)
                                                  //> res4: Boolean = true
  
  isSubsetTree(isSubSetTreeTest2, isSubSetTreeTest1)
                                                  //> res5: Boolean = false
}