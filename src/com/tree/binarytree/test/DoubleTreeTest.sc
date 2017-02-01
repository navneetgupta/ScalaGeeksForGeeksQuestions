package com.tree.binarytree.test

object DoubleTreeTest {

	import com.tree.binarytree.BinaryTree._
	import com.tree.binarytree.BinaryTree
	import com.tree.binarytree.EmptyTree
	import com.tree.binarytree.DoubleTree.{createDoubleTree,createDoubleTree4,createDoubleTree7}
	import com.tree.binarytree.InOrderTraversal.inOrderTraversalRecursive
	
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
                                    
                                                 
  //createDoubleTree(doubleTreeTest1,EmptyTree)
  //createDoubleTree(doubleTreeTest2,EmptyTree)
  var tree:BinaryTree[Int] = EmptyTree            //> tree  : com.tree.binarytree.BinaryTree[Int] = EmptyTree
  val a1:BinaryTree[Int] = createDoubleTree7(doubleTreeTest1,tree)
                                                  //> a1  : com.tree.binarytree.BinaryTree[Int] = Node(1,Node(1,Node(2,EmptyTree,E
                                                  //| mptyTree),EmptyTree),Node(3,EmptyTree,EmptyTree))
  inOrderTraversalRecursive(a1)                   //> 2 , 1 , 1 , 3 , 
  
  val b:BinaryTree[Int] = doubleTreeTest1         //> b  : com.tree.binarytree.BinaryTree[Int] = Node(1,Node(2,EmptyTree,EmptyTree
                                                  //| ),Node(3,EmptyTree,EmptyTree))

  inOrderTraversalRecursive(b)
}


//

//
//
//
//
//
//
//
//
//