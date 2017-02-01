package com.tree.binarytree

object ChildSumPropertyTree extends App {
  
  def convertToChildSumTree(tree: BinaryTree[Int]): BinaryTree[Int] = {
    tree match {
      case EmptyTree => EmptyTree
      case Node(v,l,r) => {
        (l,r) match {
          case (EmptyTree,EmptyTree) => tree
          case (_,_) => {
            convertToChildSumTree(l)
            convertToChildSumTree(r)
            val ld = l match { //node.left
                   case Node(v1,l1,r1) => v1   //node.left!=null
                   case EmptyTree => 0          //node.left==null
                 }
            val rd = r match { //node.right
                       case Node(v2,l2,r2) => v2    //node.right!=null
                       case EmptyTree => 0          //node.right==null
                     }
            val diff = ld+rd-v
            if(diff>0) Node(v+diff,l,r)
            else incrementedTree(tree,-diff)
          }
        }
      }
    }
  }
  
  def incrementedTree(tree: BinaryTree[Int], diff: Int):BinaryTree[Int] ={ 
    tree match {
      case Node(v,Node(v1,l1,r1),r) => Node(v,incrementedTree(Node(v1+diff,l1,r1),diff),r)
      case Node(v,l,Node(v2,l2,r2)) => Node(v,l,incrementedTree(Node(v2+diff,l2,r2),diff))
      case _ => tree
    }
  }
  
  val childrenSumTest = Node(50,Node(7,Node(3,EmptyTree,EmptyTree),Node(5,EmptyTree,EmptyTree)),Node(2,Node(1,EmptyTree,EmptyTree),Node(30,EmptyTree,EmptyTree)))

  val a = convertToChildSumTree(childrenSumTest);
  print(a)
}