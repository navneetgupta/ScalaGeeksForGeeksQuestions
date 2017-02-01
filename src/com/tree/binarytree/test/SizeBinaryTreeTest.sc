package com.tree.binarytree.test

import com.tree.binarytree.SizeBinaryTree.{size,sizeViaFold}
import com.tree.binarytree.BinaryTree._

object SizeBinaryTreeTest {
  size(tree1)                                     //> res0: Int = 20
  size(emptytree)                                 //> res1: Int = 0
  size(leftSkewedtree)                            //> res2: Int = 11
  size(rightSkewTree)                             //> res3: Int = 11
  size(balancedtree)                              //> res4: Int = 15
  size(onlyRoot)                                  //> res5: Int = 1
  
  sizeViaFold(tree1)                              //> res6: Int = 20
  sizeViaFold(tree1)                              //> res7: Int = 20
  sizeViaFold(emptytree)                          //> res8: Int = 0
  sizeViaFold(leftSkewedtree)                     //> res9: Int = 11
  sizeViaFold(rightSkewTree)                      //> res10: Int = 11
  sizeViaFold(balancedtree)                       //> res11: Int = 15
  sizeViaFold(onlyRoot)                           //> res12: Int = 1
  
  
}