package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.SwapNodesAtEveryKthLevel.swapNodesAtEachKthLevel
import com.tree.binarytree.InOrderTraversal.inOrderTraversalRecursive
object SwapNodesAtEveryKthLevelTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  swapNodesAtEachKthLevel(binarySearchTree, 1)    //> res0: com.tree.binarytree.BinaryTree[Int] = Node(4,Node(5,EmptyTree,EmptyTre
                                                  //| e),Node(2,Node(3,EmptyTree,EmptyTree),Node(1,EmptyTree,EmptyTree)))
                                                  
  swapNodesAtEachKthLevel(balancedtree, 1)        //> res1: com.tree.binarytree.BinaryTree[Int] = Node(1,Node(3,Node(7,Node(15,Emp
                                                  //| tyTree,EmptyTree),Node(14,EmptyTree,EmptyTree)),Node(6,Node(13,EmptyTree,Emp
                                                  //| tyTree),Node(12,EmptyTree,EmptyTree))),Node(2,Node(5,Node(11,EmptyTree,Empty
                                                  //| Tree),Node(10,EmptyTree,EmptyTree)),Node(4,Node(9,EmptyTree,EmptyTree),Node(
                                                  //| 8,EmptyTree,EmptyTree))))
   swapNodesAtEachKthLevel(binarySearchTree, 2)   //> res2: com.tree.binarytree.BinaryTree[Int] = Node(4,Node(5,EmptyTree,EmptyTre
                                                  //| e),Node(2,Node(1,EmptyTree,EmptyTree),Node(3,EmptyTree,EmptyTree)))
   
   
   swapNodesAtEachKthLevel(balancedtree, 2)       //> res3: com.tree.binarytree.BinaryTree[Int] = Node(1,Node(3,Node(6,Node(13,Emp
                                                  //| tyTree,EmptyTree),Node(12,EmptyTree,EmptyTree)),Node(7,Node(15,EmptyTree,Emp
                                                  //| tyTree),Node(14,EmptyTree,EmptyTree))),Node(2,Node(4,Node(9,EmptyTree,EmptyT
                                                  //| ree),Node(8,EmptyTree,EmptyTree)),Node(5,Node(11,EmptyTree,EmptyTree),Node(1
                                                  //| 0,EmptyTree,EmptyTree))))
                                                  
                                                  
 swapNodesAtEachKthLevel(tree1, 1)                //> res4: com.tree.binarytree.BinaryTree[Int] = Node(1,Node(10,Node(19,EmptyTree
                                                  //| ,EmptyTree),EmptyTree),Node(2,Node(9,EmptyTree,Node(17,EmptyTree,EmptyTree))
                                                  //| ,Node(3,Node(12,Node(16,EmptyTree,EmptyTree),EmptyTree),Node(4,Node(11,Empty
                                                  //| Tree,Node(15,EmptyTree,EmptyTree)),Node(5,Node(8,EmptyTree,EmptyTree),Node(6
                                                  //| ,Node(13,Node(14,EmptyTree,EmptyTree),Node(18,EmptyTree,EmptyTree)),Node(7,E
                                                  //| mptyTree,Node(20,EmptyTree,EmptyTree))))))))
                                                  
  swapNodesAtEachKthLevel(tree1, 2)               //> res5: com.tree.binarytree.BinaryTree[Int] = Node(1,Node(10,EmptyTree,Node(19
                                                  //| ,EmptyTree,EmptyTree)),Node(2,Node(3,Node(12,EmptyTree,Node(16,EmptyTree,Emp
                                                  //| tyTree)),Node(4,Node(5,Node(8,EmptyTree,EmptyTree),Node(6,Node(7,EmptyTree,N
                                                  //| ode(20,EmptyTree,EmptyTree)),Node(13,Node(14,EmptyTree,EmptyTree),Node(18,Em
                                                  //| ptyTree,EmptyTree)))),Node(11,EmptyTree,Node(15,EmptyTree,EmptyTree)))),Node
                                                  //| (9,EmptyTree,Node(17,EmptyTree,EmptyTree))))
                                                  
   swapNodesAtEachKthLevel(tree1, 3)              //> res6: com.tree.binarytree.BinaryTree[Int] = Node(1,Node(2,Node(9,Node(17,Emp
                                                  //| tyTree,EmptyTree),EmptyTree),Node(3,Node(4,Node(5,Node(8,EmptyTree,EmptyTree
                                                  //| ),Node(6,Node(7,Node(20,EmptyTree,EmptyTree),EmptyTree),Node(13,Node(18,Empt
                                                  //| yTree,EmptyTree),Node(14,EmptyTree,EmptyTree)))),Node(11,EmptyTree,Node(15,E
                                                  //| mptyTree,EmptyTree))),Node(12,EmptyTree,Node(16,EmptyTree,EmptyTree)))),Node
                                                  //| (10,Node(19,EmptyTree,EmptyTree),EmptyTree))
   
   
   swapNodesAtEachKthLevel(tree1, 4)              //> res7: com.tree.binarytree.BinaryTree[Int] = Node(1,Node(2,Node(3,Node(12,Emp
                                                  //| tyTree,Node(16,EmptyTree,EmptyTree)),Node(4,Node(5,Node(6,Node(7,EmptyTree,N
                                                  //| ode(20,EmptyTree,EmptyTree)),Node(13,Node(14,EmptyTree,EmptyTree),Node(18,Em
                                                  //| ptyTree,EmptyTree))),Node(8,EmptyTree,EmptyTree)),Node(11,Node(15,EmptyTree,
                                                  //| EmptyTree),EmptyTree))),Node(9,EmptyTree,Node(17,EmptyTree,EmptyTree))),Node
                                                  //| (10,EmptyTree,Node(19,EmptyTree,EmptyTree)))
                                                  
                                                  
   inOrderTraversalRecursive(tree1)               //> 20 , 7 , 6 , 18 , 13 , 14 , 5 , 8 , 4 , 15 , 11 , 3 , 12 , 16 , 2 , 17 , 9 
                                                  //| , 1 , 10 , 19 , 
                                                  
                                                   
   inOrderTraversalRecursive(swapNodesAtEachKthLevel(tree1, 2))
                                                  //> 10 , 19 , 1 , 12 , 16 , 3 , 8 , 5 , 7 , 20 , 6 , 14 , 13 , 18 , 4 , 11 , 15
                                                  
}