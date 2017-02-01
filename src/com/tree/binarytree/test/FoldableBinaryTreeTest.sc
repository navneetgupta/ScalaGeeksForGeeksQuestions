package com.tree.binarytree.test

import com.tree.binarytree.FoldableBinaryTree.{isFoldable,isFoldable2}
import com.tree.binarytree.BinaryTree._

object FoldableBinaryTreeTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  isFoldable(tree1)                               //> res0: Boolean = false
  isFoldable(leftSkewedtree)                      //> res1: Boolean = false
  isFoldable(rightSkewTree)                       //> res2: Boolean = false
  isFoldable(balancedtree)                        //> res3: Boolean = true
  isFoldable(balancedtree2)                       //> res4: Boolean = true
  isFoldable(binarySearchTree)                    //> res5: Boolean = false
  isFoldable(onlyRoot)                            //> res6: Boolean = true
  isFoldable(onlyChildren)                        //> res7: Boolean = true
  
  isFoldable2(tree1)                              //> res8: Boolean = false
  isFoldable2(leftSkewedtree)                     //> res9: Boolean = false
  isFoldable2(rightSkewTree)                      //> res10: Boolean = false
  isFoldable2(balancedtree)                       //> res11: Boolean = true
  isFoldable2(balancedtree2)                      //> res12: Boolean = true
  isFoldable2(binarySearchTree)                   //> res13: Boolean = false
  isFoldable2(onlyRoot)                           //> res14: Boolean = true
  isFoldable2(onlyChildren)                       //> res15: Boolean = true
  //isFoldable()
}