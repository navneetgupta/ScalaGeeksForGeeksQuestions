package com.tree.binarytree


/**
 * @author: Navneet Gupta
 * @createdOn: 10-Feb-2017
 */

object RootToLeafPathHavingEqualLength {
  
  def pathCountUtil[A](tree: BinaryTree[A],map:Map[Int,Int],pathLen:Int):Map[Int,Int] = tree match {
    case EmptyTree => map
    case Node(v,EmptyTree,EmptyTree) => map + (pathLen -> (map.getOrElse(pathLen, 0) + 1))
    case Node(v,l,r) => {
      val mp = pathCountUtil(l, map, pathLen+1)
      pathCountUtil(r, mp, pathLen+1)
    }
  }
  
  def pathCount[A](tree:BinaryTree[A]): Map[Int,Int] = {
    pathCountUtil(tree, Map.empty, 1)
  }
  
}