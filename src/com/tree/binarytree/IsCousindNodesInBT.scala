package com.tree.binarytree

object IsCousindNodesInBT {
  /*
   * http://www.geeksforgeeks.org/check-two-nodes-cousins-binary-tree/
   * 
   * Two nodes are cousins of each other if they are at same level and have different parents.
   * The idea is to find level of one of the nodes. Using the found level, check if ‘a’ and ‘b’ are at this level. 
   * If ‘a’ and ‘b’ are at given level, then finally check if they are not children of same parent.
   */
  
  def isSibblings[A](tree: BinaryTree[A],node1: BinaryTree[A],node2 : BinaryTree[A]): Boolean = tree match {
    case EmptyTree => false
    case Node(v,l,r) => 
      (l.isSameTree(node1) && r.isSameTree(node2)) || 
      (l.isSameTree(node2) && r.isSameTree(node1)) || 
      isSibblings(l, node1, node2) || 
      isSibblings(r, node1, node2)
  }
  
  def getLevel[A](tree: BinaryTree[A],node:BinaryTree[A],level: Int) :Int = tree match {
    case EmptyTree => 0
    case Node(v,l,r) if(tree.isSameTree(node)) => level
    case Node(v,l,r) =>
      val lt = getLevel(l, node, level+1)
      if(lt!= 0) 
        lt
      else
        getLevel(r, node, level+1)
  }
  
  def isCousin[A](tree: BinaryTree[A],node1: BinaryTree[A],node2: BinaryTree[A]): Boolean = {
    (getLevel(tree,node1,1) == getLevel(tree, node2, 1)) && !isSibblings(tree, node1, node2)
  }
  
}