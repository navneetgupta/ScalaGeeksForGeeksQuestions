package com.tree.AVLTree

object RightRotate {
  def rightRotate[A](tree: AVLTree[A]): AVLTree[A] = tree match {
    case AVLNode(v,AVLNode(v1,l1,r1,h1,s1),r,h,s) => 
      val newRtHt = List(l1.getHeight,r.getHeight).max +1
      val newRtSz = l1.getSize + r.getSize + 1
      val newNodeHt = List(l1.getHeight,newRtHt).max + 1
      val newNodeSz = l1.getSize + newRtSz +1 ;
      AVLNode(v1,l1,AVLNode(v,l1,r,newRtHt,newRtSz),newNodeHt,newNodeSz)
    case _ => sys.error("Can Not be Left Rotated");
  }
}