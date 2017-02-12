package com.tree.binarytree

import scala.collection.mutable.Stack
import com.tree.binarytree.BinaryTree._

/**
 * @author: Navneet Gupta
 * @createdOn: 12-Feb-2017
 */


/*
 * http://www.geeksforgeeks.org/check-if-leaf-traversal-of-two-binary-trees-is-same/
 * 
 * Leaf traversal is sequence of leaves traversed from left to right. The problem is to check if leaf traversals 
 * of two given Binary Trees are same or not.
 * 
 * A Simple Solution is traverse first tree and store leaves from left and right in an array. 
 * Then traverse other tree and store leaves in another array. Finally compare two arrays. 
 * If both arrays are same, then return true.The above solution requires O(m+n) extra space where m and n are nodes in 
 * first and second tree respectively. 
 * 
 * The idea is use iterative traversal. Traverse both trees simultaneously, 
 * look for a leaf node in both trees and compare the found leaves. All leaves must match.
 */


object IsLeafTraversalSame extends App {
  def isSame[A](tree1: BinaryTree[A],tree2: BinaryTree[A]): Boolean = (tree1,tree2) match {
    case (EmptyTree,EmptyTree) => true
    case (Node(v1,l1,r1),Node(v2,l2,r2)) => 
      var stk1 = Stack[BinaryTree[A]]()
      var stk2 = Stack[BinaryTree[A]]()
      stk1.push(tree1)
      stk2.push(tree2)
      var continue = true
      while((stk1.size >0 || stk2.size>0) && continue) {
        if(stk1.size ==0 || stk2.size ==0) continue = false;
        else {
          val temp1 = stkProcessing(stk1)
          val temp2 = stkProcessing(stk2)
          stk1 = temp1._2
          stk2 = temp2._2
          (temp1._1,temp2._1) match {
            case (EmptyTree,EmptyTree) => 
            case (Node(v11,l11,r11),Node(v12,l12,r12)) if(v11 != v12) => continue= false
            case _ => continue = false
          }
        }
      }
      continue
    case  _ => false
  }
  
  def isSame2[A](tree1: BinaryTree[A],tree2: BinaryTree[A]): Boolean = (tree1,tree2) match {
    case (EmptyTree,EmptyTree) => true
    case (_,_) => 
      val stk1 = Stack[BinaryTree[A]]()
      val stk2 = Stack[BinaryTree[A]]()
      stk1.push(tree1)
      stk2.push(tree2)
      var continue = true
      while((stk1.size >0 || stk2.size>0) && continue) {
        if(stk1.size ==0 || stk2.size ==0) continue = false;
        else {
          var temp1 = stk1.pop()
          while(!temp1.isEmptyTree && !temp1.isLeafNode) {
            temp1 match {
              case EmptyTree => 
              case Node(v,l,r) => {
                (l,r) match {
                  case (EmptyTree,EmptyTree) =>
                  case (Node(v11, l11, r11), EmptyTree) => stk1.push(l);temp1 = stk1.pop()
                  case (EmptyTree, Node(v12, l12, r12)) => stk1.push(r); temp1 = stk1.pop()
                  case _                                => stk1.push(r);stk1.push(l);temp1 = stk1.pop()
                }
              }
            }
          }
          var temp2 = stk2.pop()
          while(!temp2.isEmptyTree && !temp2.isLeafNode) {
            temp2 match {
              case EmptyTree => 
              case Node(v,l,r) => {
                (l,r) match {
                  case (EmptyTree,EmptyTree) =>
                  case (Node(v11, l11, r11), EmptyTree) => stk2.push(l);temp2 = stk2.pop()
                  case (EmptyTree, Node(v12, l12, r12)) => stk2.push(r); temp2 = stk2.pop()
                  case _                                => stk2.push(r);stk2.push(l);temp2 = stk2.pop()
                }
              }
            }
          }
          
          (temp1,temp2) match {
            case (EmptyTree,EmptyTree) => 
            case (Node(v11,l11,r11),Node(v12,l12,r12)) if(v11 != v12) => continue= false
            case _ => continue = false
          }
        }
      }
      continue
  }
  
  def stkProcessing[A](stk:Stack[BinaryTree[A]]) :(BinaryTree[A],Stack[BinaryTree[A]]) = {
    stk.pop() match {
      case EmptyTree => (EmptyTree,stk)
      case Node(v,l,r) => {
        (l, r) match {
          case (EmptyTree, EmptyTree)           => (Node(v,l,r),stk)
          case (Node(v11, l11, r11), EmptyTree) => stk.push(l);stkProcessing(stk);
          case (EmptyTree, Node(v12, l12, r12)) => stk.push(r);stkProcessing(stk);
          case _                                => stk.push(r);stk.push(l);stkProcessing(stk);
        }
      } 
    }
  }
  
  isSame(onlyChildren,onlyChildren)
}