package com.tree.binarytree

sealed trait DoubleLinkedList[+A] {}

object EmptyNode extends DoubleLinkedList[Nothing]
case class NodeDLL[A](value : A, left: DoubleLinkedList[A] , right: DoubleLinkedList[A]) extends DoubleLinkedList[A]

object DoubleLinkedList {
  
}