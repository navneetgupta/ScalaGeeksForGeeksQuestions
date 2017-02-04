package com.tree.binarytree.test
import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.IsTreeComplete.isTreeComplete
object IsTreeCompleteTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  isTreeComplete(tree1)                           //> res0: Boolean = false
  isTreeComplete(onlyChildren)                    //> res1: Boolean = true
  isTreeComplete(onlyRoot)                        //> res2: Boolean = true
  isTreeComplete(childrenSumPropertyTree)         //> res3: Boolean = false
  isTreeComplete(childrenSumPropertyTree1)        //> res4: Boolean = false
  isTreeComplete(leftSkewedtree)                  //> res5: Boolean = false
  isTreeComplete(rightSkewTree)                   //> res6: Boolean = false
  isTreeComplete(balancedtree)                    //> res7: Boolean = true
  isTreeComplete(balancedtree2)                   //> res8: Boolean = true
  isTreeComplete(binarySearchTree)                //> res9: Boolean = true
  isTreeComplete(childrenSumTest)                 //> res10: Boolean = true
  isTreeComplete(doubleTreeTest1)                 //> res11: Boolean = true
  isTreeComplete(doubleTreeTest2)                 //> res12: Boolean = true
  isTreeComplete(testTree)                        //> res13: Boolean = true
  isTreeComplete(tree2)                           //> res14: Boolean = false
  isTreeComplete(sumTreeTest)                     //> res15: Boolean = true
  isTreeComplete(isSumtreeTest)                   //> res16: Boolean = false
  isTreeComplete(isSubSetTreeTest1)               //> res17: Boolean = false
  isTreeComplete(isSubSetTreeTest2)               //> res18: Boolean = false
}