package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.NextRightNodeOfAGivenKey.nextRightNode

object NextRightNodeOfAGivenKeyTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  nextRightNode(tree1,15)                         //> res0: com.tree.binarytree.BinaryTree[Int] = EmptyTree
  nextRightNode(tree1,6)                          //> res1: com.tree.binarytree.BinaryTree[Int] = Node(8,EmptyTree,EmptyTree)
  nextRightNode(tree1,7)                          //> res2: com.tree.binarytree.BinaryTree[Int] = Node(13,Node(18,EmptyTree,EmptyT
                                                  //| ree),Node(14,EmptyTree,EmptyTree))
  nextRightNode(tree1,9)                          //> res3: com.tree.binarytree.BinaryTree[Int] = Node(19,EmptyTree,EmptyTree)
  nextRightNode(tree1,11)                         //> res4: com.tree.binarytree.BinaryTree[Int] = Node(16,EmptyTree,EmptyTree)
  nextRightNode(childrenSumPropertyTree,2)        //> res5: com.tree.binarytree.BinaryTree[Int] = Node(4,Node(3,EmptyTree,EmptyTre
                                                  //| e),Node(1,EmptyTree,EmptyTree))
  nextRightNode(childrenSumPropertyTree1,3)       //> res6: com.tree.binarytree.BinaryTree[Int] = Node(5,EmptyTree,EmptyTree)
  nextRightNode(leftSkewedtree,3)                 //> res7: com.tree.binarytree.BinaryTree[Int] = EmptyTree
  nextRightNode(rightSkewTree,2)                  //> res8: com.tree.binarytree.BinaryTree[Int] = EmptyTree
  
  nextRightNode(balancedtree,4)                   //> res9: com.tree.binarytree.BinaryTree[Int] = Node(5,Node(10,EmptyTree,EmptyTr
                                                  //| ee),Node(11,EmptyTree,EmptyTree))
  nextRightNode(balancedtree,2)                   //> res10: com.tree.binarytree.BinaryTree[Int] = Node(3,Node(6,Node(12,EmptyTree
                                                  //| ,EmptyTree),Node(13,EmptyTree,EmptyTree)),Node(7,Node(14,EmptyTree,EmptyTree
                                                  //| ),Node(15,EmptyTree,EmptyTree)))
  nextRightNode(balancedtree,7)                   //> res11: com.tree.binarytree.BinaryTree[Int] = EmptyTree
  nextRightNode(balancedtree,11)                  //> res12: com.tree.binarytree.BinaryTree[Int] = Node(12,EmptyTree,EmptyTree)
  nextRightNode(balancedtree2,200)                //> res13: com.tree.binarytree.BinaryTree[Int] = EmptyTree
  
  nextRightNode(balancedtree2,9)                  //> res14: com.tree.binarytree.BinaryTree[Int] = Node(10,EmptyTree,EmptyTree)
  nextRightNode(balancedtree2,5)                  //> res15: com.tree.binarytree.BinaryTree[Int] = Node(6,Node(12,EmptyTree,EmptyT
                                                  //| ree),Node(13,EmptyTree,EmptyTree))
  nextRightNode(binarySearchTree,1)               //> res16: com.tree.binarytree.BinaryTree[Int] = Node(3,EmptyTree,EmptyTree)
  nextRightNode(childrenSumTest,3)                //> res17: com.tree.binarytree.BinaryTree[Int] = Node(5,EmptyTree,EmptyTree)
  nextRightNode(doubleTreeTest1,2)                //> res18: com.tree.binarytree.BinaryTree[Int] = Node(3,EmptyTree,EmptyTree)
  nextRightNode(doubleTreeTest2,5)                //> res19: com.tree.binarytree.BinaryTree[Int] = EmptyTree
  nextRightNode(testTree,5)                       //> res20: com.tree.binarytree.BinaryTree[Int] = EmptyTree
  nextRightNode(tree2,10)                         //> res21: com.tree.binarytree.BinaryTree[Int] = Node(14,EmptyTree,EmptyTree)
  nextRightNode(sumTreeTest,-4)                   //> res22: com.tree.binarytree.BinaryTree[Int] = Node(7,EmptyTree,EmptyTree)
  nextRightNode(isSumtreeTest,4)                  //> res23: com.tree.binarytree.BinaryTree[Int] = Node(6,EmptyTree,EmptyTree)
  nextRightNode(isSumtreeTest,6)                  //> res24: com.tree.binarytree.BinaryTree[Int] = Node(3,EmptyTree,EmptyTree)
  nextRightNode(isSubSetTreeTest1,30)             //> res25: com.tree.binarytree.BinaryTree[Int] = EmptyTree
  nextRightNode(isSubSetTreeTest2,4)              //> res26: com.tree.binarytree.BinaryTree[Int] = Node(6,EmptyTree,EmptyTree)
  nextRightNode(maxSumLeafToRoot,-2)              //> res27: com.tree.binarytree.BinaryTree[Int] = Node(7,EmptyTree,EmptyTree)
  nextRightNode(isoMorphismTree1,7)               //> res28: com.tree.binarytree.BinaryTree[Int] = Node(8,EmptyTree,EmptyTree)
  nextRightNode(isoMorphismTree2,4)               //> res29: com.tree.binarytree.BinaryTree[Int] = Node(5,Node(8,EmptyTree,EmptyT
                                                  //| ree),Node(7,EmptyTree,EmptyTree))
 
}