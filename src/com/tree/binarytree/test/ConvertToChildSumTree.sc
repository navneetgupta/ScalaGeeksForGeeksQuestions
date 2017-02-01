package com.tree.binarytree.test

object ConvertToChildSumTreeTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  import com.tree.binarytree.BinaryTree._
  import com.tree.binarytree.ConvertToChildSumTree.{incrementedTree,convertToChildSumTree}
  import com.tree.binarytree.InOrderTraversal.inOrderTraversalRecursive
  
  //tree1
 //incrementedTree(tree1, 4)
  //convertToChildSumTree(tree1)
  
  val a = convertToChildSumTree(childrenSumTest)  //> a  : com.tree.binarytree.BinaryTree[Int] = Node(50,Node(48,Node(44,EmptyTree
                                                  //| ,EmptyTree),Node(5,EmptyTree,EmptyTree)),Node(2,Node(1,EmptyTree,EmptyTree),
                                                  //| Node(30,EmptyTree,EmptyTree)))
  inOrderTraversalRecursive(a)                    //> 44 , 48 , 5 , 50 , 1 , 2 , 30 , 
  
  //leftSkewedtree
  incrementedTree(leftSkewedtree, 4)              //> res0: com.tree.binarytree.BinaryTree[Int] = Node(1,Node(6,Node(7,Node(8,Node
                                                  //| (9,Node(10,Node(11,Node(12,Node(13,Node(14,Node(15,EmptyTree,EmptyTree),Empt
                                                  //| yTree),EmptyTree),EmptyTree),EmptyTree),EmptyTree),EmptyTree),EmptyTree),Emp
                                                  //| tyTree),EmptyTree),EmptyTree)
  //convertToChildSumTree(leftSkewedtree)
  
  //rightSkewTree
  incrementedTree(rightSkewTree, 4)               //> res1: com.tree.binarytree.BinaryTree[Int] = Node(1,EmptyTree,Node(6,EmptyTre
                                                  //| e,Node(7,EmptyTree,Node(8,EmptyTree,Node(9,EmptyTree,Node(10,EmptyTree,Node(
                                                  //| 11,EmptyTree,Node(12,EmptyTree,Node(13,EmptyTree,Node(14,EmptyTree,Node(15,E
                                                  //| mptyTree,EmptyTree)))))))))))
  //convertToChildSumTree(rightSkewTree)
  
  //balancedtree
  incrementedTree(balancedtree, 4)                //> res2: com.tree.binarytree.BinaryTree[Int] = Node(1,Node(6,Node(8,Node(12,Emp
                                                  //| tyTree,EmptyTree),Node(9,EmptyTree,EmptyTree)),Node(5,Node(10,EmptyTree,Empt
                                                  //| yTree),Node(11,EmptyTree,EmptyTree))),Node(3,Node(6,Node(12,EmptyTree,EmptyT
                                                  //| ree),Node(13,EmptyTree,EmptyTree)),Node(7,Node(14,EmptyTree,EmptyTree),Node(
                                                  //| 15,EmptyTree,EmptyTree))))
  //convertToChildSumTree(balancedtree)
  
  //binarySearchTree
  //incrementedTree(binarySearchTree, 4)
  //convertToChildSumTree(binarySearchTree)
                                                  
  //childrenSumPropertyTree
  //incrementedTree(childrenSumPropertyTree, 4)
  //convertToChildSumTree(childrenSumPropertyTree)
  
  //childrenSumPropertyTree1
  //incrementedTree(childrenSumPropertyTree1, 4)
  //convertToChildSumTree(childrenSumPropertyTree1)
  
  //onlyRoot
  //incrementedTree(onlyRoot, 4)
  //convertToChildSumTree(onlyRoot)
  
  //emptytree
  //incrementedTree(emptytree, 4)
  //convertToChildSumTree(emptytree)
  
  
  //onlyChildren
  //incrementedTree(onlyChildren, 4)
  
  //convertToChildSumTree(onlyChildren)
  
  //balancedtree2
  //convertToChildSumTree(balancedtree2)

  
  
}