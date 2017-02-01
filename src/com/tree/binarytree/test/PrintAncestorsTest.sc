package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.PrintAncestors.{printAncestorsOfANode,printAncestorsOfANode2}
object PrintAncestorsTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  tree1                                           //> res0: com.tree.binarytree.BinaryTree[Int] = Node(1,Node(2,Node(3,Node(4,Node
                                                  //| (5,Node(6,Node(7,Node(20,EmptyTree,EmptyTree),EmptyTree),Node(13,Node(18,Emp
                                                  //| tyTree,EmptyTree),Node(14,EmptyTree,EmptyTree))),Node(8,EmptyTree,EmptyTree)
                                                  //| ),Node(11,Node(15,EmptyTree,EmptyTree),EmptyTree)),Node(12,EmptyTree,Node(16
                                                  //| ,EmptyTree,EmptyTree))),Node(9,Node(17,EmptyTree,EmptyTree),EmptyTree)),Node
                                                  //| (10,EmptyTree,Node(19,EmptyTree,EmptyTree)))
  printAncestorsOfANode(tree1,1)                  //> res1: Boolean = true
  printAncestorsOfANode2(tree1,14)                //> res2: (Boolean, List[Int]) = (true,List(1, 2, 3, 4, 5, 6, 13))
  printAncestorsOfANode2(binarySearchTree,3)      //> res3: (Boolean, List[Int]) = (true,List(4, 2))
  printAncestorsOfANode2(balancedtree,13)         //> res4: (Boolean, List[Int]) = (true,List(1, 3, 6))
  printAncestorsOfANode2(balancedtree2,60)        //> res5: (Boolean, List[Int]) = (true,List(200))
   
  printAncestorsOfANode2(doubleTreeTest1,3)       //> res6: (Boolean, List[Int]) = (true,List(1))
  printAncestorsOfANode2(doubleTreeTest2,5)       //> res7: (Boolean, List[Int]) = (true,List(1, 2))
  printAncestorsOfANode2(childrenSumPropertyTree,0)
                                                  //> res8: (Boolean, List[Int]) = (true,List(10, 6, 2))
  
   printAncestorsOfANode2(tree1,20)               //> res9: (Boolean, List[Int]) = (true,List(1, 2, 3, 4, 5, 6, 7))
  printAncestorsOfANode2(binarySearchTree,7)      //> res10: (Boolean, List[Int]) = (false,List())
  printAncestorsOfANode2(balancedtree,16)         //> res11: (Boolean, List[Int]) = (false,List())
  printAncestorsOfANode2(balancedtree2,67)        //> res12: (Boolean, List[Int]) = (false,List())
   
  printAncestorsOfANode2(doubleTreeTest1,5)       //> res13: (Boolean, List[Int]) = (false,List())
  printAncestorsOfANode2(doubleTreeTest2,9)       //> res14: (Boolean, List[Int]) = (false,List())
  printAncestorsOfANode2(childrenSumPropertyTree,7)
                                                  //> res15: (Boolean, List[Int]) = (false,List())
  
}