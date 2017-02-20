package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 20-Feb-2017
 */

object PrintAllNodesAtKDistanceFromAnyNode {
  /*
   * http://www.geeksforgeeks.org/print-nodes-distance-k-given-node-binary-tree/
   * 
   * There are two types of nodes to be considered.
			1) Nodes in the subtree rooted with target node. For example if the target node is 8 and k is 2, then such nodes are 10 and 14.
			2) Other nodes, may be an ancestor of target, or a node in some other subtree. For target node 8 and k is 2, the node 22 comes in this 
					category.

	 * Finding the first type of nodes is easy to implement. Just traverse subtrees rooted with the target node and decrement k in recursive call. 
	 * When the k becomes 0, print the node currently being traversed (See this for more details). Here we call the function as 
	 * printkdistanceNodeDown().How to find nodes of second type? For the output nodes not lying in the subtree with the target node as the root, 
	 * we must go through all ancestors. For every ancestor, we find its distance from target node, let the distance be d, now we go to other 
	 * subtree (if target was found in left subtree, then we go to right subtree and vice versa) of the ancestor and find all nodes at k-d 
	 * distance from the ancestor.
   * */
  
  def printKDistanceNode[A](tree: BinaryTree[A],target: BinaryTree[A],k:Int): Int = tree match {
    case EmptyTree => -1
    case Node(v,l,r) if(tree.isSameTree(target)) => printKDistanceDownsNodes(tree,k);0
    case Node(v,l,r) => 
      val lt = printKDistanceNode(l, target, k)
      if(lt != -1) {
        if(lt+1 == k) {
          println(v + " , ")
        } else {
          printKDistanceDownsNodes(r, k-lt-2)
        }
        1+lt
      } else {
        val rt = printKDistanceNode(r, target, k)
        if(rt != -1) {
          if(rt+1 == k) {
            println(v + " , ")
          } else {
            printKDistanceDownsNodes(l, k-rt-2)
          }
          1+rt
        }
        -1
      }
  }
  
  def printKDistanceDownsNodes[A](tree: BinaryTree[A],k :Int): Unit = tree match {
    case EmptyTree => 
    case Node(v,l,r) if(k < 0) => 
    case Node(v,l,r) => 
      if(k==0){
        println(v + " , ")
      } else {
        printKDistanceDownsNodes(l, k-1)
        printKDistanceDownsNodes(r, k-1)
      }
  }
}