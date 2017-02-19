package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.SuccinctEncodingOfBT.{encodeSuccinct,decodeSuucinct}
import com.tree.binarytree.PreOrderTraversal.preOrderTraversalRecursive

object SuccinctEncodingOfBTTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val as = encodeSuccinct(succinctTreeTest, Nil, Nil)
                                                  //> as  : (List[Boolean], List[Int]) = (List(false, false, true, false, true, fa
                                                  //| lse, false, true, false, false, true, true, true),List(70, 30, 50, 40, 20, 1
                                                  //| 0))
  preOrderTraversalRecursive(decodeSuucinct(as._1.reverse,as._2.reverse))
                                                  //> 10 , 
                                                  
}