package com.tree.binarytree

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.MaxDepthOrHeight.maxDepthOrHeightViaFold
import com.tree.binarytree.SizeBinaryTree.sizeViaFold

/*Density of Binary Tree = Size / Height .Do in One Traversal*/

/**
 * @author: Navneet Gupta
 * @createdOn: 06-Feb-2017
 */

object DensityOfTree extends App {
  def heightAndSize[A](tree: BinaryTree[A],ht:Int,size:Int):(Int,Int) = tree match {
    case EmptyTree => (ht,size)
    case Node(v,l,r) => 
      val lt = heightAndSize(l,ht,size)
      val rt = heightAndSize(r,ht,lt._2)
      val size2 = rt._2 + 1 
      val height = if(lt._1 > rt._1) (lt._1)+1 else  (rt._1)+1
      (height,size2)
  }
  
  def densityOfTree[A](tree: BinaryTree[A]):Double = {
    val heightSizeTuple = heightAndSize(tree, 0, 0)
    (heightSizeTuple._2.toDouble)/(heightSizeTuple._1.toDouble)
  }
  
  println(heightAndSize(tree1, 0, 0) + "  density is " + densityOfTree(tree1) )
  println("size = "+ sizeViaFold(tree1))
  println(" height is "+ maxDepthOrHeightViaFold(tree1))
  println(heightAndSize(binarySearchTree, 0, 0) + "  density is " + densityOfTree(binarySearchTree))
  println("size = "+ sizeViaFold(binarySearchTree))
  println(" height is "+ maxDepthOrHeightViaFold(binarySearchTree))
  println(heightAndSize(tree2, 0, 0) + "  density is " + densityOfTree(tree2))
  println("size = "+ sizeViaFold(tree2))
  println(" height is "+ maxDepthOrHeightViaFold(tree2))
  println(heightAndSize(onlyRoot, 0, 0) + "  density is " + densityOfTree(onlyRoot))
  println("size = "+ sizeViaFold(onlyRoot))
  println(" height is "+ maxDepthOrHeightViaFold(onlyRoot))
  println(heightAndSize(onlyChildren, 0, 0) + "  density is " + densityOfTree(onlyChildren))
  println("size = "+ sizeViaFold(onlyChildren))
  println(" height is "+ maxDepthOrHeightViaFold(onlyChildren))
  println(heightAndSize(balancedtree, 0, 0) + "  density is " + densityOfTree(balancedtree))
  println("size = "+ sizeViaFold(balancedtree))
  println(" height is "+ maxDepthOrHeightViaFold(balancedtree))
  println(heightAndSize(childrenSumPropertyTree, 0, 0) + "  density is " + densityOfTree(childrenSumPropertyTree))
  println("size = "+ sizeViaFold(childrenSumPropertyTree))
  println(" height is "+ maxDepthOrHeightViaFold(childrenSumPropertyTree))
  println(heightAndSize(isoMorphismTree1, 0, 0) + "  density is " + densityOfTree(isoMorphismTree1))
  println("size = "+ sizeViaFold(isoMorphismTree1))
  println(" height is "+ maxDepthOrHeightViaFold(isoMorphismTree1))

}