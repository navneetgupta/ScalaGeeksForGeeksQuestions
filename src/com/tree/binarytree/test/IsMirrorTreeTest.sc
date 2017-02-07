package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.ConvertToMirrorTree.convertToMirrorTree
import com.tree.binarytree.IsMirrorTree.isMirrorTree
object IsMirrorTreeTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  isMirrorTree(tree1, tree2)                      //> res0: Boolean = false
  isMirrorTree(tree1, tree1)                      //> res1: Boolean = false
  isMirrorTree(tree1, convertToMirrorTree(tree1)) //> res2: Boolean = true
  isMirrorTree(tree2, tree2)                      //> res3: Boolean = false
  isMirrorTree(tree2, convertToMirrorTree(tree2)) //> res4: Boolean = true
  isMirrorTree(balancedtree, balancedtree)        //> res5: Boolean = false
  isMirrorTree(balancedtree, convertToMirrorTree(balancedtree))
                                                  //> res6: Boolean = true
   isMirrorTree(balancedtree2, balancedtree2)     //> res7: Boolean = false
  isMirrorTree(balancedtree2, convertToMirrorTree(balancedtree2))
                                                  //> res8: Boolean = true
  isMirrorTree(binarySearchTree, binarySearchTree)//> res9: Boolean = false
  isMirrorTree(binarySearchTree, convertToMirrorTree(binarySearchTree))
                                                  //> res10: Boolean = true
   isMirrorTree(doubleTreeTest1, doubleTreeTest1) //> res11: Boolean = false
  isMirrorTree(doubleTreeTest1, convertToMirrorTree(doubleTreeTest1))
                                                  //> res12: Boolean = true
  isMirrorTree(doubleTreeTest2, doubleTreeTest2)  //> res13: Boolean = false
  isMirrorTree(doubleTreeTest2, convertToMirrorTree(doubleTreeTest2))
                                                  //> res14: Boolean = true
  isMirrorTree(childrenSumTest, childrenSumTest)  //> res15: Boolean = false
  isMirrorTree(childrenSumTest, convertToMirrorTree(childrenSumTest))
                                                  //> res16: Boolean = true
  isMirrorTree(isoMorphismTree1, isoMorphismTree1)//> res17: Boolean = false
  isMirrorTree(isoMorphismTree1, convertToMirrorTree(isoMorphismTree1))
                                                  //> res18: Boolean = true
}