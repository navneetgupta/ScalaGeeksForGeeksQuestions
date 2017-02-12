package com.tree.binarytree

sealed trait DoubleLinkedList[+A] {}

object EmptyNode extends DoubleLinkedList[Nothing]
case class NodeDLL[A](value : A, prev: DoubleLinkedList[A] , next: DoubleLinkedList[A]) extends DoubleLinkedList[A]

object DoubleLinkedList {
  
}