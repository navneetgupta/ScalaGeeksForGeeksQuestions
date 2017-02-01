package com.tree.binarytree

import scala.annotation.tailrec

/**
 * @author: Navneet Gupta
 * @createdOn: 07-Jan-2017
 */


//TODO: Incomplete solution
object ConvertToChildSumTree extends App{
  // (You cannot change structure of tree and cannot decrement value of any node).
  
  def convertToChildSumTree(tree: BinaryTree[Int]): BinaryTree[Int] = {
    tree match {
      case EmptyTree => EmptyTree
      case Node(v,EmptyTree,EmptyTree) => Node(v,EmptyTree,EmptyTree)
      case Node(v,l,r) =>  {//node
        val ll = convertToChildSumTree(l)
        val rr = convertToChildSumTree(r)
        val ld = l match { //node.left
                   case Node(v1,l1,r1) => v1   //node.left!=null
                   case EmptyTree => 0          //node.left==null
                 }
        val rd = r match { //node.right
                   case Node(v2,l2,r2) => v2    //node.right!=null
                   case EmptyTree => 0          //node.right==null
                 }
        val diff = ld+rd-v
        if(diff>0) Node(v+diff,l,r)
        else incrementedTree(tree,-diff)
      }
    }
  }
 
  def incrementedTree(tree: BinaryTree[Int], diff: Int):BinaryTree[Int] ={ 
    tree match {
      case Node(v,Node(v1,l1,r1),r) => Node(v,incrementedTree(Node(v1+diff,l1,r1),diff),r)
      case Node(v,l,Node(v2,l2,r2)) => Node(v,l,incrementedTree(Node(v2+diff,l2,r2),diff))
      case _ => tree
    }
  }
  
  val childrenSumTest = Node(50,Node(7,Node(3,EmptyTree,EmptyTree),Node(5,EmptyTree,EmptyTree)),Node(2,Node(1,EmptyTree,EmptyTree),Node(30,EmptyTree,EmptyTree)))

  val a = convertToChildSumTree(childrenSumTest);
  print(a)
  
}

//     emptytree      onlyRoot                tree1                                       leftskeewtree    rightskewTree
//                       1                                                                          1      1
//											/	 \	  							    127                                               /        \
//                                              /    \                                            2          2
//																			      108      19                                         /            \
//                                          /   \       \                                       3              3
//                                        /      17       19                                    /                \
//											  						 91       /                                             4                  4
//                                    /   \    17                                            /                    \
//                                   /     \                                                5                      5
//  															 75       16                                             /                        \
//                                /  \        \                                           6                          6
//                               /    \        16                                        /                            \
//															60     15                                               7                              7
//                             /  \    /                                               /                                \
//													 52    8  15                                              8                                  8
//                          /  \                                                     /                                    \
//												20		32                                                  9                                      9
//                      /      /  \                                                /                                        \
//										20			18  14                                             10                                         10
//                                                                               /                                            \
//                                                                              11                                             11

//post: 20,7,18,14,13,6,8,5,15,11,4,16,12,3,17,9,3,19,10,1    11,10,9,8,7,6,5,4,3,2,1   11,10,9,8,7,6,5,4,3,2,1  8,9,4,10,11,5,2,12,13,6,14,15,7,3,1
//pre : 1,2,3,4,5,6,7,20,13,18,14,8,11,15,12,16,9,17,10,19    1,2,3,4,5,6,7,8,9,10,11                              1,2,4,8,9,5,10,11,3,6,12,13,7,14,15
//in:  20,7,6,18,13,14,5,8,4,15,11,3,12,16,2,17,9,1,10,19     11,10,9,8,7,6,5,4,3,2,1    1,2,3,4,5,6,7,8,9,10,11   8,4,9,2,10,5,11,1,12,6,13,14,7,15,3  


//                                                       balancedtree       
//                                                                           1
//                                                                   /               \
//                                                                2                    3
//                                                              /    \              /     \
//                                                            /       \            /       \  
//                                                           4         5          6         7
//                                                         /   \      / \        / \      /   \
//                                                        /     \    /   \      /   \    /     \
//                                                       8       9  10   11    12   13  14      15 
//
//
// post:   pre  in:                                         4
//                                                       /     \
//                                                      /       \
//                                                     2         5
//                                                   /   \
//                                                  1     3
//balancedtree       
//                                                                          200
//                                                                   /               \
//                                                                140                  60
//                                                              /    \              /     \
//                                                            /       \            /       \  
//                                                           119       21          31       29
//                                                         /   \      / \        / \      /   \
//                                                        /     \    /   \      /   \    /     \
//                                                      110      9  10   11    18   13  14      15 
//
//
//
//
//
//