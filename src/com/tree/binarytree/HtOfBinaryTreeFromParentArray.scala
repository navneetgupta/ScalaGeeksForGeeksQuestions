package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 19-Feb-2017
 */

object HtOfBinaryTreeFromParentArray extends App {
  /*
   * http://www.geeksforgeeks.org/find-height-binary-tree-represented-parent-array/
   * 
   * A given array represents a tree in such a way that the array value gives the parent node of that particular index. 
   * The value of the root node index would always be -1. Find the height of the tree.
   * 
   * A simple solution is to first construct the tree and then find height of the constructed binary tree. 
   * 
   * An efficient solution can solve the above problem in O(n) time. The idea is to first calculate depth of every node and store in an array depth[]. Once we have depths of all nodes, we return maximum of all depths.
			1) Find depth of all nodes and fill in an auxiliary array depth[].
			2) Return maximum value in depth[].

			Following are steps to find depth of a node at index i.
				1) If it is root, depth[i] is 1.
				2) If depth of parent[i] is evaluated, depth[i] is depth[parent[i]] + 1.
				3) If depth of parent[i] is not evaluated, recur for parent and assign depth[i] as depth[parent[i]] + 1 (same as above).
   */
  
  def getAllDepth(parent: Array[Int],i: Int,depth: Array[Int]):Array[Int] = {
    if(depth(i) != 0) {
      depth
    } else if(parent(i) == -1) {
      depth(i) = 1
      depth
    } else {
      if(depth(parent(i)) == 0) {
        val arr = getAllDepth(parent,parent(i),depth)
        arr(i) = arr(parent(i)) +1
        arr
      } else {
        depth(i) = depth(parent(i)) +1
        depth
      }
    }
  }
  
  def getDepth(parent:Array[Int],size: Int) : Int = {
    var depthArray = Array.fill(size){0}
    println(depthArray)
    for{
      i <- (0 until size)
    } yield {
      depthArray = getAllDepth(parent, i, depthArray)
    }
    depthArray.max
  }
  
  getDepth(Array(-1, 0, 0, 1, 1, 3, 5), 7)
}