package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 05-Jan-2017
 */

import scala.collection.mutable.Stack
//Test check LevelOrderTraversal
object SpiralLevelOrder {
  def spiralLevelOrderTraversal[A](tree: BinaryTree[A]):Unit = {
    var ltr = true
    for{
      i <- (1 to MaxDepthOrHeight.maxDepthOrHeight(tree))
    } yield {
      print("\n")
      printGivenLevel(tree,i,ltr)
      ltr = !ltr
    }
  }
  def spiralLevelOrderTraversal2[A](tree: BinaryTree[A]):Unit = {
    for{
      i <- (1 to MaxDepthOrHeight.maxDepthOrHeight(tree))
    } yield {
      print("\n")
      printGivenLevel(tree,i,(i%2!=0))
    }
  }
  
  def printGivenLevel[A](tree: BinaryTree[A],level:Int,ltr: Boolean):Unit = (tree,level) match {
    case (EmptyTree,_) =>
    case (Node(v,l,r),1) => print(v+ " , ")
    case (Node(v,l,r),lv) if lv>1 =>{
      if(ltr){ 
        printGivenLevel(l,lv-1,ltr);
        printGivenLevel(r, lv-1, ltr);
      } else {
        printGivenLevel(r,lv-1,ltr);
        printGivenLevel(l, lv-1, ltr);
        
      }
    }
  }
  
  def printSpiralViaStack[A](tree: BinaryTree[A]):Unit = {
    tree match {
      case EmptyTree => return;
      case Node(v,l,r) => {
         var stack1 = Stack[BinaryTree[A]]()
         var stack2 = Stack[BinaryTree[A]]()
         stack1.push(tree)
         while(!stack1.isEmpty || !stack2.isEmpty) {
           while(!stack1.isEmpty) {
             stack1.pop() match {
               case Node(v,l,r) => 
                 print(v+ " , ");
                 (l,r) match {
                   case (Node(v1,l1,r1),Node(v2,l2,r2)) => stack2.push(l);stack2.push(r);
                   case (EmptyTree,Node(v1,l1,r1)) => stack2.push(r)
                   case (Node(v1,l1,r1),EmptyTree) => stack2.push(l)
                   case (EmptyTree,EmptyTree) => 
                 }
               case EmptyTree =>
             }
           }
           while(!stack2.isEmpty) {
             stack2.pop() match {
               case Node(v,l,r) => 
                 print(v+ " , ");
                 (l,r) match {
                   case (Node(v1,l1,r1),Node(v2,l2,r2)) => stack1.push(r);stack1.push(l);
                   case (EmptyTree,Node(v1,l1,r1)) => stack1.push(r)
                   case (Node(v1,l1,r1),EmptyTree) => stack1.push(l)
                   case (EmptyTree,EmptyTree) => 
                 }
               case EmptyTree => 
             }
           }
         }
      }
    }
  }
}