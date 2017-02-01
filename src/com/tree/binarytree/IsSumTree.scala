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
}