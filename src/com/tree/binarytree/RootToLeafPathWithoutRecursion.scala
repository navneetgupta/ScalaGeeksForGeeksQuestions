package com.tree.binarytree

import scala.collection.mutable.Stack


/**
 * @author: Navneet Gupta
 * @createdOn: 06-Feb-2017
 */

import com.tree.binarytree.BinaryTree._

object RootToLeafPathWithoutRecursion extends App{
  /*
   * We can traverse tree iteratively (we have used iterative preorder). The question is, how to extend the traversal 
   * to print root to leaf paths? The idea is to maintain a map to store parent pointers of binary tree nodes. 
   * Now whenever we encounter a leaf node while doing iterative preorder traversal, we can easily print root to 
   * leaf path using parent pointer.
   */
   
  def printRootToLeafPath[A](current: BinaryTree[A],parent:Map[BinaryTree[A],BinaryTree[A]]):Unit={
    val stack = addToStack(current, parent,Stack[BinaryTree[A]]())
    while(stack.size>0) {
      stack.pop() match {
        case EmptyTree =>
        case Node(v,l,r) =>print(v +" , ")
      }
    } 
    println("==============")
  }
  
  def addToStack[A](tree:BinaryTree[A],parent:Map[BinaryTree[A],BinaryTree[A]],stack : Stack[BinaryTree[A]]): Stack[BinaryTree[A]] = tree match {
    case EmptyTree => stack
    case Node(v,l,r) => stack.push(tree); addToStack(parent.getOrElse(tree, EmptyTree),parent,stack)
  }
  
  def rootToLeafPathWithoutRecursion[A](tree: BinaryTree[A]):Unit = tree match {
    case EmptyTree => 
    case Node(v,l,r) => 
      val stk = Stack[BinaryTree[A]]()
      stk.push(tree)
      var map:Map[BinaryTree[A],BinaryTree[A]] = Map(tree -> EmptyTree)
      while(stk.size>0) {
        val cNode = stk.pop()
        cNode match {
          case EmptyTree =>
          case Node(v,l,r) => 
            (l,r) match {
              case (EmptyTree,EmptyTree) => printRootToLeafPath(cNode, map) 
              case (EmptyTree,Node(v2,l2,r2)) => map =  map + (r -> cNode);stk.push(r);
              case (Node(v1,l1,r1),EmptyTree) => map =  map + (l -> cNode);stk.push(l);
              case _ => map =  map + (r -> cNode);stk.push(r);map =  map + (l -> cNode);stk.push(l);
            }
        }
      } 
  }
  
  rootToLeafPathWithoutRecursion(tree1)
}