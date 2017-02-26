package com.tree.binarytree

/*
 *  A SumTree is a Binary Tree where the value of a node is equal to sum of the nodes present in its 
 *  left subtree and right subtree. An empty tree is SumTree and sum of an empty tree can be considered as 0. 
 *  A leaf node is also considered as SumTree.
 *  */

object IsSumTree {
   def isSumTree(tree:BinaryTree[Int]):Boolean = tree match {
     case EmptyTree => true
     case Node(v,l,r) => 
       (l,r) match {
         case (EmptyTree,EmptyTree) => true
         case _ => 
           val l1 = getSum(l)
           val l2 = getSum(r)
           (v==(l1+l2)) && isSumTree(l) && isSumTree(r)
       }
   } 
   
   def getSum(tree: BinaryTree[Int]):Int = tree match {
     case EmptyTree => 0
     case Node(v,l,r) => v + getSum(l) + getSum(r)
   }
   
   /**
     * @author: Navneet Gupta
     * @createdOn: 02-Feb-2017
     */
   /*
    * Method 2 ( Tricky ) 
		*	The Method 1 uses sum() to get the sum of nodes in left and right subtrees. 
		* The method 2 uses following rules to get the sum directly.
		*		1) If the node is a leaf node then sum of subtree rooted with this node is equal to value of this node.
		*		2) If the node is not a leaf node then sum of subtree rooted with this node is twice the value of this node 
		* 			(Assuming that the tree rooted with this node is SumTree).
    * 
    * */
   def isSumTreeOptimised(tree:BinaryTree[Int]):Boolean = tree match {
     case EmptyTree => true
     case Node(v,l,r) if(isLeafNode(tree)) => true 
     case Node(v,l,r) => 
       if(isSumTreeOptimised(l) && isSumTreeOptimised(r)) {
         val xs = (l,r) match {
           case (EmptyTree,EmptyTree) => (0,0)
           case (Node(v1,l1,r1),EmptyTree) => if(isLeafNode(l)) (v1,0) else (v1*2,0)
           case (EmptyTree,Node(v2,l2,r2)) => if(isLeafNode(r)) (v2,0) else (v2*2,0)
           case (Node(v1,l1,r1),Node(v2,l2,r2)) => 
             val lt = if(isLeafNode(l)) v1 else v1*2
             val rt = if(isLeafNode(r)) v2 else v2*2
             (lt,rt)
         }
         if(v == (xs._1+xs._2)) true
         else false
       } else 
         false
   }
   
   def isLeafNode(tree:BinaryTree[Int]):Boolean = {
     tree match {
       case EmptyTree => true
       case Node(v,l,r) => 
         (l,r) match {
           case (EmptyTree,EmptyTree) => true
           case _ => false
         }
     }
   }
}