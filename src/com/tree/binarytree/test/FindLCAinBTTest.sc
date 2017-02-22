package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.FindLCAinBT.{findLCA,findLCA2,findLCA3}
object FindLCAinBTTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  //findLCA(binarySearchTree, 1, 5)
  //findLCA(binarySearchTree, 3, 5)
  
  //findLCA(binarySearchTree, 1, 3)
  //findLCA(binarySearchTree, 2, 5)
  
  findLCA2(binarySearchTree, 1, 5)                //> res0: com.tree.binarytree.BinaryTree[Int] = Node(4,Node(2,Node(1,EmptyTree,E
                                                  //| mptyTree),Node(3,EmptyTree,EmptyTree)),Node(5,EmptyTree,EmptyTree))
  findLCA2(binarySearchTree, 3, 5)                //> res1: com.tree.binarytree.BinaryTree[Int] = Node(4,Node(2,Node(1,EmptyTree,E
                                                  //| mptyTree),Node(3,EmptyTree,EmptyTree)),Node(5,EmptyTree,EmptyTree))
  
  findLCA2(binarySearchTree, 1, 3)                //> res2: com.tree.binarytree.BinaryTree[Int] = Node(2,Node(1,EmptyTree,EmptyTre
                                                  //| e),Node(3,EmptyTree,EmptyTree))
  findLCA2(binarySearchTree, 2, 5)                //> res3: com.tree.binarytree.BinaryTree[Int] = Node(4,Node(2,Node(1,EmptyTree,E
                                                  //| mptyTree),Node(3,EmptyTree,EmptyTree)),Node(5,EmptyTree,EmptyTree))
  
  findLCA3(binarySearchTree, 1, 5)                //> res4: com.tree.binarytree.BinaryTree[Int] = Node(4,Node(2,Node(1,EmptyTree,E
                                                  //| mptyTree),Node(3,EmptyTree,EmptyTree)),Node(5,EmptyTree,EmptyTree))
  findLCA3(binarySearchTree, 3, 5)                //> res5: com.tree.binarytree.BinaryTree[Int] = Node(4,Node(2,Node(1,EmptyTree,E
                                                  //| mptyTree),Node(3,EmptyTree,EmptyTree)),Node(5,EmptyTree,EmptyTree))
  
  findLCA3(binarySearchTree, 1, 3)                //> res6: com.tree.binarytree.BinaryTree[Int] = Node(2,Node(1,EmptyTree,EmptyTre
                                                  //| e),Node(3,EmptyTree,EmptyTree))
  findLCA3(binarySearchTree, 2, 5)                //> res7: com.tree.binarytree.BinaryTree[Int] = Node(4,Node(2,Node(1,EmptyTree,E
                                                  //| mptyTree),Node(3,EmptyTree,EmptyTree)),Node(5,EmptyTree,EmptyTree))
  
}