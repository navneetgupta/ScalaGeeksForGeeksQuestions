package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 11-Feb-2017
 */

/*
 * http://www.geeksforgeeks.org/print-paths-root-specified-sum-binary-tree/
 * 
 * Given a Binary tree and a sum S, print all the paths, starting from root, that sums upto the given sum.
 * Note that this problem is different from root to leaf paths. Here path doesn’t need to end on a leaf node.
 * 
 * For this problem, preorder traversal is best suited as we have to add up a key value as we land on that node.
 * We start from the root and start traversing by preorder traversal, adding key value to the sum_so_far and checking whether
 * it is equal to the required sum. Also, as tree node doesn’t have a pointer pointing to its parent, we have to explicitly 
 * save from where we have moved. We use a vector path to store the path for this.
 * Every node in this path contributes to the sum_so_far.
 * */

object AllPathsFromRootWithGivenSum {
  def printPathsUtil(tree: BinaryTree[Int],sum:Int,sum_so_far:Int,path: List[Int]) : List[Int] = tree match {
    case EmptyTree => path
    case Node(v,l,r) => 
      val updated_sum_so_far = sum_so_far+v
      val updated_list = v::path
      if(updated_sum_so_far == sum) {
        println("path Found")
        println(" path is "+ updated_list.reverse)
      } 
      (l,r) match {
        case (EmptyTree,EmptyTree) => updated_list
        case (Node(v1,l1,r1),EmptyTree) =>printPathsUtil(l, sum, updated_sum_so_far, updated_list).tail
        case (EmptyTree,Node(v2,l2,r2)) => printPathsUtil(r, sum, updated_sum_so_far, updated_list).tail
        case (Node(v1,l1,r1),Node(v2,l2,r2)) => 
          val lt = printPathsUtil(l, sum, updated_sum_so_far, updated_list).tail
          printPathsUtil(r, sum, updated_sum_so_far, lt).tail
      }
  }
  
  def getList(xs:List[Int]): List[Int] = xs match {
    case Nil => xs
    case z::zs => zs
  }
  
  def printPaths(tree: BinaryTree[Int],sum: Int) = {
    printPathsUtil(tree, sum, 0, Nil)
  }
  
}