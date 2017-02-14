package com.tree.binarytree

object MaxPathSum {
  /*
   * http://www.geeksforgeeks.org/find-maximum-path-sum-in-a-binary-tree/
   * 
   * find the maximum path sum. The path may start and end at any node in the tree.
   */
  
  def findMaxUtil(tree: BinaryTree[Int],res: Res): Int = tree match {
    case EmptyTree => 0
    case Node(v,l,r) => {
      val lt = findMaxUtil(l, res)
      val rt = findMaxUtil(r, res)
      val max_single = List(List(lt,rt).max+v,v).max
      val max_top = List(max_single,lt+rt+v).max
      res.res = List(res.res,max_top).max
      max_single
    }
  }
  
  def findMax(tree: BinaryTree[Int]):Int = findMaxUtil(tree,Res(Int.MinValue))
}
case class Res(var res:Int)