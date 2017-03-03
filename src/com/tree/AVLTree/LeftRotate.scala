package com.tree.AVLTree


object LeftRotate {
  def leftRotate[A](tree: AVLTree[A]):AVLTree[A] = tree match {
    case AVLNode(v,l,AVLNode(v1,l1,r1,h1,s1),h,s) => 
      val newLtHt = List(l.getHeight,l1.getHeight).max +1
      val newLtSz = l.getSize + l1.getSize + 1
      val newNodeHt = List(newLtHt,r1.getHeight).max + 1
      val newNodeSz = newLtSz + r1.getSize +1 ;
      AVLNode(v1,AVLNode(v,l,l1,newLtHt,newLtSz),r1,newNodeHt,newNodeSz)
    case _ => sys.error("Can Not be Left Rotated");
  }
}