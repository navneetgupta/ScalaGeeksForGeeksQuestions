package com.tree.binarytree

import com.tree.binarytree.BinaryTree._

/**
 * @author: Navneet Gupta
 * @createdOn: 07-Jan-2017
 */

//TODO: Incomplete

object DoubleTree extends App{
  def createDoubleTree[A](tree: BinaryTree[A],doubleTree: BinaryTree[A]): BinaryTree[A] = tree match {
    case EmptyTree => doubleTree
    case Node(v,l,r) => 
      createDoubleTree(l,Node(v,Node(v,l,EmptyTree),r))
      createDoubleTree(r,Node(v,Node(v,l,EmptyTree),r))
      
  }
  
  def createDoubleTree2[A](tree: BinaryTree[A]): BinaryTree[A] = tree match {
    case EmptyTree => EmptyTree
    case Node(v,l,r) => 
      createDoubleTree2(l)
      createDoubleTree2(r)
      Node(v,Node(v,l,EmptyTree),r)
  }
  def createDoubleTree4[A](tree: BinaryTree[A]): BinaryTree[A] = tree match {
    case EmptyTree => EmptyTree
    case Node(v,l,r) => 
      createDoubleTree4(l)
      createDoubleTree4(r)
      Node(v,Node(v,l,EmptyTree),r)
  }
  
  def createDoubleTree3[A](tree: BinaryTree[A], doubleTree : BinaryTree[A]): BinaryTree[A] = tree match {
    case EmptyTree => doubleTree
    case Node(v,l,r) => 
      createDoubleTree3(l,
      Node(v,Node(v,l,EmptyTree),r))
      createDoubleTree3(r,
      Node(v,Node(v,l,EmptyTree),r))
  }
  
  def createDoubleTree5[A](tree: BinaryTree[A], doubleTree : BinaryTree[A]): BinaryTree[A] = tree match {
    case EmptyTree => doubleTree
    case Node(v,l,r) => {
      createDoubleTree5(l,Node(v,Node(v,doubleTree,EmptyTree),r))
      createDoubleTree5(r, Node(v,l,Node(v,doubleTree,EmptyTree)))
    }
  }
  
//  def createDoubleTree6[A](tree: BinaryTree[A], doubleTree: BinaryTree[A]): BinaryTree[A] = tree match {
//    case EmptyTree => doubleTree
//    case Node(v,l,r) => 
//      createDoubleTree6(l, doubleTree)
//      createDoubleTree6(r, doubleTree)
//      doubleTree match {
//        case EmptyTree => doubleTree
//        case Node(v,l,r) => 
//      }
//  }
  
  def createDoubleTree6[A](tree: BinaryTree[A]):BinaryTree[A] = {
    var doubleTree = tree
    doubleTree match {
      case EmptyTree => doubleTree
      case Node(v,l,r) => 
        createDoubleTree6(l)
        createDoubleTree6(r)
        Node(v,new Node(v,l,EmptyTree),r)
    }
  }
  def createDoubleTree7[A](tree: BinaryTree[A],doubleTree:BinaryTree[A]): BinaryTree[A] = {
    var doubleTreeL = doubleTree
    tree match {
      case EmptyTree => doubleTreeL
      case Node(v,l,r) => 
        doubleTreeL = Node(v,new Node(v,l,EmptyTree),r)
        createDoubleTree7(l,doubleTreeL)
        createDoubleTree7(r,doubleTreeL)
        doubleTreeL
    }
  }
  
  //createDoubleTree7(doubleTreeTest1, EmptyTree)
  
  
  
  //                                            1
  //                                      2           3
  //                                  4      5            7
  //                                    9   10          11 
  //
  //
  //                                            1
  //
  //
  //
  //
  //
  //
  //
  //
  //                                  4
  //                              4      9
  //                                  9
}