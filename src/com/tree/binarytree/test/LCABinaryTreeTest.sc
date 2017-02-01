package com.tree.binarytree.test

object LCABinaryTreeTest {
	import com.tree.binarytree.BinaryTree._
	import com.tree.binarytree.LowestCommonAncestorBinarySearchTree.findLCAinBST
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  findLCAinBST(binarySearchTree, 1, 5)            //> res0: com.tree.binarytree.BinaryTree[Int] = Node(4,EmptyTree,EmptyTree)
  findLCAinBST(binarySearchTree, 3, 5)            //> res1: com.tree.binarytree.BinaryTree[Int] = Node(4,EmptyTree,EmptyTree)
  
  findLCAinBST(binarySearchTree, 1, 3)            //> res2: com.tree.binarytree.BinaryTree[Int] = Node(2,EmptyTree,EmptyTree)
  findLCAinBST(binarySearchTree, 2, 5)            //> res3: com.tree.binarytree.BinaryTree[Int] = Node(4,EmptyTree,EmptyTree)
}