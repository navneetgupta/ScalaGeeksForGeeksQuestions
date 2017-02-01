package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.SumTree._
object SumTreeTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  toSumTree(onlyRoot)                             //> res0: com.tree.binarytree.BinaryTree[Int] = Node(1,Node(0,EmptyTree,EmptyTre
                                                  //| e),Node(0,EmptyTree,EmptyTree))
  toSumTree(onlyChildren )                        //> res1: com.tree.binarytree.BinaryTree[Int] = Node(6,Node(2,Node(0,EmptyTree,E
                                                  //| mptyTree),Node(0,EmptyTree,EmptyTree)),Node(3,Node(0,EmptyTree,EmptyTree),No
                                                  //| de(0,EmptyTree,EmptyTree)))
  toSumTree2(onlyChildren )                       //> res2: (com.tree.binarytree.BinaryTree[Int], Int) = (Node(5,Node(0,EmptyTree,
                                                  //| EmptyTree),Node(0,EmptyTree,EmptyTree)),6)
  toSumTree(binarySearchTree)                     //> res3: com.tree.binarytree.BinaryTree[Int] = Node(11,Node(6,Node(1,Node(0,Emp
                                                  //| tyTree,EmptyTree),Node(0,EmptyTree,EmptyTree)),Node(3,Node(0,EmptyTree,Empty
                                                  //| Tree),Node(0,EmptyTree,EmptyTree))),Node(5,Node(0,EmptyTree,EmptyTree),Node(
                                                  //| 0,EmptyTree,EmptyTree)))
  toSumTree2(binarySearchTree)                    //> res4: (com.tree.binarytree.BinaryTree[Int], Int) = (Node(11,Node(4,Node(0,Em
                                                  //| ptyTree,EmptyTree),Node(0,EmptyTree,EmptyTree)),Node(0,EmptyTree,EmptyTree))
                                                  //| ,15)
 toSumTree2(doubleTreeTest1)                      //> res5: (com.tree.binarytree.BinaryTree[Int], Int) = (Node(5,Node(0,EmptyTree,
                                                  //| EmptyTree),Node(0,EmptyTree,EmptyTree)),6)
 
 toSumTree2(doubleTreeTest2)                      //> res6: (com.tree.binarytree.BinaryTree[Int], Int) = (Node(14,Node(9,Node(0,Em
                                                  //| ptyTree,EmptyTree),Node(0,EmptyTree,EmptyTree)),Node(0,EmptyTree,EmptyTree))
                                                  //| ,15)
  
 toSumTree2(sumTreeTest)                          //> res7: (com.tree.binarytree.BinaryTree[Int], Int) = (Node(20,Node(4,Node(0,Em
                                                  //| ptyTree,EmptyTree),Node(0,EmptyTree,EmptyTree)),Node(12,Node(0,EmptyTree,Emp
                                                  //| tyTree),Node(0,EmptyTree,EmptyTree))),30)
          
 toSumTree2(tree1)                                //> res8: (com.tree.binarytree.BinaryTree[Int], Int) = (Node(209,Node(178,Node(1
                                                  //| 49,Node(117,Node(86,Node(72,Node(20,Node(0,EmptyTree,EmptyTree),EmptyTree),N
                                                  //| ode(32,Node(0,EmptyTree,EmptyTree),Node(0,EmptyTree,EmptyTree))),Node(0,Empt
                                                  //| yTree,EmptyTree)),Node(15,Node(0,EmptyTree,EmptyTree),EmptyTree)),Node(16,Em
                                                  //| ptyTree,Node(0,EmptyTree,EmptyTree))),Node(17,Node(0,EmptyTree,EmptyTree),Em
                                                  //| ptyTree)),Node(19,EmptyTree,Node(0,EmptyTree,EmptyTree))),210)
  
  toSumTree2(leftSkewedtree)                      //> res9: (com.tree.binarytree.BinaryTree[Int], Int) = (Node(65,Node(63,Node(60,
                                                  //| Node(56,Node(51,Node(45,Node(38,Node(30,Node(21,Node(11,Node(0,EmptyTree,Emp
                                                  //| tyTree),EmptyTree),EmptyTree),EmptyTree),EmptyTree),EmptyTree),EmptyTree),Em
                                                  //| ptyTree),EmptyTree),EmptyTree),EmptyTree),66)
  toSumTree2(rightSkewTree)                       //> res10: (com.tree.binarytree.BinaryTree[Int], Int) = (Node(65,EmptyTree,Node(
                                                  //| 63,EmptyTree,Node(60,EmptyTree,Node(56,EmptyTree,Node(51,EmptyTree,Node(45,E
                                                  //| mptyTree,Node(38,EmptyTree,Node(30,EmptyTree,Node(21,EmptyTree,Node(11,Empty
                                                  //| Tree,Node(0,EmptyTree,EmptyTree))))))))))),66)
}