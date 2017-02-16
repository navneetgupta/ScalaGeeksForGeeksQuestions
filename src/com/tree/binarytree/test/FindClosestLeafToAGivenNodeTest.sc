package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.FindClosestLeafToAGivenNode.findClosest
object FindClosestLeafToAGivenNodeTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  findClosest(findClosestTestTree,"A")            //> res0: Int#1107 = 1
  findClosest(findClosestTestTree,"B")            //> res1: Int#1107 = 0
  findClosest(findClosestTestTree,"C")            //> res2: Int#1107 = 2
  findClosest(findClosestTestTree,"E")            //> res3: Int#1107 = 2
  findClosest(findClosestTestTree,"F")            //> res4: Int#1107 = 2
  findClosest(findClosestTestTree,"G")            //> res5: Int#1107 = 1
  findClosest(findClosestTestTree,"H")            //> res6: Int#1107 = 1
  findClosest(findClosestTestTree,"I")            //> res7: Int#1107 = 0
  findClosest(findClosestTestTree,"J")            //> res8: Int#1107 = 0
  findClosest(findClosestTestTree,"K")            //> res9: Int#1107 = 0
  
}