package com.tree.binarytree

object VerticalSumOfTreeSet2 {
  def verticalSumDll(tree: BinaryTree[Int]):Unit = {
   // val dll = verticalSumDllUtil(tree,NodeDLL(0,EmptyNode,EmptyNode))
  }
  
//  def verticalSumDllUtil(tree: BinaryTree[Int],dll:DoubleLinkedList[Int]) : DoubleLinkedList[Int] = tree match {
//    case EmptyTree => dll
//    case Node(v,l,r) => {
//      val dll_updated = dll match {
//        case EmptyNode => NodeDLL(v,EmptyNode,EmptyNode)
//        case NodeDLL(v1,p,n) => NodeDLL(v+v1,p,n)
//      }
//      (l,r) match {
//        case (EmptyTree,EmptyTree) => dll_updated
//        case (Node(v1,l1,r1),EmptyTree) => {
//          dll_updated match {
//            case NodeDLL(vl,EmptyNode,nl) => 
//              val prev:DoubleLinkedList[Int] = NodeDLL(0,EmptyNode,NodeDLL(vl,prev,nl))
//              verticalSumDllUtil(l, prev)
//            case _ => dll_updated
//          }
//        }
//        case (EmptyTree,Node(v2,l2,r2)) => {
//          dll_updated match {
//            case NodeDLL(vl,pl,EmptyNode) => 
//              val next:DoubleLinkedList[Int] = NodeDLL(0,NodeDLL(vl,pl,next),EmptyNode)
//              verticalSumDllUtil(r, next)
//            case _ => dll_updated  
//            
//          }
//        }
//        case (Node(v1,l1,r1),Node(v2,l2,r2)) => {
//          val dll_current = dll_updated match {
//            case NodeDLL(vl,EmptyNode,nl) => 
//              val prev:DoubleLinkedList[Int] = NodeDLL(0,EmptyNode,NodeDLL(vl,prev,nl))
//              verticalSumDllUtil(l, prev)
//            case _ => dll_updated
//          }
//          dll_current match {
//            case NodeDLL(vl,pl,EmptyNode) => 
//              val next:DoubleLinkedList[Int] = NodeDLL(0,NodeDLL(vl,pl,next),EmptyNode)
//              verticalSumDllUtil(r, next)
//          }
//        }
//      }
//    }
//  }
}