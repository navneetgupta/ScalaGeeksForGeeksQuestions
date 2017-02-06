package com.tree.binarytree.test

import com.tree.binarytree.DensityOfTree.{densityOfTree,heightAndSize}
import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.MaxDepthOrHeight.maxDepthOrHeightViaFold
import com.tree.binarytree.SizeBinaryTree.sizeViaFold

object DensityOfTreeTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  println(heightAndSize(tree1, 0, 0) + "  density is " + densityOfTree(tree1) )
                                                  //> (8,20)  density is 2.5
  println("size = "+ sizeViaFold(tree1))          //> size = 20
  println(" height is "+ maxDepthOrHeightViaFold(tree1))
                                                  //>  height is 8
  println(heightAndSize(binarySearchTree, 0, 0) + "  density is " + densityOfTree(binarySearchTree))
                                                  //> (3,5)  density is 1.6666666666666667
  println("size = "+ sizeViaFold(binarySearchTree))
                                                  //> size = 5
  println(" height is "+ maxDepthOrHeightViaFold(binarySearchTree))
                                                  //>  height is 3
  println(heightAndSize(tree2, 0, 0) + "  density is " + densityOfTree(tree2))
                                                  //> (4,7)  density is 1.75
  println("size = "+ sizeViaFold(tree2))          //> size = 7
  println(" height is "+ maxDepthOrHeightViaFold(tree2))
                                                  //>  height is 4
  println(heightAndSize(onlyRoot, 0, 0) + "  density is " + densityOfTree(onlyRoot))
                                                  //> (1,1)  density is 1.0
  println("size = "+ sizeViaFold(onlyRoot))       //> size = 1
  println(" height is "+ maxDepthOrHeightViaFold(onlyRoot))
                                                  //>  height is 1
  println(heightAndSize(onlyChildren, 0, 0) + "  density is " + densityOfTree(onlyChildren))
                                                  //> (2,3)  density is 1.5
  println("size = "+ sizeViaFold(onlyChildren))   //> size = 3
  println(" height is "+ maxDepthOrHeightViaFold(onlyChildren))
                                                  //>  height is 2
  println(heightAndSize(balancedtree, 0, 0) + "  density is " + densityOfTree(balancedtree))
                                                  //> (4,15)  density is 3.75
  println("size = "+ sizeViaFold(balancedtree))   //> size = 15
  println(" height is "+ maxDepthOrHeightViaFold(balancedtree))
                                                  //>  height is 4
  println(heightAndSize(childrenSumPropertyTree, 0, 0) + "  density is " + densityOfTree(childrenSumPropertyTree))
                                                  //> (4,10)  density is 2.5
  println("size = "+ sizeViaFold(childrenSumPropertyTree))
                                                  //> size = 10
  println(" height is "+ maxDepthOrHeightViaFold(childrenSumPropertyTree))
                                                  //>  height is 4
  println(heightAndSize(isoMorphismTree1, 0, 0) + "  density is " + densityOfTree(isoMorphismTree1))
                                                  //> (4,8)  density is 2.0
  println("size = "+ sizeViaFold(isoMorphismTree1))
                                                  //> size = 8
  println(" height is "+ maxDepthOrHeightViaFold(isoMorphismTree1))
                                                  //>  height is 4
}