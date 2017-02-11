package com.tree.binarytree.test
import com.tree.binarytree.DepthFullBinaryTreeFromPreorder.findDepth
object DepthFullBinaryTreeFromPreorderTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  "nlnll".map(x => x.toChar)                      //> res0: String = nlnll
  "nlnll".toArray                                 //> res1: Array[Char] = Array(n, l, n, l, l)
  
  findDepth("nlnll".toArray)                      //> res2: Int = 2
  findDepth("nlnnlll".toArray)                    //> res3: Int = 3
}