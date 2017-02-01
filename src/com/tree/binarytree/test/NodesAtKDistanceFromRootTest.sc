package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.NodesAtKDistanceFromRoot.{getNodesAtKDistanceFromRoot,printNodesAtKDistanceFromRoot}

object NodesAtKDistanceFromRootTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  getNodesAtKDistanceFromRoot(tree1, 3, Nil)      //> res0: List[Int] = List()
  
  printNodesAtKDistanceFromRoot(tree1, 3)         //> 4 
                                                  //| 12 
                                                  //| 17 
                            
}