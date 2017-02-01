package com.tree.binarytree.test

import com.tree.binarytree.CountLeafNodes.noOfLeafNodes
import com.tree.binarytree.BinaryTree._
object CountLeafNodesTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  noOfLeafNodes(tree1)                            //> res0: Int = 8
  noOfLeafNodes(leftSkewedtree)                   //> res1: Int = 1
  noOfLeafNodes(rightSkewTree)                    //> res2: Int = 1
  noOfLeafNodes(balancedtree)                     //> res3: Int = 8
  noOfLeafNodes(onlyRoot)                         //> res4: Int = 1
  noOfLeafNodes(binarySearchTree)                 //> res5: Int = 3
  noOfLeafNodes(emptytree)                        //> res6: Int = 0
}