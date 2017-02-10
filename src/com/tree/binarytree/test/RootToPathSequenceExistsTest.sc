package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.RootToPathSequenceExists.pathExists
object RootToPathSequenceExistsTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  pathExists(leftSkewedtree,Array(1,2,3,4,5,6,7,8,9))
                                                  //> res0: Boolean = false
                                                  
  pathExists(tree1, Array(1,2,3,4,5,6,7,20))      //> res1: Boolean = true
   pathExists(tree1, Array(1,2,3,4,5,6,13,18))    //> res2: Boolean = true
    pathExists(tree1, Array(1,2,3,4,5,6,13,14))   //> res3: Boolean = true
     pathExists(tree1, Array(1,2,3,4,5,8))        //> res4: Boolean = true
      pathExists(tree1, Array(1,2,3,4,11,15))     //> res5: Boolean = true
       pathExists(tree1, Array(1,2,9,17))         //> res6: Boolean = true
  
       pathExists(tree1, Array(1,10,19))          //> res7: Boolean = true
       
    pathExists(tree1, Array(1,2,3,4,5,13,18))     //> res8: Boolean = false
    pathExists(tree1, Array(1,2,3,4,5,6,14))      //> res9: Boolean = false
     pathExists(tree1, Array(1,2,3,4,7,8))        //> res10: Boolean = false
      pathExists(tree1, Array(1,2,3,4,13,15))     //> res11: Boolean = false
       pathExists(tree1, Array(1,4,9,17))         //> res12: Boolean = false
  
       pathExists(tree1, Array(1,10,29))          //> res13: Boolean = false
}