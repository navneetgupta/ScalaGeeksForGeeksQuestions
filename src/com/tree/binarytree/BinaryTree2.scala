package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 03-Jan-2017
 */

sealed trait BinaryTree2[+A]

case class Leaf[A](value: A) extends BinaryTree2[A]
case class Branch[A](l: BinaryTree2[A],right: BinaryTree2[A]) extends BinaryTree2[A]

//TODO: INCOMPLETE
object BinaryTree2 {
  
}