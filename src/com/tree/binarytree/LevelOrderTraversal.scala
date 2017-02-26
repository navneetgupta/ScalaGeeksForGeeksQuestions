package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 06-Jan-2017
 */

object LevelOrderTraversal {
  /*
   * http://www.geeksforgeeks.org/level-order-tree-traversal/ 
   * */
  def printLevelOrderRecursive[A](tree: BinaryTree[A]): Unit  = {
    val h: Int = MaxDepthOrHeight.maxDepthOrHeightViaFold(tree)
    for{
      i <- (1 to h)
    } yield(
        print("\n"),
        printLevelOrder(tree,i,Nil)
    );
  }
  
  def printLevelOrder[A](tree: BinaryTree[A],level:Int,xs:List[A]): Unit ={
    (tree,level) match {
      case (EmptyTree,_) => 
      case (Node(v,l,r),1) => print(v+",")
      case (Node(v,l,r),lv) if lv>1 => printLevelOrder(l,lv-1,xs); printLevelOrder(r,lv-1,xs);
    }
  }
}