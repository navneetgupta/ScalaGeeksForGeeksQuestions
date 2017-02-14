package com.tree.binarytree

sealed trait NAryTree[+A] {
  
}
case object EmptyNAryTree extends NAryTree[Nothing]
case class NAryNode[A](value:A,child:Array[NAryTree[A]]) extends NAryTree[A]

object NAryTree {
  def empty[A]: NAryTree[A] = EmptyNAryTree
  
  def emptyChild[A]: Array[NAryTree[A]] = Array(empty)
  
  def node[A](value:A,child:Array[NAryTree[A]]= Array(empty)) = NAryNode(value,child)
  
//  def fold[A,B](tree : NAryTree[A],z: B)(f: A => B)(g: (B,B) => B) : B = tree match {
//    case EmptyNAryTree => z
//    case NAryNode(v,c) => c.flatMap { x => ??? }g(fold(l,z)(f)(g),fold(r,z)(f)(g))
//  }
  def childArray[A](v:A): Array[NAryTree[A]] = Array(NAryNode(v,emptyChild))
  
  val tree1 = NAryNode(10,childArray(10))
}