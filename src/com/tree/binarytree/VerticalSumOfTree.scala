package com.tree.binarytree


/*
 * http://www.geeksforgeeks.org/vertical-sum-in-a-given-binary-tree/
 * 
 * We need to check the Horizontal Distances from root for all nodes. If two nodes have the same 
 * Horizontal Distance (HD), then they are on same vertical line. The idea of HD is simple. 
 * HD for root is 0, a right edge (edge connecting to right subtree) is considered as +1 horizontal 
 * distance and a left edge is considered as -1 horizontal distance.
 */
object VerticalSumOfTree {
  
  def verticalSum(tree: BinaryTree[Int]):Map[Int,Int] = { 
    tree match {
      case EmptyTree => Map.empty
      case Node(v,l,r) => VerticalSumUtil(tree,0,Map.empty)
    }
  }
  
  def VerticalSumUtil(tree: BinaryTree[Int],hd:Int,vs:Map[Int,Int]) : Map[Int,Int] = {
    tree match {
      case EmptyTree => vs
      case Node(v,l,r) => {
        val map = VerticalSumUtil(l, hd-1, vs)
        val vs1 = map + (hd -> (map.getOrElse(hd, 0)+v));
        VerticalSumUtil(r, hd+1, vs1)
      }
    }
  }

}