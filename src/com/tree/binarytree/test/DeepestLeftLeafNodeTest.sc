package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.DeepestLeftLeafNode.deepestLeftLeaf

object DeepestLeftLeafNodeTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
 
  deepestLeftLeaf(tree1)                          //> res0: com.tree.binarytree.BinaryTree[Int] = Node(19,EmptyTree,EmptyTree)
  deepestLeftLeaf(childrenSumPropertyTree)        //> res1: com.tree.binarytree.BinaryTree[Int] = Node(4,EmptyTree,EmptyTree)
  deepestLeftLeaf(childrenSumPropertyTree1)       //> res2: com.tree.binarytree.BinaryTree[Int] = Node(2,EmptyTree,EmptyTree)
  deepestLeftLeaf(leftSkewedtree)                 //> res3: com.tree.binarytree.BinaryTree[Int] = Node(11,EmptyTree,EmptyTree)
  deepestLeftLeaf(rightSkewTree)                  //> res4: com.tree.binarytree.BinaryTree[Int] = Node(11,EmptyTree,EmptyTree)
  
  deepestLeftLeaf(balancedtree)                   //> res5: com.tree.binarytree.BinaryTree[Int] = Node(15,EmptyTree,EmptyTree)
  deepestLeftLeaf(balancedtree2)                  //> res6: com.tree.binarytree.BinaryTree[Int] = Node(15,EmptyTree,EmptyTree)
  deepestLeftLeaf(binarySearchTree)               //> res7: com.tree.binarytree.BinaryTree[Int] = Node(5,EmptyTree,EmptyTree)
  deepestLeftLeaf(childrenSumTest)                //> res8: com.tree.binarytree.BinaryTree[Int] = Node(30,EmptyTree,EmptyTree)
  deepestLeftLeaf(doubleTreeTest1)                //> res9: com.tree.binarytree.BinaryTree[Int] = Node(3,EmptyTree,EmptyTree)
  deepestLeftLeaf(doubleTreeTest2)                //> res10: com.tree.binarytree.BinaryTree[Int] = Node(3,EmptyTree,EmptyTree)
  deepestLeftLeaf(testTree)                       //> res11: com.tree.binarytree.BinaryTree[Int] = Node(3,EmptyTree,EmptyTree)
  deepestLeftLeaf(tree2)                          //> res12: com.tree.binarytree.BinaryTree[Int] = Node(22,EmptyTree,EmptyTree)
  deepestLeftLeaf(sumTreeTest)                    //> res13: com.tree.binarytree.BinaryTree[Int] = Node(5,EmptyTree,EmptyTree)
  deepestLeftLeaf(isSumtreeTest)                  //> res14: com.tree.binarytree.BinaryTree[Int] = Node(3,EmptyTree,EmptyTree)
  deepestLeftLeaf(isSubSetTreeTest1)              //> res15: com.tree.binarytree.BinaryTree[Int] = Node(3,EmptyTree,EmptyTree)
  deepestLeftLeaf(isSubSetTreeTest2)              //> res16: com.tree.binarytree.BinaryTree[Int] = Node(6,EmptyTree,EmptyTree)
  deepestLeftLeaf(maxSumLeafToRoot)               //> res17: com.tree.binarytree.BinaryTree[Int] = Node(7,EmptyTree,EmptyTree)
  deepestLeftLeaf(isoMorphismTree1)               //> res18: com.tree.binarytree.BinaryTree[Int] = Node(6,EmptyTree,EmptyTree)
  deepestLeftLeaf(isoMorphismTree2)               //> res19: com.tree.binarytree.BinaryTree[Int] = Node(7,EmptyTree,EmptyTree)
  deepestLeftLeaf(bstToBalancedBSTTest1)          //> res20: com.tree.binarytree.BinaryTree[Int] = Node(10,EmptyTree,EmptyTree)
  deepestLeftLeaf(bstToBalancedBSTTest2)          //> res21: com.tree.binarytree.BinaryTree[Int] = Node(7,EmptyTree,EmptyTree)
  deepestLeftLeaf(bstToBalancedBSTTest)           //> res22: com.tree.binarytree.BinaryTree[Int] = Node(5,EmptyTree,EmptyTree)
  deepestLeftLeaf(maxConcurrentIncreasing2)       //> res23: com.tree.binarytree.BinaryTree[Int] = Node(15,EmptyTree,EmptyTree)
  deepestLeftLeaf(maxConcurrentIncreasing)        //> res24: com.tree.binarytree.BinaryTree[Int] = Node(8,EmptyTree,EmptyTree)
  deepestLeftLeaf(pairSumTree)                    //> res25: com.tree.binarytree.BinaryTree[Int] = Node(3,EmptyTree,EmptyTree)
  deepestLeftLeaf(onlyChildren)                   //> res26: com.tree.binarytree.BinaryTree[Int] = Node(3,EmptyTree,EmptyTree)
  deepestLeftLeaf(sumCoveredAndUncoveredNodes)    //> res27: com.tree.binarytree.BinaryTree[Int] = Node(3,EmptyTree,EmptyTree)
  deepestLeftLeaf(symmetricTree)                  //> res28: com.tree.binarytree.BinaryTree[Int] = Node(3,EmptyTree,EmptyTree)
  
}