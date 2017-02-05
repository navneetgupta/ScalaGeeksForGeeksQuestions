package com.tree.binarytree.test
import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.NormalBSTToBalancedBST.bstToBalanacedBST

object NormalBSTToBalancedBSTTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  bstToBalanacedBST(binarySearchTree)             //> res0: com.tree.binarytree.BinaryTree[Int] = Node(3,Node(1,EmptyTree,Node(2,E
                                                  //| mptyTree,EmptyTree)),Node(4,EmptyTree,Node(5,EmptyTree,EmptyTree)))
                                            
  bstToBalanacedBST(bstToBalancedBSTTest)         //> res1: com.tree.binarytree.BinaryTree[Int] = Node(7,Node(5,EmptyTree,Node(6,E
                                                  //| mptyTree,EmptyTree)),Node(8,EmptyTree,Node(10,EmptyTree,EmptyTree)))
  bstToBalanacedBST(bstToBalancedBSTTest1)        //> res2: com.tree.binarytree.BinaryTree[Int] = Node(20,Node(10,EmptyTree,EmptyT
                                                  //| ree),Node(30,EmptyTree,EmptyTree))
  bstToBalanacedBST(bstToBalancedBSTTest2)        //> res3: com.tree.binarytree.BinaryTree[Int] = Node(4,Node(2,Node(1,EmptyTree,E
                                                  //| mptyTree),Node(3,EmptyTree,EmptyTree)),Node(6,Node(5,EmptyTree,EmptyTree),No
                                                  //| de(7,EmptyTree,EmptyTree)))
}