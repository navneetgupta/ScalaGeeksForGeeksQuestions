package com.array.test

import com.array.MergeOverlappingArray.mergeOverlappingArray
import scala.collection.mutable.Stack

object MergeOverlappingArrayTEst {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  var arr = Array((1,3),(6,8),(5,7),(2,4))        //> arr  : Array[(Int, Int)] = Array((1,3), (6,8), (5,7), (2,4))
  arr.sortWith((a,b) => a._1 < b._1)              //> res0: Array[(Int, Int)] = Array((1,3), (2,4), (5,7), (6,8))
  arr                                             //> res1: Array[(Int, Int)] = Array((1,3), (6,8), (5,7), (2,4))
  
  val stk = Stack[(Int,Int)]()                    //> stk  : scala.collection.mutable.Stack[(Int, Int)] = Stack()
  stk.toArray                                     //> res2: Array[(Int, Int)] = Array()
  
  mergeOverlappingArray(arr)                      //> res3: List[(Int, Int)] = List((5,8), (1,4))
}