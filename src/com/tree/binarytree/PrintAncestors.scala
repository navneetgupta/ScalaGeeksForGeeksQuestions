package com.tree.binarytree
import com.tree.binarytree.BinaryTree._

/**
 * @author: Navneet Gupta
 * @createdOn: 01-Feb-2017
 */

object PrintAncestors extends App {

  
  def printAncestorsOfANode(tree: BinaryTree[Int],target: Int):Boolean = tree match {
    case EmptyTree => false
    case Node(v,l,r) => 
      if(v==target) true
      else if(printAncestorsOfANode(l, target) || printAncestorsOfANode(r, target)){ 
        println(v + " ")
        true
      } else 
        false     
  }
  
  println(printAncestorsOfANode(tree1, 14))
  
  def printAncestorsOfANode2(tree: BinaryTree[Int],target: Int):(Boolean,List[Int] )= tree match {
    case EmptyTree => (false,Nil)
    case Node(v,l,r) => 
      if(v==target) (true,Nil)
      else if(printAncestorsOfANode2(l, target)._1) (true,v::printAncestorsOfANode2(l, target)._2)
      else if(printAncestorsOfANode2(r, target)._1) (true,v::printAncestorsOfANode2(r, target)._2)
      else (false,Nil)
  }
  
  println(printAncestorsOfANode2(tree1, 14))
  
//  def getAncestorsOfANode(tree: BinaryTree[Int],target: Int,xs:List[Int]): Boolean = tree match {
//    case EmptyTree => false
//    case Node(v,l,r) => 
//      if(v==target) true
//      if(getAncestorsOfANode(l, target, xs) || getAncestorsOfANode(r, target, xs)) 
//        
//  }
}