package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._


import com.tree.binarytree.MaxConsecutiveIncreasingPathLength.maxConsecutiveIncresaingPathLength
object MaxConsecutiveIncreasingPathLengthTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  maxConcurrentIncreasing                         //> res0: com.tree.binarytree.Node[Int] = Node(10,Node(11,Node(13,EmptyTree,Empt
                                                  //| yTree),Node(12,EmptyTree,EmptyTree)),Node(9,Node(13,EmptyTree,EmptyTree),Nod
                                                  //| e(8,EmptyTree,EmptyTree)))
  maxConsecutiveIncresaingPathLength(maxConcurrentIncreasing)
                                                  //> res1: Int = 3
  maxConsecutiveIncresaingPathLength(tree1)       //> res2: Int = 7
  maxConsecutiveIncresaingPathLength(tree2)       //> res3: Int = 1
  maxConsecutiveIncresaingPathLength(binarySearchTree)
                                                  //> res4: Int = 2
  maxConsecutiveIncresaingPathLength(balancedtree)//> res5: Int = 2
  maxConsecutiveIncresaingPathLength(balancedtree2)
                                                  //> res6: Int = 1
  maxConsecutiveIncresaingPathLength(onlyChildren)//> res7: Int = 2
  maxConsecutiveIncresaingPathLength(maxConcurrentIncreasing2)
                                                  //> res8: Int = 2
  maxConsecutiveIncresaingPathLength(maxSumLeafToRoot)
                                                  //> res9: Int = 1
  maxConsecutiveIncresaingPathLength(childrenSumTest)
                                                  //> res10: Int = 1
  maxConsecutiveIncresaingPathLength(childrenSumPropertyTree1)
                                                  //> res11: Int = 1
  maxConsecutiveIncresaingPathLength(childrenSumPropertyTree)
                                                  //> res12: Int = 1
  maxConsecutiveIncresaingPathLength(leftSkewedtree)
                                                  //> res13: Int = 11
  maxConsecutiveIncresaingPathLength(rightSkewTree)
                                                  //> res14: Int = 11
  maxConsecutiveIncresaingPathLength(isoMorphismTree1)
                                                  //> res15: Int = 2
  maxConsecutiveIncresaingPathLength(isoMorphismTree2)
                                                  //> res16: Int = 2
}