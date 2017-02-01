package com.tree.binarytree.test

object DiameterOfTreeTest {
	import com.tree.binarytree.DiameterOfTree.{diameterOfTree,diameterOfTreeOptimised,diameterOfTreeOptimised2}
	import com.tree.binarytree.BinaryTree._
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  diameterOfTree(tree1)                           //> res0: Int = 10
  diameterOfTree(leftSkewedtree)                  //> res1: Int = 11
  diameterOfTree(rightSkewTree)                   //> res2: Int = 11
  diameterOfTree(balancedtree)                    //> res3: Int = 7
	diameterOfTree(binarySearchTree)          //> res4: Int = 4
	diameterOfTree(balancedtree2)             //> res5: Int = 7
	diameterOfTree(childrenSumPropertyTree1)  //> res6: Int = 5
	diameterOfTree(childrenSumPropertyTree)   //> res7: Int = 6
	diameterOfTree(onlyRoot)                  //> res8: Int = 1
	diameterOfTree(onlyChildren)              //> res9: Int = 3
	
	diameterOfTreeOptimised(tree1,0)          //> res10: (Int, Int) = (10,8)
  diameterOfTreeOptimised(leftSkewedtree,0)       //> res11: (Int, Int) = (11,11)
  diameterOfTreeOptimised(rightSkewTree,0)        //> res12: (Int, Int) = (11,11)
  diameterOfTreeOptimised(balancedtree,0)         //> res13: (Int, Int) = (7,4)
	diameterOfTreeOptimised(binarySearchTree,0)
                                                  //> res14: (Int, Int) = (4,3)
	diameterOfTreeOptimised(balancedtree2,0)  //> res15: (Int, Int) = (7,4)
	diameterOfTreeOptimised(childrenSumPropertyTree1,0)
                                                  //> res16: (Int, Int) = (5,3)
	diameterOfTreeOptimised(childrenSumPropertyTree,0)
                                                  //> res17: (Int, Int) = (6,4)
	diameterOfTreeOptimised(onlyRoot,0)       //> res18: (Int, Int) = (1,1)
	diameterOfTreeOptimised(onlyChildren,0)   //> res19: (Int, Int) = (3,2)
	
	diameterOfTree(testTree)                  //> res20: Int = 4
	diameterOfTreeOptimised(testTree, 0)      //> res21: (Int, Int) = (4,3)
	
	 
  diameterOfTreeOptimised2(tree1)                 //> res22: (Int, Int) = (1,0)
  diameterOfTreeOptimised2(leftSkewedtree)        //> res23: (Int, Int) = (1,0)
  diameterOfTreeOptimised2(rightSkewTree)         //> res24: (Int, Int) = (1,0)
  diameterOfTreeOptimised2(balancedtree)          //> res25: (Int, Int) = (1,0)
	diameterOfTreeOptimised2(binarySearchTree)//> res26: (Int, Int) = (1,0)
	diameterOfTreeOptimised2(balancedtree2)   //> res27: (Int, Int) = (1,0)
	diameterOfTreeOptimised2(childrenSumPropertyTree1)
                                                  //> res28: (Int, Int) = (1,0)
	diameterOfTreeOptimised2(childrenSumPropertyTree)
                                                  //> res29: (Int, Int) = (1,0)
	diameterOfTreeOptimised2(onlyRoot)        //> res30: (Int, Int) = (1,0)
	diameterOfTreeOptimised2(onlyChildren)    //> res31: (Int, Int) = (1,0)
	
}