package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.ExpressionTreeEvaluation.evaluate
object ExpressionTreeEvaluationTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  evaluate(expresiionTree1, 0)                    //> res0: Int = 110
  evaluate(expresiionTree, 0)                     //> res1: Int = 100
  
  for{
  	i <- (10 to 1 by -1)
  } yield (i)                                     //> res2: scala.collection.immutable.IndexedSeq[Int] = Vector(10, 9, 8, 7, 6, 5,
                                                  //|  4, 3, 2, 1)
  
  
}