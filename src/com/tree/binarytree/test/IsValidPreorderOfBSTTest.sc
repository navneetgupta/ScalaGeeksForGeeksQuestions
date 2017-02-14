package com.tree.binarytree.test
import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.IsValidPreorderOfBST.canRepresentBST
object IsValidPreorderOfBSTTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val a = Array(40, 30, 35, 80, 100)              //> a  : Array[Int] = Array(40, 30, 35, 80, 100)
  val b = Array(40, 30, 35, 20, 80, 100)          //> b  : Array[Int] = Array(40, 30, 35, 20, 80, 100)
  
  canRepresentBST(a, a.length)                    //> res0: Boolean = true
  canRepresentBST(b, b.length)                    //> res1: Boolean = false
}