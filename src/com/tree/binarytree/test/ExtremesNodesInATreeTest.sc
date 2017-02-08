package com.tree.binarytree.test
import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.ExtremesNodesInATree.printExtremeNodes
object ExtremesNodesInATreeTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  printExtremeNodes(balancedtree)                 //> 1 , 2 , 7 , 8 , 
  printExtremeNodes(balancedtree2)                //> 200 , 2 , 7 , 8 , 
  printExtremeNodes(binarySearchTree)             //> 4 , 2 , 3 , 
  printExtremeNodes(childrenSumTest)              //> 50 , 7 , 30 , 
  printExtremeNodes(tree1)                        //> 1 , 2 , 19 , 4 , 16 , 6 , 13 , 20 , 
  printExtremeNodes(tree2)                        //> 20 , 8 , 12 , 10 , 
  printExtremeNodes(childrenSumPropertyTree1)     //> 10 , 8 , 2 , 
  printExtremeNodes(childrenSumPropertyTree)      //> 10 , 6 , 4 , 2 , 
  printExtremeNodes(isoMorphismTree1)             //> 1 , 2 , 6 , 7 , 
  printExtremeNodes(isSumtreeTest)                //> 26 , 10 , 3 , 
  printExtremeNodes(isoMorphismTree2)             //> 1 , 3 , 5 , 8 , 
  printExtremeNodes(isSubSetTreeTest2)            //> 10 , 4 , 30 , 
  printExtremeNodes(isSubSetTreeTest1)            //> 26 , 10 , 3 , 30 , 
  printExtremeNodes(testTree)                     //> 1 , 2 , 5 , 
  printExtremeNodes(bstToBalancedBSTTest1)        //> 30 , 20 , 10 , 
  printExtremeNodes(bstToBalancedBSTTest2)        //> 4 , 3 , 6 , 1 , 
  printExtremeNodes(rightSkewTree)                //> 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11 , 
  printExtremeNodes(leftSkewedtree)               //> 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11 , 
  printExtremeNodes(expresiionTree)
  
  
  

}