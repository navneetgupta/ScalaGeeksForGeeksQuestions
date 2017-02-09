package com.tree.binarytree.test
import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.LongestConsecutiveSequence.longestConsecutive
object LongestConsecutiveSequenceTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  longestConsecutive(tree1)                       //> res0: Int = 7
  longestConsecutive(leftSkewedtree)              //> res1: Int = 11
  
}