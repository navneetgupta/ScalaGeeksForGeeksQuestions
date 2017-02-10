package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.RootToLeafPathHavingEqualLength.pathCount
object RootToLeafPathHavingEqualLengthTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  pathCount(tree1)                                //> res0: Map[Int,Int] = Map(5 -> 1, 6 -> 2, 3 -> 1, 8 -> 3, 4 -> 1)
  pathCount(tree2)                                //> res1: Map[Int,Int] = Map(3 -> 1, 4 -> 2, 2 -> 1)
  pathCount(leftSkewedtree)                       //> res2: Map[Int,Int] = Map(11 -> 1)
  pathCount(rightSkewTree)                        //> res3: Map[Int,Int] = Map(11 -> 1)
    pathCount(onlyRoot)                           //> res4: Map[Int,Int] = Map(1 -> 1)
  pathCount(onlyChildren )                        //> res5: Map[Int,Int] = Map(2 -> 2)
  pathCount(onlyChildren )                        //> res6: Map[Int,Int] = Map(2 -> 2)
  pathCount(binarySearchTree)                     //> res7: Map[Int,Int] = Map(3 -> 2, 2 -> 1)
  pathCount(binarySearchTree)                     //> res8: Map[Int,Int] = Map(3 -> 2, 2 -> 1)
 pathCount(doubleTreeTest1)                       //> res9: Map[Int,Int] = Map(2 -> 2)
 
 pathCount(doubleTreeTest2)                       //> res10: Map[Int,Int] = Map(3 -> 2, 2 -> 1)
  
 pathCount(sumTreeTest)                           //> res11: Map[Int,Int] = Map(3 -> 4)
          
 pathCount(tree1)                                 //> res12: Map[Int,Int] = Map(5 -> 1, 6 -> 2, 3 -> 1, 8 -> 3, 4 -> 1)
  
  pathCount(leftSkewedtree)                       //> res13: Map[Int,Int] = Map(11 -> 1)
  pathCount(rightSkewTree)                        //> res14: Map[Int,Int] = Map(11 -> 1)
}